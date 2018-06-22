/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.TinTuc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TinTucDAL {
    public static ArrayList<TinTuc> getALL() throws SQLException {
        ArrayList<TinTuc> tt = new ArrayList<>();
        DTO.TinTuc tintuc;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from TinTuc";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaTinTuc =rs.getString("MaTinTuc");
                    String TenTinTuc=rs.getString("TenTinTuc");
                    String NoiDungTT=rs.getString("NoiDungTT");
                    String ThoiGianDang=rs.getString("ThoiGianDang");
                    String NguoiDang=rs.getString("NguoiDang");
                        
                    tintuc = new  TinTuc(MaTinTuc, TenTinTuc,NoiDungTT,ThoiGianDang,NguoiDang);
                    tt.add(tintuc);
                }   } catch (SQLException ex) {
                Logger.getLogger(TinTucDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tt;
    }
    public static ArrayList<TinTuc> findTT( String TGD){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from TinTuc where ThoiGianDang = '"+ TGD +"'";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<TinTuc> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaTinTuc =rs.getString("MaTinTuc");
                    String TenTinTuc=rs.getString("TenTinTuc");
                    String NoiDungTT=rs.getString("NoiDungTT");
                    String ThoiGianDang=rs.getString("ThoiGianDang");
                    String NguoiDang=rs.getString("NguoiDang");
                    TinTuc tintuc = new TinTuc(MaTinTuc, TenTinTuc,NoiDungTT,ThoiGianDang,NguoiDang);
                    ds.add(tintuc);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
     public static int Insert(String MaTinTuc, String TenTinTuc,String NoiDungTT, String ThoiGianDang, String NguoiDang){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into TinTuc(MaTinTuc, TenTinTuc, NoiDungTT, ThoiGianDang, NguoiDang) values ('"+ MaTinTuc +"',N'"+TenTinTuc +"',N'"+NoiDungTT+"','"+ ThoiGianDang +"',N'"+ NguoiDang+"')";
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
      public static int Update(String MaTinTuc, String TenTinTuc,String NoiDungTT, String ThoiGianDang, String NguoiDang){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update TinTuc set TenTinTuc = N'"+ TenTinTuc +"',NoiDungTT=N'"+ NoiDungTT +"',ThoiGianDang = '"+ ThoiGianDang +"',NguoiDang=N'"+NguoiDang+"' where MaTinTuc = '"+ MaTinTuc +"'";
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
       public static int Delete(String MaTinTuc){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from TinTuc where MaTinTuc = '"+ MaTinTuc +"'";
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
        ArrayList<TinTuc> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaTinTuc()+"\t"+test.get(i).getTenTinTuc()+"\t"+test.get(i).getNoiDungTT()+"\t"+test.get(i).getThoiGianDang()+"\t"+test.get(i).getNguoiDang());
        }
    }
}
