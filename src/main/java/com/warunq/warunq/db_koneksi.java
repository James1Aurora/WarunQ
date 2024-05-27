/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.warunq.warunq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Win10
 */
public class db_koneksi {
    
    public static Connection koneksi;
    
    public static Connection konfigurasi_koneksiDB() throws SQLException {
        
        try {
            String user = "avnadmin";
            String password = "AVNS_dHcesTccniEeErK2qOH";
            String url = "jdbc:mysql://mysql-warunq-warunq.d.aivencloud.com:28737/defaultdb?sslmode=require";

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, password);
            System.out.println("Database berhasil terhubung!");
        } catch (SQLException e) {
            System.err.println("Database gagal terhubung!");
        }
        
        return koneksi;
    }
    
    public static void main(String[] args) throws SQLException {
        Connection penghubung = (Connection)db_koneksi.konfigurasi_koneksiDB();
    }
}
