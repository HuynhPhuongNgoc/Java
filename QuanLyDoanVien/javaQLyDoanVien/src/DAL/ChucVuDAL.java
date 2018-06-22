/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.ChucVu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ChucVuDAL {
     public static ArrayList<ChucVu> getALL() throws SQLException {
        ArrayList<ChucVu> cv = new ArrayList<>();
        DTO.ChucVu chucvu;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from ChucVu";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaChucVu =rs.getString("MaChucVu");
                    String TenChucVu=rs.getString("TenChucVu");
                    String NgayNhamChuc=rs.getString("NgayNhamChuc");
                    String NgayHetNhiemKy=rs.getString("NgayHetNhiemKy");
                    String MaDV=rs.getString("MaDV");
                        
                    chucvu = new  ChucVu(MaChucVu, TenChucVu,NgayNhamChuc,NgayHetNhiemKy,MaDV);
                    cv.add(chucvu);
                }   } catch (SQLException ex) {
                Logger.getLogger(ChucVuDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cv;
    }
     public static int Insert(String MaChucVu, String TenChucVu,String NgayNhamChuc, String NgayHetNhiemKy, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into ChucVu(MaChucVu, TenChucVu, NgayNhamChuc, NgayHetNhiemKy, MaDV) values ('"+ MaChucVu +"',N'"+TenChucVu +"','"+NgayNhamChuc+"','"+ NgayHetNhiemKy +"','"+ MaDV+"')";
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
     public static int Update(String MaChucVu, String TenChucVu,String NgayNhamChuc, String NgayHetNhiemKy, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update ChucVu set TenChucVu = N'"+ TenChucVu +"',NgayNhamChuc='"+ NgayNhamChuc +"',NgayHetNhiemKy = '"+ NgayHetNhiemKy +"',MaDV=N'"+MaDV+"' where MaChucVu = '"+ MaChucVu +"'";
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
       public static int Delete(String MaChucVu){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from ChucVu where MaChucVu = '"+ MaChucVu +"'";
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
        ArrayList<ChucVu> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaChucVu()+"\t"+test.get(i).getTenChucVu()+"\t"+test.get(i).getNgayNhamChuc()+"\t"+test.get(i).getNgayHetNhiemKy()+"\t"+test.get(i).getMaDV());
        }
    }
}
