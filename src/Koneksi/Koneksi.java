/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.*;


/**
 *
 * @author Nurul Kafi
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    Connection connect;
    Statement sttmnt;
    ResultSet rslt;
    private static Connection koneksi;  
    public static Connection getKoneksi(){
        try{
            String url = "jdbc:mysql://localhost/minimarket";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,user,password);
            System.out.println("Koneksi berhasil");
            
        }catch(Exception e){
            System.out.println("Koneksi Gagal");
        }return koneksi;
    }
}
