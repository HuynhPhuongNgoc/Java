/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.Hang1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DTO.*;

public class Hang1DAL {
  public static ArrayList<Hang1> getALL() {
        ArrayList<Hang1> mh = new ArrayList<>();
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try {
                Statement stm = con.createStatement();
                String sqlSelect = "select * from tblHang";
                ResultSet rs=stm.executeQuery(sqlSelect);
           
                while (true) {
                    if(!rs.next()) break;
                    String MaHang =rs.getString("MaHang");
                    String TenHang=rs.getString("TenHang");
                    String MaChatLieu=rs.getString("MaChatLieu");
                    float SoLuong=rs.getFloat("SoLuong");
                    float DonGiaNhap=rs.getFloat("DonGiaNhap");
                    float DonGiaBan=rs.getFloat("DonGiaBan");
                    String Anh =rs.getString("Anh");
                    String GhiChu=rs.getString("GhiChu");
                    Hang1 matHang = new Hang1(MaHang, TenHang,MaChatLieu,SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
//                    mathang = new  Hang1(MaHang, TenHang,MaChatLieu,SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu );
                    mh.add(matHang);
                }  
                con.close();
                return mh;
            } catch (SQLException ex) {
//                Logger.getLogger(Hang1DAL.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }
  public static String TenHang(String MaHang){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TenHang from Hang where MaHang='"+ MaHang +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("TenHang");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
  public static String DonGia(String MaHang){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DonGiaBan from Hang where MaHang='"+ MaHang +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("DonGiaBan");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
     public static int Insert(String MaHang, String TenHang, String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan, String Anh, String GhiChu){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblHang (MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu ) values ('"+ MaHang +"',N'"+TenHang +"','"+ MaChatLieu+"',"+ SoLuong +","+ DonGiaNhap +","+ DonGiaBan +",'"+ Anh +"',N'"+ GhiChu +"')";
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
    
    public static int Update(String MaHang, String TenHang, String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan, String Anh, String GhiChu) {
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblHang set TenHang = N'"+ TenHang +"',MaChatLieu = '"+ MaChatLieu+"',SoLuong="+ SoLuong +",DonGiaNhap = "+ DonGiaNhap +",DonGiaBan = "+ DonGiaBan +",Anh = '" + Anh +"',GhiChu = N'"+ GhiChu +"' where MaHang = '"+ MaHang +"'";
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
    
    public static int Delete(String MaHang){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblHang where MaHang = '"+MaHang+"'";
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
        ArrayList<Hang1> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaHang()+"\t"+test.get(i).getTenHang()+"\t"+test.get(i).getMaChatLieu()+"\t"+ test.get(i).getSoLuong()+"\t"+test.get(i).getDonGiaNhap()+"\t"+"\t"+test.get(i).getDonGiaBan()+test.get(i).getAnh()+"\t"+test.get(i).getGhiChu());
        }
    }   

    
}
