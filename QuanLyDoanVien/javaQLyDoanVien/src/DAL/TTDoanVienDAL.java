/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import GUI.TimKiemDVGUI;
import DTO.TTDoanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.metal.MetalComboBoxUI;
public class TTDoanVienDAL {
    public static ArrayList<TTDoanVien> getALL() throws SQLException {
        ArrayList<TTDoanVien> ttdv = new ArrayList<>();
        DTO.TTDoanVien ttdoanvien;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from DoanVienTN";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaDV=rs.getString("MaDV");
                    String HoDV=rs.getString("HoDV");
                    String TenDV=rs.getString("TenDV");
                    String NgaySinh=rs.getString("NgaySinh");
                    String GioiTinh=rs.getString("GioiTinh");
                    String QueQuan=rs.getString("QueQuan");
                    String Email=rs.getString("Email");
                    String SDT=rs.getString("SDT");
                    String DanToc=rs.getString("DanToc");
                    String TonGiao=rs.getString("TonGiao");
                    String NgayVaoDoan=rs.getString("NgayVaoDoan");
                    String ChooHienNay=rs.getString("ChooHienNay");
                  
                    String MaChiDoan=rs.getString("MaChiDoan");
                        
                    ttdoanvien = new  TTDoanVien(MaDV,HoDV,TenDV,NgaySinh,GioiTinh,QueQuan,Email,SDT,DanToc,TonGiao,NgayVaoDoan,ChooHienNay,MaChiDoan);
                    ttdv.add(ttdoanvien);
                }   } catch (SQLException ex) {
                Logger.getLogger(TTDoanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ttdv;
    }
   public static ArrayList<TTDoanVien> findDV(String valueCombobox,String txtFindValue){ //String mdv,String Hten, String MCD,
 //String valueCombobox;
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from DoanVienTN Where "+valueCombobox+"=N'"+txtFindValue+"'";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<TTDoanVien> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaDV=rs.getString("MaDV");
                    String HoDV=rs.getString("HoDV");
                      String TenDV=rs.getString("TenDV");
                    String NgaySinh=rs.getString("NgaySinh");
                    String GioiTinh=rs.getString("GioiTinh");
                    String QueQuan=rs.getString("QueQuan");
                    String Email=rs.getString("Email");
                    String SDT=rs.getString("SDT");
                    String DanToc=rs.getString("DanToc");
                    String TonGiao=rs.getString("TonGiao");
                    String NgayVaoDoan=rs.getString("NgayVaoDoan");
                    String ChooHienNay=rs.getString("ChooHienNay");
                    String MaChiDoan=rs.getString("MaChiDoan");
                    TTDoanVien ttdoanvien = new TTDoanVien(MaDV,HoDV,TenDV,NgaySinh,GioiTinh,QueQuan,Email,SDT,DanToc,TonGiao,NgayVaoDoan,ChooHienNay,MaChiDoan);
                    ds.add(ttdoanvien);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
     public static int Insert(String MaDV, String HoDV,String TenDV,String NgaySinh, String GioiTinh, String QueQuan, String Email,String SDT, String DanToc,String TonGiao, String NgayVaoDoan, String ChooHienNay, String MaChiDoan){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into DoanVienTN(MaDV,HoDV,TenDV,NgaySinh,GioiTinh,QueQuan,Email,SDT,DanToc,TonGiao,NgayVaoDoan,ChooHienNay,MaChiDoan) values ('"+ MaDV +"',N'"+HoDV +"',N'"+TenDV+"','"+NgaySinh+"',N'"+ GioiTinh +"',N'"+ QueQuan+"','"+Email+"','"+SDT+"',N'"+DanToc+"',N'"+TonGiao+"','"+NgayVaoDoan+"',N'"+ChooHienNay+"','"+MaChiDoan+"')";
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
       public static int Update(String MaDV, String HoDV, String TenDV,String NgaySinh, String GioiTinh, String QueQuan, String Email,String SDT, String DanToc,String TonGiao, String NgayVaoDoan, String ChooHienNay, String MaChiDoan){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update DoanVienTN set HoDV = N'"+ HoDV +"',TenDV=N'"+TenDV+"',NgaySinh='"+ NgaySinh +"',GioiTinh = N'"+ GioiTinh +"',QueQuan=N'"+QueQuan+"',Email='"+Email+"',SDT='"+SDT+"',DanToc=N'"+DanToc+"',TonGiao=N'"+TonGiao+"',NgayVaoDoan='"+NgayVaoDoan+"',ChooHienNay=N'"+ChooHienNay+"',MaChiDoan='"+MaChiDoan+"' where MaDV = '"+ MaDV +"'";
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
       public static int Delete(String MaDV){
        Connection con = DBConnect.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from DoanVienTN where MaDV = '"+MaDV +"'";
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
        ArrayList<TTDoanVien> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaDV()+"\t"+test.get(i).getHoDV()+"\t"+test.get(i).getTenDV()+"\t"+test.get(i).getNgaySinh()+"\t"+test.get(i).getGioiTinh()+"\t"+test.get(i).getQueQuan()+"\t"+test.get(i).getEmail()+"\t"+test.get(i).getSDT()+"\t"+test.get(i).getDanToc()+"\t"+test.get(i).getTonGiao()+"\t"+test.get(i).getNgayVaoDoan()+"\t"+test.get(i).getChooHienNay()+"\t"+test.get(i).getMaChiDoan());
        }
    }
      
}
