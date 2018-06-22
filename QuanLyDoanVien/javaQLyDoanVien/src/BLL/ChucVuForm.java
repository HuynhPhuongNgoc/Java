/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.ChucVuDAL;
import DTO.ChucVu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class ChucVuForm {
     public static ArrayList<ChucVu> ChucVuArray() throws SQLException{
        return ChucVuDAL.getALL();
}
       public static DefaultTableModel ChucVuModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã chức vụ");
        model.addColumn("Tên chức vụ");
        model.addColumn("Ngày nhậm chức");
        model.addColumn("Ngày hết nhiệm kỳ");
        model.addColumn("Mã Đoàn viên");
        try{
            for(int i = 0; i < ChucVuArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChucVuArray().get(i).getMaChucVu());
                h.add(ChucVuArray().get(i).getTenChucVu());
                h.add(ChucVuArray().get(i).getNgayNhamChuc());
                h.add(ChucVuArray().get(i).getNgayHetNhiemKy());
                h.add(ChucVuArray().get(i).getMaDV());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
        public static int InsertChucVu(String MaChucVu, String TenChucVu,String NgayNhamChuc, String NgayHetNhiemKy, String MaDV){
            return ChucVuDAL.Insert(MaChucVu, TenChucVu,NgayNhamChuc,NgayHetNhiemKy,MaDV);
    }
    
    public static int UpdateChucVu(String MaChucVu, String TenChucVu,String NgayNhamChuc, String NgayHetNhiemKy, String MaDV){
            return ChucVuDAL.Update(MaChucVu, TenChucVu,NgayNhamChuc,NgayHetNhiemKy,MaDV);
    }
    
    public static int DeleteChucVu(String MaChucVu){
            return ChucVuDAL.Delete(MaChucVu);
    } 
}
