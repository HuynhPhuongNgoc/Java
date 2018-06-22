/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


public class KyLuat {
    private String MaKyLuat;
    private String NgayKyLuat;
    private String NoiDungKL;
    private String MaDV;
    
    public KyLuat(String mkl, String nkl,String ndkl, String mdv){
        this.MaKyLuat=mkl;
        this.NgayKyLuat=nkl;
        this.NoiDungKL=ndkl;
        this.MaDV=mdv;
    }

    /**
     * @return the MaKyLuat
     */
    public String getMaKyLuat() {
        return MaKyLuat;
    }

    /**
     * @param MaKyLuat the MaKyLuat to set
     */
    public void setMaKyLuat(String MaKyLuat) {
        this.MaKyLuat = MaKyLuat;
    }

    /**
     * @return the NgayKyLuat
     */
    public String getNgayKyLuat() {
        return NgayKyLuat;
    }

    /**
     * @param NgayKyLuat the NgayKyLuat to set
     */
    public void setNgayKyLuat(String NgayKyLuat) {
        this.NgayKyLuat = NgayKyLuat;
    }

    /**
     * @return the NoiDungKL
     */
    public String getNoiDungKL() {
        return NoiDungKL;
    }

    /**
     * @param NoiDungKL the NoiDungKL to set
     */
    public void setNoiDungKL(String NoiDungKL) {
        this.NoiDungKL = NoiDungKL;
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
