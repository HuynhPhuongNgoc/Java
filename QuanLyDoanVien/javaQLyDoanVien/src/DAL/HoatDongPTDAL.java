/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HoatDongPT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HoatDongPTDAL {
    public static ArrayList<HoatDongPT> getALL() throws SQLException {
        ArrayList<HoatDongPT> hdpt = new ArrayList<>();
        DTO.HoatDongPT hoatdongpt;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from HoatDongPT";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaHDPT=rs.getString("MaHDPT");
                    String NgayBatDau=rs.getString("NgayBatDau");
                    String NgayKetThuc=rs.getString("NgayKetThuc");
                    String NoiDungHD=rs.getString("NoiDungHD");
                    String DiaDiem=rs.getString("DiaDiem");
                    String MaDV=rs.getString("MaDV");
                        
                    hoatdongpt = new  HoatDongPT(MaHDPT,NgayBatDau,NgayKetThuc,NoiDungHD,DiaDiem,MaDV);
                    hdpt.add(hoatdongpt);
                }   } catch (SQLException ex) {
                Logger.getLogger(HoatDongPTDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hdpt;
    }
     public static int Insert(String MaHDPT, String NgayBatDau,String NgayKetThuc, String NoiDungHD, String DiaDiem, String MaDV ){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into HoatDongPT(MaHDPT,NgayBatDau,NgayKetThuc,NoiDungHD,DiaDiem,MaDV) values ('"+ MaHDPT +"','"+NgayBatDau +"','"+NgayKetThuc+"',N'"+ NoiDungHD +"',N'"+ DiaDiem+"','"+MaDV+"')";
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
     public static int Update(String MaHDPT, String NgayBatDau,String NgayKetThuc, String NoiDungHD, String DiaDiem, String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update HoatDongPT set NgayBatDau = '"+ NgayBatDau +"',NgayKetThuc='"+ NgayKetThuc +"',NoiDungHD = N'"+ NoiDungHD +"',DiaDiem=N'"+DiaDiem+"',MaDV='"+MaDV+"' where MaHDPT = '"+ MaHDPT +"'";
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
     public static int Delete(String MaHDPT){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from HoatDongPT where MaHDPT = '"+ MaHDPT +"'";
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
        ArrayList<HoatDongPT> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaHDPT()+"\t"+test.get(i).getNgayBatDau()+"\t"+test.get(i).getNgayKetThuc()+"\t"+test.get(i).getNoiDungHD()+"\t"+test.get(i).getDiaDiem()+"\t"+test.get(i).getMaDV());
        }
    }
}
