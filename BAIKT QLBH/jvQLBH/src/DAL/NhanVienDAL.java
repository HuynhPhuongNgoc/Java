/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.NhanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
/**
 *
 * @author Dell
 */
public class NhanVienDAL {
     public static ArrayList<NhanVien> getALL() throws SQLException {
        ArrayList<NhanVien> nv = new ArrayList<>();
        DTO.NhanVien nhanvien;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from Nhanvien1";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String Manhanvien =rs.getString("Manhanvien");
                    String Tennhanvien =rs.getString("Tennhanvien");
                    String Gioitinh=rs.getString("Gioitinh");
                    String Diachi=rs.getString("Diachi");
                    String Dienthoai=rs.getString("Dienthoai");
                    String Ngaysinh=rs.getString("Ngaysinh");
                    nhanvien = new  NhanVien(Manhanvien, Tennhanvien, Gioitinh, Diachi,Dienthoai,Ngaysinh);
                    nv.add(nhanvien);
                }   } catch (SQLException ex) {
                Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return nv;
    }
     public static int Insert(String Manhanvien, String Tennhanvien, String Gioitinh, String Diachi, String Dienthoai, String Ngaysinh){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
              String sql = "insert into NhanVien1(Manhanvien, Tennhanvien, Gioitinh, Diachi, Dienthoai, Ngaysinh) values ('"+ Manhanvien +"','"+Tennhanvien +"',"+ Gioitinh +","+ Diachi +","+ Dienthoai +","+ Ngaysinh +")";
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
    
    public static int Update(String Manhanvien, String Tennhanvien, String Giơitinh , String Diachi, String Dienthoai, String Ngaysinh) {
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update NhanVien set Manhanvien = "+ Manhanvien +", Tennhanvien = "+ Tennhanvien +",Diachi="+ Diachi +",Dienthoai = "+ Dienthoai +" ,Ngaysinh="+ Ngaysinh +" where Manhanvien = '"+ Manhanvien +"'";;
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
    
    public static int Delete(String Manhanvien){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from Khach where Manhanvien = '"+Manhanvien+"'";
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

