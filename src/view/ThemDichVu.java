package view;

import dao.DichVuDAO;
import java.awt.Color;
import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import model.DichVu;

public class ThemDichVu extends javax.swing.JFrame {

    DichVuDAO dao = new DichVuDAO();

    public ThemDichVu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    void insert() {
        DichVu model = getModel();
//       model.setNgayTao(new Date());
        try {
            dao.Insert(model);
            this.clear();
            lblMessage.setText("Thêm mới thành công!");
        } catch (HeadlessException e) {
            lblMessage.setForeground(Color.RED);
            lblMessage.setText("Thêm mới không thành công!");
        }
    }

    void update() {
        DichVu model = getModel();
        try {
            dao.Update(model);
            lblMessage.setText("Cập nhật thành công!");
        } catch (Exception e) {
            lblMessage.setForeground(Color.RED);
            lblMessage.setText("Cập nhật không thành công!");
        }

    }

    DichVu getModel() {
        DichVu model = new DichVu();
        BigDecimal g = new BigDecimal(txtGia.getText());
        BigDecimal gia = g.setScale(2, RoundingMode.HALF_EVEN);
        
        model.setMaDV(txtMaDV.getText());
        model.setTenDV(txtTenDV.getText());
        model.setGiaDV(gia);
        return model;
    }

    void setModel(DichVu sv) {
        txtMaDV.setText(sv.getMaDV());
        txtTenDV.setText(sv.getTenDV());
        txtGia.setText(String.valueOf(sv.getGiaDV()));
    }

    void clear() {

    }

    boolean check() {
        if ((txtMaDV.getText()).equals("")) {
            lblMessage.setText("Thông tin không hợp lệ");
            lblMessage.setForeground(Color.red);
            return false;
        } else if ((txtTenDV.getText()).equals("")) {
            lblMessage.setText("Thông tin không hợp lệ");
            lblMessage.setForeground(Color.red);
            return false;
        } else if (txtGia.getText().equals("")) {
            lblMessage.setText("Thông tin không hợp lệ");
            lblMessage.setForeground(Color.red);
            return false;

        } else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaDV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenDV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnDong = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Mã dịch vụ:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 95, 35));
        jPanel2.add(txtMaDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 281, 35));

        jLabel3.setText("Tên dịch vụ:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 95, 35));
        jPanel2.add(txtTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 281, 35));

        jLabel4.setText("Giá:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 95, 35));
        jPanel2.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 281, 35));

        jLabel5.setText("Ghi chú:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 95, 35));

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 281, -1));

        btnDong.setText("đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
        jPanel2.add(btnDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 83, -1));

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel2.add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 80, -1));

        lblMessage.setForeground(new java.awt.Color(51, 153, 255));
        lblMessage.setText(" ");
        jPanel2.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 281, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (check()) {
            insert();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

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
            java.util.logging.Logger.getLogger(ThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaDV;
    private javax.swing.JTextField txtTenDV;
    // End of variables declaration//GEN-END:variables
}
