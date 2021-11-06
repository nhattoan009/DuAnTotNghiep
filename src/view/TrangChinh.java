package view;

/**
 *
 * @author tuong
 */
public class TrangChinh extends javax.swing.JFrame {

    /**
     * Creates new form TrangChinh
     */
    public TrangChinh() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnDSPhong = new javax.swing.JMenuItem();
        btn_DSHopDong = new javax.swing.JMenuItem();
        btnDichVu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnDSTK = new javax.swing.JMenuItem();
        btnQLSV = new javax.swing.JMenu();
        btnDSSV = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jMenu6.setBackground(new java.awt.Color(204, 204, 204));
        jMenu6.setText("                                                                                          ");
        jMenu6.setEnabled(false);
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        jMenu3.setText("Trang Chủ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Quản lí phòng");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnDSPhong.setText("Danh Sách Phòng");
        btnDSPhong.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnDSPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSPhongActionPerformed(evt);
            }
        });
        jMenu4.add(btnDSPhong);

        btn_DSHopDong.setText("Danh sách hợp đồng");
        btn_DSHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DSHopDongActionPerformed(evt);
            }
        });
        jMenu4.add(btn_DSHopDong);

        btnDichVu.setText("Dịch vụ");
        btnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichVuActionPerformed(evt);
            }
        });
        jMenu4.add(btnDichVu);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Quản lí tài khoản");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnDSTK.setText("Danh sách tài khoản");
        btnDSTK.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnDSTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSTKActionPerformed(evt);
            }
        });
        jMenu1.add(btnDSTK);

        jMenuBar2.add(jMenu1);

        btnQLSV.setText("Quản lí sinh viên");
        btnQLSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLSV.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btnQLSV.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });

        btnDSSV.setText("Danh sách sinh viên");
        btnDSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSSVActionPerformed(evt);
            }
        });
        btnQLSV.add(btnDSSV);

        jMenuBar2.add(btnQLSV);

        jMenu2.setText("Thống Kê");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnDSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSSVActionPerformed
        try {
            tab.setSelectedComponent(new DS_SinhVien());
        } catch (Exception e) {
            DS_SinhVien pnl = new DS_SinhVien();
            tab.add("Danh sách sinh viên", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_btnDSSVActionPerformed

    private void btnDSTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSTKActionPerformed
        try {
            tab.setSelectedComponent(new DS_TaiKhoan());
        } catch (Exception e) {
            DS_TaiKhoan pnl = new DS_TaiKhoan();
            tab.add("Danh sách tài khoản", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_btnDSTKActionPerformed

    private void btnDSPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSPhongActionPerformed
        try {
            tab.setSelectedComponent(new DS_Phong());
        } catch (Exception e) {
            DS_Phong pnl = new DS_Phong();
            tab.add("Danh sách phòng", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_btnDSPhongActionPerformed

    private void btn_DSHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DSHopDongActionPerformed
        try {
            tab.setSelectedComponent(new DS_HopDong());
        } catch (Exception e) {
            DS_HopDong pnl = new DS_HopDong();
            tab.add("Danh sách hợp đồng", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_btn_DSHopDongActionPerformed

    private void btnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVuActionPerformed
        try {
            tab.setSelectedComponent(new DS_DichVu());
        } catch (Exception e) {
            DS_DichVu pnl = new DS_DichVu();
            tab.add("Danh sách dịch vụ", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_btnDichVuActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnDSPhong;
    private javax.swing.JMenuItem btnDSSV;
    private javax.swing.JMenuItem btnDSTK;
    private javax.swing.JMenuItem btnDichVu;
    private javax.swing.JMenu btnQLSV;
    private javax.swing.JMenuItem btn_DSHopDong;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables
}
