package view;

public class TrangChinh extends javax.swing.JFrame {

    public TrangChinh() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        pnlDSP = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        DSP = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnDSPhong = new javax.swing.JMenuItem();
        btn_DSHopDong = new javax.swing.JMenuItem();
        btnDichVu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnDSTK = new javax.swing.JMenuItem();
        btnQLSV = new javax.swing.JMenu();
        btnDSSV = new javax.swing.JMenuItem();
        btn_DienNuoc = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btn_DSHoaDon = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlDSPLayout = new javax.swing.GroupLayout(pnlDSP);
        pnlDSP.setLayout(pnlDSPLayout);
        pnlDSPLayout.setHorizontalGroup(
            pnlDSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1383, Short.MAX_VALUE)
        );
        pnlDSPLayout.setVerticalGroup(
            pnlDSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jButton1.setText("Đóng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu6.setBackground(new java.awt.Color(204, 204, 204));
        jMenu6.setText("                                                                        ");
        jMenu6.setEnabled(false);
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_24px.png"))); // NOI18N
        jMenu3.setText("Trang Chủ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        DSP.setText("DSP");
        DSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSPActionPerformed(evt);
            }
        });
        jMenu3.add(DSP);

        jMenuBar2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_hotel_bed_24px.png"))); // NOI18N
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

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_account_24px.png"))); // NOI18N
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

        btnQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_writer_male_24px.png"))); // NOI18N
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

        btn_DienNuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cash_and_credit_card_24px.png"))); // NOI18N
        btn_DienNuoc.setText("Thanh toán");
        btn_DienNuoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setText("Hóa đơn điện/ nước");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btn_DienNuoc.add(jMenuItem1);

        btn_DSHoaDon.setText("Hóa đơn tiền phòng");
        btn_DSHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DSHoaDonActionPerformed(evt);
            }
        });
        btn_DienNuoc.add(btn_DSHoaDon);

        jMenuBar2.add(btn_DienNuoc);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_statistics_24px.png"))); // NOI18N
        jMenu2.setText("Thống Kê");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jMenuItem2.setText("Doanh thu theo tháng");
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Doanh thu theo phòng");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem3.setText("Thóng kê thu tiền");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tab)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1295, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(12, Short.MAX_VALUE)
                    .addComponent(pnlDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(56, Short.MAX_VALUE)
                    .addComponent(pnlDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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

    private void DSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSPActionPerformed
        try {
            tab.setSelectedComponent(new Load_DS_Phong());
        } catch (Exception e) {
            Load_DS_Phong pnl = new Load_DS_Phong();
            tab.add("Danh sách p", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_DSPActionPerformed

    private void btn_DSHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DSHoaDonActionPerformed
        try {
            tab.setSelectedComponent(new DS_HoaDon());
        } catch (Exception e) {
            DS_HoaDon pnl = new DS_HoaDon();
            tab.add("Danh sách hóa đơn", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_btn_DSHoaDonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            tab.setSelectedComponent(new DienNuoc());
        } catch (Exception e) {
            DienNuoc pnl = new DienNuoc();
            tab.add("Quản lý điện nước", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tab.getTabCount() != 1) {
            tab.remove(tab.getSelectedComponent());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            tab.setSelectedComponent(new ThongKeThuTien());
        } catch (Exception e) {
            ThongKeThuTien pnl = new ThongKeThuTien();
            tab.add("Thống kê thu tiền", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         try {
            tab.setSelectedComponent(new DoanhThu());
        } catch (Exception e) {
            DoanhThu pnl = new DoanhThu();
            tab.add("Doanh thu", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
    private javax.swing.JMenuItem DSP;
    private javax.swing.JMenuItem btnDSPhong;
    private javax.swing.JMenuItem btnDSSV;
    private javax.swing.JMenuItem btnDSTK;
    private javax.swing.JMenuItem btnDichVu;
    private javax.swing.JMenu btnQLSV;
    private javax.swing.JMenuItem btn_DSHoaDon;
    private javax.swing.JMenuItem btn_DSHopDong;
    private javax.swing.JMenu btn_DienNuoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel pnlDSP;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables
}
