/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author John
 */
public class koneksilokal {
    private static Connection koneksi;
    public static Connection getConnection(){
        
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost";
                String user = "root";
                String pass = "123";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            
            }catch(SQLException e){
                JOptionPane.showConfirmDialog(null, "Gagal Koneksi"+e);
            }
        }
        return koneksi;
}
}
