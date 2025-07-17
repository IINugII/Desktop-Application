/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.FeedBackManagement;
import model.CounselorManagement;
/**
 *
 * @author kgsmi
 */
public class ManagementController {
    
    private FeedBackManagement feedbackManager;
    private CounselorManagement counselorManagement;

    public ManagementController(FeedBackManagement feedbackManager, CounselorManagement counselorManagement) {
        this.feedbackManager = feedbackManager;
        this.counselorManagement = counselorManagement;
    }

    public void addFeedback(String ID ,String studentName, int rating, String comments) {
        
        feedbackManager.setFeedbackData(ID,studentName, rating, comments);
        feedbackManager.addData();
        
    }
    
    public void removeFeedback(String ID ,String studentName, int rating, String comments){
        
        feedbackManager.setFeedbackData(ID, studentName, rating, comments);
        feedbackManager.removeData();
        
    }
    
    public void updateFeedback(String ID, String studentName, int rating, String comments) {
        
        feedbackManager.setFeedbackData(ID, studentName, rating, comments);
        feedbackManager.updateData();
        
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
