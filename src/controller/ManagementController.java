/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.FeedBackManagement;
import model.CounselorManagement;
import model.AppointmentManagement;
/**
 *
 * @author kgsmi
 */
public class ManagementController {
    
    private FeedBackManagement feedbackManager;  // Declares a private variable for handling feedback managing operations
    private CounselorManagement counselorManagement; // Declares a private variable for handling counselor managing operations
    private AppointmentManagement appointmentManagement;
    
    // Constructor to initialize the feedbackManager,counselorManagement and appointmentManagment objects
    public ManagementController(FeedBackManagement feedbackManager, CounselorManagement counselorManagement, AppointmentManagement appointmentManagement) {
        this.feedbackManager = feedbackManager;
        this.counselorManagement = counselorManagement;
        this.appointmentManagement = appointmentManagement;
    }


    public void addFeedback(String ID ,String studentName, int rating, String comments) {
        
        feedbackManager.setFeedbackData(ID,studentName, rating, comments); // Sets the feedback data in FeedBackManagement to what needs to be added
        feedbackManager.addData(); // Calls the method from FeedBackManagement to add the feedback data
        
    }
    
    public void removeFeedback(String ID ,String studentName, int rating, String comments){
        
        feedbackManager.setFeedbackData(ID, studentName, rating, comments); // Sets the feedback data in FeedBackManagement to what needs to be removed
        feedbackManager.removeData(); // Calls the method from FeedBackManagement to remove the feedback data
        
    }
    
    public void updateFeedback(String ID, String studentName, int rating, String comments) {
        
        feedbackManager.setFeedbackData(ID, studentName, rating, comments); // Sets the feedback data in FeedBackManagement to updated data
        feedbackManager.updateData(); // Calls the method from FeedBackManagement to update the feedback data
        
    }
    
    // Same applies to the following, only change is the arguments (input fields) given
    public void addCounselor(String ID, String counselorName ,String specialization, String availability) {
        
        counselorManagement.setCounselorData(ID, counselorName, specialization, availability);
        counselorManagement.addData();
        
    }
    
    public void removeCounselor(String ID, String counselorName ,String specialization, String availability){
        
        counselorManagement.setCounselorData(ID, counselorName, specialization, availability);
        counselorManagement.removeData();
        
    }
    
    public void updateCounselor(String ID, String counselorName ,String specialization, String availability) {
        
        counselorManagement.setCounselorData(ID, counselorName, specialization, availability);
        counselorManagement.updateData();
        
    }
    
    public void addAppointment(String id, String studentName, String counselor, String date, String time, String status) {
        appointmentManagement.setAppointmentData(id, studentName, counselor, date, time, status);
        appointmentManagement.addData();
    }

    public void removeAppointment() {
        appointmentManagement.removeData(); 
    }

    public void updateAppointment(String id, String studentName, String counselor, String date, String time, String status) {
        appointmentManagement.setAppointmentData(id, studentName, counselor, date, time, status);
        appointmentManagement.updateData();
    }
    
}
