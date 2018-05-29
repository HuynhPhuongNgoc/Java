/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public class HDBan1 {
    private String MaHDBan;
    private String MaNhanVien;
    private String NgayBan;
    private String MaKhach;
    private float TongTien;
    
    public HDBan1(String mhdb, String mnv, String nb, String mk, float tt){
        this.MaHDBan=mhdb;
        this.MaNhanVien=mnv;
        this.NgayBan=nb;
        this.MaKhach=mk;
        this.TongTien=tt;
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
     * @return the MaNhanVien
     */
    public String getMaNhanVien() {
        return MaNhanVien;
    }

    /**
     * @param MaNhanVien the MaNhanVien to set
     */
    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    /**
     * @return the NgayBan
     */
    public String getNgayBan() {
        return NgayBan;
    }

    /**
     * @param NgayBan the NgayBan to set
     */
    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
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
     * @return the TongTien
     */
    public Float getTongTien() {
        return TongTien;
    }

    /**
     * @param TongTien the TongTien to set
     */
    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }
}
