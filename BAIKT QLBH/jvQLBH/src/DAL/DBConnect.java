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

/**
 *
 * @author Dell
 */
public class DBConnect {
    static String dbURL="jdbc:sqlserver://NGOCNGOCKUTE\\MSSQLSERVER;databaseName=jvQLBH;user=sa;password=sa"; 
    public static Connection moketnoi() {
        
        try {
            Connection  conn= DriverManager.getConnection(dbURL);
            return conn;
//            System.out.print("Kết nối thành công!");
//            JOptionPane.showMessageDialog(null,"Kết nối thành công","Thông báo", JOptionPane.DEFAULT_OPTION);
        } catch (SQLException ex) {
            return null;
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.print(" "+ex);
        }
        
    }
 
   /* static String dbURL="jdbc:sqlserver://localhost;databaseName=jvQLBH;user=sa;password=sa";
    Connection conn=null;
    public DBConnect() {
        try {
           conn= DriverManager.getConnection(dbURL);
           System.out.println("Connect");
        } catch (SQLException e) {
           System.out.println("Not connect"+e);
        }
   }
   
    public Connection getConnection() {return conn;}


DBConnect db = new DBConnect();
        Connection con= db.getConnection();*/
    }


