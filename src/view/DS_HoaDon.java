package view;

import dao.HoaDonDAO;
import dao.HopDongDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HopDong;

public class DS_HoaDon extends javax.swing.JPanel {

    HoaDonDAO hdDao = new HoaDonDAO();
    HopDongDAO hdongDao = new HopDongDAO();

    public DS_HoaDon() {
        initComponents();
        this.load();
    }

    public void load() {
        DefaultTableModel model = (DefaultTableModel) tblDSP.getModel();
        model.setRowCount(0);
        try {
//            String MaSV = txtTimKiemMaSV.getText();
//            List<model.HoaDon> list = hdDao.selectByMaSV(MaSV);
            List<model.HoaDon> list = hdDao.select();
            for (model.HoaDon sv : list) {
                Object[] row = {
                    sv.getMaHoaDon(),
                    sv.getMaHopDong(),
                    sv.getTienPhong(),
                    sv.getNgayTao(),
                    sv.isTrangThai() ? "Hoạt động" : "không hoạt động"};
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
        btnThemMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXuatHoaDon = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSP = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Danh sách hóa đơn");

        jButton4.setText("Đóng");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXuatHoaDon.setText("Xuất hóa đơn");
        btnXuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDonActionPerformed(evt);
            }
        });

        jButton6.setText("Gửi email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(btnXuatHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemMoi)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnCapNhat)
                            .addComponent(btnThemMoi)
                            .addComponent(jButton4)
                            .addComponent(btnLamMoi)
                            .addComponent(btnXuatHoaDon)
                            .addComponent(jButton6))
                        .addContainerGap())))
        );

        tblDSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã hợp đồng", "Tiền phòng", "Ngày tạo", "Trạng thái"
            }
        ));
        tblDSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSP);

        txtTimKiem.setText(" ");

        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        lblMessage.setText(" ");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed

    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
//        String maphong = (String) tblDSP.getValueAt(this.index, 0);
//        String tenphong = (String) tblDSP.getValueAt(this.index, 1);
//        String giaphong = (String.valueOf(tblDSP.getValueAt(this.index, 2)));
//        String trangthai = (String) tblDSP.getValueAt(this.index, 3);
//
//        Phong model = dao.findById(maphong);
//        if (model != null) {
//            SuaPhong sp = new SuaPhong(maphong, tenphong, giaphong, trangthai);
//            sp.setVisible(true);
//        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
//        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
//        load();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    int index = 0;
    private void tblDSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSPMouseClicked
        if (evt.getClickCount() == 1) {
            this.index = tblDSP.rowAtPoint(evt.getPoint());
        }
    }//GEN-LAST:event_tblDSPMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
//        TimKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDonActionPerformed
        int mahoadon = (int) tblDSP.getValueAt(this.index, 0);
//        String mahopdong = (String) tblDSP.getValueAt(this.index, 1);
//        String tienphong = (String) tblDSP.getValueAt(this.index, 2);
        Date ngatTaohoadon = (Date) tblDSP.getValueAt(this.index, 3);
        String trangThai = (String) tblDSP.getValueAt(this.index, 4);

        model.HoaDon hd = hdDao.findById(mahoadon);
        int mahopdong = hd.getMaHopDong();
        HopDong hopDong = hdongDao.findById(mahopdong);
        String maSV = hopDong.getMaSV();
        String maPhong = hopDong.getMaPhong();
        double gia = hopDong.getGiaThue();
        Date ngayTaoHopDong = hopDong.getNgayTao();

        HoaDonPhong hoaDon = new HoaDonPhong(mahoadon, mahopdong,maPhong, maSV, gia, ngayTaoHopDong, ngatTaohoadon);
        hoaDon.setVisible(true);
    }//GEN-LAST:event_btnXuatHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatHoaDon;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblDSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
