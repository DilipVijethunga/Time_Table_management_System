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
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import time_table_management_system.DBConnect;

/**
 *
 * @author DILIP
 */
public class lecturers_mgmt extends javax.swing.JFrame {

    //DB connection
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;

    JTextField rankText = new JTextField("testing");

    public lecturers_mgmt() {
        initComponents();

        con = DBConnect.connect();

        rankText.setEditable(false);

        //load table details 
        lectureDetails();

    }

    //load table details and show
    public void lectureDetails() {

        try {
            String sql = "SELECT eid as 'Employee ID', lectur_name as 'Lecturer Name', faculty as 'Faculty', department as 'Department', center as 'Center', building as 'Building', lec_level as 'Level', lec_rank as 'Rank' FROM lecturer";
            pst = con.prepareStatement(sql);
            res = pst.executeQuery();

            lectDetails.setModel(DbUtils.resultSetToTableModel(res));

        } catch (SQLException ex) {
            Logger.getLogger(lecturers_mgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddLect = new javax.swing.JButton();
        RankGen = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        save2 = new javax.swing.JButton();
        LectName = new javax.swing.JTextField();
        EmpID = new javax.swing.JTextField();
        Rank = new javax.swing.JTextField();
        faculty = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        center = new javax.swing.JComboBox<>();
        building = new javax.swing.JComboBox<>();
        level = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lectDetails = new javax.swing.JTable();
        errorBox = new javax.swing.JLabel();
        save3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        AddLect.setBackground(new java.awt.Color(168, 211, 229));
        AddLect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddLect.setText("Add Lecturer");
        AddLect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLectActionPerformed(evt);
            }
        });

