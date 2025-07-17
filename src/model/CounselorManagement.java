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
public class CounselorManagement extends Management{
    
    private DefaultTableModel tableModel;
    private JTable table;
    
    public CounselorManagement(DefaultTableModel tableModel, JTable table) {
        this.tableModel = tableModel;
        this.table = table;
    }
    
    private String counselorName;
    private String specialization;
    private String availability;

    public void setConselorData(String counselorName, String specialization, String availability) {
        this.counselorName= counselorName;
        this.specialization = specialization;
        this.availability = availability;
    }
    
    @Override
    public void addData() {
        
        Object[] rowData = {counselorName, specialization, availability};
        tableModel.addRow(rowData);

    }

    @Override
    public void removeData() {
        
        int rowCount = tableModel.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            
            Object name = tableModel.getValueAt(i, 0);
            Object special = tableModel.getValueAt(i, 1);
            Object avail = tableModel.getValueAt(i, 2);

            if (name.equals(counselorName) && special.equals(specialization) && avail.equals(availability)) {

                tableModel.removeRow(i);
                break;
            }
        }
    }
    

    @Override
    public void updateData() {
        
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            tableModel.setValueAt(counselorName, selectedRow, 0);
            tableModel.setValueAt(specialization, selectedRow, 1);
            tableModel.setValueAt(availability, selectedRow, 2);
        }
    }
    
}
