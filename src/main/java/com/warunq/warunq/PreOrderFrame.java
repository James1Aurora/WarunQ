/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.warunq.warunq;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win10
 */
public class PreOrderFrame extends javax.swing.JFrame {


    
    public PreOrderFrame() {
        initComponents();
        baca_data();
    }
     private void baca_data(){
        DefaultTableModel data_pesanan = new DefaultTableModel();
        data_pesanan.addColumn("Id");
        data_pesanan.addColumn("Kode Barang");
        data_pesanan.addColumn("Nama Pemesan");
        data_pesanan.addColumn("Kuantitas");
        data_pesanan.addColumn("Tenggat Pesanan");
        data_pesanan.addColumn("Sub-Total");

    try {
        String query_data = "SELECT * FROM pesanan";
        Connection connection = (Connection) DatabaseConnection.configure();
        Statement statement_sql = connection.createStatement();
        ResultSet hasil_SQL = statement_sql.executeQuery(query_data);

        while (hasil_SQL.next()) {
            data_pesanan.addRow(new Object[]{
                hasil_SQL.getInt("id"),
                hasil_SQL.getString("kode_barang"),
                hasil_SQL.getString("nama_pemesan"),
                hasil_SQL.getInt("kuantitas_barang"),
                hasil_SQL.getDate("tenggat_pesanan"),
                hasil_SQL.getDouble("subtotal")
            });
        }

        // Set model to the table after populating it
        pesananTable.setModel(data_pesanan);

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
        
        
     }
     
    public void layar_bersih(){
        namaPemesanField.setText("");
        kodeBarangField.setText("");
        kuantitasBarangField.setText("");
        tanggalTenggatField.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        laporanFrameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesananTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namaPemesanField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kuantitasBarangField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kodeBarangField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tanggalTenggatField = new javax.swing.JTextField();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        warunqLabel = new javax.swing.JLabel();
        posButton = new javax.swing.JButton();

        jButton5.setFont(new java.awt.Font("RobotoMono Nerd Font Mono Md", 0, 14)); // NOI18N
        jButton5.setText("Dashboard");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(73, 94, 87));
        jPanel3.setToolTipText("");

        laporanFrameLabel.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 36)); // NOI18N
        laporanFrameLabel.setForeground(new java.awt.Color(255, 255, 255));
        laporanFrameLabel.setText("Pesanan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(laporanFrameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(laporanFrameLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pesananTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama Pemesan", "Tengat Pesanan", "Kode Barang", "Kuantitas", "Sub-Total"
            }
        ));
        pesananTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesananTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pesananTable);

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(244, 206, 20));
        searchButton.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        searchButton.setText("Cari");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        totalLabel.setBackground(new java.awt.Color(244, 206, 20));
        totalLabel.setFont(new java.awt.Font("RobotoMono Nerd Font", 2, 14)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalLabel.setText(" Rp. ");
        totalLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 206, 20), 3, true));

        jLabel3.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 206, 20));
        jLabel3.setText("TOTAL : ");

        jLabel5.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        jLabel5.setText("Nama Pemesan");

        namaPemesanField.setText(" ");

        jLabel6.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        jLabel6.setText("Kuantitas");

        kuantitasBarangField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuantitasBarangFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        jLabel7.setText("Kode Barang");

        kodeBarangField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBarangFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        jLabel8.setText("Tenggat Pesanan");

        tanggalTenggatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalTenggatFieldActionPerformed(evt);
            }
        });

        buttonTambah.setBackground(new java.awt.Color(0, 153, 0));
        buttonTambah.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        buttonTambah.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambah.setText("Tambah");
        buttonTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUbah.setBackground(new java.awt.Color(73, 94, 87));
        buttonUbah.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        buttonUbah.setForeground(new java.awt.Color(255, 255, 255));
        buttonUbah.setText("Ubah");
        buttonUbah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 206, 20), 1, true));
        buttonUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setBackground(new java.awt.Color(204, 0, 0));
        buttonHapus.setFont(new java.awt.Font("RobotoMono Nerd Font", 1, 12)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("Hapus");
        buttonHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(506, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(namaPemesanField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kodeBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(kuantitasBarangField))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tanggalTenggatField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPemesanField)
                    .addComponent(kuantitasBarangField)
                    .addComponent(kodeBarangField)
                    .addComponent(tanggalTenggatField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(244, 206, 20));

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
                .addContainerGap(19, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void posButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posButtonActionPerformed
        // TODO add your handling code here:
        PosFrame posFrame = new PosFrame();
        posFrame.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_posButtonActionPerformed

    private void kuantitasBarangFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuantitasBarangFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuantitasBarangFieldActionPerformed

    private void kodeBarangFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBarangFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeBarangFieldActionPerformed

    private void tanggalTenggatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalTenggatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalTenggatFieldActionPerformed

    private void pesananTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesananTableMouseClicked
        
        int baris = pesananTable.rowAtPoint(evt.getPoint());

        // Ambil data dari baris yang diklik dan set ke text field
        String id = pesananTable.getValueAt(baris, 0).toString();
        String kode_barang = pesananTable.getValueAt(baris, 1).toString();
        String nama = pesananTable.getValueAt(baris, 2).toString();
        String kuantitas = pesananTable.getValueAt(baris, 3).toString();
        Date tenggat = (Date) pesananTable.getValueAt(baris, 4);
        String subtotal = pesananTable.getValueAt(baris, 5).toString();

        // Format tanggal jika diperlukan
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tenggatStr = sdf.format(tenggat);

        // Set text field
        kodeBarangField.setText(kode_barang);
        namaPemesanField.setText(nama);
        kuantitasBarangField.setText(kuantitas);
        tanggalTenggatField.setText(tenggatStr);
        
        
    }//GEN-LAST:event_pesananTableMouseClicked
private double getHargaBarang(String kode_barang) {
    double harga = 0.0;
    try {
        String query = "SELECT harga FROM barang WHERE kode = ?";
        Connection connection = (Connection) DatabaseConnection.configure();
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, kode_barang);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            harga = rs.getDouble("harga");
        }
        
        rs.close();
        ps.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    
    return harga;
}

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
            // Tangkap variabel inputan dari GUI
        String nama_pemesan = namaPemesanField.getText();
        String tenggat_pesanan = tanggalTenggatField.getText();
        String kode_barang = kodeBarangField.getText();
        String kuantitas_barang = kuantitasBarangField.getText();
    
    try {
        // Konversi string tenggat_pesanan ke java.sql.Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateTenggat = sdf.parse(tenggat_pesanan);
        java.sql.Date sqlDateTenggat = new java.sql.Date(dateTenggat.getTime());

       // Dapatkan harga barang
        double harga_barang = getHargaBarang(kode_barang);
        
        // Hitung subtotal
        int kuantitas = Integer.parseInt(kuantitas_barang);
        double subtotal = harga_barang * kuantitas;

        // Query untuk memasukkan data
        String query_data = "INSERT INTO pesanan (kode_barang, nama_pemesan, kuantitas_barang, tenggat_pesanan, subtotal) VALUES (?, ?, ?, ?, ?)";
        Connection connection = (Connection) DatabaseConnection.configure();
        PreparedStatement perintah_tambah = connection.prepareStatement(query_data);
        perintah_tambah.setString(1, kode_barang);
        perintah_tambah.setString(2, nama_pemesan);
        perintah_tambah.setInt(3, kuantitas);
        perintah_tambah.setDate(4, sqlDateTenggat);
        perintah_tambah.setDouble(5, subtotal);

        // Eksekusi perintah SQL
        perintah_tambah.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
        baca_data();
        layar_bersih();
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
        
        
        
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // Ambil baris yang dipilih di tabel
    int baris = pesananTable.getSelectedRow();
    if (baris != -1) {
        // Ambil ID dari baris yang dipilih
        int id = Integer.parseInt(pesananTable.getValueAt(baris, 0).toString());
        
        try {
            // Query untuk menghapus data berdasarkan ID
            String query_hapus = "DELETE FROM pesanan WHERE id = ?";
            Connection connection = (Connection) DatabaseConnection.configure();
            PreparedStatement perintah_hapus = connection.prepareStatement(query_hapus);
            perintah_hapus.setInt(1, id);

            // Eksekusi perintah SQL
            perintah_hapus.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            baca_data();
            layar_bersih();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus terlebih dahulu!");
    }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
     // Ambil baris yang dipilih di tabel
    int baris = pesananTable.getSelectedRow();
    if (baris != -1) {
        // Ambil ID dari baris yang dipilih
        int id = Integer.parseInt(pesananTable.getValueAt(baris, 0).toString());
        
        // Tangkap variabel inputan dari GUI
        String nama_pemesan = namaPemesanField.getText();
        String tenggat_pesanan = tanggalTenggatField.getText();
        String kode_barang = kodeBarangField.getText();
        String kuantitas_barang = kuantitasBarangField.getText();
        
        try {
            // Konversi string tenggat_pesanan ke java.sql.Date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dateTenggat = sdf.parse(tenggat_pesanan);
            java.sql.Date sqlDateTenggat = new java.sql.Date(dateTenggat.getTime());

            // Dapatkan harga barang
            double harga_barang = getHargaBarang(kode_barang);
            
            // Hitung subtotal
            int kuantitas = Integer.parseInt(kuantitas_barang);
            double subtotal = harga_barang * kuantitas;

            // Query untuk memperbarui data berdasarkan ID
            String query_data = "UPDATE pesanan SET kode_barang = ?, nama_pemesan = ?, kuantitas_barang = ?, tenggat_pesanan = ?, subtotal = ? WHERE id = ?";
            Connection connection = (Connection) DatabaseConnection.configure();
            PreparedStatement perintah_ubah = connection.prepareStatement(query_data);
            perintah_ubah.setString(1, kode_barang);
            perintah_ubah.setString(2, nama_pemesan);
            perintah_ubah.setInt(3, kuantitas);
            perintah_ubah.setDate(4, sqlDateTenggat);
            perintah_ubah.setDouble(5, subtotal);
            perintah_ubah.setInt(6, id);

            // Eksekusi perintah SQL
            perintah_ubah.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            baca_data();
            layar_bersih();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Pilih baris yang ingin diubah terlebih dahulu!");
    }   
    }//GEN-LAST:event_buttonUbahActionPerformed

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
            java.util.logging.Logger.getLogger(PreOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PreOrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodeBarangField;
    private javax.swing.JTextField kuantitasBarangField;
    private javax.swing.JLabel laporanFrameLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField namaPemesanField;
    private javax.swing.JTable pesananTable;
    private javax.swing.JButton posButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton settingsButton;
    private javax.swing.JTextField tanggalTenggatField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel warunqLabel;
    // End of variables declaration//GEN-END:variables
}
