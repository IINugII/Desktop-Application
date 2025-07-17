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
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author kgsmi
 */
public class DBConnection {
    
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    
    private static final String JDBC_URL = "jdbc:derby:managemetDB;create=true";
    
    Connection con;
    
    public DBConnection(){
        
    }
    
    public void connect() throws ClassNotFoundException{
        
        try{
            Class.forName(DRIVER);
            this.con = DriverManager.getConnection(JDBC_URL);
            
            if(this.con != null){
                System.out.println("Connected to database");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
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

public void addAppointment(String studentName, String counselor, String dateStr, String timeStr, String status) {
    try {
        if (studentName == null || studentName.isEmpty() ||
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

        String query = "INSERT INTO Appointments (StudentName, Counselor, AppointmentDate, AppointmentTime, Status) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, studentName);
        pstmt.setString(2, counselor);
        pstmt.setDate(3, sqlDate);
        pstmt.setTime(4, sqlTime);
        pstmt.setString(5, status);

        pstmt.executeUpdate();
        pstmt.close(); // Clean up
        System.out.println("Appointment added successfully");

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error while adding appointment:\n" + e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Unexpected error:\n" + e.getMessage());
    }
}





    public void removeAppointment(String studentName, String date, String time) {
        try {
            String query = "DELETE FROM Appointments WHERE StudentName = '" + studentName +
                    "' AND AppointmentDate = '" + date + "' AND AppointmentTime = '" + time + "'";
            this.con.createStatement().execute(query);
            System.out.println("Appointment removed");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

public void updateAppointment(String studentName, String counselor, String dateStr, String timeStr, String status) {
    try {
        // Validate
        if (studentName == null || counselor == null || dateStr == null || timeStr == null || status == null) {
            JOptionPane.showMessageDialog(null, "All fields must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Date sqlDate;
        Time sqlTime;

        try {
            sqlDate = Date.valueOf(dateStr); // yyyy-MM-dd
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Invalid date: " + dateStr, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (timeStr.length() == 5) timeStr += ":00"; // add seconds
            sqlTime = Time.valueOf(timeStr); // hh:mm:ss
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Invalid time: " + timeStr, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "UPDATE Appointments SET Counselor = ?, AppointmentDate = ?, AppointmentTime = ?, Status = ? WHERE StudentName = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, counselor);
        pstmt.setDate(2, sqlDate);
        pstmt.setTime(3, sqlTime);
        pstmt.setString(4, status);
        pstmt.setString(5, studentName); // assuming you're using StudentName to identify the record

        int rows = pstmt.executeUpdate();
        pstmt.close();

        if (rows > 0) {
            JOptionPane.showMessageDialog(null, "Appointment updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No matching appointment found to update.", "Not Found", JOptionPane.WARNING_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        
        try{
            String query = "Create Table Feedback (ID varchar(50) PRIMARY KEY , StudentsName varchar(20), Rating int, Comments varchar(100))";
            this.con.createStatement().execute(query);
            System.out.println("Feedback table created");
        }catch (SQLException ex){
            ex.printStackTrace();
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
