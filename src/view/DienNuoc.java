package view;

import dao.DienNuocDAO;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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

        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        tblDSDienNuoc.setFont(font);
        tblDSDienNuoc.setRowHeight(30);
        tblDSDienNuoc.setBackground(Color.decode("#ffffff"));
        tblDSDienNuoc.setForeground(Color.decode("#505160"));

        JTableHeader tableHeader = tblDSDienNuoc.getTableHeader();
        tableHeader.setBackground(Color.decode("#B7B8B6"));
        tableHeader.setForeground(Color.decode("#0099FF"));
        Font headerFont = new Font("Segoe UI", Font.BOLD, 16);
        tableHeader.setFont(headerFont);
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
                    sv.getTrangThai()};
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
        btnLamMoi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnHDDN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSDienNuoc = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnThemMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_create_20px.png"))); // NOI18N
        btnThemMoi.setText("Tạo hóa đơn mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_available_updates_20px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Hóa đơn điện nước");

        btnHDDN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHDDN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_contract_20px.png"))); // NOI18N
        btnHDDN.setText("Xuất hóa đơn");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                .addComponent(btnHDDN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemMoi)
                        .addComponent(btnLamMoi)
                        .addComponent(btnHDDN))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(536, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        try {
//            int csm = (int) tblDSDienNuoc.getValueAt(this.x, 3);
//            int csm1 = (int) tblDSDienNuoc.getValueAt(this.x, 5);

            ThemDienNuoc tdn = new ThemDienNuoc();
//        ThemDienNuoc tdn = new ThemDienNuoc();
            tdn.setVisible(true);
        } catch (Exception e) {
            ThemDienNuoc tdn = new ThemDienNuoc();
//        ThemDienNuoc tdn = new ThemDienNuoc();
            tdn.setVisible(true);
        }


    }//GEN-LAST:event_btnThemMoiActionPerformed

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
        BigDecimal tienDien = (BigDecimal) tblDSDienNuoc.getValueAt(this.x, 8);
        BigDecimal tienNuoc = (BigDecimal) tblDSDienNuoc.getValueAt(this.x, 9);
        String thang = (String) tblDSDienNuoc.getValueAt(this.x, 10);

        HoaDonDienNuoc ssv = new HoaDonDienNuoc(maHD, maPhong, thang, cscDien, csmDien, cscNuoc, csmNuoc, dienSD, nuocSD, tienDien, tienNuoc);
        ssv.setVisible(true);

    }//GEN-LAST:event_btnHDDNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHDDN;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSDienNuoc;
    // End of variables declaration//GEN-END:variables
}
