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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TaiKhoanDAL {
     DBConnect s = new DBConnect();
    Connection conn = s.moketnoi();
    public ArrayList<TaiKhoan> LoadDsTk(){
        ArrayList<TaiKhoan> dstk = new ArrayList<>();
        try {
            String sql = "EXEC ACCOUNT_DS";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                String taikhoan = rs.getString("TAIKHOAN");
                String matkhau = rs.getString("MATKHAU");
                TaiKhoan tk = new TaiKhoan(taikhoan, matkhau);
                dstk.add(tk);
            }
            
        } catch (Exception e) {
        }
        return dstk;
    }
    
    public boolean getTrungMa(String taikhoan){
        Boolean ktra = true;
        try {
            String sql = "EXEC ACCOUNT_DS";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()){
                if (taikhoan.toUpperCase().equals(rs.getString("TAIKHOAN").toUpperCase()))
                    ktra = true;
                else{
                    ktra = false;
                }
                    
                break;
                    
            }
        } catch (Exception e) {
        }
        return ktra;
    }
    
    public Boolean Them(TaiKhoan tk){
        boolean ktra = true;
        try {
            String sql = "{call ACCOUNT_THEM(?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, tk.getsTaiKhoan());
            cs.setString(2, tk.getsMatKhau());
            cs.execute();
        } catch (Exception e) {
            ktra = false;
        }
        return ktra;
    }
    
    public Boolean Xoa(String taikhoan){
        boolean ktra = true;
        try {
            String sql = "{call ACCOUNT_XOA(?)}";
            CallableStatement cs  = conn.prepareCall(sql);
            cs.setString(1, taikhoan);
            cs.execute();
        } catch (Exception ex) {
            ktra = false;
        }
        return ktra;
    }
    
    public Boolean Sua(TaiKhoan tk){
        boolean ktra = true;
        try {
            String sql = "{call ACCOUNT_SUA(?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, tk.getsTaiKhoan());
            cs.setString(2, tk.getsMatKhau());
            cs.execute();
        } catch (Exception e) {
            ktra = false;
        }
        return ktra;
    }
}
