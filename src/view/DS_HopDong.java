package view;

import dao.HopDongDAO;
import dao.PhongDAO;
import java.text.NumberFormat;
import java.util.Date;
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
public class DS_HopDong extends javax.swing.JPanel {

    HopDongDAO dao = new HopDongDAO();
    PhongDAO pDao = new PhongDAO();

    /**
     * Creates new form DS_HopDong
     */
    public DS_HopDong() {
        initComponents();
        this.load();
        this.loadComboBoxPhong();
    }

    public void load() {
        DefaultTableModel model = (DefaultTableModel) tblDSHD.getModel();
        model.setRowCount(0);
        try {
            String MaSV = txtTimKiemMaSV.getText();
            List<HopDong> list = dao.selectByMaSV(MaSV);
//            List<HopDong> list = dao.select();
            for (HopDong sv : list) {
                Object[] row = {
                    sv.getMaHopDong(),
                    sv.getMaSV(),
                    sv.getMaPhong(),
                    sv.getNgayTao(),
                    sv.isTrangThai() ? "Hoạt động" : "không hoạt động",
                    sv.getGiaThue()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void loadP() {  // search for room
        DefaultTableModel model = (DefaultTableModel) tblDSHD.getModel();
        model.setRowCount(0);
        try {
            String MaPhong = (String) cboPhong.getSelectedItem();
            List<HopDong> list = dao.selectByMaPhong(MaPhong.trim());
            System.out.println(list);
//            List<SinhVien> list = dao.select();
            for (HopDong sv : list) {
                Object[] row = {
                    sv.getMaHopDong(),
                    sv.getMaSV(),
                    sv.getMaPhong(),
                    sv.getNgayTao(),
                    sv.isTrangThai() ? "Hoạt động" : "không hoạt động",
                    sv.getGiaThue()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void loadTT() {  // search trạng thái
        DefaultTableModel model = (DefaultTableModel) tblDSHD.getModel();
        model.setRowCount(0);
        try {
            List<HopDong> list;
            String tt = (String) cboTrangThai.getSelectedItem();

            if (tt.equals("Không hoạt động")) {
                list = dao.selectByTrangThai0();
            } else {
                list = dao.selectByTrangThai1();
            }
            for (HopDong sv : list) {
                Object[] row = {
                    sv.getMaHopDong(),
                    sv.getMaSV(),
                    sv.getMaPhong(),
                    sv.getNgayTao(),
                    sv.isTrangThai() ? "Hoạt động" : "không hoạt động",
                    sv.getGiaThue()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void TimKiem() {
        loadTT();
    }

    void loadComboBoxPhong() {
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
    }
    int index = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCapNhat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnTaoHoaDon = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTimKiemMaSV = new javax.swing.JTextField();
        cboPhong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSHD = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Danh sách hợp đồng");

        jButton4.setText("Đóng");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTaoHoaDon.setText("Tạo hóa đơn cá nhân");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        jButton5.setText("Tạo hóa đơn phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(btnTaoHoaDon)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCapNhat)
                            .addComponent(jButton4)
                            .addComponent(btnLamMoi)
                            .addComponent(btnTaoHoaDon)
                            .addComponent(jButton5))
                        .addContainerGap())))
        );

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã sinh viên");

        txtTimKiemMaSV.setText(" ");

        cboPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel4.setText("Mã phòng");

        jLabel5.setText("Trạng thái");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt động", "Không hoạt động" }));

        tblDSHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hợp đồng", "Mã sinh viên", "Mã phòng", "Ngày tạo", "Trạng thái", "Giá thuê"
            }
        ));
        jScrollPane2.setViewportView(tblDSHD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKiemMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboPhong)
                            .addComponent(txtTimKiemMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        TimKiem();
        load();
        loadP();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int mahd = (int) tblDSHD.getValueAt(this.index, 0);
        String masv = (String) tblDSHD.getValueAt(this.index, 1);
        String mp = (String) tblDSHD.getValueAt(this.index, 2);
        Date ngayTao = (Date) tblDSHD.getValueAt(this.index, 3);
        String tt = (String.valueOf(tblDSHD.getValueAt(this.index, 4)));
        double gia = (double) tblDSHD.getValueAt(this.index, 5);

//        HopDong model = dao.findById(mahd);
//        if (model != null) {
        SuaHopDong ssv = new SuaHopDong(mahd, masv, mp, ngayTao, tt, gia);
        ssv.setVisible(true);
//        }
        System.out.println(mahd + "-" + masv + "-" + mp + "-" + ngayTao + "-" + tt + "-" + gia);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        this.load();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        int mahd = (int) tblDSHD.getValueAt(this.index, 0);
        String masv = (String) tblDSHD.getValueAt(this.index, 1);
        String maphong = (String) tblDSHD.getValueAt(this.index, 2);
        Date ngatTao = (Date) tblDSHD.getValueAt(this.index, 3);
        String trangThai = (String) tblDSHD.getValueAt(this.index, 4);
        String giaThue = String.valueOf(tblDSHD.getValueAt(this.index, 5));

        HoaDon hoaDon = new HoaDon(mahd, masv, maphong, ngatTao, trangThai, giaThue);
        hoaDon.setVisible(true);
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDSHD;
    private javax.swing.JTextField txtTimKiemMaSV;
    // End of variables declaration//GEN-END:variables

}
