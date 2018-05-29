/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Khach1DAL;
import DTO.Khach1;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class Khach1Form {
      public static ArrayList<Khach1> KhachArray(){
        return Khach1DAL.getALL();
    }
      public static DefaultTableModel KhachModel(){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Khách");
            model.addColumn("Tên Khách");
            model.addColumn("Địa Chỉ");
            model.addColumn("Điện Thoại");
            try{
            for(int i = 0; i < KhachArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(KhachArray().get(i).getMaKhach());
                h.add(KhachArray().get(i).getTenKhach());
                h.add(KhachArray().get(i).getDiaChi());
                h.add(KhachArray().get(i).getDienThoai());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
             System.out.println(e);
            return null;
        }
    }
    
    public static int InsertKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return Khach1DAL.Insert(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int UpdateKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return Khach1DAL.Update(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int DeleteKhach(String MaKhach){
        return Khach1DAL.Delete(MaKhach);
    }
}
