/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Dell
 */
public class QLBH extends javax.swing.JFrame {

    /**
     * Creates new form QLBH
     */
    public QLBH() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dBConnect11 = new DAL.DBConnect1();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnTapTin = new javax.swing.JMenu();
        mThoat = new javax.swing.JMenuItem();
        mnDanhMuc = new javax.swing.JMenu();
        mChatLieu = new javax.swing.JMenuItem();
        mNhanVien = new javax.swing.JMenuItem();
        mKhachHang = new javax.swing.JMenuItem();
        mHangHoa = new javax.swing.JMenuItem();
        mnHoaDon = new javax.swing.JMenu();
        mHoaDonBan = new javax.swing.JMenuItem();
        mnTimKiem = new javax.swing.JMenu();
        mTimHoaDon = new javax.swing.JMenuItem();
        mTimHang = new javax.swing.JMenuItem();
        mTimKhachHang = new javax.swing.JMenuItem();
        mnBaoCao = new javax.swing.JMenu();
        mHangTon = new javax.swing.JMenuItem();
        mDoanhThu = new javax.swing.JMenuItem();
        mnTroGiup = new javax.swing.JMenu();
        mHienTroGiup = new javax.swing.JMenuItem();
        mVaiNet = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnTapTin.setText("Tập tin ");

        mThoat.setText("Thoát");
        mThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mThoatActionPerformed(evt);
            }
        });
        mnTapTin.add(mThoat);

        jMenuBar1.add(mnTapTin);

        mnDanhMuc.setText("Danh mục");

        mChatLieu.setText("Chất liệu");
        mChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mChatLieuActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mChatLieu);

        mNhanVien.setText("Nhân viên");
        mNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNhanVienActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mNhanVien);

        mKhachHang.setText("Khách hàng");
        mKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mKhachHangActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mKhachHang);

        mHangHoa.setText("Hàng hóa");
        mHangHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHangHoaActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mHangHoa);

        jMenuBar1.add(mnDanhMuc);

        mnHoaDon.setText("Hóa đơn");

        mHoaDonBan.setText("Hóa đơn bán");
        mHoaDonBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHoaDonBanActionPerformed(evt);
            }
        });
        mnHoaDon.add(mHoaDonBan);

        jMenuBar1.add(mnHoaDon);

        mnTimKiem.setText("Tìm kiếm");

        mTimHoaDon.setText("Tìm hóa đơn");
        mTimHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTimHoaDonActionPerformed(evt);
            }
        });
        mnTimKiem.add(mTimHoaDon);

        mTimHang.setText("Tìm hàng");
        mnTimKiem.add(mTimHang);

        mTimKhachHang.setText("Tìm khách hàng");
        mTimKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTimKhachHangActionPerformed(evt);
            }
        });
        mnTimKiem.add(mTimKhachHang);

        jMenuBar1.add(mnTimKiem);

        mnBaoCao.setText("Báo cáo");

        mHangTon.setText("Hàng tồn");
        mnBaoCao.add(mHangTon);

        mDoanhThu.setText("Doanh Thu");
        mnBaoCao.add(mDoanhThu);

        jMenuBar1.add(mnBaoCao);

        mnTroGiup.setText("Trợ giúp");

        mHienTroGiup.setText("Hiện trợ giúp");
        mnTroGiup.add(mHienTroGiup);

        mVaiNet.setText("Vài nét");
        mnTroGiup.add(mVaiNet);

        jMenuBar1.add(mnTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mKhachHangActionPerformed

    private void mThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mThoatActionPerformed
           setVisible(false);
        dispose();
    }//GEN-LAST:event_mThoatActionPerformed

    private void mTimKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTimKhachHangActionPerformed
       setVisible(false);
        dispose();
        new Khach1GUI().setVisible(true);
    }//GEN-LAST:event_mTimKhachHangActionPerformed

    private void mChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mChatLieuActionPerformed
     setVisible(false);
        dispose();
        new ChatLieu1GUI().setVisible(true);
    }//GEN-LAST:event_mChatLieuActionPerformed

    private void mNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNhanVienActionPerformed
                setVisible(false);
        dispose();
        new NhanVien1GUI().setVisible(true);
    }//GEN-LAST:event_mNhanVienActionPerformed

    private void mHangHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHangHoaActionPerformed
          setVisible(false);
        dispose();
        new Hang1GUI().setVisible(true);
    }//GEN-LAST:event_mHangHoaActionPerformed

    private void mHoaDonBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHoaDonBanActionPerformed
         setVisible(false);
        dispose();
        new HDBan1GUI().setVisible(true);
    }//GEN-LAST:event_mHoaDonBanActionPerformed

    private void mTimHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTimHoaDonActionPerformed
         setVisible(false);
        dispose();
        new TimKiemHD1().setVisible(true);
    }//GEN-LAST:event_mTimHoaDonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* CreatmnTapTindisplay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLBH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DAL.DBConnect1 dBConnect11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mChatLieu;
    private javax.swing.JMenuItem mDoanhThu;
    private javax.swing.JMenuItem mHangHoa;
    private javax.swing.JMenuItem mHangTon;
    private javax.swing.JMenuItem mHienTroGiup;
    private javax.swing.JMenuItem mHoaDonBan;
    private javax.swing.JMenuItem mKhachHang;
    private javax.swing.JMenuItem mNhanVien;
    private javax.swing.JMenuItem mThoat;
    private javax.swing.JMenuItem mTimHang;
    private javax.swing.JMenuItem mTimHoaDon;
    private javax.swing.JMenuItem mTimKhachHang;
    private javax.swing.JMenuItem mVaiNet;
    private javax.swing.JMenu mnBaoCao;
    private javax.swing.JMenu mnDanhMuc;
    private javax.swing.JMenu mnHoaDon;
    private javax.swing.JMenu mnTapTin;
    private javax.swing.JMenu mnTimKiem;
    private javax.swing.JMenu mnTroGiup;
    // End of variables declaration//GEN-END:variables
}
