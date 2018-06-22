/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


public class TinTuc {
    private String MaTinTuc;
    private String TenTinTuc;
    private String NoiDungTT;
    private String ThoiGianDang;
    private String NguoiDang;
    public TinTuc(String mtt, String ttt,String ndtt, String tgd, String nd){
        this.MaTinTuc=mtt;
        this.TenTinTuc=ttt;
        this.NoiDungTT=ndtt;
        this.ThoiGianDang=tgd;
        this.NguoiDang=nd;
}

    /**
     * @return the MaTinTuc
     */
    public String getMaTinTuc() {
        return MaTinTuc;
    }

    /**
     * @param MaTinTuc the MaTinTuc to set
     */
    public void setMaTinTuc(String MaTinTuc) {
        this.MaTinTuc = MaTinTuc;
    }

    /**
     * @return the TenTinTuc
     */
    public String getTenTinTuc() {
        return TenTinTuc;
    }

    /**
     * @param TenTinTuc the TenTinTuc to set
     */
    public void setTenTinTuc(String TenTinTuc) {
        this.TenTinTuc = TenTinTuc;
    }

    /**
     * @return the NoiDungTT
     */
    public String getNoiDungTT() {
        return NoiDungTT;
    }

    /**
     * @param NoiDungTT the NoiDungTT to set
     */
    public void setNoiDungTT(String NoiDungTT) {
        this.NoiDungTT = NoiDungTT;
    }

    /**
     * @return the ThoiGianDang
     */
    public String getThoiGianDang() {
        return ThoiGianDang;
    }

    /**
     * @param ThoiGianDang the ThoiGianDang to set
     */
    public void setThoiGianDang(String ThoiGianDang) {
        this.ThoiGianDang = ThoiGianDang;
    }

    /**
     * @return the NguoiDang
     */
    public String getNguoiDang() {
        return NguoiDang;
    }

    /**
     * @param NguoiDang the NguoiDang to set
     */
    public void setNguoiDang(String NguoiDang) {
        this.NguoiDang = NguoiDang;
    }
}