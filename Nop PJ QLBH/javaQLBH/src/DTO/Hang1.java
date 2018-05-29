/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public class Hang1 {
    private String MaHang;
    private String TenHang;
    private String MaChatLieu;
    private float SoLuong;
    private float DonGiaNhap;
    private float DonGiaBan;
    private String Anh;
    private String GhiChu;
    
    public Hang1(String mh, String th, String mcl,float sl,float dgn, float dgb, String a, String gc){
        this.MaHang=mh;
        this.TenHang=th;
        this.MaChatLieu=mcl;
        this.SoLuong=sl;
        this.DonGiaNhap=dgn;
        this.DonGiaBan=dgb;
        this.Anh=a;
        this.GhiChu=gc;
    }

    /**
     * @return the MaHang
     */
    public String getMaHang() {
        return MaHang;
    }

    /**
     * @param MaHang the MaHang to set
     */
    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    /**
     * @return the TenHang
     */
    public String getTenHang() {
        return TenHang;
    }

    /**
     * @param TenHang the TenHang to set
     */
    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    /**
     * @return the MaChatLieu
     */
    public String getMaChatLieu() {
        return MaChatLieu;
    }

    /**
     * @param MaChatLieu the MaChatLieu to set
     */
    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    /**
     * @return the SoLuong
     */
    public float getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
    }

    /**
     * @return the DonGiaNhap
     */
    public float getDonGiaNhap() {
        return DonGiaNhap;
    }

    /**
     * @param DonGiaNhap the DonGiaNhap to set
     */
    public void setDonGiaNhap(float DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    /**
     * @return the DonGiaBan
     */
    public float getDonGiaBan() {
        return DonGiaBan;
    }

    /**
     * @param DonGiaBan the DonGiaBan to set
     */
    public void setDonGiaBan(float DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    /**
     * @return the Anh
     */
    public String getAnh() {
        return Anh;
    }

    /**
     * @param Anh the Anh to set
     */
    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}
