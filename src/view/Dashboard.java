
package view;
import controller.DBConnection;
import controller.ManagementController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.FeedBackManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.CounselorManagement;
import model.AppointmentManagement;
/**
 *
 * @author kgsmi
 */
public class Dashboard extends javax.swing.JFrame {
    
    private FeedBackManagement FM;
    private ManagementController MC;
    private CounselorManagement CM;
    private AppointmentManagement AM;
    public static DBConnection db = new DBConnection();
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        DefaultTableModel model1 = (DefaultTableModel) tbFeedback.getModel();
        FM = new FeedBackManagement(model1, tbFeedback);
        
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        CM = new CounselorManagement(model2, jTable2);
        
        DefaultTableModel model3 = (DefaultTableModel) tbAppointments.getModel(); 
        AM = new AppointmentManagement(model3, tbAppointments);
        
        MC = new ManagementController(FM, CM, AM); 
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAppointments = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHours = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtMinutes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDay = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCounselorNameApp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        btnBookApp = new javax.swing.JButton();
        btnViewAllApp = new javax.swing.JButton();
        btnUpdateApp = new javax.swing.JButton();
        btnCancelApp = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtCounselorName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCounselorSpecial = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCounselorAval = new javax.swing.JComboBox<>();
        btnAddCounselor = new javax.swing.JButton();
        btnViewCounselors = new javax.swing.JButton();
        btnUpdateCounselor = new javax.swing.JButton();
        btnRemoveCounselor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFeedback = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtRating = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtStudentNameFeed = new javax.swing.JTextField();
        btnFeedHistory = new javax.swing.JButton();
        btnUpdateEntry = new javax.swing.JButton();
        btnDeleteEntry = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        btnSubmitFeed = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtStudentIDFeed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 248, 249));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel2.setText("<html><u>Belgium Campus Wellness Management Application</u></html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(239, 241, 243));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86), 2));

        tbAppointments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Counselor", "Date", "Time", "Status"
            }
        ));
        tbAppointments.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbAppointments);
        if (tbAppointments.getColumnModel().getColumnCount() > 0) {
            tbAppointments.getColumnModel().getColumn(2).setHeaderValue("Date");
            tbAppointments.getColumnModel().getColumn(3).setHeaderValue("Time");
            tbAppointments.getColumnModel().getColumn(4).setHeaderValue("Status");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 532, 402));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pending", "Confirmed", "In Progress", "Completed", "No-Show", "Rescheduled" }));
        txtStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86)));
        txtStatus.setName("txtStatus"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Status:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Time:");

        txtHours.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        txtHours.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86)));
        txtHours.setName("txtHours"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Hours:");

        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTime.setText(":");
        lblTime.setName("lblTime"); // NOI18N

        txtMinutes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        txtMinutes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Minutes:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Date:");

        txtMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Februrary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        txtMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86)));
        txtMonth.setName("txtMonth"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Month:");

        txtDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st" }));
        txtDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86)));
        txtDay.setName("txtDay"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Day:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Counselor:");

        txtCounselorNameApp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCounselorNameApp.setText("Enter counselor's name");
        txtCounselorNameApp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86)));
        txtCounselorNameApp.setName("txtCounselorNameApp"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student Name:");

        txtStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStudentName.setText("Enter student's name");
        txtStudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 1, 86)));
        txtStudentName.setName("txtStudentName"); // NOI18N

        btnBookApp.setBackground(new java.awt.Color(173, 1, 86));
        btnBookApp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBookApp.setForeground(new java.awt.Color(255, 255, 255));
        btnBookApp.setText("Book Appointment");
        btnBookApp.setName("btnBookApp"); // NOI18N
        btnBookApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppActionPerformed(evt);
            }
        });

        btnViewAllApp.setBackground(new java.awt.Color(173, 1, 86));
        btnViewAllApp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewAllApp.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAllApp.setText("View All");
        btnViewAllApp.setName("btnViewAllApp"); // NOI18N
        btnViewAllApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllAppActionPerformed(evt);
            }
        });

        btnUpdateApp.setBackground(new java.awt.Color(173, 1, 86));
        btnUpdateApp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateApp.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateApp.setText("Update Appointment");
        btnUpdateApp.setName("btnUpdateApp"); // NOI18N
        btnUpdateApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppActionPerformed(evt);
            }
        });

        btnCancelApp.setBackground(new java.awt.Color(173, 1, 86));
        btnCancelApp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelApp.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelApp.setText("Cancel Appointment");
        btnCancelApp.setName("btnCancelApp"); // NOI18N
        btnCancelApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel7)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCounselorNameApp)
                            .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(73, 73, 73)
                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(txtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBookApp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCancelApp)
                        .addGap(40, 40, 40)
                        .addComponent(btnViewAllApp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCounselorNameApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTime)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookApp)
                    .addComponent(btnUpdateApp))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelApp)
                    .addComponent(btnViewAllApp))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 440));

        jTabbedPane1.addTab("Appointment Management", jPanel1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(231, 76, 60), 2, true));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specialization", "Availability"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Date");
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 532, 402));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCounselorName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCounselorName.setText("Enter counselor's name");
        txtCounselorName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(231, 76, 60), 1, true));
        txtCounselorName.setName("txtCounselorName"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Counselor Name:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Specialization:");

        txtCounselorSpecial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCounselorSpecial.setText("Counselor's specialization");
        txtCounselorSpecial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(231, 76, 60), 1, true));
        txtCounselorSpecial.setName("txtCounselorSpecial"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Availability:");

        txtCounselorAval.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCounselorAval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Available", "Unavailable" }));
        txtCounselorAval.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(231, 76, 60), 1, true));
        txtCounselorAval.setName("txtCounselorAval"); // NOI18N

        btnAddCounselor.setBackground(new java.awt.Color(231, 76, 60));
        btnAddCounselor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddCounselor.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCounselor.setText("Add Counselor");
        btnAddCounselor.setName("btnAddCounselor"); // NOI18N
        btnAddCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCounselorActionPerformed(evt);
            }
        });

        btnViewCounselors.setBackground(new java.awt.Color(231, 76, 60));
        btnViewCounselors.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewCounselors.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCounselors.setText("View Counselors");
        btnViewCounselors.setName("btnViewCounselors"); // NOI18N

        btnUpdateCounselor.setBackground(new java.awt.Color(231, 76, 60));
        btnUpdateCounselor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateCounselor.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCounselor.setText("Update Counselor");
        btnUpdateCounselor.setName("btnUpdateCounselor"); // NOI18N
        btnUpdateCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCounselorActionPerformed(evt);
            }
        });

        btnRemoveCounselor.setBackground(new java.awt.Color(231, 76, 60));
        btnRemoveCounselor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoveCounselor.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveCounselor.setText("Remove Counselor");
        btnRemoveCounselor.setName("btnRemoveCounselor"); // NOI18N
        btnRemoveCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCounselorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRemoveCounselor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewCounselors))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddCounselor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateCounselor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCounselorAval, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCounselorName)
                                .addComponent(txtCounselorSpecial)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtCounselorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtCounselorSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtCounselorAval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCounselor)
                    .addComponent(btnUpdateCounselor))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveCounselor)
                    .addComponent(btnViewCounselors))
                .addGap(26, 26, 26))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 440));

        jTabbedPane1.addTab("Counselor Management", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 193, 193), 2, true));

        tbFeedback.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 51)));
        tbFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Counselor", "Rating", "Comments"
            }
        ));
        tbFeedback.setName("tbFeedback"); // NOI18N
        tbFeedback.getTableHeader().setReorderingAllowed(false);
        tbFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFeedbackMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbFeedback);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 532, 402));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Comments:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Rating:");

        txtRating.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5" }));
        txtRating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 193, 193)));
        txtRating.setName("txtRating"); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Student:");

        txtStudentNameFeed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStudentNameFeed.setText("Enter student's name");
        txtStudentNameFeed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 193, 193)));
        txtStudentNameFeed.setName("txtStudentNameFeed"); // NOI18N

        btnFeedHistory.setBackground(new java.awt.Color(74, 193, 193));
        btnFeedHistory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFeedHistory.setText("Feedback History");
        btnFeedHistory.setName("btnFeedHistory"); // NOI18N
        btnFeedHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedHistoryActionPerformed(evt);
            }
        });

        btnUpdateEntry.setBackground(new java.awt.Color(74, 193, 193));
        btnUpdateEntry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateEntry.setText("Update Entry");
        btnUpdateEntry.setName("btnUpdateEntry"); // NOI18N
        btnUpdateEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEntryActionPerformed(evt);
            }
        });

        btnDeleteEntry.setBackground(new java.awt.Color(74, 193, 193));
        btnDeleteEntry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteEntry.setText("Delete Entry");
        btnDeleteEntry.setName("btnDeleteEntry"); // NOI18N
        btnDeleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEntryActionPerformed(evt);
            }
        });

        txtComments.setColumns(20);
        txtComments.setRows(5);
        txtComments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 193, 193)));
        txtComments.setName("txtComments"); // NOI18N
        jScrollPane4.setViewportView(txtComments);

        btnSubmitFeed.setBackground(new java.awt.Color(74, 193, 193));
        btnSubmitFeed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmitFeed.setText("Submit Feedback");
        btnSubmitFeed.setName("btnSubmitFeed"); // NOI18N
        btnSubmitFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitFeedActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ID:");

        txtStudentIDFeed.setText("Enter student's id number");
        txtStudentIDFeed.setName("txtStudentIDFeed"); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSubmitFeed)
                                .addComponent(btnDeleteEntry))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnUpdateEntry)
                                .addComponent(btnFeedHistory)))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStudentNameFeed, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(txtStudentIDFeed)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStudentIDFeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtStudentNameFeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitFeed)
                    .addComponent(btnFeedHistory))
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteEntry)
                    .addComponent(btnUpdateEntry))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 440));

        jTabbedPane1.addTab("Feedback Management", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, 950, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitFeedActionPerformed
        
        String ID = txtStudentIDFeed.getText();
        String StudentName = txtStudentNameFeed.getText();
        int Rating = Integer.parseInt(txtRating.getSelectedItem().toString());
        String Comments = txtComments.getText();
        
        MC.addFeedback(ID, StudentName, Rating, Comments);
        db.addFeedback(ID,StudentName, Rating, Comments);
        
    }//GEN-LAST:event_btnSubmitFeedActionPerformed

    private void btnDeleteEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEntryActionPerformed
        
        String ID = txtStudentIDFeed.getText();
        String StudentName = txtStudentNameFeed.getText();
        int Rating = Integer.parseInt(txtRating.getSelectedItem().toString());
        String Comments = txtComments.getText();
        
        MC.removeFeedback(ID, StudentName, Rating, Comments);
        db.removeFeedback(ID,StudentName, Rating, Comments);
    }//GEN-LAST:event_btnDeleteEntryActionPerformed

    private void tbFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFeedbackMouseClicked
        
        int selectedRow = tbFeedback.getSelectedRow(); 

        if (selectedRow >= 0) {
            String studentID = tbFeedback.getValueAt(selectedRow, 0).toString();
            String studentName = tbFeedback.getValueAt(selectedRow, 1).toString();
            String rating = tbFeedback.getValueAt(selectedRow, 2).toString();
            String comments = tbFeedback.getValueAt(selectedRow, 3).toString();
               
            txtStudentIDFeed.setText(studentID);
            txtStudentNameFeed.setText(studentName);
            txtRating.setSelectedItem(rating);
            txtComments.setText(comments);
        }
        
    }//GEN-LAST:event_tbFeedbackMouseClicked

    private void btnUpdateEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEntryActionPerformed
        
        String ID = txtStudentIDFeed.getText();
        String StudentName = txtStudentNameFeed.getText();
        int Rating = Integer.parseInt(txtRating.getSelectedItem().toString());
        String Comments = txtComments.getText();

        MC.updateFeedback(ID, StudentName, Rating, Comments);
        db.updateFeedback(ID,StudentName, Rating, Comments);
        
    }//GEN-LAST:event_btnUpdateEntryActionPerformed

    private void btnFeedHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedHistoryActionPerformed
        
        try {
            ResultSet rs = db.getAllFeedback();
            DefaultTableModel model = (DefaultTableModel) tbFeedback.getModel();
            model.setRowCount(0);

            if (rs != null) {
                while (rs.next()) {
                    String ID = rs.getString("ID");
                    String studentName = rs.getString("StudentsName");
                    int rating = rs.getInt("Rating");
                    String comments = rs.getString("Comments");

                    Object[] row = {ID, studentName, rating, comments};
                    model.addRow(row);
                }
                rs.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to load feedback history.");
        }
        
    }//GEN-LAST:event_btnFeedHistoryActionPerformed

    private void btnAddCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCounselorActionPerformed
        
        String counselorName = txtCounselorName.getText();
        String specialization = txtCounselorSpecial.getText();
        String availability = txtCounselorAval.getSelectedItem().toString();
        
        MC.addCounselor(counselorName, specialization, availability);
        
    }//GEN-LAST:event_btnAddCounselorActionPerformed

    private void btnUpdateCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCounselorActionPerformed
        
        String counselorName = txtCounselorName.getText();
        String specialization = txtCounselorSpecial.getText();
        String availability = txtCounselorAval.getSelectedItem().toString();
        
        MC.updateCounselor(counselorName, specialization, availability);
        
    }//GEN-LAST:event_btnUpdateCounselorActionPerformed

    private void btnRemoveCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCounselorActionPerformed
        
        String counselorName = txtCounselorName.getText();
        String specialization = txtCounselorSpecial.getText();
        String availability = txtCounselorAval.getSelectedItem().toString();
        
        MC.removeCounselor(counselorName, specialization, availability);
        
    }//GEN-LAST:event_btnRemoveCounselorActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int selectedRow = jTable2.getSelectedRow(); 

        if (selectedRow >= 0) {
            String counselorName= jTable2.getValueAt(selectedRow, 0).toString();
            String specialization = jTable2.getValueAt(selectedRow, 1).toString();
            String availability = jTable2.getValueAt(selectedRow, 2).toString();
               
            txtCounselorName.setText(counselorName);
            txtCounselorSpecial.setText(specialization);
            txtCounselorAval.setSelectedItem(availability);
        }
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnBookAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppActionPerformed
        try {
            String student = txtStudentName.getText().trim();
            String counselor = txtCounselorNameApp.getText().trim();
            String status = txtStatus.getSelectedItem().toString();
            String monthName = txtMonth.getSelectedItem().toString();
            String day = txtDay.getSelectedItem().toString();
            String hour = txtHours.getSelectedItem().toString();
            String minute = txtMinutes.getSelectedItem().toString();

            // Validate inputs
            if (student.isEmpty() || counselor.isEmpty() || status.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
                return;
            }

            // Convert month name to number
            int month = convertMonthNameToNumber(monthName);
            if (month == -1) {
                JOptionPane.showMessageDialog(null, "Invalid month selected.");
                return;
            }

            String formattedDate = String.format("2025-%02d-%02d", month, Integer.parseInt(day.replaceAll("\\D", "")));
            String formattedTime = String.format("%02d:%02d:00", Integer.parseInt(hour), Integer.parseInt(minute));

            System.out.println("Final date: " + formattedDate);
            System.out.println("Final time: " + formattedTime);

            MC.addAppointment(student, counselor, formattedDate, formattedTime, status);
            //db.addAppointment(student, counselor, formattedDate, formattedTime, status);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please select valid numbers for date and time.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error booking appointment:\n" + e.getMessage());
        }   
    }//GEN-LAST:event_btnBookAppActionPerformed

    private void btnUpdateAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppActionPerformed
        String student = txtStudentName.getText();
        String counselor = txtCounselorNameApp.getText();
        String status = txtStatus.getSelectedItem().toString();
        String monthName = txtMonth.getSelectedItem().toString();
        String day = txtDay.getSelectedItem().toString();
        String hour = txtHours.getSelectedItem().toString();
        String minute = txtMinutes.getSelectedItem().toString();
        
        int month = convertMonthNameToNumber(monthName);
        if (month == -1) {
            JOptionPane.showMessageDialog(null, "Invalid month selected.");
            return;
        }

        String formattedDate = String.format("2025-%02d-%02d", month, Integer.parseInt(day.replaceAll("\\D", "")));
        String formattedTime = String.format("%02d:%02d:00", Integer.parseInt(hour), Integer.parseInt(minute));;

