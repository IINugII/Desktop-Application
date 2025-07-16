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
    
    private DefaultTableModel tableModel;
    private JTable table;
    
    public FeedBackManagement(DefaultTableModel tableModel, JTable table) {
        this.tableModel = tableModel;
        this.table = table;
    }
    
    private String studentName;
    private int rating;
    private String comments;
    private String ID;

    public void setFeedbackData(String ID, String studentName, int rating, String comments) {
        this.studentName = studentName;
        this.rating = rating;
        this.comments = comments;
        this.ID = ID;
    }

    @Override
    public void addData() {
        
        Object[] rowData = {ID ,studentName, rating, comments};
        tableModel.addRow(rowData);

    }

    @Override
    public void removeData() {
        
        int rowCount = tableModel.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Object givenID = tableModel.getValueAt(i, 0);
            Object name = tableModel.getValueAt(i, 1);
            Object rate = tableModel.getValueAt(i, 2);
            Object comment = tableModel.getValueAt(i, 3);

            if (givenID.equals(ID) && name.equals(studentName) && Integer.parseInt(rate.toString()) == rating && comment.equals(comments)) {

                tableModel.removeRow(i);
                break;
            }
        }
    }
    

    @Override
    public void updateData() {
        
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            tableModel.setValueAt(ID, selectedRow, 0);
            tableModel.setValueAt(studentName, selectedRow, 1);
            tableModel.setValueAt(rating, selectedRow, 2);
            tableModel.setValueAt(comments, selectedRow, 3);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to update.");
        }
    }
}
