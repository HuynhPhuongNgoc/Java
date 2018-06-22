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
    public static ArrayList<TTDoanVien> FindDV(String MaDV,String MaChiDoan){
        return TTDoanVienDAL.findDV(MaDV,MaChiDoan);
    }
    public static DefaultTableModel TimDVModel(){
        try{
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
            return model;
        } catch (Exception e){
            return null;
        }
    }
}
