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
public class HDBan {
    private String MaHDBan;
    private  String Manhanvien;
    private String Ngayban;
    private String MaKhach;
    private float Tongtien;
 public HDBan(String MaHDBan, String MaNhanVien, String NgayBan, String MaKhach, float TongTien){
    this.MaHDBan=MaHDBan;
    this.MaKhach=MaKhach;
    this.Manhanvien=MaNhanVien;
    this.Ngayban=NgayBan;
    this.Tongtien=TongTien;  
 }

    /**
     * @return the MaHDBan
     */
    public String getMaHDBan() {
        return MaHDBan;
    }

    /**
     * @param MaHDBan the MaHDBan to set
     */
    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
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
     * @return the Ngayban
     */
    public String getNgayban() {
        return Ngayban;
    }

    /**
     * @param Ngayban the Ngayban to set
     */
    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    /**
     * @return the MaKhach
     */
    public String getMaKhach() {
        return MaKhach;
    }

    /**
     * @param MaKhach the MaKhach to set
     */
    public void setMaKhach(String MaKhach) {
        this.MaKhach = MaKhach;
    }

    /**
     * @return the Tongtien
     */
    public float getTongtien() {
        return Tongtien;
    }

    /**
     * @param Tongtien the Tongtien to set
     */
    public void setTongtien(float Tongtien) {
        this.Tongtien = Tongtien;
    }
 
 
}

