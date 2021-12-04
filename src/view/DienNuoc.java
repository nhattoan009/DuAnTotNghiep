package view;

import dao.DienNuocDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DienNuoc extends javax.swing.JPanel {

    DienNuocDAO dDao = new DienNuocDAO();
    int x = 0;

    public DienNuoc() {
        initComponents();
        this.loadDienNuoc();
    }

    public void loadDienNuoc() {
        DefaultTableModel model = (DefaultTableModel) tblDSDienNuoc.getModel();
        model.setRowCount(0);
        try {
            List<model.DienNuoc> list = dDao.select();
            for (model.DienNuoc sv : list) {
                Object[] row = {
                    sv.getMaDienNuoc(),
                    sv.getMaPhong(),
                    sv.getChiSoCuDien(),
                    sv.getChiSoMoiDien(),
                    sv.getChiSoCuNuoc(),
                    sv.getChiSoMoiNuoc(),
                    sv.getSuDungDien(),
                    sv.getSuDungNuoc(),
                    sv.getTongTienDien(),
                    sv.getTongTienNuoc(),
                    sv.getThang(),
                    sv.isTrangThai() ? "Đã thanh toán" : "Chưa thanh toán"};
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
        btnLamMoi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnHDDN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSDienNuoc = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnThemMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_create_20px.png"))); // NOI18N
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_20px.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_available_updates_20px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Hóa đơn điện nước");

        btnHDDN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHDDN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_contract_20px.png"))); // NOI18N
        btnHDDN.setText("Lập hóa đơn điện nước");
        btnHDDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDDNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(btnHDDN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnCapNhat)
                            .addComponent(btnThemMoi)
                            .addComponent(btnLamMoi)
                            .addComponent(btnHDDN)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tblDSDienNuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã Phòng", "CSC Điện", "CSM Điện", "CSC Nước", "CSM Nước", "Điện sử dụng", "Nước sử dụng", "Tổng tiền điện", "Tổng tiền nước", "Tháng", "Trạng thái"
            }
        ));
        tblDSDienNuoc.setToolTipText("click dup chuột phải để xem chi tiết");
        tblDSDienNuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSDienNuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSDienNuoc);
        if (tblDSDienNuoc.getColumnModel().getColumnCount() > 0) {
            tblDSDienNuoc.getColumnModel().getColumn(0).setResizable(false);
            tblDSDienNuoc.getColumnModel().getColumn(11).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(536, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        int csm = (int) tblDSDienNuoc.getValueAt(this.x, 3);
        int csm1 = (int) tblDSDienNuoc.getValueAt(this.x, 5);

        ThemDienNuoc tdn = new ThemDienNuoc(csm, csm1);
//        ThemDienNuoc tdn = new ThemDienNuoc();
        tdn.setVisible(true);


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

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        loadDienNuoc();
    }//GEN-LAST:event_btnLamMoiActionPerformed


    private void tblDSDienNuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSDienNuocMouseClicked
        if (evt.getClickCount() == 1) {
            x = tblDSDienNuoc.rowAtPoint(evt.getPoint());
//            if (this.x >= 0) {
//                int maHD = (int) tblDSDienNuoc.getValueAt(x, 0);
//                String maPhong = (String) tblDSDienNuoc.getValueAt(x, 1);
//                int cscDien = (int) tblDSDienNuoc.getValueAt(x, 2);
//                int csmDien = (int) tblDSDienNuoc.getValueAt(x, 3);
//                int cscNuoc = (int) tblDSDienNuoc.getValueAt(x, 4);
//                int csmNuoc = (int) tblDSDienNuoc.getValueAt(x, 5);
//                int dienSD = (int) tblDSDienNuoc.getValueAt(x, 6);
//                int nuocSD = (int) tblDSDienNuoc.getValueAt(x, 7);
//                double tienDien = (double) tblDSDienNuoc.getValueAt(x, 8);
//                double tienNuoc = (double) tblDSDienNuoc.getValueAt(x, 9);
//                String thang = (String) tblDSDienNuoc.getValueAt(x, 10);
//                String trangthai = (String) tblDSDienNuoc.getValueAt(x, 11);
//
//                HoaDonDienNuoc ssv = new HoaDonDienNuoc(maHD, maPhong, thang, trangthai, cscDien, csmDien, cscNuoc, csmNuoc, dienSD, nuocSD, tienDien, tienNuoc);
//                ssv.setVisible(true);
////
//                System.out.println("x: " + x);
//            }
        }
    }//GEN-LAST:event_tblDSDienNuocMouseClicked


    private void btnHDDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDDNActionPerformed

        int maHD = (int) tblDSDienNuoc.getValueAt(this.x, 0);
        String maPhong = (String) tblDSDienNuoc.getValueAt(this.x, 1);
        int cscDien = (int) tblDSDienNuoc.getValueAt(this.x, 2);
        int csmDien = (int) tblDSDienNuoc.getValueAt(this.x, 3);
        int cscNuoc = (int) tblDSDienNuoc.getValueAt(this.x, 4);
        int csmNuoc = (int) tblDSDienNuoc.getValueAt(this.x, 5);
        int dienSD = (int) tblDSDienNuoc.getValueAt(this.x, 6);
        int nuocSD = (int) tblDSDienNuoc.getValueAt(this.x, 7);
        double tienDien = (double) tblDSDienNuoc.getValueAt(this.x, 8);
        double tienNuoc = (double) tblDSDienNuoc.getValueAt(this.x, 9);
        String thang = (String) tblDSDienNuoc.getValueAt(this.x, 10);

        HoaDonDienNuoc ssv = new HoaDonDienNuoc(maHD, maPhong, thang, cscDien, csmDien, cscNuoc, csmNuoc, dienSD, nuocSD, tienDien, tienNuoc);
        ssv.setVisible(true);

    }//GEN-LAST:event_btnHDDNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHDDN;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSDienNuoc;
    // End of variables declaration//GEN-END:variables
}
