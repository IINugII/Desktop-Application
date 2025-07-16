/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
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