<<<<<<< Updated upstream
        MC.updateAppointment(student, counselor, date, time, status);
        //db.updateAppointment(student, counselor, date, time, status);
=======
        MC.updateAppointment(student, counselor, formattedDate, formattedTime, status);
        db.updateAppointment(student, counselor, formattedDate, formattedTime, status);
>>>>>>> Stashed changes
    }//GEN-LAST:event_btnUpdateAppActionPerformed

    private void btnCancelAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAppActionPerformed
        int selectedRow = tbAppointments.getSelectedRow(); // Your appointment table

        if (selectedRow >= 0) {
            String student = tbAppointments.getValueAt(selectedRow, 0).toString();
            String date = tbAppointments.getValueAt(selectedRow, 2).toString();
            String time = tbAppointments.getValueAt(selectedRow, 3).toString();

            MC.removeAppointment(); // remove from table
            //db.removeAppointment(student, date, time); // remove from DB
        } else {
            JOptionPane.showMessageDialog(null, "Please select an appointment to remove.");
        }
    }//GEN-LAST:event_btnCancelAppActionPerformed

    private void btnViewAllAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllAppActionPerformed
    try {
        ResultSet rs = db.getAllAppointments();
        DefaultTableModel model = (DefaultTableModel) tbAppointments.getModel();
        model.setRowCount(0);

        if (rs != null) {
            while (rs.next()) {
                String student = rs.getString("StudentName");
                String counselor = rs.getString("Counselor");
                String date = rs.getString("AppointmentDate");
                String time = rs.getString("AppointmentTime");
                String status = rs.getString("Status");

                Object[] row = {student, counselor, date, time, status};
                model.addRow(row);
            }
            rs.close();
        } else {
            JOptionPane.showMessageDialog(null, "No appointment data found.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error:\n" + e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading appointments:\n" + e.getMessage());
    }
    }//GEN-LAST:event_btnViewAllAppActionPerformed
        
    private String formatTwoDigits(String val) {
        return val.length() == 1 ? "0" + val : val;
    }

    
    private int convertMonthNameToNumber(String monthName) {
    switch (monthName.toLowerCase()) {
        case "january": return 1;
        case "february": return 2;
        case "march": return 3;
        case "april": return 4;
        case "may": return 5;
        case "june": return 6;
        case "july": return 7;
        case "august": return 8;
        case "september": return 9;
        case "october": return 10;
        case "november": return 11;
        case "december": return 12;
        default: return -1;
    }
}


    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                try{
                    db.connect();
                    //db.createAppointmentsTable();
                    //db.createFeedbackTable();
                    //db.dropFeedbackTable();
                }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCounselor;
    private javax.swing.JButton btnBookApp;
    private javax.swing.JButton btnCancelApp;
    private javax.swing.JButton btnDeleteEntry;
    private javax.swing.JButton btnFeedHistory;
    private javax.swing.JButton btnRemoveCounselor;
    private javax.swing.JButton btnSubmitFeed;
    private javax.swing.JButton btnUpdateApp;
    private javax.swing.JButton btnUpdateCounselor;
    private javax.swing.JButton btnUpdateEntry;
    private javax.swing.JButton btnViewAllApp;
    private javax.swing.JButton btnViewCounselors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tbAppointments;
    private javax.swing.JTable tbFeedback;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JComboBox<String> txtCounselorAval;
    private javax.swing.JTextField txtCounselorName;
    private javax.swing.JTextField txtCounselorNameApp;
    private javax.swing.JTextField txtCounselorSpecial;
    private javax.swing.JComboBox<String> txtDay;
    private javax.swing.JComboBox<String> txtHours;
    private javax.swing.JComboBox<String> txtMinutes;
    private javax.swing.JComboBox<String> txtMonth;
    private javax.swing.JComboBox<String> txtRating;
    private javax.swing.JComboBox<String> txtStatus;
    private javax.swing.JTextField txtStudentIDFeed;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtStudentNameFeed;
    // End of variables declaration//GEN-END:variables
}
