/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.KyLuatDAL;
import DTO.KyLuat;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class KyLuatForm {
    public static ArrayList<KyLuat> KyLuatArray() throws SQLException{
        return KyLuatDAL.getALL();
}
       public static DefaultTableModel KyLuatModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã kỷ luật");
        model.addColumn("Ngày kỷ luật");
        model.addColumn("Nội dung kỷ luật");
        model.addColumn("Mã Đoàn viên");
       
        try{
            for(int i = 0; i < KyLuatArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(KyLuatArray().get(i).getMaKyLuat());
                h.add(KyLuatArray().get(i).getNgayKyLuat());
                h.add(KyLuatArray().get(i).getNoiDungKL());
                h.add(KyLuatArray().get(i).getMaDV());
        
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
        public static int InsertKyLuat(String MaKyLuat ,String NgayKyLuat,String NoiDungKL, String MaDV){
            return KyLuatDAL.Insert(MaKyLuat, NgayKyLuat,NoiDungKL,MaDV);
    }
    
    public static int UpdateKyLuat(String MaKyLuat ,String NgayKyLuat,String NoiDungKL, String MaDV){
            return KyLuatDAL.Update(MaKyLuat, NgayKyLuat,NoiDungKL,MaDV);
    }
    
    public static int DeleteKyLuat(String MaKyLuat){
            return KyLuatDAL.Delete(MaKyLuat);
    } 
}