        RankGen.setBackground(new java.awt.Color(168, 211, 229));
        RankGen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RankGen.setText("Generate Rank");
        RankGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankGenActionPerformed(evt);
            }
        });

        save1.setBackground(new java.awt.Color(168, 211, 229));
        save1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lecturer Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Faculty");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Center");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Building");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Rank");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Level");

        delete.setBackground(new java.awt.Color(168, 211, 229));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        save2.setBackground(new java.awt.Color(168, 211, 229));
        save2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save2.setText("Update");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });

        LectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LectNameActionPerformed(evt);
            }
        });

        EmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIDActionPerformed(evt);
            }
        });
        EmpID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmpIDKeyPressed(evt);
            }
        });

        Rank.setBackground(new java.awt.Color(204, 204, 204));

        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty of Computing", "Faculty of Engineering", "Faculty of Business", "Faculty of Humanities & Sciences", "Faculty of Graduate Studies & Research", "School of Architecture", "School of Law" }));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Technology.", "Computer systems & network engineering.", "Software Engineering.", "Information Systems Engineering.", "Cyber Security.", "Interactive Media.", "Data Science.", "Bachelor of Information Technology – Curtin University." }));
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });

        center.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Malabe", "Metro", "Matara", "Kandy", "Kurunagala", "Jaffna" }));

        building.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Building", "New building", "D-block" }));

        level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        level.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                levelKeyTyped(evt);
            }
        });

        lectDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        lectDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lectDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lectDetails);

        errorBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errorBox.setForeground(new java.awt.Color(255, 51, 0));

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(department, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(faculty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LectName)
                                    .addComponent(EmpID))))
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rank, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(center, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(building, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(level, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(283, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(save3)
                        .addGap(18, 18, 18)
                        .addComponent(AddLect)
                        .addGap(19, 19, 19)
                        .addComponent(RankGen)
                        .addGap(18, 18, 18)
                        .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddLect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RankGen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LectName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(faculty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(center)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(building))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(level))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(Rank, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LectNameActionPerformed

    //auto generate rank
    private void EmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIDActionPerformed

        String eid = EmpID.getText();
        String lev = level.getSelectedItem().toString();

        Rank.setText(eid + "." + lev);

    }//GEN-LAST:event_EmpIDActionPerformed


    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentActionPerformed

    //save button action
    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed

        //Save Button action
        //eid int
        //level int
        //rank int
        String lname = LectName.getText();
        String eid = EmpID.getText();
        String fac = faculty.getSelectedItem().toString();
        String dep = department.getSelectedItem().toString();
        String cent = center.getSelectedItem().toString();
        String build = building.getSelectedItem().toString();
        String lev = level.getSelectedItem().toString();
        String rnk = Rank.getText();

        try {

            String s = "INSERT INTO lecturer (eid, lectur_name, faculty, department, center, building, lec_level, lec_rank) values ('" + eid + "', '" + lname + "', '" + fac + "', '" + dep + "', '" + cent + "', '" + build + "', '" + lev + "', '" + rnk + "')";
            pst = con.prepareStatement(s);
            pst.execute();

            //load tabledetails after adding a new one
            lectureDetails();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            System.out.print(e);
        }

    }//GEN-LAST:event_save1ActionPerformed

    //Update details 
    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do you want to update?");

        if (x == 0) {
            String lname = LectName.getText();
            String eid = EmpID.getText();
            String fac = faculty.getSelectedItem().toString();
            String dep = department.getSelectedItem().toString();
            String cent = center.getSelectedItem().toString();
            String build = building.getSelectedItem().toString();
            String lev = level.getSelectedItem().toString();
            String rnk = Rank.getText();

            try {
                String sql = "UPDATE lecturer SET lectur_name = '" + lname + "', faculty = '" + fac + "', department = '" + dep + "', center = '" + cent + "', building = '" + build + "', lec_level = '" + lev + "', lec_rank = '" + rnk + "' where eid = '" + eid + "' ";
                pst = con.prepareStatement(sql);
                pst.execute();

                //load table after editing button pressed 
               lectureDetails();

            } catch (SQLException ex) {
                Logger.getLogger(lecturers_mgmt.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_save2ActionPerformed

    //table mouse click on an entry(when editing)
    private void lectDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectDetailsMouseClicked

        int row = lectDetails.getSelectedRow();

        String lname = lectDetails.getValueAt(row, 1).toString();
        String eid = lectDetails.getValueAt(row, 0).toString();
        String fac = lectDetails.getValueAt(row, 2).toString();
        String dep = lectDetails.getValueAt(row, 3).toString();
        String cent = lectDetails.getValueAt(row, 4).toString();
        String build = lectDetails.getValueAt(row, 5).toString();
        String lev = lectDetails.getValueAt(row, 6).toString();
        String rnk = lectDetails.getValueAt(row, 7).toString();

        LectName.setText(lname);
        EmpID.setText(eid);
        faculty.setSelectedItem(fac);
        department.setSelectedItem(dep);
        center.setSelectedItem(cent);
        building.setSelectedItem(build);
        level.setSelectedItem(lev);
        Rank.setText(rnk);


    }//GEN-LAST:event_lectDetailsMouseClicked


    private void RankGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankGenActionPerformed

        String eid = EmpID.getText();
        String lev = level.getSelectedItem().toString();

        Rank.setText(eid + "." + lev);

    }//GEN-LAST:event_RankGenActionPerformed

    //Delete Button Action
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do you want to delete?");

        if (x == 0) {

            String eid = EmpID.getText();

            String sql = "DELETE FROM lecturer where eid = '" + eid + "'";

            try {

                pst = con.prepareStatement(sql);
                pst.execute();

                //load table after delete button pressed
                lectureDetails();

            } catch (SQLException ex) {
                Logger.getLogger(lecturers_mgmt.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_deleteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        Rank.setEditable(false);

    }//GEN-LAST:event_formComponentShown

    //Clear all fields
    private void AddLectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLectActionPerformed

        LectName.setText(null);
        EmpID.setText(null);
        faculty.setSelectedItem("Faculty of Computing");
        department.setSelectedItem("Information Technology.");
        center.setSelectedItem("Malabe");
        building.setSelectedItem("Main Building");
        level.setSelectedItem("1");
        Rank.setText(null);

    }//GEN-LAST:event_AddLectActionPerformed

    private void levelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_levelKeyTyped

    }//GEN-LAST:event_levelKeyTyped

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        Main homebt = new Main();
        homebt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_save3ActionPerformed

    private void EmpIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpIDKeyPressed
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            save1.setEnabled(false);
            errorBox.setText("Only numbers Allowed");
        } else if (Character.isDigit(c)) {
            save1.setEnabled(true);
            errorBox.setText("");
        } else if (EmpID.getText().isEmpty()) {
            save1.setEnabled(true);
            errorBox.setText("");
        }
    }//GEN-LAST:event_EmpIDKeyPressed

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
            java.util.logging.Logger.getLogger(lecturers_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturers_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturers_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturers_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecturers_mgmt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLect;
    private javax.swing.JTextField EmpID;
    private javax.swing.JTextField LectName;
    private javax.swing.JTextField Rank;
    private javax.swing.JButton RankGen;
    private javax.swing.JComboBox<String> building;
    private javax.swing.JComboBox<String> center;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JLabel errorBox;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lectDetails;
    private javax.swing.JComboBox<String> level;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JButton save3;
    // End of variables declaration//GEN-END:variables
}
