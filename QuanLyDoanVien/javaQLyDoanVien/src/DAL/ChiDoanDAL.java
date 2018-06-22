/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.ChiDoan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ChiDoanDAL {
    public static ArrayList<ChiDoan> getALL() throws SQLException {
        ArrayList<ChiDoan> chd = new ArrayList<>();
        DTO.ChiDoan chidoan;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from ChiDoan";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaChiDoan =rs.getString("MaChiDoan");
                    String TenChiDoan=rs.getString("TenChiDoan");
                    
                    chidoan = new  ChiDoan(MaChiDoan, TenChiDoan);
                    chd.add(chidoan);
                }   } catch (SQLException ex) {
                Logger.getLogger(ChiDoanDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return chd;
    }
    public static int Insert(String MaChiDoan, String TenChiDoan){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into ChiDoan (MaChiDoan, TenChiDoan) values ('"+ MaChiDoan +"','"+ TenChiDoan +"')";
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
    public static int Update(String MaChiDoan, String TenChiDoan){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update ChiDoan set TenChiDoan = '"+ TenChiDoan +"' where MaChiDoan = '"+ MaChiDoan +"'";
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
     public static int Delete(String MaChiDoan){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from ChiDoan where MaChiDoan = '"+ MaChiDoan +"'";
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
        ArrayList<ChiDoan> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaChiDoan()+"\t"+test.get(i).getTenChiDoan());
        }
    }
}
