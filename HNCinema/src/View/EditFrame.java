/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ListFilm;
import Model.Film;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haing
 */
public class EditFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditFrame
     */
    int chosenRow;
    
    public EditFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        showing();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addEditBT = new javax.swing.JButton();
        resetEditBT = new javax.swing.JButton();
        deleteBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEdit = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(453, 549));

        addEditBT.setText("Add");
        addEditBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEditBTActionPerformed(evt);
            }
        });

        resetEditBT.setText("Reset");
        resetEditBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetEditBTMouseClicked(evt);
            }
        });
        resetEditBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetEditBTActionPerformed(evt);
            }
        });

        deleteBT.setText("Delete");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addEditBT)
                .addGap(59, 59, 59)
                .addComponent(resetEditBT)
                .addGap(54, 54, 54)
                .addComponent(deleteBT)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEditBT)
                    .addComponent(resetEditBT)
                    .addComponent(deleteBT))
                .addGap(43, 43, 43))
        );

        tableEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Genre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEdit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEditBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEditBTActionPerformed
        // TODO add your handling code here:
        addeditFilmFrame sf = null;
        try {
            sf = new addeditFilmFrame();
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        sf.setVisible(true);
        sf.pack();
        sf.setLocationRelativeTo(null);//center
    }//GEN-LAST:event_addEditBTActionPerformed

    private void resetEditBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetEditBTMouseClicked
        // TODO add your handling code here:
        showing();
    }//GEN-LAST:event_resetEditBTMouseClicked

    private void resetEditBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetEditBTActionPerformed
        // TODO add your handling code here:
        showing();
    }//GEN-LAST:event_resetEditBTActionPerformed

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
        // TODO add your handling code here:

        String nameFilm = tableEdit.getValueAt(chosenRow, 0).toString();
        for (Film film : ListFilm.getList()) {
            if (film.getNameFilm().equals(nameFilm)) {
                ListFilm.getList().remove(film);
                JOptionPane.showMessageDialog(null, "Remove successfully");
                ListFilm.saveFilm();
                return;
                
            }
        }
    }//GEN-LAST:event_deleteBTActionPerformed

    private void tableEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEditMouseClicked
        // TODO add your handling code here:
        chosenRow = this.tableEdit.rowAtPoint(evt.getPoint());
        String nameFilm = tableEdit.getValueAt(chosenRow, 0).toString();
        for (Film film : ListFilm.getList()) {
            if (film.getNameFilm().equals(nameFilm)) {
                
                new ShowFilmInfor(film).setVisible(true);
                
                return;
            }
        }
    }//GEN-LAST:event_tableEditMouseClicked
    
    private void showing() {
        DefaultTableModel table = (DefaultTableModel) tableEdit.getModel();
        table.setRowCount(0);
        Vector row;
        for (Film film : ListFilm.getList()) {
            row = new Vector<>();
            row.add(film.getNameFilm());
            row.add(film.getGenre());
            table.addRow(row);
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
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEditBT;
    private javax.swing.JButton deleteBT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetEditBT;
    private javax.swing.JTable tableEdit;
    // End of variables declaration//GEN-END:variables
}