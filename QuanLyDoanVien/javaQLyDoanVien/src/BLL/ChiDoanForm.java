/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChiDoanDAL;
import DTO.ChiDoan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class ChiDoanForm {
     public static ArrayList<ChiDoan> ChiDoanArray() throws SQLException{
        return ChiDoanDAL.getALL();
}
       public static DefaultTableModel ChiDoanModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Chi Đoàn");
        model.addColumn("Tên Chi Đoàn");
        try{
            for(int i = 0; i < ChiDoanArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChiDoanArray().get(i).getMaChiDoan());
                h.add(ChiDoanArray().get(i).getTenChiDoan());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
   public static int InsertChiDoan(String MaChiDoan,String TenChiDoan){
            return ChiDoanDAL.Insert(MaChiDoan, TenChiDoan);
    }
    
    public static int UpdateChatLieu(String MaChiDoan, String TenChiDoan){
            return ChiDoanDAL.Update(MaChiDoan, TenChiDoan);
    }
    
    public static int DeleteChatLieu(String MaChiDoan){
            return ChiDoanDAL.Delete(MaChiDoan);
    } 
}
