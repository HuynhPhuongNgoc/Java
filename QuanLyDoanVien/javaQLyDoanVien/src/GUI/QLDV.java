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
public class QLDV extends javax.swing.JFrame {

    /**
     * Creates new form QLDV
     */
    public QLDV() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jChiDoan = new javax.swing.JMenuItem();
        jTinTuc = new javax.swing.JMenuItem();
        jHDPT = new javax.swing.JMenuItem();
        jDoanPhi = new javax.swing.JMenuItem();
        jKhenThuong = new javax.swing.JMenuItem();
        jKyLuat = new javax.swing.JMenuItem();
        jChucVu = new javax.swing.JMenuItem();
        jTTDoanVien = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jTimKiemDV = new javax.swing.JMenuItem();
        jTimKiemTT = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jThoat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Danh mục");

        jChiDoan.setText("Chi Đoàn");
        jChiDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChiDoanActionPerformed(evt);
            }
        });
        jMenu2.add(jChiDoan);

        jTinTuc.setText("Tin Tức");
        jTinTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTinTucActionPerformed(evt);
            }
        });
        jMenu2.add(jTinTuc);

        jHDPT.setText("Hoạt động phong trào");
        jHDPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHDPTActionPerformed(evt);
            }
        });
        jMenu2.add(jHDPT);

        jDoanPhi.setText("Đoàn phí");
        jDoanPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoanPhiActionPerformed(evt);
            }
        });
        jMenu2.add(jDoanPhi);

        jKhenThuong.setText("Khen thưởng");
        jKhenThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKhenThuongActionPerformed(evt);
            }
        });
        jMenu2.add(jKhenThuong);

        jKyLuat.setText("Kỷ luật");
        jKyLuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKyLuatActionPerformed(evt);
            }
        });
        jMenu2.add(jKyLuat);

        jChucVu.setText("Chức vụ");
        jChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChucVuActionPerformed(evt);
            }
        });
        jMenu2.add(jChucVu);

        jTTDoanVien.setText("Thông tin Đoàn Viên");
        jTTDoanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTDoanVienActionPerformed(evt);
            }
        });
        jMenu2.add(jTTDoanVien);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tìm kiếm");

        jTimKiemDV.setText("Tìm kiếm đoàn viên");
        jTimKiemDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTimKiemDVActionPerformed(evt);
            }
        });
        jMenu3.add(jTimKiemDV);

        jTimKiemTT.setText("Tìm kiếm tin tức");
        jTimKiemTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTimKiemTTActionPerformed(evt);
            }
        });
        jMenu3.add(jTimKiemTT);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Exit");

        jThoat.setText("Thoát");
        jThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jThoatActionPerformed(evt);
            }
        });
        jMenu1.add(jThoat);

        jMenuBar1.add(jMenu1);

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

    private void jChiDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChiDoanActionPerformed
        setVisible(false);
        dispose();
        new ChiDoanGUI().setVisible(true);
    }//GEN-LAST:event_jChiDoanActionPerformed

    private void jTinTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTinTucActionPerformed
        setVisible(false);
        dispose();
        new TinTucGUI().setVisible(true);
    }//GEN-LAST:event_jTinTucActionPerformed

    private void jThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jThoatActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jThoatActionPerformed

    private void jHDPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHDPTActionPerformed
        setVisible(false);
        dispose();
        new HoatDongPTGUI().setVisible(true);
    }//GEN-LAST:event_jHDPTActionPerformed

    private void jDoanPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoanPhiActionPerformed
        setVisible(false);
        dispose();
        new DoanPhiGUI().setVisible(true);
    }//GEN-LAST:event_jDoanPhiActionPerformed

    private void jKhenThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKhenThuongActionPerformed
        setVisible(false);
        dispose();
        new KhenThuongGUI().setVisible(true);
    }//GEN-LAST:event_jKhenThuongActionPerformed

    private void jKyLuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKyLuatActionPerformed
        setVisible(false);
        dispose();
        new KyLuatGUI().setVisible(true);
    }//GEN-LAST:event_jKyLuatActionPerformed

    private void jChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChucVuActionPerformed
        setVisible(false);
        dispose();
        new ChucVuGUI().setVisible(true);
    }//GEN-LAST:event_jChucVuActionPerformed

    private void jTTDoanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTDoanVienActionPerformed
        setVisible(false);
        dispose();
        new TTDoanVienGUI().setVisible(true);
    }//GEN-LAST:event_jTTDoanVienActionPerformed

    private void jTimKiemDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTimKiemDVActionPerformed
        setVisible(false);
        dispose();
        new TimKiemDVGUI().setVisible(true);
    }//GEN-LAST:event_jTimKiemDVActionPerformed

    private void jTimKiemTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTimKiemTTActionPerformed
        setVisible(false);
        dispose();
        new TimKiemTinTucGUI().setVisible(true);
    }//GEN-LAST:event_jTimKiemTTActionPerformed

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
            java.util.logging.Logger.getLogger(QLDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jChiDoan;
    private javax.swing.JMenuItem jChucVu;
    private javax.swing.JMenuItem jDoanPhi;
    private javax.swing.JMenuItem jHDPT;
    private javax.swing.JMenuItem jKhenThuong;
    private javax.swing.JMenuItem jKyLuat;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jTTDoanVien;
    private javax.swing.JMenuItem jThoat;
    private javax.swing.JMenuItem jTimKiemDV;
    private javax.swing.JMenuItem jTimKiemTT;
    private javax.swing.JMenuItem jTinTuc;
    // End of variables declaration//GEN-END:variables
}
