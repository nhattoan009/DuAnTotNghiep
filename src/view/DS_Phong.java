package view;

import dao.PhongDAO;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Phong;

/**
 *
 * @author huynh
 */
public class DS_Phong extends javax.swing.JPanel {

    PhongDAO dao = new PhongDAO();

    public DS_Phong() {
        initComponents();
        this.load();
    }

    public void load() {
        DefaultTableModel model = (DefaultTableModel) tblDSP.getModel();
        model.setRowCount(0);
        
        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        tblDSP.setFont(font);
        tblDSP.setRowHeight(30);
        tblDSP.setBackground(Color.decode("#ffffff"));
        tblDSP.setForeground(Color.decode("#505160"));

        JTableHeader tableHeader = tblDSP.getTableHeader();
        tableHeader.setBackground(Color.decode("#B7B8B6"));
        tableHeader.setForeground(Color.decode("#0099FF"));
        Font headerFont = new Font("Segoe UI", Font.BOLD, 16);
        tableHeader.setFont(headerFont);
        try {
//            String keyword = txtTimKiem.getText();
//            List<Phong> list = dao.selectByKeyword(keyword);
            Locale localeVN = new Locale("vi", "VN");
            NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
            
            List<Phong> list = dao.select();
            for (Phong sv : list) {
                Object[] row = {
                    sv.getMaPhong(),
                    sv.getTenPhong(),
                    String.format(Locale.UK, "%1$,.0f", sv.getGiaPhong()),
                    sv.isTrangThai() ? "Hoạt động" : "Không hoạt động",};
                model.addRow(row);
            }
        } catch (Exception e) {
            lblMessage.setText("Lỗi truy vấn dữ liệu!");
            System.out.println("e " + e);
        }
    }

    void delete() {
        int x = JOptionPane.showConfirmDialog(this, "Ấn YES để xóa");
        if (x == JOptionPane.YES_OPTION) {
            try {
                String maphong = (String) tblDSP.getValueAt(this.index, 0);
                Phong model = dao.findById(maphong);
                if (model != null) {
                    dao.Delete(maphong);
                    lblMessage.setText("Xóa thành công");
                }
            } catch (Exception e) {
                lblMessage.setForeground(Color.RED);
                lblMessage.setText("xóa lỗi");
            }
        }
    }

    void TimKiem() {
        load();
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
        btnLamMoi1 = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSP = new javax.swing.JTable();

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

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Danh sách phòng");

        btnLamMoi.setBackground(new java.awt.Color(0, 153, 255));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_available_updates_20px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setOpaque(false);
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnLamMoi1.setBackground(new java.awt.Color(0, 153, 255));
        btnLamMoi1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_eye_20px.png"))); // NOI18N
        btnLamMoi1.setText("Xem chi tiết phòng");
        btnLamMoi1.setOpaque(false);
        btnLamMoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(btnLamMoi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnLamMoi1))
                        .addContainerGap())))
        );

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTimKiem.setText(" ");

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_20px.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        lblMessage.setText(" ");

        tblDSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Tên phòng", "Giá phòng", "Trạng thái phòng"
            }
        ));
        tblDSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDSP);

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        new ThemPhong().setVisible(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        TimKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        load();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    int index = 0;
    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String maphong = (String) tblDSP.getValueAt(this.index, 0);
        String tenphong = (String) tblDSP.getValueAt(this.index, 1);
        String giaphong = (String.valueOf(tblDSP.getValueAt(this.index, 2)));
        String trangthai = (String) tblDSP.getValueAt(this.index, 3);

        Phong model = dao.findById(maphong);
        if (model != null) {
            SuaPhong sp = new SuaPhong(maphong, tenphong, giaphong, trangthai);
            sp.setVisible(true);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoi1ActionPerformed

    private void tblDSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSPMouseClicked
        if (evt.getClickCount() == 1) {
            this.index = tblDSP.rowAtPoint(evt.getPoint());

            System.out.println(index);
            System.out.println("click");
        }
    }//GEN-LAST:event_tblDSPMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLamMoi1;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblDSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
