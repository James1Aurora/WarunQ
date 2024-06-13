/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.warunq.warunq;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Win10
 */
public class PosFrame extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    
    /**
     * Creates new form inventory
     */
    public PosFrame() {
        initComponents();
        initWebcam();
        initRealTimeClock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        warunqLabel = new javax.swing.JLabel();
        posButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cameraPanel = new javax.swing.JPanel();
        kodeBarangField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kodeBarangLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addToCartButton = new javax.swing.JButton();
        removeFromCartButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        cashLabel = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        jButton5.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        jButton5.setText("Dashboard");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(244, 206, 20));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        homeButton.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        homeButton.setText("Beranda");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        inventoryButton.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        inventoryButton.setText("Penyimpanan");
        inventoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventoryButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        reportButton.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        reportButton.setText("Laporan");
        reportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        settingsButton.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        settingsButton.setText("Pengaturan");
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        logoutButton.setText("Keluar");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        warunqLabel.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 36)); // NOI18N
        warunqLabel.setText("WarunQ");

        posButton.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        posButton.setText("Kasir");
        posButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        posButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        posButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warunqLabel)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(posButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warunqLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cameraPanel.setBackground(new java.awt.Color(0, 0, 0));
        cameraPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 206, 20), 2, true));
        cameraPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(cameraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 160));

        kodeBarangField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBarangFieldActionPerformed(evt);
            }
        });
        jPanel4.add(kodeBarangField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, 30));

        jPanel1.setBackground(new java.awt.Color(73, 94, 87));

        jLabel1.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kasir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 780, 40));

        kodeBarangLabel.setBackground(new java.awt.Color(255, 255, 255));
        kodeBarangLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel4.add(kodeBarangLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 230, 30));

        totalLabel.setBackground(new java.awt.Color(0, 0, 0));
        totalLabel.setFont(new java.awt.Font("RobotoMono Nerd Font", 2, 14)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(102, 102, 102));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("Total");
        totalLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, new java.awt.Color(204, 204, 204)));
        totalLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 410, 30));

        jLabel3.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 14)); // NOI18N
        jLabel3.setText("Kode Barang");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        addToCartButton.setBackground(new java.awt.Color(0, 153, 0));
        addToCartButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addToCartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });
        jPanel4.add(addToCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 40, 30));

        removeFromCartButton.setBackground(new java.awt.Color(153, 0, 0));
        removeFromCartButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeFromCartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeFromCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromCartButtonActionPerformed(evt);
            }
        });
        jPanel4.add(removeFromCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 40, 30));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produk", "Kuantitas", "Harga"
            }
        ));
        jScrollPane2.setViewportView(cartTable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 480, 360));

        cashLabel.setBackground(new java.awt.Color(0, 0, 0));
        cashLabel.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        cashLabel.setForeground(new java.awt.Color(102, 102, 102));
        cashLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashLabel.setText("Tunai");
        cashLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, new java.awt.Color(204, 204, 204)));
        cashLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(cashLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 280, 40));

        subtotalLabel.setBackground(new java.awt.Color(0, 0, 0));
        subtotalLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        subtotalLabel.setForeground(new java.awt.Color(102, 102, 102));
        subtotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtotalLabel.setText("Sub-Total");
        subtotalLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, new java.awt.Color(204, 204, 204)));
        subtotalLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(subtotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 410, 30));

        payButton.setBackground(new java.awt.Color(244, 206, 20));
        payButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        payButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        jPanel4.add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 50, 90));

        jLabel7.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 12)); // NOI18N
        jLabel7.setText("Total");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 12)); // NOI18N
        jLabel8.setText("Sub-Total");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        timeLabel.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 14)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("08:00:00");
        timeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 280, 30));

        dateLabel.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 14)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Jumat, 14 Juni 2024");
        dateLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        // TODO add your handling code here:
        InventoryFrame inventoryFrame = new InventoryFrame();
        inventoryFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        ReportFrame reportFrame = new ReportFrame();
        reportFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reportButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        // TODO add your handling code here:
        SettingsFrame settingsFrame = new SettingsFrame();
        settingsFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void posButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posButtonActionPerformed
        // TODO add your handling code here:
        PosFrame posFrame = new PosFrame();
        posFrame.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_posButtonActionPerformed

    private void kodeBarangFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBarangFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeBarangFieldActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
        playSound("audio/cash_register_x.wav");
    }//GEN-LAST:event_payButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
        playSound("audio/coin2.wav");
//        kodeBarangField.setText("");
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void removeFromCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromCartButtonActionPerformed
        // TODO add your handling code here:
        playSound("audio/Voicy_Roblox Delete.wav");
    }//GEN-LAST:event_removeFromCartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosFrame().setVisible(true);
            }
        });
    }
    
    private void initWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        
        cameraPanel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, cameraPanel.getWidth(), cameraPanel.getHeight()));
        
        executor.execute(this);
    }
    
    private void initRealTimeClock() {
        Timer timer = new Timer(1000, event -> updateDateTime());
        timer.start();
    }
    
    @Override
    public void run() {
        do {            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Logger.getLogger(PosFrame.class.getName()).log(Level.SEVERE, null, e);
            }
            
            Result result = null;
            BufferedImage image = null;
            
            image = webcam.getImage();
            
            if (webcam.isOpen()) {
                if (image == null) {
                    continue;
                }
            }
            
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            
            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
                Logger.getLogger(PosFrame.class.getName()).log(Level.SEVERE, null, e);
            }
            
            if (result != null) {
                kodeBarangField.setText(result.getText());
                playSound("audio/Barcode-scanner-beep-sound.wav");
//                addToCartButton.doClick();
            }
                    
        } while (true);
    }
    
    @Override
    public Thread newThread (Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }
    
    private void  updateDateTime() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM YYYY", Locale.forLanguageTag("id-ID"));
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.forLanguageTag("id-ID"));
        
        LocalDateTime now = LocalDateTime.now();
        
        dateLabel.setText(now.format(dateFormatter));
        timeLabel.setText(now.format(timeFormatter));
    }
    
    private void playSound(String relativePath) {


            new Thread(() -> {
                try (InputStream audioSrc = getClass().getClassLoader().getResourceAsStream(relativePath)) {
                    
//                File soundFile = new File(fileName);
//
//                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
//
//                Clip clip = AudioSystem.getClip();
//
//                clip.open(audioInputStream);
//
//                clip.start();

                    if (audioSrc == null) {
                        System.err.println("Could not find the file: " + relativePath);
                        return;
                    }
                    
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioSrc);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                    Logger.getLogger(PosFrame.class.getName()).log(Level.SEVERE, "Exception occurred", e);
                }
            }).start();
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JPanel cameraPanel;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel cashLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kodeBarangField;
    private javax.swing.JLabel kodeBarangLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton payButton;
    private javax.swing.JButton posButton;
    private javax.swing.JButton removeFromCartButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel warunqLabel;
    // End of variables declaration//GEN-END:variables
}
