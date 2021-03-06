/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TTDoanVienDAL;
import DTO.TTDoanVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class TTDoanVienForm {
    public static ArrayList<TTDoanVien> TTDoanVienArray() throws SQLException{
        return TTDoanVienDAL.getALL();
}
       public static DefaultTableModel TTDoanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã đoàn viên");
        model.addColumn("Họ đoàn viên");
        model.addColumn("Tên đoàn viên");
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
                h.add(TTDoanVienArray().get(i).getHoDV());
                h.add(TTDoanVienArray().get(i).getTenDV());
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
       public static int InsertTTDoanVien(String MaDV, String HoDV,String TenDV,String NgaySinh, String GioiTinh, String QueQuan, String Email,String SDT, String DanToc,String TonGiao, String NgayVaoDoan, String ChooHienNay, String MaChiDoan){
            return TTDoanVienDAL.Insert(MaDV,HoDV,TenDV,NgaySinh,GioiTinh,QueQuan,Email,SDT,DanToc,TonGiao,NgayVaoDoan,ChooHienNay,MaChiDoan);
    }
    
    public static int UpdateTTDoanVien(String MaDV, String HoDV,String TenDV,String NgaySinh, String GioiTinh, String QueQuan, String Email,String SDT, String DanToc,String TonGiao, String NgayVaoDoan, String ChooHienNay, String MaChiDoan){
            return  TTDoanVienDAL.Update(MaDV,HoDV,TenDV,NgaySinh,GioiTinh,QueQuan,Email,SDT,DanToc,TonGiao,NgayVaoDoan,ChooHienNay,MaChiDoan);
    }
    
    public static int DeleteTTDoanVien(String MaDV){
            return  TTDoanVienDAL.Delete(MaDV);
    }   
}
