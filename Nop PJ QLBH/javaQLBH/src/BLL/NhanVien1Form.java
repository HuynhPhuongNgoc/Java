/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVien1DAL;
import DTO.NhanVien1;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class NhanVien1Form {
      public static ArrayList<NhanVien1> NhanVienArray(){
         return NhanVien1DAL.getALL();
}
       public static DefaultTableModel NhanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã nhân viên");
        model.addColumn("Tên nhân viên");
        model.addColumn("Giới tính");
        model.addColumn("Địa chỉ");
        model.addColumn("Điện thoại");
        model.addColumn("Ngày sinh");

        try{
            for(int i = 0; i < NhanVienArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(NhanVienArray().get(i).getMaNhanVien());
                h.add(NhanVienArray().get(i).getTenNhanVien());
                h.add(NhanVienArray().get(i).getGioiTinh());
                h.add(NhanVienArray().get(i).getDiaChi());
                h.add(NhanVienArray().get(i).getDienThoai());
                 h.add(NhanVienArray().get(i).getNgaySinh());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static int InsertNhanVien(String MaNhanVien,String TenNhanVien,String GioiTinh, String DiaChi,String DienThoai, String NgaySinh){
            return NhanVien1DAL.Insert(MaNhanVien,TenNhanVien,GioiTinh,DiaChi,DienThoai,NgaySinh);
    }
    
    public static int UpdateNhanVien(String MaNhanVien,String TenNhanVien,String GioiTinh, String DiaChi,String DienThoai, String NgaySinh){
            return NhanVien1DAL.Update(MaNhanVien,TenNhanVien,GioiTinh,DiaChi,DienThoai,NgaySinh);
    }
    
    public static int DeleteNhanVien(String MaNhanVien){
            return NhanVien1DAL.Delete(MaNhanVien);
    }
    
    public static void main(String[] args) {
        System.out.println(NhanVienArray());
        
    }
}     
