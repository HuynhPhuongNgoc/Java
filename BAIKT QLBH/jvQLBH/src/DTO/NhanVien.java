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
public class NhanVien {
    private String Manhanvien;
    private String Tennhanvien;
    private String Gioitinh;
    private String Diachi;
    private String DienThoai;
    private  String Ngaysinh;
    public NhanVien(String mnv, String tnv, String gt, String dc, String dt, String ns){
        this.Manhanvien=mnv;
        this.Tennhanvien=tnv;
        this.Diachi=dc;
        this.Gioitinh=gt;
        this.DienThoai=dt;
        this.Ngaysinh=ns;
    }

    /**
     * @return the Manhanvien
     */
    public String getManhanvien() {
        return Manhanvien;
    }

    /**
     * @param Manhanvien the Manhanvien to set
     */
    public void setManhanvien(String Manhanvien) {
        this.Manhanvien = Manhanvien;
    }

    /**
     * @return the Tennhanvien
     */
    public String getTennhanvien() {
        return Tennhanvien;
    }

    /**
     * @param Tennhanvien the Tennhanvien to set
     */
    public void setTennhanvien(String Tennhanvien) {
        this.Tennhanvien = Tennhanvien;
    }

    /**
     * @return the Gioitinh
     */
    public String getGioitinh() {
        return Gioitinh;
    }

    /**
     * @param Gioitinh the Gioitinh to set
     */
    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    /**
     * @return the Diachi
     */
    public String getDiachi() {
        return Diachi;
    }

    /**
     * @param Diachi the Diachi to set
     */
    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    /**
     * @return the DienThoai
     */
    public String getDienThoai() {
        return DienThoai;
    }

    /**
     * @param DienThoai the DienThoai to set
     */
    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    /**
     * @return the Ngaysinh
     */
    public String getNgaysinh() {
        return Ngaysinh;
    }

    /**
     * @param Ngaysinh the Ngaysinh to set
     */
    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }
    
}
