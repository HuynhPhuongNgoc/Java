/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.Hang;
/**
 *
 * @author Dell
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HangDAL {
    public static ArrayList<Hang> getALL() throws SQLException {
        ArrayList<Hang> mh = new ArrayList<>();
        DTO.Hang mathang;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from Hang";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String Mahang =rs.getString("Mahang");
                    String Tenhang=rs.getString("Tenhang");
                    float Soluong=rs.getFloat("Soluong");
                    float Dongianhap=rs.getFloat("Dongianhap");
                    float Dongiaban=rs.getFloat("Dongiaban");
                    String Anh =rs.getString("Anh");
                    String Ghichu=rs.getString("Ghichu");
                    String Machatlieu=rs.getString("Machatlieu");
                    mathang = new  Hang(Mahang, Tenhang, Soluong, Dongianhap, Dongiaban, Anh, Ghichu, Machatlieu);
                    mh.add(mathang);
                }   } catch (SQLException ex) {
                Logger.getLogger(HangDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mh;
    }
     public static int Insert(String Mahang, String Tenhang, float Soluong,float Dongianhap,float Dongiaban, String Anh, String Ghichu, String Machatlieu){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into Hang(Mahang, Tenhang, Soluong, Dongianhap, Dongiaban, Anh, Ghichu, Machatlieu) values ('"+ Mahang +"','"+Tenhang +"',"+ Soluong +","+ Dongianhap +","+ Dongiaban +","+ Anh +","+ Ghichu +","+ Machatlieu+")";
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
    
    public static int Update(String Mahang, String Tenhang, float Soluong,float Dongianhap,float Dongiaban, String Anh, String Ghichu, String Machatlieu) {
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update Hang set Mahang = "+ Mahang +", Tenhang = "+ Tenhang +",Soluong="+ Soluong +",Dongianhap = "+ Dongianhap +",Dongiaban = "+ Dongiaban +",Anh = " + Anh +",Ghichu = "+ Ghichu +", Machatlieu = "+ Machatlieu +" where Mahang = '"+ Mahang +"'";
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
    
    public static int Delete(String Mahang){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from Hang where Mahang = '"+Mahang+"'";
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
        ArrayList<Hang> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMahang()+"\t"+test.get(i).getTenhang()+"\t"+test.get(i).getSoluong()+"\t"+test.get(i).getDongianhap()+"\t"+"\t"+test.get(i).getDongiaban()+test.get(i).getAnh()+"\t"+test.get(i).getGhichu()+"\t"+test.get(i).getMachatlieu());
        }
    }
}
    
