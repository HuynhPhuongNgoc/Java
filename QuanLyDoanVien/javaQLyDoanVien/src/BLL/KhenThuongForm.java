/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.KhenThuongDAL;
import DTO.KhenThuong;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class KhenThuongForm {
      public static ArrayList<KhenThuong> KhenThuongArray() throws SQLException{
        return KhenThuongDAL.getALL();
}
       public static DefaultTableModel KhenThuongModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã khen thưởng");
        model.addColumn("Ngày khen thưởng");
        model.addColumn("Nội dung khen thưởng");
        model.addColumn("Mã Đoàn viên");
       
        try{
            for(int i = 0; i < KhenThuongArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(KhenThuongArray().get(i).getMaKhenThuong());
                h.add(KhenThuongArray().get(i).getNgayKhenThuong());
                h.add(KhenThuongArray().get(i).getNoiDungKT());
                h.add(KhenThuongArray().get(i).getMaDV());
        
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
        public static int InsertKhenThuong(String MaKhenThuong, String NgayKhenThuong,String NoiDungKT, String MaDV){
            return KhenThuongDAL.Insert(MaKhenThuong, NgayKhenThuong,NoiDungKT,MaDV);
    }
    
    public static int UpdateKhenThuong(String MaKhenThuong, String NgayKhenThuong,String NoiDungKT, String MaDV){
            return KhenThuongDAL.Update(MaKhenThuong, NgayKhenThuong,NoiDungKT,MaDV);
    }
    
    public static int DeleteKhenThuong(String MaKhenThuong){
            return KhenThuongDAL.Delete(MaKhenThuong);
    } 
}
