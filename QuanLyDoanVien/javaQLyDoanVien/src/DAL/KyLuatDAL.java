/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KyLuat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class KyLuatDAL {
    public static ArrayList<KyLuat> getALL() throws SQLException {
        ArrayList<KyLuat> kl = new ArrayList<>();
        DTO.KyLuat kyluat;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from KyLuat";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaKyLuat =rs.getString("MaKyLuat");
                    String NgayKyLuat=rs.getString("NgayKyLuat");
                    String NoiDungKL=rs.getString("NoiDungKL");
                    String MaDV=rs.getString("MaDV");
                
                        
                    kyluat = new  KyLuat(MaKyLuat, NgayKyLuat,NoiDungKL,MaDV);
                    kl.add(kyluat);
                }   } catch (SQLException ex) {
                Logger.getLogger(KhenThuongDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kl;
    }
    public static int Insert(String MaKyLuat ,String NgayKyLuat,String NoiDungKL, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into KyLuat(MaKyLuat, NgayKyLuat,NoiDungKL,MaDV) values ('"+ MaKyLuat +"','"+NgayKyLuat +"',N'"+NoiDungKL+"','"+ MaDV +"')";
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
 public static int Update(String MaKyLuat ,String NgayKyLuat,String NoiDungKL, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update KyLuat set NgayKyLuat = '"+ NgayKyLuat +"',NoiDungKL=N'"+ NoiDungKL +"',MaDV = '"+ MaDV +"' where MaKyLuat = '"+ MaKyLuat +"'";
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
  public static int Delete(String MaKyLuat){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from KyLuat where MaKyLuat = '"+ MaKyLuat +"'";
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
        ArrayList<KyLuat> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaKyLuat()+"\t"+test.get(i).getNgayKyLuat()+"\t"+test.get(i).getNoiDungKL()+"\t"+test.get(i).getMaDV());
        }
    }
}
