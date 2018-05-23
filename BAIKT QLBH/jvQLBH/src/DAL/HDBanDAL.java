/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;



import DTO.HDBan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dell
 */
public class HDBanDAL {
   public static ArrayList<HDBan> getALL() throws SQLException {
        ArrayList<HDBan> hdb = new ArrayList<>();
        DTO.HDBan hdban;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from tblHDBan1";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaHDBan =rs.getString("MaHDBan");
                    String Manhanvien=rs.getString("Manhanvien");
                    String Ngayban=rs.getString("Ngayban");
                    String MaKhach=rs.getString("MaKhach");
                    float Tongtien=rs.getFloat("Tongtien");
                   
                    hdban = new  HDBan(MaHDBan, Manhanvien, Ngayban, MaKhach, Tongtien);
                    hdb.add(hdban);
                }   } catch (SQLException ex) {
                Logger.getLogger(HDBanDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hdb;
    }
     public static int Insert(String MaHDBan, String Manhanvien, String Ngayban, String MaKhach,float Tongtien){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblHDBan1(MaHDBan, Manhanvien, Ngayban, MaKhach, Tongtien) values ('"+ MaHDBan +"','"+Manhanvien +"',"+ Ngayban +","+ MaKhach +","+ Tongtien +")";
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
    
    public static int Update(String MaHDBan, String Manhanvien, String Ngayban, String MaKhach,float Tongtien) {
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblHDBan1 set MaHDBan = "+ MaHDBan +", Manhanvien = "+ Manhanvien +", Ngayban="+ Ngayban +", MaKhach= "+ MaKhach +", Tongtien = "+ Tongtien+"'";
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
                String sql = "delete from tblHDBan1 where MaHDBan = '"+MaHDBan+"'";
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
        ArrayList<HDBan> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaHDBan()+"\t"+test.get(i).getManhanvien()+"\t"+test.get(i).getNgayban()+"\t"+test.get(i).getMaKhach()+"\t"+"\t"+test.get(i).getTongtien());
        }
    }
}
    
