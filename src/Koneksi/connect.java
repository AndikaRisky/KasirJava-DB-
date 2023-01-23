/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDIKA RISKY FAIZATAMA
 */
public class connect {
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    private static Connection koneksi;  
    
    public connect(){
        try{
            String url = "jdbc:mysql://localhost:3306/db_Penjualan";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,user,password);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"TIDAK BISA TERHUBUNG KE DATABASE\n EROR PADA"+e);
        }
    }
    
           
   public void insertDB(String Barcode,String tanggal,String Nama,int Stok,int harga){
        String sql = "insert into Barang values(?,?,?,?,?,?)";
        try {
            pst = koneksi.prepareStatement(sql);
            pst.setString(1, Barcode);
            pst.setString(2, tanggal);
            pst.setString(3, Nama);
            pst.setInt(4, Stok);
            pst.setInt(5, harga);
            pst.setInt(6, 0);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Insert Gagal\n"+ex);
        }
    }
    public ResultSet SelectDB(){
        String sql = "SELECT * from Barang";
        try {
            st = koneksi.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  rs;
    }
    public void deleteDB(String barcode){
        try {
            String sql = "Delete from barang where Barcode = ?";
            pst = koneksi.prepareStatement(sql);
            pst.setString(1, barcode);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    public void updateDB(String Barcode,String tanggal,String Nama,int Stok,int harga){  
        try {
            String sql = "UPDATE Barang Set Nama =?,stok=?,tanggal=?,harga=? where Barcode=?";
            pst = koneksi.prepareStatement(sql);
            pst.setString(5, Barcode);
            pst.setString(3, tanggal);
            pst.setString(1, Nama);
            pst.setInt(2, Stok);
            pst.setInt(4, harga);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Insert Gagal\n"+ex);
        }
    }
    public void updateStok(int stok,int terjual,String barcode){
        try {
            String sql = "UPDATE Barang set stok=?,terjual=? where Barcode=?";
            pst = koneksi.prepareStatement(sql);
            pst.setInt(1, stok);
            pst.setInt(2, terjual);
            pst.setString(3, barcode);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
    public ResultSet searchDB(String search){
        String sql = "SELECT * from Barang where Barcode like '%"+search+"%' OR Nama LIKE '%"+search+"%'";
        try {
            st = koneksi.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}