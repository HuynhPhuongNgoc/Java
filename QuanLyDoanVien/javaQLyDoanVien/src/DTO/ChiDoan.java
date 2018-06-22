
package DTO;


public class ChiDoan {
    private String MaChiDoan;
    private  String TenChiDoan;
    public ChiDoan(String mcd, String tcd){
        this.MaChiDoan=mcd;
        this.TenChiDoan=tcd;
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
     * @return the TenChiDoan
     */
    public String getTenChiDoan() {
        return TenChiDoan;
    }

    /**
     * @param TenChiDoan the TenChiDoan to set
     */
    public void setTenChiDoan(String TenChiDoan) {
        this.TenChiDoan = TenChiDoan;
    }
}
