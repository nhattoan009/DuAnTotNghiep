package view;

import dao.SinhVienDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

/**
 *
 * @author huynh
 */
public class DS_SinhVien extends javax.swing.JPanel {

    SinhVienDAO dao = new SinhVienDAO();

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
        try {
            List<SinhVien> list = dao.select();
            for (SinhVien sv : list) {
                Object[] row = {
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getGioiTinh(),
                    sv.getNgaySinh(),
                    sv.getSDT(),
                    sv.getEmail(),
                    sv.getCMND(),};
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
        jButton4 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSV = new javax.swing.JTable();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Danh sách sinh viên");

        jButton4.setText("Đóng");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemMoi)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat)
                .addGap(18, 18, 18)
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
                            .addComponent(btnThemMoi)
                            .addComponent(jButton4)
                            .addComponent(btnLamMoi))
                        .addContainerGap())))
        );

        tblDSSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Giới tính", "Điện thoại", "CMND", "Email", "Ngày Sinh"
            }
        ));
        tblDSSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        new ThemSinhVien().setVisible(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        this.load();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    int index = 0;

    void edit() {
        try {
            String masv = (String) tblDSSV.getValueAt(this.index, 0);
            String tensv = (String) tblDSSV.getValueAt(this.index, 1);
//            Boolean gioitinh = (Boolean) tblDSSV.getValueAt(this.index, 3);
            String gt = (String.valueOf(tblDSSV.getValueAt(this.index, 2)));
//            boolean gioitinhsv = Boolean.parseBoolean(gt);
//            String namsinh = (String) tblDSSV.getValueAt(this.index, 2);
            String sdt = (String) tblDSSV.getValueAt(this.index, 4);
            String email = (String) tblDSSV.getValueAt(this.index, 5);
            String cmnd = (String) tblDSSV.getValueAt(this.index, 6);
            SinhVien model = dao.findById(masv);
            if (model != null) {
//                SuaSinhVien ssv = new SuaSinhVien(masv, tensv, gt, sdt, email, cmnd);
//                ssv.setVisible(true);
//
////                new SuaSinhVien().setModel(model);

                System.out.println(masv + "" + tensv + "" + gt + "" + sdt + "" + email + "" + cmnd);
            }
        } catch (Exception e) {
//            lblMessage.setText("cập nhật lỗi");
        }
    }
    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String masv = (String) tblDSSV.getValueAt(this.index, 0);
        String tensv = (String) tblDSSV.getValueAt(this.index, 1);
//        String gioitinh = (String) tblDSSV.getValueAt(this.index, 3);
//        String namsinh = (String) tblDSSV.getValueAt(this.index, 2);
        String gt = (String.valueOf(tblDSSV.getValueAt(this.index, 2)));
//        boolean gioitinhsv = Boolean.parseBoolean(gt);
        String sdt = (String) tblDSSV.getValueAt(this.index, 4);
        String email = (String) tblDSSV.getValueAt(this.index, 5);
        String cmnd = (String) tblDSSV.getValueAt(this.index, 6);
        SinhVien model = dao.findById(masv);
        if (model != null) {
            SuaSinhVien ssv = new SuaSinhVien(masv, tensv, sdt, email, cmnd, gt);
            ssv.setVisible(true);
        }
        System.out.println(masv + "-" + tensv + "-" + sdt + "-" + email + "-" + cmnd + "-" + gt);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void tblDSSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSVMouseClicked
        if (evt.getClickCount() == 1) {
            this.index = tblDSSV.rowAtPoint(evt.getPoint());
//            if (this.index >= 0) {
            this.edit();
//            }
            System.out.println(this.index);
            System.out.println("click");
        }
    }//GEN-LAST:event_tblDSSVMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSSV;
    // End of variables declaration//GEN-END:variables
}
