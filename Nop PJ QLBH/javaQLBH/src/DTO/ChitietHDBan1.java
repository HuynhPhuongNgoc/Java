/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public class ChitietHDBan1 {
     private String MaHDBan;
    private String MaHang;
    private float SoLuong;
    private float DonGia;
    private float GiamGia;
    private  float ThanhTien;
    
    public ChitietHDBan1(String mhdb, String mh, float sl, float dg, float gg, float tt){
        this.MaHDBan=mhdb;
        this.MaHang=mh;
        this.SoLuong=sl;
        this.DonGia=dg;
        this.GiamGia=gg;
        this.ThanhTien=tt;
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
     * @return the DonGia
     */
    public float getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    /**
     * @return the GiamGia
     */
    public float getGiamGia() {
        return GiamGia;
    }

    /**
     * @param GiamGia the GiamGia to set
     */
    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }

    /**
     * @return the ThanhTien
     */
    public float getThanhTien() {
        return ThanhTien;
    }

    /**
     * @param ThanhTien the ThanhTien to set
     */
    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}
