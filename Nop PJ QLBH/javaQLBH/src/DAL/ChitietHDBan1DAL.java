/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.ChitietHDBan1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ChitietHDBan1DAL {
    public static ArrayList<ChitietHDBan1> getALL() throws SQLException {
        ArrayList<ChitietHDBan1> cthd = new ArrayList<>();
        DTO.ChitietHDBan1 chitiet;
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from tblChitietHDBan";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaHDBan =rs.getString("MaHDBan");
                    String MaHang=rs.getString("MaHang");
                    float SoLuong=rs.getFloat("SoLuong");
                    float DonGia=rs.getFloat("DonGia");
                    float GiamGia=rs.getFloat("GiamGia");
                    float ThanhTien=rs.getFloat("ThanhTien");
                    chitiet = new  ChitietHDBan1(MaHDBan, MaHang, SoLuong, DonGia, GiamGia, ThanhTien);
                    cthd.add(chitiet);
                }   } catch (SQLException ex) {
                Logger.getLogger(ChitietHDBan1DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cthd;
    }
     public static int Insert(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblChitietHDBan(MaHDBan, MaHang, SoLuong,DonGia,GiamGia,ThanhTien) values ('"+ MaHDBan +"','"+ MaHang +"',"+ SoLuong +","+ DonGia +","+ GiamGia +","+ ThanhTien +")";
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
    
    public static int Update(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblChitietHDBan set SoLuong = "+ SoLuong +",DonGia = "+ DonGia +",GiamGia="+ GiamGia +",ThanhTien = "+ ThanhTien +" where MaHDBan = '"+ MaHDBan +"' and MaHang='"+MaHang+"'";
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
                String sql = "delete from tblChiTietHDBan where MaHDBan = '"+MaHDBan+"'";
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
        ArrayList<ChitietHDBan1> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaHDBan()+"\t"+test.get(i).getMaHang()+"\t"+test.get(i).getSoLuong()+"\t"+test.get(i).getDonGia()+"\t"+test.get(i).getGiamGia()+"\t"+test.get(i).getThanhTien());
        }
    }
}
