/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.NhanVien1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVien1DAL {
     public static ArrayList<NhanVien1> getALL() {
        ArrayList<NhanVien1> nv = new ArrayList<>();
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
            Statement stm = con.createStatement();
            String sqlSelect = "select * from tblNhanVien";
            ResultSet rs=stm.executeQuery(sqlSelect);
            
                while (true) {
                    if(!rs.next()) break;
                    String MaNhanVien =rs.getString("MaNhanVien");
                    String TenNhanVien =rs.getString("TenNhanVien");
                    String GioiTinh =rs.getString("GioiTinh");
                    String DiaChi=rs.getString("DiaChi");
                    String DienThoai=rs.getString("DienThoai");
                    String NgaySinh =rs.getString("NgaySinh");
                    NhanVien1 nhanvien = new  NhanVien1(MaNhanVien, TenNhanVien,GioiTinh, DiaChi,DienThoai, NgaySinh);
                    nv.add(nhanvien);
                }    
                con.close();
                return nv;
            } catch (SQLException ex) {
               return null;
            }
        }
        return null;
    }
      public static String TenNhanVien(String MaNhanVien){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TenNhanVien from NhanVien where MaNhanVien='"+ MaNhanVien +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("TenNhanVien");
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
     public static int Insert(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai, String NgaySinh){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblNhanVien(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh) values (N'"+ MaNhanVien +"',N'"+TenNhanVien +"',N'"+GioiTinh+"',N'"+ DiaChi +"',N'"+ DienThoai +"',N'"+ NgaySinh+"')";
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
    
    public static int Update(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai, String NgaySinh) {
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblNhanVien set TenNhanVien = N'"+ TenNhanVien +"',GioiTinh=N'"+GioiTinh+"',Diachi=N'"+ DiaChi +"',Dienthoai = N'"+ DienThoai +"',NgaySinh =N'"+ NgaySinh +"' where MaNhanVien = N'"+ MaNhanVien +"'";
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
    
    public static int Delete(String MaNhanVien){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblNhanVien where MaNhanVien = N'"+MaNhanVien+"'";
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
        ArrayList<NhanVien1> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaNhanVien()+"\t"+test.get(i).getTenNhanVien()+"\t"+test.get(i).getGioiTinh()+"\t"+test.get(i).getDiaChi()+"\t"+test.get(i).getDienThoai()+"\t"+test.get(i).getNgaySinh());
        }
    }
}
