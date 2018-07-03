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
public class TTDoanVien {
    private String MaDV;
    private String HoDV;
    private  String TenDV;
    private String NgaySinh;
    private String GioiTinh;
    private String QueQuan;
    private String Email;
    private String SDT;
    private String DanToc;
    private String TonGiao;
    private String NgayVaoDoan;
    private String ChooHienNay;
 
    private String MaChiDoan;
    public TTDoanVien(String mdv, String hdv,String tdv,String ns, String gt, String qq, String email, String sdt, String dt, String tg, String nvd, String cohn, String mcd){
        this.MaDV=mdv;
        this.HoDV=hdv;
        this.TenDV=tdv;
        this. NgaySinh=ns;
        this.GioiTinh=gt;
        this.QueQuan=qq;
        this.Email=email;
        this.SDT=sdt;
        this.DanToc=dt;
        this.TonGiao=tg;
        this.NgayVaoDoan=nvd;
        this.ChooHienNay=cohn;
        
        this.MaChiDoan=mcd;
        
        
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

    /**
     * @return the HoTenDV
     */
  

    /**
     * @return the NgaySinh
     */
    public String getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    /**
     * @return the GioiTinh
     */
    public String getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    /**
     * @return the QueQuan
     */
    public String getQueQuan() {
        return QueQuan;
    }

    /**
     * @param QueQuan the QueQuan to set
     */
    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the SDT
     */
    public String getSDT() {
        return SDT;
    }

    /**
     * @param SDT the SDT to set
     */
    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    /**
     * @return the DanToc
     */
    public String getDanToc() {
        return DanToc;
    }

    /**
     * @param DanToc the DanToc to set
     */
    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    /**
     * @return the TonGiao
     */
    public String getTonGiao() {
        return TonGiao;
    }

    /**
     * @param TonGiao the TonGiao to set
     */
    public void setTonGiao(String TonGiao) {
        this.TonGiao = TonGiao;
    }

    /**
     * @return the NgayVaoDoan
     */
    public String getNgayVaoDoan() {
        return NgayVaoDoan;
    }

    /**
     * @param NgayVaoDoan the NgayVaoDoan to set
     */
    public void setNgayVaoDoan(String NgayVaoDoan) {
        this.NgayVaoDoan = NgayVaoDoan;
    }

    /**
     * @return the ChooHienNay
     */
    public String getChooHienNay() {
        return ChooHienNay;
    }

    /**
     * @param ChooHienNay the ChooHienNay to set
     */
    public void setChooHienNay(String ChooHienNay) {
        this.ChooHienNay = ChooHienNay;
    }

  

    /**
     * @return the MaChiDoan
     */
    public String getMaChiDoan() {
        return MaChiDoan;
    }

    /**
     * @param MaChiDoan the MaChiDoan to set
     */
    public void setMaChiDoan(String MaChiDoan) {
        this.MaChiDoan = MaChiDoan;
    }

    /**
     * @return the HoDV
     */
    public String getHoDV() {
        return HoDV;
    }

    /**
     * @param HoDV the HoDV to set
     */
    public void setHoDV(String HoDV) {
        this.HoDV = HoDV;
    }

    /**
     * @return the TenDV
     */
    public String getTenDV() {
        return TenDV;
    }

    /**
     * @param TenDV the TenDV to set
     */
    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }
}
