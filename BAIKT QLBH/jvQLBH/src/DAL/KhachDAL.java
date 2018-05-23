/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Khach;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class KhachDAL {
     public static ArrayList<Khach> getALL() throws SQLException {
        ArrayList<Khach> k = new ArrayList<>();
        DTO.Khach khach;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from Khach";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String Makhach =rs.getString("Makhach");
                    String Tenkhach =rs.getString("Tenkhach");
                    String Diachi=rs.getString("Diachi");
                    int Dienthoai=rs.getInt("Dienthoai");
                    khach = new  Khach(Makhach, Tenkhach, Diachi,Dienthoai);
                    k.add(khach);
                }   } catch (SQLException ex) {
                Logger.getLogger(KhachDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return k;
    }
     public static int Insert(String Makhach, String Tenkhach, String Diachi, int Dienthoai){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into Khach(Makhach, Tenkhach, Diachi, Dienthoai) values ('"+ Makhach +"','"+Tenkhach +"',"+ Diachi +","+ Dienthoai +")";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Update(String Makhach, String Tenkhach, String Diachi ,int Dienthoai) {
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update Khach set Makhach = "+ Makhach +", Tenkhach = "+ Tenkhach +",Diachi="+ Diachi +",Dienthoai = "+ Dienthoai +" where Makhach = '"+ Makhach +"'";;
                int rs = stmt.executeUpdate(Sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Delete(String Makhach){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from Khach where Makhach = '"+Makhach+"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    } 
      
    public static void main(String[] args) throws SQLException {
        ArrayList<Khach> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMakhach()+"\t"+test.get(i).getTenkhach()+"\t"+test.get(i).getDiachi()+"\t"+test.get(i).getDienthoai());
        }
    }
}
    


