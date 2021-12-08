package view;

import dao.QuanLyDAO;
import java.util.Random;
import javax.swing.JOptionPane;
import model.QuanLy;

public class QuenMatKhau extends javax.swing.JFrame {

    QuanLyDAO dao = new QuanLyDAO();

    public QuenMatKhau() {
        initComponents();
        this.setLocationRelativeTo(null);
        RandomSo();
    }

    public void RandomSo() {
        for (int i = 0; i < 1; i++) {
            Random rand = new Random();
            int a = rand.nextInt(10) + 1;
            String so1 = String.valueOf(a);
            lblSo1.setText(so1);
        }
        for (int i = 0; i < 1; i++) {
            Random rand = new Random();
            int b = rand.nextInt(10) + 1;
            String so2 = String.valueOf(b);
            lblSo2.setText(so2);
        }
        txtKQ.setText("");
    }

    public void clearform() {
        txtTenDangNhap.setText("");
        txtKQ.setText("");
        lblMK.setText("");
    }

    public void Ketqua() {
        String user = txtTenDangNhap.getText();
        if (user.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "nhập tên đăng nhập");
        }
        String so1 = lblSo1.getText();
        String so2 = lblSo2.getText();
        int kq = (Integer.parseInt(so1) + Integer.parseInt(so2));
        String so3 = txtKQ.getText();
        if (so3.equals("")) {
            JOptionPane.showMessageDialog(this, "nhập kết quả");
        }
        int kquanhap = Integer.parseInt(so3);

        try {
            QuanLy ql = dao.findById(user);
            if (ql != null) {
                if (kquanhap == kq) {
                    lblMK.setText(ql.getMatKhau());
                } else if (kquanhap != kq) {
                    JOptionPane.showMessageDialog(this, "Phép tính sai rồi");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tên đăng nhập sai rồi");

            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSo1 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        lblSo2 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblMK = new javax.swing.JLabel();
        btnLayMK = new javax.swing.JButton();
        txtKQ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_20px.png"))); // NOI18N
        btnHuy.setText("Đóng");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Quên mật khẩu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHuy)
                        .addContainerGap())))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tên đăng nhập:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, 35));

        lblSo1.setText("0");
        jPanel2.add(lblSo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 24, 30));
        jPanel2.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 20, 255, 35));

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        jPanel2.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 0, 272, 23));

        lblSo2.setText("0");
        jPanel2.add(lblSo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 30, 30));

        lblTitle.setText("kết quả của phép cộng giữa hai số là:");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 187, 23));

        lblMK.setText("****");
        jPanel2.add(lblMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 100, 36));

        btnLayMK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLayMK.setText("Lấy mật khẩu");
        btnLayMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLayMKActionPerformed(evt);
            }
        });
        jPanel2.add(btnLayMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 141, -1));

        txtKQ.setText(" ");
        jPanel2.add(txtKQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLayMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayMKActionPerformed
        Ketqua();
    }//GEN-LAST:event_btnLayMKActionPerformed

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
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLayMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMK;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSo1;
    private javax.swing.JLabel lblSo2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtKQ;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
