/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;


import DAL.Hang1DAL;
import DTO.Hang1;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class Hang1Form {
      public static ArrayList<Hang1> HangArray(){
         return Hang1DAL.getALL();
      }
     public static DefaultTableModel HangModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Hàng");
        model.addColumn("Tên hàng");
        model.addColumn("Mã chất liệu");
        model.addColumn("Số lượng");
        model.addColumn("Đơn giá nhập");
        model.addColumn("Đơn giá bán");
        model.addColumn("Ảnh");
        model.addColumn("Ghi chú");
        try{
            for(int i = 0; i < HangArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(HangArray().get(i).getMaHang());
                h.add(HangArray().get(i).getTenHang());
                h.add(HangArray().get(i).getMaChatLieu());
                h.add(String.valueOf(HangArray().get(i).getSoLuong()));
                h.add(String.valueOf(HangArray().get(i).getDonGiaNhap()));
                h.add(String.valueOf(HangArray().get(i).getDonGiaBan()));
                h.add(HangArray().get(i).getAnh());
                h.add(HangArray().get(i).getGhiChu());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static int InsertHang(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
            return Hang1DAL.Insert(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
    }
    
    public static int UpdateHang(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
            return Hang1DAL.Update(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
    }
    
    public static int DeleteHang(String MaHang){
            return Hang1DAL.Delete(MaHang);
    }
    
    public static void main(String[] args) {
        System.out.println(HangArray());
        
    }
}
