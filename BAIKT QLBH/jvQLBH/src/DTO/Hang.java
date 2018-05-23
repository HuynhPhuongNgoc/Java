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
public class Hang {
    private String Mahang;
    private String Tenhang;
    private float Soluong;
    private float Dongianhap;
    private float Dongiaban;
    private String Anh;
    private String Ghichu;
    private String Machatlieu;
    public Hang(String mh, String th, float sl,float dgn, float dgb, String a, String gc,String mcl){
        this.Mahang=mh;
        this.Tenhang=th;
        this.Soluong=sl;
        this.Dongianhap=dgn;
        this.Dongiaban=dgb;
        this.Anh=a;
        this.Ghichu=gc;
        this.Machatlieu=mcl;
    }

    public Hang(String Mahang, String Tenhang, String Machatlieu, float Soluong, float Dongianhap, float Dongiaban, String Anh, String Ghichu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the Tenhang
     */
    public String getTenhang() {
        return Tenhang;
    }

    /**
     * @param Tenhang the Tenhang to set
     */
    public void setTenhang(String Tenhang) {
        this.Tenhang = Tenhang;
    }

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

    /**
     * @return the Dongianhap
     */
    public float getDongianhap() {
        return Dongianhap;
    }

    /**
     * @param Dongianhap the Dongianhap to set
     */
    public void setDongianhap(float Dongianhap) {
        this.Dongianhap = Dongianhap;
    }

    /**
     * @return the Dongiaban
     */
    public float getDongiaban() {
        return Dongiaban;
    }

    /**
     * @param Dongiaban the Dongiaban to set
     */
    public void setDongiaban(float Dongiaban) {
        this.Dongiaban = Dongiaban;
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
     * @return the Ghichu
     */
    public String getGhichu() {
        return Ghichu;
    }

    /**
     * @param Ghichu the Ghichu to set
     */
    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    /**
     * @return the Machatlieu
     */
    public String getMachatlieu() {
        return Machatlieu;
    }

    /**
     * @param Machatlieu the Machatlieu to set
     */
    public void setMachatlieu(String Machatlieu) {
        this.Machatlieu = Machatlieu;
    }
    
}
