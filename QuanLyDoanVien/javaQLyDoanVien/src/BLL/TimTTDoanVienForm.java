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
public class TimTTDoanVienForm {
    public static ArrayList<TTDoanVien> FindDV(String valueCombobox,String txtFindValue){ //String MaDV, String TenDV,String MaChiDoan,
        return TTDoanVienDAL.findDV(valueCombobox, txtFindValue);
    }
    public static DefaultTableModel TimDVModel(){
        try{
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
            ArrayList<DTO.TTDoanVien> xuly = TTDoanVienDAL.getALL();
            for(int i = 0 ; i <xuly.size();i++){
                Vector<String> h = new Vector<>();
                h.add(xuly.get(i).getMaDV());
                h.add(xuly.get(i).getHoDV());
                h.add(xuly.get(i).getTenDV());
                h.add(xuly.get(i).getNgaySinh());
                h.add(xuly.get(i).getGioiTinh());
                h.add(xuly.get(i).getQueQuan());
                h.add(xuly.get(i).getEmail());
                h.add(xuly.get(i).getSDT());
                h.add(xuly.get(i).getDanToc());
                h.add(xuly.get(i).getTonGiao());
                h.add(xuly.get(i).getNgayVaoDoan());
                h.add(xuly.get(i).getChooHienNay());
                h.add(xuly.get(i).getMaChiDoan());
                model.addRow(h);
            }
            return model; 
        } catch (Exception e){
            return null;
        }
    }
}
