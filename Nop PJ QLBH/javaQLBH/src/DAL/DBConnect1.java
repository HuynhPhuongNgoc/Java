/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class DBConnect1 {
    static String dbURL="jdbc:sqlserver://NGOCNGOCKUTE\\MSSQLSERVER;databaseName=javaQLBH;user=sa;password=sa"; 
    public static Connection moketnoi() {
        
        try {
            Connection  conn= DriverManager.getConnection(dbURL);
            return conn;

        } catch (SQLException ex) {
            return null;
        }
        
    }
 
   
}
