/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import time_table_management_system.DBConnect;

/**
 *
 * @author DILIP
 */
public class subject_mgmt extends javax.swing.JFrame {

    //DB connection
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;

    public subject_mgmt() {
        initComponents();

        //DB connection
        con = DBConnect.connect();

        //load data to table
        showSubjDetails();

    }

    public void showSubjDetails() {

        try {

            String sql = "SELECT subj_code as 'Subject Code', subj_name as 'Subject Name', offered_year as 'Offered Year', offered_sem as 'Offered Semester', lect_hours as 'Lecture Hours', tute_hours as 'Tutorial Hours', lab_hours as 'Lab Hours', eval_hours as 'Evaluation Hours' from subject ";
            pst = con.prepareStatement(sql);
            res = pst.executeQuery();

            subjDetails.setModel(DbUtils.resultSetToTableModel(res));

        } catch (SQLException ex) {
            Logger.getLogger(subject_mgmt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        AddSubj = new javax.swing.JButton();
        saveBT = new javax.swing.JButton();
        oYear = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sem1 = new javax.swing.JRadioButton();
        sem2 = new javax.swing.JRadioButton();
        subjName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lh1 = new javax.swing.JSpinner();
        saveBT1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        th = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        labh = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        evh = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjDetails = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        subjCode = new javax.swing.JTextField();
        lm1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tm = new javax.swing.JSpinner();
        evm = new javax.swing.JSpinner();
        labm = new javax.swing.JSpinner();
        save3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Subjects");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        AddSubj.setBackground(new java.awt.Color(168, 211, 229));
        AddSubj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddSubj.setText("Add Subject");
        AddSubj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjActionPerformed(evt);
            }
        });

