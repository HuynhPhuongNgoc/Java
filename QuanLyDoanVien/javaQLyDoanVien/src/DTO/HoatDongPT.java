/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


public class HoatDongPT {
    private String MaHDPT;
    private String NgayBatDau;
    private String NgayKetThuc;
    private String NoiDungHD;
    private String DiaDiem;
    private String MaDV;
    public HoatDongPT(String mhdpt, String nbd,String nkt, String ndhd, String dd, String mdv){
        this.MaHDPT=mhdpt;
        this.NgayBatDau=nbd;
        this.NgayKetThuc=nkt;
        this.NoiDungHD=ndhd;
        this.DiaDiem=dd;
        this.MaDV=mdv;
}

    /**
     * @return the MaHDPT
     */
    public String getMaHDPT() {
        return MaHDPT;
    }

    /**
     * @param MaHDPT the MaHDPT to set
     */
    public void setMaHDPT(String MaHDPT) {
        this.MaHDPT = MaHDPT;
    }

    /**
     * @return the NgayBatDau
     */
    public String getNgayBatDau() {
        return NgayBatDau;
    }

    /**
     * @param NgayBatDau the NgayBatDau to set
     */
    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    /**
     * @return the NgayKetThuc
     */
    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    /**
     * @param NgayKetThuc the NgayKetThuc to set
     */
    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    /**
     * @return the NoiDungHD
     */
    public String getNoiDungHD() {
        return NoiDungHD;
    }

    /**
     * @param NoiDungHD the NoiDungHD to set
     */
    public void setNoiDungHD(String NoiDungHD) {
        this.NoiDungHD = NoiDungHD;
    }

    /**
     * @return the DiaDiem
     */
    public String getDiaDiem() {
        return DiaDiem;
    }

    /**
     * @param DiaDiem the DiaDiem to set
     */
    public void setDiaDiem(String DiaDiem) {
        this.DiaDiem = DiaDiem;
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
