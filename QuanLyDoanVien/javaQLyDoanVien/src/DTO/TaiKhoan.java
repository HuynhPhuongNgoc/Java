/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Dell
 */
public class TaiKhoan {
     private String sTaiKhoan;
    private String sMatKhau;
    
    public TaiKhoan(String tk, String mk){
        this.sTaiKhoan = tk;
        this.sMatKhau = mk;
    }

    /**
     * @return the sTaiKhoan
     */
    public String getsTaiKhoan() {
        return sTaiKhoan;
    }

    /**
     * @param sTaiKhoan the sTaiKhoan to set
     */
    public void setsTaiKhoan(String sTaiKhoan) {
        this.sTaiKhoan = sTaiKhoan;
    }

    /**
     * @return the sMatKhau
     */
    public String getsMatKhau() {
        return sMatKhau;
    }

    /**
     * @param sMatKhau the sMatKhau to set
     */
    public void setsMatKhau(String sMatKhau) {
        this.sMatKhau = sMatKhau;
    }
}