        saveBT.setBackground(new java.awt.Color(168, 211, 229));
        saveBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBT.setText("Save");
        saveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTActionPerformed(evt);
            }
        });

        oYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year 1", "Year 2", "Year 3", "Year 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Offered Year");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Offered Semester");

        buttonGroup1.add(sem1);
        sem1.setText("Semester 1");

        buttonGroup1.add(sem2);
        sem2.setText("Semester 2");

        subjName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Subject Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Subject Code");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Number of Lecture Hours");

        lh1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lh1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        saveBT1.setBackground(new java.awt.Color(168, 211, 229));
        saveBT1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBT1.setText("Home");
        saveBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBT1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Number of Tutorial Hours");

        th.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        th.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Number of Lab Hours");

        labh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labh.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Number of Evaluation Hours");

        evh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        evh.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        subjDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subjDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        subjDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjDetails);

        Delete.setBackground(new java.awt.Color(168, 211, 229));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(168, 211, 229));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        subjCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjCodeActionPerformed(evt);
            }
        });

        lm1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lm1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 15));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("H");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("H");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("H");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("H");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("M");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("M");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("M");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("M");

        tm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tm.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 15));

        evm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        evm.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 15));

        labm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labm.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 15));

        save3.setBackground(new java.awt.Color(168, 211, 229));
        save3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(298, 298, 298)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(subjName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(oYear, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(subjCode, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(sem1)
                                                    .addGap(32, 32, 32)
                                                    .addComponent(sem2)))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(save3)
                                .addGap(18, 18, 18)
                                .addComponent(saveBT1)
                                .addGap(18, 18, 18)
                                .addComponent(AddSubj)
                                .addGap(19, 19, 19)
                                .addComponent(saveBT)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(evh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lh1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(th, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lm1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))
                        .addGap(48, 48, 48)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Delete)
                .addGap(19, 19, 19)
                .addComponent(update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(saveBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddSubj, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(save3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oYear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem1)
                            .addComponent(sem2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lm1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lh1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(th, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(evh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(evm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(31, 31, 31)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddSubjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjActionPerformed


    }//GEN-LAST:event_AddSubjActionPerformed

    //add data to DB
    private void saveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTActionPerformed

        String sem = null;

        if (sem1.isSelected() == true) {
            sem = "1";
        } else if (sem2.isSelected() == true) {
            sem = "2";
        }

        String year = oYear.getSelectedItem().toString();
        String semNo = sem;
        String subName = subjName.getText();
        String scode = subjCode.getText();

        //Spinner
        //lecture hours
        String LectHours = lh1.getValue().toString();
        String LectMinutes = lm1.getValue().toString();
        String lecture = LectHours + ":" + LectMinutes;

        //Tutorial hours
        String tuteHours = th.getValue().toString();
        String tuteMinutes = tm.getValue().toString();
        String tutorial = tuteHours + ":" + tuteMinutes;

        //lab hours
        String labhours = labh.getValue().toString();
        String labMinutes = labm.getValue().toString();
        String labs = labhours + ":" + labMinutes;

        //evaluation hours
        String evHours = evh.getValue().toString();
        String evMinutes = evm.getValue().toString();
        String Evaluation = evHours + ":" + evMinutes;

        String sql = "INSERT INTO subject (subj_code, offered_year, offered_sem, subj_name, lect_hours, tute_hours, lab_hours, eval_hours) values ('" + scode + "', '" + year + "', '" + semNo + "', '" + subName + "', '" + lecture + "', '" + tutorial + "', '" + labs + "', '" + Evaluation + "')";
        try {
            pst = con.prepareStatement(sql);
            pst.execute();

            showSubjDetails();

        } catch (SQLException ex) {
            Logger.getLogger(subject_mgmt.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_saveBTActionPerformed

    private void subjNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjNameActionPerformed

    private void saveBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBT1ActionPerformed

    
    //Delete button avtion
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        //confirmation
        int x = JOptionPane.showConfirmDialog(null, "Do you want to update?");

        if (x == 0) {
            String sem = null;

            if (sem1.isSelected() == true) {
                sem = "1";
            } else if (sem2.isSelected() == true) {
                sem = "2";
            }

            String year = oYear.getSelectedItem().toString();
            String semNo = sem;
            String subName = subjName.getText();
            String scode = subjCode.getText();

            //Spinner
            //lecture hours
            String LectHours = lh1.getValue().toString();
            String LectMinutes = lm1.getValue().toString();
            String lecture = LectHours + ":" + LectMinutes;

            //Tutorial hours
            String tuteHours = th.getValue().toString();
            String tuteMinutes = tm.getValue().toString();
            String tutorial = tuteHours + ":" + tuteMinutes;

            //lab hours
            String labhours = labh.getValue().toString();
            String labMinutes = labm.getValue().toString();
            String labs = labhours + ":" + labMinutes;

            //evaluation hours
            String evHours = evh.getValue().toString();
            String evMinutes = evm.getValue().toString();
            String Evaluation = evHours + ":" + evMinutes;
            
            try {
                String sql = "DELETE from Subject where subj_code = '"+scode+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
                
                showSubjDetails();

            }catch (SQLException ex) {
            Logger.getLogger(subject_mgmt.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    
    //Update data
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        //confirmation
        int x = JOptionPane.showConfirmDialog(null, "Do you want to update?");

        if (x == 0) {
            String sem = null;

            if (sem1.isSelected() == true) {
                sem = "1";
            } else if (sem2.isSelected() == true) {
                sem = "2";
            }

            String year = oYear.getSelectedItem().toString();
            String semNo = sem;
            String subName = subjName.getText();
            String scode = subjCode.getText();

            //Spinner
            //lecture hours
            String LectHours = lh1.getValue().toString();
            String LectMinutes = lm1.getValue().toString();
            String lecture = LectHours + ":" + LectMinutes;

            //Tutorial hours
            String tuteHours = th.getValue().toString();
            String tuteMinutes = tm.getValue().toString();
            String tutorial = tuteHours + ":" + tuteMinutes;

            //lab hours
            String labhours = labh.getValue().toString();
            String labMinutes = labm.getValue().toString();
            String labs = labhours + ":" + labMinutes;

            //evaluation hours
            String evHours = evh.getValue().toString();
            String evMinutes = evm.getValue().toString();
            String Evaluation = evHours + ":" + evMinutes;
            
            try {
                String sql = "UPDATE subject SET subj_code = '" + scode + "', offered_year = '" + year + "', offered_sem = '" + semNo + "', subj_name = '" + subName + "', lect_hours = '" + lecture + "', tute_hours ='" + tutorial + "', lab_hours = '" + labs + "', eval_hours = '" + Evaluation + "' where subj_code = '"+ scode +"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                
                showSubjDetails();

            }catch (SQLException ex) {
            Logger.getLogger(subject_mgmt.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_updateActionPerformed


    private void subjCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjCodeActionPerformed

    //Show details when mouse clicked
    private void subjDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjDetailsMouseClicked
        int row = subjDetails.getSelectedRow();

        String scode = subjDetails.getValueAt(row, 0).toString();
        String year = subjDetails.getValueAt(row, 1).toString();
        String semNo = subjDetails.getValueAt(row, 2).toString();
        String subName = subjDetails.getValueAt(row, 3).toString();
        String lecH = subjDetails.getValueAt(row, 4).toString();
        String tutH = subjDetails.getValueAt(row, 5).toString();
        String labH = subjDetails.getValueAt(row, 6).toString();
        String evalH = subjDetails.getValueAt(row, 7).toString();

        if ("1".equals(semNo)) {
            sem1.setSelected(true);
        } else if ("2".equals(semNo)) {
            sem2.setSelected(true);
        }

        oYear.setSelectedItem(year);

        subjName.setText(subName);
        subjCode.setText(scode);
    }//GEN-LAST:event_subjDetailsMouseClicked

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        Main homebt = new Main();
        homebt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_save3ActionPerformed

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
            java.util.logging.Logger.getLogger(subject_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subject_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subject_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subject_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subject_mgmt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSubj;
    private javax.swing.JButton Delete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSpinner evh;
    private javax.swing.JSpinner evm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner labh;
    private javax.swing.JSpinner labm;
    private javax.swing.JSpinner lh1;
    private javax.swing.JSpinner lm1;
    private javax.swing.JComboBox<String> oYear;
    private javax.swing.JButton save3;
    private javax.swing.JButton saveBT;
    private javax.swing.JButton saveBT1;
    private javax.swing.JRadioButton sem1;
    private javax.swing.JRadioButton sem2;
    private javax.swing.JTextField subjCode;
    private javax.swing.JTable subjDetails;
    private javax.swing.JTextField subjName;
    private javax.swing.JSpinner th;
    private javax.swing.JSpinner tm;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
