package view;

import dao.HopDongDAO;
import dao.PhongDAO;
import dao.SinhVienDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.HopDong;
import model.Phong;
import model.SinhVien;

/**
 *
 * @author huynh
 */
public class DS_SinhVien extends javax.swing.JPanel {

    SinhVienDAO dao = new SinhVienDAO();
    PhongDAO Pdao = new PhongDAO();
    Phong phong = new Phong();
    HopDongDAO hdDao = new HopDongDAO();

    /**
     * Creates new form ThemSinhVien1
     */
    public DS_SinhVien() {
        initComponents();
        this.load();
    }

    public void load() {
        DefaultTableModel model = (DefaultTableModel) tblDSSV.getModel();
        model.setRowCount(0);

        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        tblDSSV.setFont(font);
        tblDSSV.setRowHeight(30);
        tblDSSV.setBackground(Color.decode("#ffffff"));
        tblDSSV.setForeground(Color.decode("#505160"));

        JTableHeader tableHeader = tblDSSV.getTableHeader();
        tableHeader.setBackground(Color.decode("#B7B8B6"));
        tableHeader.setForeground(Color.decode("#0099FF"));
        Font headerFont = new Font("Segoe UI", Font.BOLD, 16);
        tableHeader.setFont(headerFont);
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
//            String keyword = txtTimKiem.getText();
//            List<SinhVien> list = dao.selectByKeyword(keyword);
            List<SinhVien> list = dao.select();
            for (SinhVien sv : list) {
                Object[] row = {
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.isGioiTinh() ? "Nam" : "Nữ",
                    sv.getSDT(),
                    sv.getCMND(),
                    sv.getEmail(),
                    formatter.format(sv.getNgaySinh()),
                    sv.getTrangThai()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    public void TimKiem() {
        DefaultTableModel model = (DefaultTableModel) tblDSSV.getModel();
        model.setRowCount(0);

        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        tblDSSV.setFont(font);
        tblDSSV.setRowHeight(30);
        tblDSSV.setBackground(Color.decode("#ffffff"));
        tblDSSV.setForeground(Color.decode("#505160"));

        JTableHeader tableHeader = tblDSSV.getTableHeader();
        tableHeader.setBackground(Color.decode("#B7B8B6"));
        tableHeader.setForeground(Color.decode("#0099FF"));
        Font headerFont = new Font("Segoe UI", Font.BOLD, 16);
        tableHeader.setFont(headerFont);
        try {
            String maSV = txtMaSV.getText();
            List<SinhVien> list = dao.selectByKeyword(maSV.trim());
            System.out.println("list"+ list);
//            List<SinhVien> list = dao.select();
            for (SinhVien sv : list) {
                Object[] row = {
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.isGioiTinh() ? "Nam" : "Nữ",
                    sv.getSDT(),
                    sv.getCMND(),
                    sv.getEmail(),
                    sv.getNgaySinh(),
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
        btnCapNhat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTaoHopDong = new javax.swing.JButton();
        btnChiTietSinhVien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSV = new javax.swing.JTable();
        lblMessage = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnThemMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_create_20px.png"))); // NOI18N
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_20px.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Danh sách sinh viên");

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_available_updates_20px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtTaoHopDong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTaoHopDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_contract_20px.png"))); // NOI18N
        txtTaoHopDong.setText("Tạo hợp đồng");
        txtTaoHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaoHopDongActionPerformed(evt);
            }
        });

        btnChiTietSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChiTietSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_show_property_20px.png"))); // NOI18N
        btnChiTietSinhVien.setText("Xem chi tiết sinh viên");
        btnChiTietSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietSinhVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChiTietSinhVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTaoHopDong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCapNhat)
                            .addComponent(btnThemMoi)
                            .addComponent(btnLamMoi)
                            .addComponent(btnXoa)
                            .addComponent(txtTaoHopDong)
                            .addComponent(btnChiTietSinhVien))
                        .addContainerGap())))
        );

        tblDSSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Giới tính", "Điện thoại", "CMND", "Email", "Ngày Sinh", "Trạng thái hợp đồng"
            }
        ));
        tblDSSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSSV);

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        lblMessage.setText(" ");

        txtMaSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_20px.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã sinh viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        new ThemSinhVien().setVisible(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        this.load();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    void delete() {
        index = tblDSSV.getSelectedRow();
        if (index >= 0) {
            Object[] luaChon = {"Đồng Ý", "Hủy bỏ"};
            int traLoi = JOptionPane.showOptionDialog(this,
                    "Bạn có muốn xóa không", "Thông Báo", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, luaChon, luaChon[0]);
            if (traLoi == JOptionPane.YES_OPTION) {
                try {
                    String masv = (String) tblDSSV.getValueAt(this.index, 0);
                    SinhVien sv = dao.findById(masv);
                    HopDong hopDong = hdDao.findByIdMaSV(masv);
                    if (sv != null) {
                        if (hopDong.getMaSV().equals(masv)) {
                            lblMessage.setText("Sinh viên này đang ở, không thể xóa");
                            lblMessage.setForeground(Color.RED);
                        } else {

                        }
                    }
                } catch (Exception e) {
                    String masv = (String) tblDSSV.getValueAt(this.index, 0);
                    dao.Delete(masv);
                    lblMessage.setForeground(Color.BLUE);
                    lblMessage.setText("Xóa thành công");
                }
            }
        }
    }

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed

        String masv = (String) tblDSSV.getValueAt(this.index, 0);
        String tensv = (String) tblDSSV.getValueAt(this.index, 1);
        String gt = (String.valueOf(tblDSSV.getValueAt(this.index, 2)));
        String sdt = (String) tblDSSV.getValueAt(this.index, 3);
        String cmnd = (String) tblDSSV.getValueAt(this.index, 4);
        String email = (String) tblDSSV.getValueAt(this.index, 5);
        String namsinh = (String) tblDSSV.getValueAt(this.index, 6);
        if (this.index >= 0) {
            SuaSinhVien ssv = new SuaSinhVien(masv, tensv, sdt, email, cmnd, gt, namsinh);
            ssv.setVisible(true);
        }

        System.out.println(masv + "-" + tensv + "-" + sdt + "-" + email + "-" + cmnd + "-" + gt + "" + namsinh);
    }//GEN-LAST:event_btnCapNhatActionPerformed
    int index;
    private void tblDSSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSVMouseClicked
        if (evt.getClickCount() == 1) {
            index = tblDSSV.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                String masv = (String) tblDSSV.getValueAt(this.index, 0);
                System.out.println(masv);
            }
            System.out.println(this.index);
            System.out.println("click");
        }

    }//GEN-LAST:event_tblDSSVMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        TimKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed


    private void txtTaoHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaoHopDongActionPerformed
        String masv = (String) tblDSSV.getValueAt(this.index, 0);
        String tensv = (String) tblDSSV.getValueAt(this.index, 1);

        ThemHopDong ssv = new ThemHopDong(masv, tensv);
        ssv.setVisible(true);

    }//GEN-LAST:event_txtTaoHopDongActionPerformed

    private void btnChiTietSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietSinhVienActionPerformed
        String masv = (String) tblDSSV.getValueAt(this.index, 0);
        HopDong hd = hdDao.findByIdMaSV(masv);
        String hoTen = hd.getHoTen();
        String maPhong = hd.getMaPhong();
        String thang = hd.getThang();
        String ttHD = hd.getTrangThai();
        String ttTT = hd.getTrangThai();
        ChiTietSinhVien ssv = new ChiTietSinhVien(masv, hoTen, maPhong, thang, ttHD, ttTT);
        ssv.setVisible(true);
    }//GEN-LAST:event_btnChiTietSinhVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnChiTietSinhVien;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblDSSV;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JButton txtTaoHopDong;
    // End of variables declaration//GEN-END:variables
}
