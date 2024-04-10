/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RestaurantRole;

import java.awt.CardLayout;

import javax.swing.JOptionPane;

import business.DB4OUtil.DB4OUtil;
import business.DB4OUtil.UserDBUtil;
import business.dto.UserDto;
import business.exception.CommonException;

/**
 *
 * @author Lynn Wei
 */
public class ManageInfoJPanel extends javax.swing.JPanel {
    private javax.swing.JPanel userProcessContainer;
    
    private UserDto userDto;
    /**
     * Creates new form ManageInfoJPanel
     */
    public ManageInfoJPanel(javax.swing.JPanel userProcessContainer, UserDto userDto) {
        this.userDto = userDto;
        this.userProcessContainer = userProcessContainer;
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {
        txtRestaurantName = new javax.swing.JTextField();
        lblRestaurantName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblPerson = new javax.swing.JLabel();
        txtUserName4 = new javax.swing.JTextField();
        lblUserName2 = new javax.swing.JLabel();
        lblPassword2 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JTextField();
        txtPerson = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        lblRestaurantName.setText("Restaurant Name:");
        txtRestaurantName.setText(this.userDto.getRestaurantName());

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPerson.setText("Person/Manager:");
        txtPerson.setText(this.userDto.getPerson().getPersonName());

        lblUserName2.setText("User Name:");
        txtUserName4.setText(this.userDto.getUserName());

        lblPassword2.setText("Password:");
        txtPassword2.setText(this.userDto.getPassword());

        lblTitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lblTitle.setText("Restaurant Info");

        btnBack.setText(">>Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPerson)
                                .addGap(18, 18, 18)
                                .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRestaurantName)
                                .addGap(18, 18, 18)
                                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUserName2)
                                    .addComponent(lblPassword2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerson))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantName)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName2)
                    .addComponent(txtUserName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword2)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnUpdate)
                .addGap(122, 122, 122))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // add your handling code here:
        String person = txtPerson.getText();
        String resName = txtRestaurantName.getText();
        String userName = txtUserName4.getText();
        String password = txtPassword2.getText();
        if (person.isEmpty() || userName.isEmpty() || password.isEmpty() || resName.isEmpty()) {
            return;
        }
        this.userDto.getPerson().setPersonName(person);
        this.userDto.setRestaurantName(resName);
        this.userDto.setUserName(userName);
        this.userDto.setPassword(password);
        try {
            UserDBUtil.update(this.userDto);
        } catch (CommonException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
        JOptionPane.showMessageDialog(null, "Manage Restaurant Info updated successfully.");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // add your handling code here:
        ResaurantWorkAreaJPanel rwajp = new ResaurantWorkAreaJPanel(userProcessContainer, this.userDto);
        userProcessContainer.add("ResaurantWorkAreaJPanel", rwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName2;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtPerson;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtUserName4;
    // End of variables declaration//GEN-END:variables
}
