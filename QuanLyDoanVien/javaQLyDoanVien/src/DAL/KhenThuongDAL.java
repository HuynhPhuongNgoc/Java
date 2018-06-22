/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhenThuong;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class KhenThuongDAL {
    public static ArrayList<KhenThuong> getALL() throws SQLException {
        ArrayList<KhenThuong> kt = new ArrayList<>();
        DTO.KhenThuong khenthuong;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from KhenThuong";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaKhenThuong =rs.getString("MaKhenThuong");
                    String NgayKhenThuong=rs.getString("NgayKhenThuong");
                    String NoiDungKT=rs.getString("NoiDungKT");
                    String MaDV=rs.getString("MaDV");
                
                        
                    khenthuong = new  KhenThuong(MaKhenThuong, NgayKhenThuong,NoiDungKT,MaDV);
                    kt.add(khenthuong);
                }   } catch (SQLException ex) {
                Logger.getLogger(KhenThuongDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kt;
    }
     public static int Insert(String MaKhenThuong, String NgayKhenThuong,String NoiDungKT, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into KhenThuong(MaKhenThuong, NgayKhenThuong,NoiDungKT,MaDV) values ('"+ MaKhenThuong +"','"+NgayKhenThuong +"',N'"+NoiDungKT+"','"+ MaDV +"')";
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
     public static int Update(String MaKhenThuong, String NgayKhenThuong,String NoiDungKT, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update KhenThuong set NgayKhenThuong = '"+ NgayKhenThuong +"',NoiDungKT=N'"+ NoiDungKT +"',MaDV = '"+ MaDV +"' where MaKhenThuong = '"+ MaKhenThuong +"'";
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
     public static int Delete(String MaKhenThuong){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from KhenThuong where MaKhenThuong = '"+ MaKhenThuong +"'";
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
        ArrayList<KhenThuong> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaKhenThuong()+"\t"+test.get(i).getNgayKhenThuong()+"\t"+test.get(i).getNoiDungKT()+"\t"+test.get(i).getMaDV());
        }
    }
}
