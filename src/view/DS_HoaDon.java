package view;

import dao.HoaDonDAO;
import dao.HopDongDAO;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.HopDong;

public class DS_HoaDon extends javax.swing.JPanel {

    HoaDonDAO hdDao = new HoaDonDAO();
    HopDongDAO hdongDao = new HopDongDAO();

    public DS_HoaDon() {
        initComponents();
        this.load();
    }

    public void load() {
        DefaultTableModel model = (DefaultTableModel) tblDSHoaDon.getModel();
        model.setRowCount(0);

        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        tblDSHoaDon.setFont(font);
        tblDSHoaDon.setRowHeight(30);
        tblDSHoaDon.setBackground(Color.decode("#ffffff"));
        tblDSHoaDon.setForeground(Color.decode("#505160"));

        JTableHeader tableHeader = tblDSHoaDon.getTableHeader();
        tableHeader.setBackground(Color.decode("#B7B8B6"));
        tableHeader.setForeground(Color.decode("#0099FF"));
        Font headerFont = new Font("Segoe UI", Font.BOLD, 16);
        tableHeader.setFont(headerFont);

        try {
//            String MaSV = txtTimKiemMaSV.getText();
//            List<model.HoaDon> list = hdDao.selectByMaSV(MaSV);
            List<model.HoaDon> list = hdDao.select();
            System.out.println("-=-=-=-" + list);
            for (model.HoaDon sv : list) {
                Object[] row = {
                    sv.getMaHoaDon(),
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getMaPhong(),
                    sv.getTienPhong(),
                    sv.getNgayTao(),
                    sv.getTrangThai(),
                    sv.getThang()
                };
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
        btnLamMoi = new javax.swing.JButton();
        btnXuatHoaDon = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSHoaDon = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnThemMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemMoi.setForeground(new java.awt.Color(51, 51, 51));
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_create_20px.png"))); // NOI18N
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(51, 51, 51));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_20px.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Danh sách hóa đơn");

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(51, 51, 51));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_available_updates_20px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXuatHoaDon.setBackground(new java.awt.Color(204, 204, 204));
        btnXuatHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatHoaDon.setForeground(new java.awt.Color(51, 51, 51));
        btnXuatHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_export_pdf_20px_1.png"))); // NOI18N
        btnXuatHoaDon.setText("Xuất hóa đơn");
        btnXuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDonActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_forward_message_20px.png"))); // NOI18N
        jButton6.setText("Gửi email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(7, 7, 7)
                .addComponent(btnXuatHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnLamMoi)
                            .addComponent(btnXuatHoaDon)
                            .addComponent(jButton6))
                        .addContainerGap())))
        );

        tblDSHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã sinh viên", "Họ tên", "Mã phòng", "Tiền phòng", "Ngày tạo ", "Trạng thái ", "Tháng"
            }
        ));
        tblDSHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSHoaDon);

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTimKiem.setText(" ");

        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        lblMessage.setText(" ");

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_20px.png"))); // NOI18N
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
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 578, Short.MAX_VALUE)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        load();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    int index = 0;
    private void tblDSHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSHoaDonMouseClicked
        if (evt.getClickCount() == 1) {
            this.index = tblDSHoaDon.rowAtPoint(evt.getPoint());
        }
    }//GEN-LAST:event_tblDSHoaDonMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
//        TimKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDonActionPerformed
        int mahoadon = (int) tblDSHoaDon.getValueAt(this.index, 0);

        model.HoaDon hd = hdDao.findById(mahoadon);
        Date ngatTaohoadon = hd.getNgayTao();
        int mahopdong = hd.getMaHopDong();
        HopDong hopDong = hdongDao.findById(mahopdong);
        String maSV = hopDong.getMaSV();
        String maPhong = hopDong.getMaPhong();
        String hoTen = hopDong.getHoTen();
        BigDecimal gia = hopDong.getGiaThue();
        String thang = hopDong.getThang();

        HoaDonPhong hoaDon = new HoaDonPhong(mahoadon, maSV, hoTen, maPhong, gia, thang, ngatTaohoadon);
        hoaDon.setVisible(true);
    }//GEN-LAST:event_btnXuatHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatHoaDon;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblDSHoaDon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
