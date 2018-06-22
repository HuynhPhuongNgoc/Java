/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DoanPhiDAL;
import DTO.DoanPhi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class DoanPhiForm {
    public static ArrayList<DoanPhi> DoanPhiArray() throws SQLException{
        return DoanPhiDAL.getALL();
}
       public static DefaultTableModel DoanPhiModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã đoàn phí");
        model.addColumn("Ngày");
        model.addColumn("Số tiền");
        model.addColumn("Nội dung đoàn phí");
        model.addColumn("Mã đoàn viên");
        try{
            for(int i = 0; i < DoanPhiArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(DoanPhiArray().get(i).getMaDoanPhi());
                h.add( DoanPhiArray().get(i).getNgay());
                h.add( DoanPhiArray().get(i).getSoTien());
                h.add( DoanPhiArray().get(i).getNoiDungDP());
                h.add( DoanPhiArray().get(i).getMaDV());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
       public static int InsertDoanPhi(String MaDoanPhi,String  Ngay,String  SoTien, String NoiDungDP, String MaDV){
            return DoanPhiDAL.Insert(MaDoanPhi, Ngay, SoTien, NoiDungDP, MaDV);
    }
    
    public static int UpdateDoanPhi(String MaDoanPhi,String  Ngay,String  SoTien, String NoiDungDP, String MaDV){
            return DoanPhiDAL.Update(MaDoanPhi, Ngay, SoTien, NoiDungDP, MaDV);
    }
    
    public static int DeleteDoanPhi(String MaDoanPhi){
            return DoanPhiDAL.Delete(MaDoanPhi);
    } 
}
