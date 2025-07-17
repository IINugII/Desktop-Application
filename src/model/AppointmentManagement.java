package model;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AppointmentManagement extends Management {

    private DefaultTableModel tableModel;
    private JTable table;
    private String studentName;
    private String counselor;
    private String date;
    private String time;
    private String status;

    public AppointmentManagement(DefaultTableModel tableModel, JTable table) {
        this.tableModel = tableModel;
        this.table = table;
    }

    public void setAppointmentData(String studentName, String counselor, String date, String time, String status) {

        this.studentName = studentName;
        this.counselor = counselor;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    @Override
    public void addData() {
        Object[] rowData = {studentName, counselor, date, time, status};
        tableModel.addRow(rowData);
    }

    @Override
    public void removeData() {
        int selectedRow = table.getSelectedRow();

        if (selectedRow >= 0) {
            tableModel.removeRow(selectedRow);
        }
    }


    @Override
    public void updateData() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.setValueAt(studentName, selectedRow, 0);
            tableModel.setValueAt(counselor, selectedRow, 1);
            tableModel.setValueAt(date, selectedRow, 2);
            tableModel.setValueAt(time, selectedRow, 3);
            tableModel.setValueAt(status, selectedRow, 4);
        }
    }
}
