/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HDBan1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HDBan1DAL {
    public static ArrayList<HDBan1> getALL() {
        ArrayList<HDBan1> hd = new ArrayList<>();
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
            Statement stm = con.createStatement();
            String sqlSelect = "select * from tblHDBan";
            ResultSet rs=stm.executeQuery(sqlSelect);
         
                while (true) {
                    if(!rs.next()) break;
                    String MaHDBan=rs.getString("MaHDBan");
                    String MaNhanVien =rs.getString("MaNhanVien");
                    String NgayBan =rs.getString("NgayBan");
                    String MaKhach=rs.getString("MaKhach");
                    float TongTien=rs.getFloat("TongTien");
                    
                    HDBan1 hoadon = new  HDBan1(MaHDBan, MaNhanVien,NgayBan, MaKhach, TongTien);
                    hd.add(hoadon);
                }
                con.close();
                return hd;
            } catch (SQLException ex) {
             return  null;
            }
        }
        return null;
    }
     public static int Insert(String MaHDBan, String MaNhanVien, String NgayBan, String MaKhach, float TongTien){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblHDBan(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien) values (N'"+ MaHDBan +"',N'"+MaNhanVien +"',N'"+NgayBan+"N,N'"+ MaKhach +"N,"+ TongTien+")";
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
    
    public static int Update(String MaHDBan, String MaNhanVien, String NgayBan, String MaKhach, float TongTien) {
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblHDBan set MaNhanVien = N'"+ MaNhanVien +"N,NgayBan=N'"+NgayBan+"',MaKhach=N'"+ MaKhach +"N,TongTien = "+ TongTien +" where MaHDBan = N'"+ MaHDBan+"'";;
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
    
    public static int Delete(String MaHDBan){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblHDBan where MaHDBan = N'"+MaHDBan+"'";
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
        ArrayList<HDBan1> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaHDBan()+"\t"+test.get(i).getMaNhanVien()+"\t"+test.get(i).getNgayBan()+"\t"+test.get(i).getMaKhach()+"\t"+test.get(i).getTongTien());
        }
    }

    
}
