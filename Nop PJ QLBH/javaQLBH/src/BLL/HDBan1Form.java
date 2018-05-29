/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChitietHDBan1DAL;
import DAL.HDBan1DAL;
import DAL.Hang1DAL;
import DAL.Khach1DAL;
import DAL.NhanVien1DAL;
import DTO.HDBan1;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class HDBan1Form {
      public static ArrayList<HDBan1> HDBanArray(){
         return HDBan1DAL.getALL();
}
       public static DefaultTableModel HDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Hàng");
            model.addColumn("Tên hàng");
            model.addColumn("Số lượng");
            model.addColumn("Đơn giá");
            model.addColumn("Giảm giá");
            model.addColumn("Thành tiền");
            return model;
        } catch (Exception e){
            return null;
        }
    }
      public static String TenNVHDBan(String MaNhanVien){
        return NhanVien1DAL.TenNhanVien(MaNhanVien);
    }
    
    public static String TenKhachHDBan(String MaKhach){
        return Khach1DAL.TenKhach(MaKhach);
    }
    
    public static String DTKhachHDBan(String MaKhach){
        return Khach1DAL.DienThoai(MaKhach);
    }
    
    public static String DCKhachHDBan(String MaKhach){
        return Khach1DAL.DiaChi(MaKhach);
    }
    
    public static String TenHangHDBan(String MaHang){
        return Hang1DAL.TenHang(MaHang);
    }
    
    public static String DonGiaHDBan(String MaHang){
        return Hang1DAL.DonGia(MaHang);
    }
    
    public static int InsertHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBan1DAL.Insert(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int UpdateHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBan1DAL.Update(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int DeleteHDBan(String MaHDBan){
        return HDBan1DAL.Delete(MaHDBan);
    }
    
    public static int InsertChiTietHDBan(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        return ChitietHDBan1DAL.Insert(MaHDBan, MaHang, SoLuong, DonGia, GiamGia, ThanhTien);
    }
    public static void main(String[] args) {
        System.out.println(HDBanArray());
        
    }
}
