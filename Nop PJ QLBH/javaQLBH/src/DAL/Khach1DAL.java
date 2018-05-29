/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.Khach1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Khach1DAL {
    public static ArrayList<Khach1> getALL()  {
        ArrayList<Khach1> k = new ArrayList<>();
        //DTO.Khach1 khach;
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stm = con.createStatement();
                String sqlSelect = "select * from tblKhach";
                ResultSet rs=stm.executeQuery(sqlSelect);
          
                while (true) {
                    if(!rs.next()) break;
                    String MaKhach =rs.getString("MaKhach");
                    String TenKhach =rs.getString("TenKhach");
                    String DiaChi=rs.getString("DiaChi");
                    String DienThoai=rs.getString("DienThoai");
                    Khach1 khach = new  Khach1(MaKhach, TenKhach, DiaChi, DienThoai);
                    k.add(khach);
                }
                 con.close();
                return k;
            } catch (SQLException ex) {
                //Logger.getLogger(Khach1DAL.class.getName()).log(Level.SEVERE, null, ex);
              return null;
            }
        }
        return null;
    }
      public static String TenKhach(String MaKhach){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TenKhach from Khach where MaKhach='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("TenKhach");
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
      public static String DiaChi(String MaKhach){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DiaChi from Khach where MaKhach='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("DiaChi");
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
      public static String DienThoai(String MaKhach){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DienThoai from Khach where MaKhach='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("DienThoai");
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
    
    
     public static int Insert(String MaKhach, String TenKhach, String DiaChi, String DienThoai){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblKhach(MaKhach, TenKhach, DiaChi, DienThoai) values (N'"+ MaKhach +"',N'"+TenKhach +"',N'"+ DiaChi +"',N'"+ DienThoai +"')";
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
    
    public static int Update(String MaKhach, String TenKhach, String DiaChi ,String DienThoai) {
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblKhach set Tenkhach = N'"+ TenKhach +"',DiaChi=N'"+ DiaChi +"',DienThoai = N'"+ DienThoai +"' where MaKhach = N'"+ MaKhach +"'";;
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
    
    public static int Delete(String MaKhach){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblKhach where MaKhach = N'"+MaKhach+"'";
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
        ArrayList<Khach1> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaKhach()+"\t"+test.get(i).getTenKhach()+"\t"+test.get(i).getDiaChi()+"\t"+test.get(i).getDienThoai());
        }
    }


}
