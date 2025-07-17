/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * Manages Counselor records in a JTable with proper error handling.
 */
public class CounselorManagement extends Management {

    private DefaultTableModel tableModel; // Model that holds and updates table data
    private JTable table; // The GUI component to display tabular counselor entries
    // Fields to temporarily store counselor data before performing operations
    private String id;
    private String counselorName;
    private String specialization;
    private String availability;
    
    // Constructor to initialize the model and table
    public CounselorManagement(DefaultTableModel tableModel, JTable table) {
        this.tableModel = tableModel;
        this.table = table;
    }

    // Sets the counselor data used for add, remove, and update methods
    public void setCounselorData(String id, String counselorName, String specialization, String availability) {
        this.id = id;
        this.counselorName = counselorName;
        this.specialization = specialization;
        this.availability = availability;
    }

    @Override
    public void addData() {
            Object[] rowData = {id, counselorName, specialization, availability}; // Counselor data for new row
            tableModel.addRow(rowData); // Adds the new row to the table model
    }

    @Override
    public void removeData() {
            int selectedRow = table.getSelectedRow();

            
 if (selectedRow >= 0) {
        tableModel.removeRow(selectedRow);
    } else {
        JOptionPane.showMessageDialog(null, "Please select a counselor to remove.");
    }
        }

    @Override
    public void updateData() {
            int selectedRow = table.getSelectedRow(); // Get the selected row

            if (selectedRow != -1) { // Ensure a row is selected
                // Update the selected row with new data
                tableModel.setValueAt(id, selectedRow, 0);
                tableModel.setValueAt(counselorName, selectedRow, 1);
                tableModel.setValueAt(specialization, selectedRow, 2);
                tableModel.setValueAt(availability, selectedRow, 3);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to update.");
            }
    }
}