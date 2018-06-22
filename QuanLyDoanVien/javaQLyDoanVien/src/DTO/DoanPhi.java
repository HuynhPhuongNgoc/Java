/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


public class DoanPhi {
    private String MaDoanPhi;
    private String Ngay;
    private String SoTien;
    private String NoiDungDP;
    private String MaDV;
    public DoanPhi(String mdp, String ngay,String sotien, String nddp, String mdv){
        this.MaDoanPhi=mdp;
        this.Ngay=ngay;
        this.SoTien=sotien;
        this.NoiDungDP=nddp;
        this.MaDV=mdv;
}

    /**
     * @return the MaDoanPhi
     */
    public String getMaDoanPhi() {
        return MaDoanPhi;
    }

    /**
     * @param MaDoanPhi the MaDoanPhi to set
     */
    public void setMaDoanPhi(String MaDoanPhi) {
        this.MaDoanPhi = MaDoanPhi;
    }

    /**
     * @return the Ngay
     */
    public String getNgay() {
        return Ngay;
    }

    /**
     * @param Ngay the Ngay to set
     */
    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    /**
     * @return the SoTien
     */
    public String getSoTien() {
        return SoTien;
    }

    /**
     * @param SoTien the SoTien to set
     */
    public void setSoTien(String SoTien) {
        this.SoTien = SoTien;
    }

    /**
     * @return the NoiDungDP
     */
    public String getNoiDungDP() {
        return NoiDungDP;
    }

    /**
     * @param NoiDungDP the NoiDungDP to set
     */
    public void setNoiDungDP(String NoiDungDP) {
        this.NoiDungDP = NoiDungDP;
    }

    /**
     * @return the MaDV
     */
    public String getMaDV() {
        return MaDV;
    }

    /**
     * @param MaDV the MaDV to set
     */
    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }
 
}
