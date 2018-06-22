/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TTDoanVieDAL;
import DTO.TTDoanVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class TTDoanVienForm {
    public static ArrayList<TTDoanVien> TTDoanVienArray() throws SQLException{
        return TTDoanVieDAL.getALL();
}
       public static DefaultTableModel TTDoanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã đoàn viên");
        model.addColumn("Họ tên đoàn viên");
        model.addColumn("Ngày sinh");
        model.addColumn("Giới tính");
        model.addColumn("Quê quán");
        model.addColumn("Email");
        model.addColumn("Số điện thoại");
        model.addColumn("Dân tộc");
        model.addColumn("Tôn giáo");
        model.addColumn("Ngày vào Đoàn");
        model.addColumn("Chỗ ở hiện nay");
       
        model.addColumn("Mã chi đoàn");
        
        try{
            for(int i = 0; i < TTDoanVienArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(TTDoanVienArray().get(i).getMaDV());
                h.add(TTDoanVienArray().get(i).getHoTenDV());
                h.add(TTDoanVienArray().get(i).getNgaySinh());
                h.add(TTDoanVienArray().get(i).getGioiTinh());
                h.add(TTDoanVienArray().get(i).getQueQuan());
                h.add(TTDoanVienArray().get(i).getEmail());
                h.add(TTDoanVienArray().get(i).getSDT());
                h.add(TTDoanVienArray().get(i).getDanToc());
                h.add(TTDoanVienArray().get(i).getTonGiao());
                h.add(TTDoanVienArray().get(i).getNgayVaoDoan());
                h.add(TTDoanVienArray().get(i).getChooHienNay());
               
                h.add(TTDoanVienArray().get(i).getMaChiDoan());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
       public static int InsertTTDoanVien(String MaDV, String HoTenDV,String NgaySinh, String GioiTinh, String QueQuan, String Email,String SDT, String DanToc,String TonGiao, String NgayVaoDoan, String ChooHienNay, String MaChiDoan){
            return TTDoanVieDAL.Insert(MaDV,HoTenDV,NgaySinh,GioiTinh,QueQuan,Email,SDT,DanToc,TonGiao,NgayVaoDoan,ChooHienNay,MaChiDoan);
    }
    
    public static int UpdateTTDoanVien(String MaDV, String HoTenDV,String NgaySinh, String GioiTinh, String QueQuan, String Email,String SDT, String DanToc,String TonGiao, String NgayVaoDoan, String ChooHienNay, String MaChiDoan){
            return  TTDoanVieDAL.Update(MaDV,HoTenDV,NgaySinh,GioiTinh,QueQuan,Email,SDT,DanToc,TonGiao,NgayVaoDoan,ChooHienNay,MaChiDoan);
    }
    
    public static int DeleteTTDoanVien(String MaDV){
            return  TTDoanVieDAL.Delete(MaDV);
    }   
}
