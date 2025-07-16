/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kgsmi
 */
public class FeedBackManagement extends Management{
    
    private DefaultTableModel tableModel; // Model that holds and updates table data
    private JTable table; // The GUI component to display tabular feedback entries
    
    // Constructor to initialize the model and table
    public FeedBackManagement(DefaultTableModel tableModel, JTable table) {
        this.tableModel = tableModel;
        this.table = table;
    }
    
    // Fields that temporarily store feedback data before performing any operations
    private String studentName;
    private int rating;
    private String comments;
    private String ID;

    // Sets the feedback data used for add, remove, and update methods
    public void setFeedbackData(String ID, String studentName, int rating, String comments) {
        this.studentName = studentName;
        this.rating = rating;
        this.comments = comments;
        this.ID = ID;
    }

    @Override
    public void addData() {
        
        Object[] rowData = {ID ,studentName, rating, comments}; // Creates an array with the feedback data 
        tableModel.addRow(rowData); // Then adds the data as a new row to the table model

    }

    @Override
    public void removeData() {
        
        int rowCount = tableModel.getRowCount(); // Gets total number of rows in the table

        for (int i = 0; i < rowCount; i++) {
            Object givenID = tableModel.getValueAt(i, 0);  // Gets ID from column 0
            Object name = tableModel.getValueAt(i, 1); // Gets student name from column 1
            Object rate = tableModel.getValueAt(i, 2); // Gets rating from column 2
            Object comment = tableModel.getValueAt(i, 3); // Gets comment from column 3
            // Use Object because getValueAt() returns a generic Object just to be safe
            
            // Checks if current row matches the feedback data stored in the class
            if (givenID.equals(ID) && name.equals(studentName) && Integer.parseInt(rate.toString()) == rating && comment.equals(comments)) {

                tableModel.removeRow(i); // If found, removes the matching row
                break; // Breaks out of the loop to avoid unnecessary iteration and prevent index shifting
            }
        }
    }
    
    // This approach could also be used in removeData() as apposed to its crude for loop
    @Override
    public void updateData() {
        
        int selectedRow = table.getSelectedRow(); // Gets the index of the selected row

        if (selectedRow != -1) { // This ensures that a row is selected
            tableModel.setValueAt(ID, selectedRow, 0); // Updates ID in column 0
            tableModel.setValueAt(studentName, selectedRow, 1); // Updates student name in column 1
            tableModel.setValueAt(rating, selectedRow, 2);  // Updates rating in column 2
            tableModel.setValueAt(comments, selectedRow, 3);  // Updates comment in column 3 
        }
    }
}
