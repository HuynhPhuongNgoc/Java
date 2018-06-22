/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DangNhapDAL;
import DTO.TaiKhoan;
public class DangNhapForm {
    DangNhapDAL dnDal = new DangNhapDAL();
    public boolean DangNhap(TaiKhoan tk){
        return dnDal.DangNhap(tk);
    }
}
