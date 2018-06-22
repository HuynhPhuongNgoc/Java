/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DoanPhi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DoanPhiDAL {
     public static ArrayList<DoanPhi> getALL() throws SQLException {
        ArrayList<DoanPhi> dp = new ArrayList<>();
        DTO.DoanPhi doanphi;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from DoanPhi";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaDoanPhi =rs.getString("MaDoanPhi");
                    String Ngay=rs.getString("Ngay");
                    String SoTien=rs.getString("SoTien");
                    String NoiDungDP=rs.getString("NoiDungDP");
                    String MaDV=rs.getString("MaDV");
                        
                    doanphi = new  DoanPhi(MaDoanPhi, Ngay, SoTien, NoiDungDP, MaDV);
                    dp.add(doanphi);
                }   } catch (SQLException ex) {
                Logger.getLogger(DoanPhiDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dp;
    }
      public static int Insert(String MaDoanPhi,String  Ngay,String  SoTien, String NoiDungDP, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into DoanPhi(MaDoanPhi, Ngay, SoTien, NoiDungDP, MaDV) values ('"+ MaDoanPhi +"','"+Ngay +"','"+SoTien+"',N'"+ NoiDungDP +"','"+ MaDV+"')";
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
      public static int Update(String MaDoanPhi,String  Ngay,String  SoTien, String NoiDungDP, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update DoanPhi set Ngay = '"+ Ngay +"',SoTien='"+ SoTien +"',NoiDungDP= N'"+ NoiDungDP +"',MaDV='"+MaDV+"' where MaDoanPhi = '"+ MaDoanPhi +"'";
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
      public static int Delete(String MaDoanPhi){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from DoanPhi where MaDoanPhi = '"+ MaDoanPhi +"'";
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
        ArrayList<DoanPhi> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaDoanPhi()+"\t"+test.get(i).getNgay()+"\t"+test.get(i).getSoTien()+"\t"+test.get(i).getNoiDungDP()+"\t"+test.get(i).getMaDV());
        }
    }
}
