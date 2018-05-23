/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.ChatLieu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ChatLieuDaL {
    public static ArrayList<ChatLieu> getALL() {
        Connection con = DBConnect.moketnoi();
        if(con != null){
        try {
            Statement stm = con.createStatement();
            String sqlSelect = "select * from Chatlieu";
            ResultSet rs=stm.executeQuery(sqlSelect);
            ArrayList<ChatLieu> chat = new ArrayList<>();
        while (true) {            
            if(!rs.next()) break;
            String Machatlieu=rs.getString("Machatlieu");
            String Tenchatlieu=rs.getString("Tenchatlieu");
            DTO.ChatLieu Chatlieu= new DTO.ChatLieu(Machatlieu, Tenchatlieu);
            chat.add(Chatlieu);
        }
        con.close();
        return chat;
        } catch (SQLException ex) {
            System.out.println("Fail");
            return null;
        }
        }
        return null;
    }
     public static int Insert(String Machatlieu, String Tenchatlieu){
            Connection con = DBConnect.moketnoi();
            if(con != null){
                try{
                    Statement stmt = con.createStatement();
                    String sql = "insert into ChatLieu(MachatLieu,TenchatLieu) values ('"+ Machatlieu +"',N'"+ Tenchatlieu +"')";
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
    public static int Update(String Machatlieu, String Tenchatlieu){
            Connection con = DBConnect.moketnoi();
            if(con != null){
                try{
                    Statement stmt = con.createStatement();
                    String sql = "update Chatlieu set Tenchatlieu = N'"+ Tenchatlieu +"' where Machatlieu = '"+ Machatlieu +"'";
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
  public static int Delete(String Machatlieu){
        Connection con = DBConnect.moketnoi();
        if (con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from ChatLieu where Machatlieu = '"+ Machatlieu +"'";
                //String sql = "EXEC dbo.QLBH_DEL @MaCL = N'"+ MaChatLieu +"'";
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
  public static void main(String[] args) {
        ArrayList<ChatLieu> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMachatlieu() +"\t"+test.get(i).getTenchatlieu());
        }
}
}
  
   
    
