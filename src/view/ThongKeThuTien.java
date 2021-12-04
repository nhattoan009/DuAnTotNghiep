package view;

import dao.HopDongDAO;
import dao.PhongDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HopDong;
import model.Phong;


public class ThongKeThuTien extends javax.swing.JPanel {

    PhongDAO pDao = new PhongDAO();
    HopDongDAO hdDao = new HopDongDAO();
    
    public ThongKeThuTien() {
        initComponents();
        this.load();
        this.loadComboBoxPhong();
    }
    
    void loadComboBoxPhong() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboPhong.getModel();
        model.removeAllElements();
        try {
            List<Phong> list = pDao.select();
            for (Phong p : list) {
                model.addElement(p.getMaPhong());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn!");
        }
    }
    
    public void load() {
        DefaultTableModel model = (DefaultTableModel) tblDSHD.getModel();
        model.setRowCount(0);
        try {
            List<HopDong> list = hdDao.select();
            for (HopDong sv : list) {
                Object[] row = {
                    sv.getMaHopDong(),
                    sv.getMaSV(),
                    sv.getMaPhong(),
                    sv.getNgayTao(),
                    sv.isTrangThai() ? "Hoạt động" : "không hoạt động",
                    sv.getGiaThue(),
                    sv.getThang()};
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
        jLabel1 = new javax.swing.JLabel();
        btnThemDV = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnXoaDV = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSHD = new javax.swing.JTable();
        cboPhong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboPhong1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Thống kê thu tiền");

        btnThemDV.setText("Thêm dịch vụ");
        btnThemDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDVActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        lblMessage.setForeground(new java.awt.Color(0, 204, 255));
        lblMessage.setText(" ");

        btnXoaDV.setText("Xóa dịch vụ");
        btnXoaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDVActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemDV)
                    .addComponent(btnLamMoi)
                    .addComponent(lblMessage)
                    .addComponent(btnXoaDV)
                    .addComponent(btnCapNhat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblDSHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hợp đồng", "Mã sinh viên", "Mã phòng", "Ngày tạo", "Trạng thái", "Giá thuê", "Tháng", "Trạng thái thu"
            }
        ));
        tblDSHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSHDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDSHD);

        cboPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongActionPerformed(evt);
            }
        });

        jLabel4.setText("Phòng");

        cboPhong1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboPhong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhong1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tháng");

        jButton1.setText("Xem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboPhong1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPhong1)
                    .addComponent(cboPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDVActionPerformed
        new ThemDichVu().setVisible(true);
    }//GEN-LAST:event_btnThemDVActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
       
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnXoaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDVActionPerformed
        
    }//GEN-LAST:event_btnXoaDVActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        
    }//GEN-LAST:event_btnCapNhatActionPerformed
    
    int index = 0;
    private void tblDSHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSHDMouseClicked
        if (evt.getClickCount() == 1) {
            this.index = tblDSHD.rowAtPoint(evt.getPoint());

            System.out.println(index);
            System.out.println("click");
        }
    }//GEN-LAST:event_tblDSHDMouseClicked

    private void cboPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPhongActionPerformed

    private void cboPhong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPhong1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemDV;
    private javax.swing.JButton btnXoaDV;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JComboBox<String> cboPhong1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblDSHD;
    // End of variables declaration//GEN-END:variables
}
