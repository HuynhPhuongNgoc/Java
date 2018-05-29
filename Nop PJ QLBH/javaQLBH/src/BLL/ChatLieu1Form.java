/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChatLieu1DAL;
import DTO.ChatLieu1;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ChatLieu1Form {
        public static ArrayList<ChatLieu1> ChatLieuArray() throws SQLException{
        return ChatLieu1DAL.getALL();
}
        
    public static DefaultTableModel ChatLieuModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Chất Liệu");
        model.addColumn("Tên Chất Liệu");
        try{
            for(int i = 0; i < ChatLieuArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChatLieuArray().get(i).getMaChatLieu());
                h.add(ChatLieuArray().get(i).getTenChatLieu());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
    
    public static int InsertChatLieu(String MaChatLieu,String TenChatLieu){
            return ChatLieu1DAL.Insert(MaChatLieu, TenChatLieu);
    }
    
    public static int UpdateChatLieu(String MaChatLieu, String TenChatLieu){
            return ChatLieu1DAL.Update(MaChatLieu, TenChatLieu);
    }
    
    public static int DeleteChatLieu(String MaChatLieu){
            return ChatLieu1DAL.Delete(MaChatLieu);
    }
}
