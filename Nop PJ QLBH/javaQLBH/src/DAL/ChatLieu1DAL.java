/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.ChatLieu1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatLieu1DAL {
     public static ArrayList<ChatLieu1> getALL() throws SQLException {
        ArrayList<ChatLieu1> chat = new ArrayList<>();
        DTO.ChatLieu1 chatlieu;
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            Statement stm = con.createStatement();
            String sqlSelect = "select * from tblChatLieu";
            ResultSet rs=stm.executeQuery(sqlSelect);
            try {
                while (rs.next()) {
                    String MaChatLieu =rs.getString("MaChatLieu");
                    String TenChatLieu=rs.getString("TenChatLieu");
                    
                    chatlieu = new  ChatLieu1(MaChatLieu, TenChatLieu);
                    chat.add(chatlieu);
                }   } catch (SQLException ex) {
                Logger.getLogger(ChatLieu1DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return chat;
    }
     public static int Insert(String MaChatLieu, String TenChatLieu){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblChatLieu (MaChatLieu, TenChatLieu) values ('"+ MaChatLieu +"','"+ TenChatLieu +"')";
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
    
    public static int Update(String MaChatLieu, String TenChatLieu){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblChatLieu set TenChatLieu = '"+ TenChatLieu +"' where MaChatLieu = '"+ MaChatLieu +"'";
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
    
    public static int Delete(String MaChatLieu){
        Connection con = DBConnect1.moketnoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblChatLieu where MaChatLieu = '"+ MaChatLieu +"'";
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
        ArrayList<ChatLieu1> test = getALL();
        System.out.println(""+ test.size());
        for(int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i).getMaChatLieu()+"\t"+test.get(i).getTenChatLieu());
        }
    }
}
