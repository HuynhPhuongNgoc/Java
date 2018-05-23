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
public class Khach {
    private String Makhach;
    private String Tenkhach;
    private String Diachi;
    private int Dienthoai;
public Khach(String mk, String tk, String dc, int dt){
        this.Makhach=mk;
        this.Tenkhach=tk;
        this.Diachi=dc;
        this.Dienthoai=dt;
    }
    
    /**
     * @return the Tenkhach
     */
    public String getTenkhach() {
        return Tenkhach;
    }

    /**
     * @param Tenkhach the Tenkhach to set
     */
    public void setTenkhach(String Tenkhach) {
        this.Tenkhach = Tenkhach;
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
     * @return the Dienthoai
     */
    public int getDienthoai() {
        return Dienthoai;
    }

    /**
     * @param Dienthoai the Dienthoai to set
     */
    public void setDienthoai(int Dienthoai) {
        this.Dienthoai = Dienthoai;
    }

    /**
     * @return the Makhach
     */
    public String getMakhach() {
        return Makhach;
    }

    /**
     * @param Makhach the Makhach to set
     */
    public void setMakhach(String Makhach) {
        this.Makhach = Makhach;
    }
}
