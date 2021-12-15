package view;

import dao.HopDongDAO;
import dao.PhongDAO;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HopDong;
import model.Phong;

/**
 *
 * @author huynh
 */
public class CapNhatHopDong extends javax.swing.JFrame {

    HopDongDAO dao = new HopDongDAO();
    PhongDAO pDao = new PhongDAO();

    /**
     * Creates new form ThemHopDong
     */
    public CapNhatHopDong(
            int maHD,
            String gia
    ) {
        initComponents();
        this.loadComboBox();
        this.setLocationRelativeTo(null);
        this.txtGia.setText(gia);
        this.lblMaHD.setText(String.valueOf(maHD));
    }

    CapNhatHopDong() {
    }

    public void update() {
        HopDong sv = getModel();
        try {
            dao.Update(sv);
            lblMessage.setText("Cập nhật thành công!");
        } catch (Exception e) {
            lblMessage.setText("Cập nhật thất bại!");
            System.out.println(e);
        }

    }

    HopDong getModel() {
        HopDong sv = new HopDong();
        BigDecimal model = new BigDecimal(txtGia.getText());
        BigDecimal gia = model.setScale(2, RoundingMode.HALF_EVEN);

        sv.setMaPhong(cboPhong.getSelectedItem().toString()); //////
        sv.setTrangThai(cboTrangThai.getSelectedItem().toString());
        sv.setGiaThue(gia);
        sv.setThang(cboThang.getSelectedItem().toString()); //////
        sv.setTrangThaiThu("Chưa thu");
        sv.setMaHopDong(Integer.parseInt(lblMaHD.getText()));
        return sv;

    }

    void clear() {

    }

    private void loadPhong() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietPhong.getModel();
        model.setRowCount(0);
        try {
            String maPhong = cboPhong.getSelectedItem().toString();
            List<HopDong> list = dao.selectByMaPhong(maPhong);
            for (HopDong hd : list) {
                Object[] row = {
                    hd.getMaPhong(),
                    hd.getHoTen(),
                    hd.getThang(),
                    hd.getTrangThaiThu()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboPhong = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        btnChiTietPhong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietPhong = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_20px_1.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_20px.png"))); // NOI18N
        btnHuy.setText("Đóng");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Cập nhật hợp đồng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHuy)
                            .addComponent(btnLuu))
                        .addContainerGap())))
        );

        jLabel3.setText("Danh Sách Phòng:");

        cboPhong.setToolTipText("chọn phòng ");
        cboPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongActionPerformed(evt);
            }
        });

        jLabel6.setText("Trạng Thái phòng:");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hoạt động", "không hoạt động" }));
        cboTrangThai.setToolTipText("chọ trạng thái");

        jLabel7.setText("Giá Phòng:");

        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 153, 255));

        jLabel8.setText("Tháng:");

        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThang.setToolTipText("chọn tháng");
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        btnChiTietPhong.setText("Xem chi tiết phòng");
        btnChiTietPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietPhongActionPerformed(evt);
            }
        });

        tblChiTietPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phòng", "Sinh viên", "Tháng", "Trạng thái thu"
            }
        ));
        jScrollPane1.setViewportView(tblChiTietPhong);

        jLabel9.setText("VND");

        jLabel4.setText("Mã Họp Đồng:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChiTietPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnChiTietPhong)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboPhong.getModel();
        model.removeAllElements();
        try {
            List<Phong> list = pDao.select();
            for (Phong p : list) {
                model.addElement(p.getMaPhong());
                System.out.println(p.getMaPhong());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn!");
        }
        setGiaLenComboboxPhong();
    }

    void setGiaLenComboboxPhong() {
        String id = cboPhong.getSelectedItem().toString();
        Phong phong = pDao.findById(id);
        BigDecimal giaPhong = phong.getGiaPhong();

//        Locale locale = new Locale("vi", "VN");
//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
//        String gia = currencyFormatter.format(giaPhong);
//        Locale localeVN = new Locale("vi", "VN");
//        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        txtGia.setText(String.format(Locale.UK, "%1$.0f", giaPhong));

//        DecimalFormat formatter = new DecimalFormat("###,###,###");
//        txtGia.setText(formatter.format(giaPhong) + " VNĐ");
    }

    private void cboPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongActionPerformed

    }//GEN-LAST:event_cboPhongActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        update();


    }//GEN-LAST:event_btnLuuActionPerformed

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboThangActionPerformed

    private void btnChiTietPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietPhongActionPerformed
        loadPhong();
    }//GEN-LAST:event_btnChiTietPhongActionPerformed

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed

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
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapNhatHopDong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietPhong;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblChiTietPhong;
    private javax.swing.JTextField txtGia;
    // End of variables declaration//GEN-END:variables

}
