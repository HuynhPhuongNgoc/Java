/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TaiKhoan;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
public class DangNhapDAL {
      public Boolean DangNhap(TaiKhoan tk){
        boolean test = true;
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.moketnoi();
            
            String sql = "{call SP_DANGNHAP(?, ?)}";
            CallableStatement cs =conn.prepareCall(sql);
            cs.setString(1, tk.getsTaiKhoan());
            cs.setString(2, tk.getsMatKhau());
            
            ResultSet rs = cs.executeQuery();
            if (rs.next()){
                test = true;
            }
            else{
                test = false;
            }
            
        } catch (Exception e) {
            test = false;
        }
        return test;
    }
}
