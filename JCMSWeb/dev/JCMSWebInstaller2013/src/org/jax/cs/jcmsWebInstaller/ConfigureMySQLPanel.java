/****
Copyright (c) 2015 The Jackson Laboratory

This is free software: you can redistribute it and/or modify it 
under the terms of the GNU General Public License as published by  
the Free Software Foundation, either version 3 of the License, or  
(at your option) any later version.
 
This software is distributed in the hope that it will be useful,  
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 
General Public License for more details.

You should have received a copy of the GNU General Public License 
along with this software.  If not, see <http://www.gnu.org/licenses/>.
****/

package org.jax.cs.jcmsWebInstaller;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author cnh
 */
public class ConfigureMySQLPanel extends JCMSPanel {

    public ConfigureMySQLPanel(JDesktopPane desktopPane, JFrame frame) {
        super.JCMSPanel(desktopPane, frame);
        initComponents();
    }

    public void initialize() {
        String msg = "JCMS Web Installer executes MySQL scripts to create and "
                + "upgrade your database.  To achieve this, MySQL must be added to "
                + "your system path allowing JCMS Web Installer to run any MySQL tool "
                + "without having to include the full path.  "
                + "\n\nPlease follow the link below to add MySQL to the PATH. "
                + "\n\n*Do NOT remove anything from the PATH. Just add MySQL to the PATH, "
                + "by carefully following the steps in this link below*"
                + "\n\n" + getInstruction()
                + "";
        this.txtMessage.setText(msg);
        this.txtMessage.setCaretPosition(0);
    }
    
    private String getInstruction() {
        String instruction = "";
        if (Utils.isWindows()) {
            this.lblWindowsAddPath.setVisible(true);
        } else {
            this.lblWindowsAddPath.setVisible(false);
        }
        return "";
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblWindowsAddPath = new javax.swing.JLabel();

        txtMessage.setEditable(false);
        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtMessage.setLineWrap(true);
        txtMessage.setRows(5);
        txtMessage.setTabSize(5);
        txtMessage.setText("JCMS Web Installer executes MySQL scripts to create and upgrade your database.  To do this, MySQL must be added to your path allowing JCMS Web Installer to run MySQL tools without knowing where it is installed.  \n\nPlease follow these instructions to configure MySQL Server. \n\n");
        txtMessage.setWrapStyleWord(true);
        txtMessage.setCaretPosition(0);
        jScrollPane1.setViewportView(txtMessage);

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonNextActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonNextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configure MySQL Community Server");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblWindowsAddPath.setForeground(new java.awt.Color(0, 0, 255));
        lblWindowsAddPath.setText("Instructions to add MySQL to your System PATH");
        lblWindowsAddPath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblWindowsAddPath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblWindowsAddPathMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWindowsAddPath, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                                .addComponent(nextButton)))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblWindowsAddPath)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(backButton))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonNextActionPerformed
        this.nextPanel(this, this.getJcmsView().getDatabaseSetupPanel(), this.getJcmsView());        
    }//GEN-LAST:event_nextButtonNextActionPerformed

    private void backButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonNextActionPerformed
        this.previousPanel(this, this.getJcmsView());
    }//GEN-LAST:event_backButtonNextActionPerformed

    private void lblWindowsAddPathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWindowsAddPathMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLAddWindowsToPathURL());
    }//GEN-LAST:event_lblWindowsAddPathMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWindowsAddPath;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}