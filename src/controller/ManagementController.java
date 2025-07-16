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
    
    public void addCounselor(String counselorName ,String specialization, String availability) {
        
        counselorManagement.setConselorData(counselorName, specialization, availability);
        counselorManagement.addData();
        
    }
    
    public void removeCounselor(String counselorName ,String specialization, String availability){
        
        counselorManagement.setConselorData(counselorName, specialization, availability);
        counselorManagement.removeData();
        
    }
    
    public void updateCounselor(String counselorName ,String specialization, String availability) {
        
        counselorManagement.setConselorData(counselorName, specialization, availability);
        counselorManagement.updateData();
        
    }
    
}
