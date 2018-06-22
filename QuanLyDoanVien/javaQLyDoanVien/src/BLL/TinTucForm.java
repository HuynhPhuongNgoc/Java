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
public class TinTucForm {
        public static ArrayList<TinTuc> TinTucArray() throws SQLException{
        return TinTucDAL.getALL();
}
       public static DefaultTableModel TinTucModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã tin tức");
        model.addColumn("Tên tin tức");
        model.addColumn("Nội dung tin tức");
        model.addColumn("Thời gian đăng");
        model.addColumn("Người đăng");
        try{
            for(int i = 0; i < TinTucArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(TinTucArray().get(i).getMaTinTuc());
                h.add(TinTucArray().get(i).getTenTinTuc());
                h.add(TinTucArray().get(i).getNoiDungTT());
                h.add(TinTucArray().get(i).getThoiGianDang());
                h.add(TinTucArray().get(i).getNguoiDang());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
        public static int InsertTinTuc(String MaTinTuc,String TenTinTuc, String NoiDungTT, String ThoiGianDang, String NguoiDang){
            return TinTucDAL.Insert(MaTinTuc,TenTinTuc,NoiDungTT,ThoiGianDang,NguoiDang);
    }
    
    public static int UpdateTinTuc(String MaTinTuc,String TenTinTuc, String NoiDungTT, String ThoiGianDang, String NguoiDang){
            return TinTucDAL.Update(MaTinTuc,TenTinTuc,NoiDungTT,ThoiGianDang,NguoiDang);
    }
    
    public static int DeleteTinTuc(String MaTinTuc){
            return TinTucDAL.Delete(MaTinTuc);
    } 
}
