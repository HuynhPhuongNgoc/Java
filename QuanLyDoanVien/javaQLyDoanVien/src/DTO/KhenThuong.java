/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


public class KhenThuong {
    private String MaKhenThuong;
    private String NgayKhenThuong;
    private String NoiDungKT;
    private String MaDV;
    
    public KhenThuong(String mkt, String nkt,String ndkt, String mdv){
        this.MaKhenThuong=mkt;
        this.NgayKhenThuong=nkt;
        this.NoiDungKT=ndkt;
        this.MaDV=mdv;
    }

    /**
     * @return the MaKhenThuong
     */
    public String getMaKhenThuong() {
        return MaKhenThuong;
    }

    /**
     * @param MaKhenThuong the MaKhenThuong to set
     */
    public void setMaKhenThuong(String MaKhenThuong) {
        this.MaKhenThuong = MaKhenThuong;
    }

    /**
     * @return the NgayKhenThuong
     */
    public String getNgayKhenThuong() {
        return NgayKhenThuong;
    }

    /**
     * @param NgayKhenThuong the NgayKhenThuong to set
     */
    public void setNgayKhenThuong(String NgayKhenThuong) {
        this.NgayKhenThuong = NgayKhenThuong;
    }

    /**
     * @return the NoiDungKT
     */
    public String getNoiDungKT() {
        return NoiDungKT;
    }

    /**
     * @param NoiDungKT the NoiDungKT to set
     */
    public void setNoiDungKT(String NoiDungKT) {
        this.NoiDungKT = NoiDungKT;
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
