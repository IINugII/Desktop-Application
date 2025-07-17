/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author kgsmi
 */
public class DBConnection {
    
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    
    private static final String JDBC_URL = "jdbc:derby:managementDB;create=true";
    
    Connection con;
    
    public DBConnection(){
        
    }
    
    public void connect() throws ClassNotFoundException{
        
        try {
        Class.forName(DRIVER);
        this.con = DriverManager.getConnection(JDBC_URL);
        System.out.println("Connected to database");
    } catch (SQLException ex) {
        this.con = null;
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to connect to DB:\n" + ex.getMessage());
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "JDBC Driver not found:\n" + ex.getMessage());
    }
        
    }
    
        public void createCounselorTable() {
    try {
        ResultSet rs = con.getMetaData().getTables(null, null, "COUNSELORS", null);
        if (rs.next()) {
            System.out.println("Counselors table already exists.");
            return;
        }
        String query = "CREATE TABLE Counselors (" +
                       "ID VARCHAR(50) PRIMARY KEY, " +
                       "Name VARCHAR(50), " +
                       "Specialization VARCHAR(50), " +
                       "Available VARCHAR(50))";
        this.con.createStatement().execute(query);
        System.out.println("Counselor table created.");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error creating Counselor table:\n" + ex.getMessage());
    }
}

    public void addCounselor(String id, String name, String specialization, String available) {
    try {
        if (id == null || id.isEmpty() ||
            name == null || name.isEmpty() ||
            specialization == null || specialization.isEmpty()){
            System.err.println("Invalid input: one or more fields are empty");
            JOptionPane.showMessageDialog(null, "Please fill in all counselor fields.");
            return;
        }

        String query = "INSERT INTO Counselors (ID, Name, Specialization, Available) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, specialization);
        pstmt.setString(4, available);

        pstmt.executeUpdate();
        pstmt.close();
        System.out.println("Counselor added successfully.");
    } catch (SQLException ex) {
        if ("23505".equals(ex.getSQLState())) {
            JOptionPane.showMessageDialog(null, "Error: Counselor ID already exists.");
        } else {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error while adding counselor:\n" + ex.getMessage());
        }
    }
    }
    
        public void dropAppointmentTable() {
        try {
            String query = "DROP TABLE Appointments";
            this.con.createStatement().execute(query);
            System.out.println("Table 'Appointment' dropped successfully.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Failed to drop table.");
        }
    }
        
    public void dropCounselorTable() {
        try {
            String query = "DROP TABLE Counselors";
            this.con.createStatement().execute(query);
            System.out.println("Table 'Cousnelor' dropped successfully.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Failed to drop table.");
        }
    }
    
    public void removeCounselor(String id) {
    try {
        if (id == null || id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide the ID of the counselor to remove.");
            return;
        }

        String query = "DELETE FROM Counselors WHERE ID = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        int rowsAffected = pstmt.executeUpdate();
        pstmt.close();

        if (rowsAffected > 0) {
            System.out.println("Counselor removed.");
        } else {
            JOptionPane.showMessageDialog(null, "No counselor found with ID: " + id);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error while removing counselor:\n" + ex.getMessage());
    }
}
    
    
    public void updateCounselor(String id, String newName, String newSpecialization, String newAvailable) {
        try {
            if (id == null || id.isEmpty() ||
                newName == null || newName.isEmpty() ||
                newSpecialization == null || newSpecialization.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields to update the counselor.");
                return;
            }

            String query = "UPDATE Counselors SET Name = ?, Specialization = ?, Available = ? WHERE ID = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, newName);
            pstmt.setString(2, newSpecialization);
            pstmt.setString(3, newAvailable);
            pstmt.setString(4, id);

            int rowsAffected = pstmt.executeUpdate();
            pstmt.close();

            if (rowsAffected > 0) {
                System.out.println("Counselor updated successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "No counselor found with ID: " + id);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error while updating counselor:\n" + ex.getMessage());
    }
}
    
    public ResultSet getAllCounselors() {
    try {
        String query = "SELECT * FROM Counselors";
        return this.con.createStatement().executeQuery(query);
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to fetch counselors:\n" + ex.getMessage());
        return null;
    }
}
    
    public void createAppointmentsTable() {
    try {
        ResultSet rs = con.getMetaData().getTables(null, null, "APPOINTMENTS", null);
        if (rs.next()) {
            System.out.println("Appointments table already exists.");
            return;
        }
        String query = "CREATE TABLE Appointments (" +
                "ID VARCHAR(50) PRIMARY KEY," +
                "StudentName VARCHAR(50), " +
                "Counselor VARCHAR(50), " +
                "AppointmentDate DATE, " +
                "AppointmentTime TIME, " +
                "Status VARCHAR(20))";
        this.con.createStatement().execute(query);
        System.out.println("Appointments table created.");
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
public void addAppointment(String id, String studentName, String counselor, String dateStr, String timeStr, String status) {
    try {
        if (id == null || id.isEmpty()||
            studentName == null || studentName.isEmpty() ||
            counselor == null || counselor.isEmpty() ||
            dateStr == null || timeStr == null || status == null) {
            System.err.println("Invalid input: one or more fields are empty");
            JOptionPane.showMessageDialog(null, "Please fill in all appointment fields.");
            return;
        }

        // Convert string date and time into SQL types
        java.sql.Date sqlDate;
        java.sql.Time sqlTime;

        try {
            sqlDate = java.sql.Date.valueOf(dateStr); // "yyyy-MM-dd"
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Invalid date format: " + dateStr);
            return;
        }

        try {
            sqlTime = java.sql.Time.valueOf(timeStr); // "HH:mm:ss"
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Invalid time format: " + timeStr);
            return;
        }

        String query = "INSERT INTO Appointments (ID, StudentName, Counselor, AppointmentDate, AppointmentTime, Status) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        pstmt.setString(2, studentName);
        pstmt.setString(3, counselor);
        pstmt.setDate(4, sqlDate);
        pstmt.setTime(5, sqlTime);
        pstmt.setString(6, status);

        pstmt.executeUpdate();
        pstmt.close(); // Clean up
        System.out.println("Appointment added successfully");

        
    } catch (SQLException ex) {
        if ("23505".equals(ex.getSQLState())) {
            JOptionPane.showMessageDialog(null, "Error: Counselor ID already exists.");
        } else {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error while adding counselor:\n" + ex.getMessage());
        }
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Unexpected error:\n" + ex.getMessage());
    }
}


    public void removeAppointment(String id, String studentName, String date, String time) {
        try {
            String query = "DELETE FROM Appointments WHERE ID = '" + id + "'";
            this.con.createStatement().execute(query);
            System.out.println("Appointment removed");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateAppointment(String id, String studentName, String counselor, String date, String time, String status) {
        try {
            String query = "UPDATE Appointments SET " +
                           "StudentName = '" + studentName + "', " +
                           "Counselor = '" + counselor + "', " +
                           "AppointmentDate = '" + date + "', " +
                           "AppointmentTime = '" + time + "', " +
                           "Status = '" + status + "' " +
                           "WHERE ID = '" + id + "'";

            this.con.createStatement().execute(query);
            System.out.println("Appointment updated");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}

    public ResultSet getAllAppointments() {
        try {
            String query = "SELECT * FROM Appointments";
            return this.con.createStatement().executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void createFeedbackTable(){
         try {
        // Check if the table already exists
        ResultSet rs = con.getMetaData().getTables(null, null, "FEEDBACK", null);
        if (rs.next()) {
            System.out.println("Feedback table already exists.");
            return;
        }
        String query = "CREATE TABLE Feedback (" +
                       "ID VARCHAR(50) PRIMARY KEY, " +
                       "StudentsName VARCHAR(20), " +
                       "Rating INT, " +
                       "Comments VARCHAR(100))";
        this.con.createStatement().execute(query);
        System.out.println("Feedback table created");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error creating Feedback table:\n" + ex.getMessage());
    }
    }
    
    public void dropFeedbackTable() {
        try {
            String query = "DROP TABLE Feedback";
            this.con.createStatement().execute(query);
            System.out.println("Table 'Feedback' dropped successfully.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Failed to drop table.");
        }
    }
    
    public void addFeedback(String ID, String studentName, int rating, String comments){
        
        try{
            String query = "INSERT INTO Feedback VALUES ('" + ID + "', '" + studentName + "', " + rating + ", '" + comments + "')";
            this.con.createStatement().execute(query);
            System.out.println("Feedback added");
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Data not added");
        }
        
    }
    
    public void removeFeedback(String ID, String studentName, int rating, String comments){
        
        try{
            String query = "DELETE FROM Feedback WHERE ID = '" + ID + "' AND StudentsName = '" + studentName + "' AND Rating = " + rating + " AND Comments = '" + comments + "'";
            this.con.createStatement().execute(query);
            System.out.println("Feedback removed");
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Data was not removed");
        }
    }
    
    public void updateFeedback(String ID, String newStudentName, int newRating, String newComments) {
        
        try {
            String query = "UPDATE Feedback " + "SET StudentsName = '" + newStudentName + "', " + "Rating = " + newRating + ", " + "Comments = '" + newComments + "' " + "WHERE ID = '" + ID + "'";
            this.con.createStatement().executeUpdate(query);
            System.out.println("Feedback updated");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Data was not updated");
        }
    }
    
    public ResultSet getAllFeedback() {
        
        try {
            String query = "SELECT * FROM Feedback";
            return this.con.createStatement().executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Failed to fetch feedback data");
            return null;
        }
    }
    
}
