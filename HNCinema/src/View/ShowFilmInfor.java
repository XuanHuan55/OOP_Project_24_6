/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ListAccount;
import Controller.ListFilm;
import Model.AccountModel;
import Model.Film;
import javax.swing.JOptionPane;

/**
 *
 * @author haing
 */
public class ShowFilmInfor extends javax.swing.JFrame {

    private Film film;

    public ShowFilmInfor(Film film) {
        this.film = film;
        initComponents();
        if (Login.user == null) {
            this.btnAddFa.setVisible(false);
        }
        if (ListFilmFrame.doesView) {
            this.deleteBT.setVisible(false);
        }
        setData();

    }

    public void setData() {
        pic.setImage(new javax.swing.ImageIcon(getClass().getResource(film.getPathImage())));
        genreLabel.setText(film.getGenre());
        actor.setText(film.getActor());
        time.setText(film.getTime());
        descrip.setText(film.getIntroduction());
        nameFilm.setText(film.getNameFilm());
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
        nameFilm = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        actorLabel2 = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        actor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextArea();
        pic = new View.PictureBox();
        btnAddFa = new javax.swing.JButton();
        exitBT = new javax.swing.JLabel();
        deleteBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        nameFilm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameFilm.setForeground(new java.awt.Color(255, 255, 255));
        nameFilm.setText("Film name");

        l1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(204, 204, 204));
        l1.setText("Genre:");

        l3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(204, 204, 204));
        l3.setText("Time:");

        l2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 204, 204));
        l2.setText("Actor:");

        actorLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        actorLabel2.setForeground(new java.awt.Color(204, 204, 204));
        actorLabel2.setText("Description:");

        genreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(204, 204, 204));
        genreLabel.setText("Genre:");

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(204, 204, 204));
        time.setText("Genre:");

        actor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actor.setForeground(new java.awt.Color(204, 204, 204));
        actor.setText("Genre:");

        descrip.setBackground(new java.awt.Color(0, 0, 0));
        descrip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descrip.setForeground(new java.awt.Color(255, 255, 255));
        descrip.setBorder(null);
        descrip.setCaretColor(new java.awt.Color(255, 255, 255));
        descrip.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        descrip.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(descrip);

        pic.setBorder(new javax.swing.border.MatteBorder(null));

        btnAddFa.setBackground(new java.awt.Color(255, 204, 204));
        btnAddFa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddFa.setForeground(new java.awt.Color(0, 0, 0));
        btnAddFa.setText("Add favorite");
        btnAddFa.setBorder(null);
        btnAddFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFaActionPerformed(evt);
            }
        });

        exitBT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitBT.setForeground(new java.awt.Color(255, 255, 255));
        exitBT.setText("Exit");
        exitBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBTMouseClicked(evt);
            }
        });

        deleteBT.setBackground(new java.awt.Color(255, 204, 204));
        deleteBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBT.setForeground(new java.awt.Color(0, 0, 0));
        deleteBT.setText("Delete");
        deleteBT.setBorder(null);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(nameFilm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(exitBT)
                                .addGap(116, 116, 116)
                                .addComponent(btnAddFa, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(deleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l1)
                                        .addGap(18, 18, 18)
                                        .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l2)
                                        .addGap(22, 22, 22)
                                        .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l3)
                                        .addGap(25, 25, 25)
                                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(actorLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(nameFilm)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(genreLabel)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(actor)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l3)
                            .addComponent(time))
                        .addGap(28, 28, 28)
                        .addComponent(actorLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddFa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBT)
                        .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFaActionPerformed

        if (Login.user.checkFaFilm(film)) {
            Login.user.getListFavorite().add(film);
            ListAccount.saveToFile();
            JOptionPane.showMessageDialog(null, "Successful");
        } else {
            JOptionPane.showMessageDialog(null, "Film exists");
        }

    }//GEN-LAST:event_btnAddFaActionPerformed

    private void exitBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBTMouseClicked

        this.dispose();
    }//GEN-LAST:event_exitBTMouseClicked

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
        // TODO add your handling code here:
        
        ListFilm.getList().remove(this.film);
        ListFilm.saveFilm();
        for (AccountModel account : ListAccount.list) {
            account.removeFilm(this.film);
        }
        ListAccount.saveToFile();
        JOptionPane.showMessageDialog(null, "Delete Successful");
    }//GEN-LAST:event_deleteBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actor;
    private javax.swing.JLabel actorLabel2;
    private javax.swing.JButton btnAddFa;
    private javax.swing.JButton deleteBT;
    private javax.swing.JTextArea descrip;
    private javax.swing.JLabel exitBT;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel nameFilm;
    private View.PictureBox pic;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}