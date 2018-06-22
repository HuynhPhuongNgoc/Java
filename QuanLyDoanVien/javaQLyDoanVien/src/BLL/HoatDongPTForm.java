/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.HoatDongPTDAL;
import DTO.HoatDongPT;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class HoatDongPTForm {
     public static ArrayList<HoatDongPT> HoatDongPTArray() throws SQLException{
        return HoatDongPTDAL.getALL();
}
       public static DefaultTableModel HoatDongPTModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã hoạt động phong trào");
        model.addColumn("Ngày bắt đầu");
        model.addColumn("Ngày kết thúc");
        model.addColumn("Nội dung hoạt động");
        model.addColumn("Địa điểm");
        model.addColumn("Mã đoàn viên");
        try{
            for(int i = 0; i < HoatDongPTArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(HoatDongPTArray().get(i).getMaHDPT());
                h.add(HoatDongPTArray().get(i).getNgayBatDau());
                h.add(HoatDongPTArray().get(i).getNgayKetThuc());
                h.add(HoatDongPTArray().get(i).getNoiDungHD());
                h.add(HoatDongPTArray().get(i).getDiaDiem());
                h.add(HoatDongPTArray().get(i).getMaDV());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
      public static int InsertHoatDongPT(String MaHDPT, String NgayBatDau,String NgayKetThuc, String NoiDungHD, String DiaDiem, String MaDV){
            return HoatDongPTDAL.Insert(MaHDPT,NgayBatDau,NgayKetThuc,NoiDungHD,DiaDiem,MaDV);
    }
    
    public static int UpdateHoatDongPT(String MaHDPT, String NgayBatDau,String NgayKetThuc, String NoiDungHD, String DiaDiem, String MaDV){
            return HoatDongPTDAL.Update(MaHDPT,NgayBatDau,NgayKetThuc,NoiDungHD,DiaDiem,MaDV);
    }
    
    public static int DeleteHoatDongPT(String MaHDPT){
            return HoatDongPTDAL.Delete(MaHDPT);
    }   
}
