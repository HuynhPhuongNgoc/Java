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
public class ChucVu {
    private String MaChucVu;
    private String TenChucVu;
    private String NgayNhamChuc;
    private String NgayHetNhiemKy;
    private String MaDV;
    public ChucVu(String mcv, String tcv,String nnc, String nhnk, String mdv){
        this.MaChucVu=mcv;
        this. TenChucVu=tcv;
        this.NgayNhamChuc=nnc;
        this.NgayHetNhiemKy=nhnk;
        this.MaDV=mdv;
}

    /**
     * @return the MaChucVu
     */
    public String getMaChucVu() {
        return MaChucVu;
    }

    /**
     * @param MaChucVu the MaChucVu to set
     */
    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    /**
     * @return the TenChucVu
     */
    public String getTenChucVu() {
        return TenChucVu;
    }

    /**
     * @param TenChucVu the TenChucVu to set
     */
    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    /**
     * @return the NgayNhamChuc
     */
    public String getNgayNhamChuc() {
        return NgayNhamChuc;
    }

    /**
     * @param NgayNhamChuc the NgayNhamChuc to set
     */
    public void setNgayNhamChuc(String NgayNhamChuc) {
        this.NgayNhamChuc = NgayNhamChuc;
    }

    /**
     * @return the NgayHetNhiemKy
     */
    public String getNgayHetNhiemKy() {
        return NgayHetNhiemKy;
    }

    /**
     * @param NgayHetNhiemKy the NgayHetNhiemKy to set
     */
    public void setNgayHetNhiemKy(String NgayHetNhiemKy) {
        this.NgayHetNhiemKy = NgayHetNhiemKy;
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
