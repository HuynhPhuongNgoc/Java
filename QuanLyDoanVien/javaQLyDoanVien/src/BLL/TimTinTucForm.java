/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TinTucDAL;
import DTO.TinTuc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class TimTinTucForm {
      public static ArrayList<TinTuc> FindTT(String ThoiGianDang){
        return TinTucDAL.findTT(ThoiGianDang);
}
      public static DefaultTableModel TimTTModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã tin tức");
        model.addColumn("Tên tin tức");
        model.addColumn("Nội dung tin tức");
        model.addColumn("Thời gian đăng");
        model.addColumn("Người đăng");
            return model;
        } catch (Exception e){
            return null;
        }
    }
}
