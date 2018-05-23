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
public class ChitietHDBan {

    /**
     * @return the Soluong
     */
    public float getSoluong() {
        return Soluong;
    }

    /**
     * @param Soluong the Soluong to set
     */
    public void setSoluong(float Soluong) {
        this.Soluong = Soluong;
    }
    private  String MaHDBan;
    private String Mahang;
    private float Soluong;
    private float Dongia;
    private float Giamgia; 
    private float Thanhtien;
public ChitietHDBan(String Mahdb, String mh,float sl,float dg,float gg, float tt){
        this.MaHDBan=Mahdb;
        this.Mahang=mh;
        this.Soluong=sl;
        this.Dongia=dg;
        this.Giamgia=gg;
        this.Thanhtien=tt;
    }

//    public ChitietHDBan(String MaHDBan, String Mahang, String Soluong, String Dongia, String Giamgia, String Thanhtien) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
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
     * @return the Mahang
     */
    public String getMahang() {
        return Mahang;
    }

    /**
     * @param Mahang the Mahang to set
     */
    public void setMahang(String Mahang) {
        this.Mahang = Mahang;
    }

    /**
     * @return the Soluong
     */

    /**
     * @return the Dongia
     */
    public float getDongia() {
        return Dongia;
    }

    /**
     * @param Dongia the Dongia to set
     */
    public void setDongia(float Dongia) {
        this.Dongia = Dongia;
    }

    /**
     * @return the Giamgia
     */
    public float getGiamgia() {
        return Giamgia;
    }

    /**
     * @param Giamgia the Giamgia to set
     */
    public void setGiamgia(float Giamgia) {
        this.Giamgia = Giamgia;
    }

    /**
     * @return the Thanhtien
     */
    public float getThanhtien() {
        return Thanhtien;
    }

    /**
     * @param Thanhtien the Thanhtien to set
     */
    public void setThanhtien(float Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
}
