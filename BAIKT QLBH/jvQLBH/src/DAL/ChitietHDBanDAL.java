/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.ChitietHDBan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class ChitietHDBanDAL {
      public static ArrayList<ChitietHDBan> getALL() throws SQLException {
        ArrayList<ChitietHDBan> chat = new ArrayList<>();
        DTO.ChitietHDBan chitiet;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from tblChitietHDBan1";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaHDBan =rs.getString("MaHDBan");
                    String Mahang=rs.getString("Mahang");
                    float Soluong=rs.getFloat("Soluong");
                    float Dongia=rs.getFloat("Dongia");
                    float Giamgia=rs.getFloat("Giamgia");
                    float Thanhtien=rs.getFloat("Thanhtien");
                    chitiet = new  ChitietHDBan(MaHDBan, Mahang, Soluong, Dongia, Giamgia, Thanhtien);
                    chat.add(chitiet);
                }   } catch (SQLException ex) {
                Logger.getLogger(ChitietHDBanDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return chat;
    }
     public static int Insert(String MaHDBan, String Mahang, float Soluong,float Dongia,float Giamgia,float Thanhtien){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblChitietHDBan1(MaHDBan, Mahang, Soluong,DonGia,Giamgia,Thanhtien) values ('"+ MaHDBan +"','"+ Mahang +"',"+ Soluong +","+ Dongia +","+ Giamgia +","+ Thanhtien +")";
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
    
    public static int Update(String MaHDBan, String Mahang, float Soluong, float Dongia,float Giamgia,float Thanhtien){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblChitietHDBan1 set Soluong = "+ Soluong +",DOngia = "+ Dongia +",Giamgia="+ Giamgia +",ThanhTien = "+ Thanhtien +" where MaHDBan = '"+ MaHDBan +"' and MaHang='"+Mahang+"'";
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
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblChiTietHDBan1 where MaHDBan = '"+MaHDBan+"'";
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
        ArrayList<ChitietHDBan> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaHDBan()+"\t"+test.get(i).getMahang()+"\t"+test.get(i).getSoluong()+"\t"+test.get(i).getDongia()+"\t"+test.get(i).getGiamgia()+"\t"+test.get(i).getThanhtien());
        }
    }
}
    
