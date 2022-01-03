package view;

import dao.QuanLyDAO;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
                    lbMail.setText(ql.getEmail());
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
    private void Sendmail() {
       
        final String username = "Tuongpham2772@gmail.com";
        final String password = "tuong13456";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        
        try {
            

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tuongpham2772@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(lbMail.getText())
            );
            message.setSubject("Lấy lại mật khẩu" );
            message.setText("Xin Chào " + txtTenDangNhap.getText() + " mật khẩu của bạn là " + lblMK.getText() );
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Mật khẩu bạn đã được gửi " +"vào "+lbMail.getText()+" vui lòng kiểm tra");
            clearform();
            
        } catch (Exception e) {
            
            System.out.println("looo" + e);
        }
        
        
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMK = new javax.swing.JLabel();
        lbMail = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        btnLayMK = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblSo1 = new javax.swing.JLabel();
        lblSo2 = new javax.swing.JLabel();
        txtKQ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        lblMK.setText("****");

        lbMail.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tên đăng nhập:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 35));
        jPanel2.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 380, 35));

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        jPanel2.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 0, 272, 23));

        btnLayMK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLayMK.setText("Lấy mật khẩu");
        btnLayMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLayMKActionPerformed(evt);
            }
        });
        jPanel2.add(btnLayMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 370, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSo1.setText("0");

        lblSo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSo2.setText("0");

        txtKQ.setText(" ");
        txtKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKQActionPerformed(evt);
            }
        });

        jLabel1.setText("+");

        jLabel5.setText("=");

        jLabel6.setText("Hoàn thành phép tính");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 380, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ktx.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("QUÊN MẬT KHẨU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLayMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayMKActionPerformed
        Ketqua();
        Sendmail();
    }//GEN-LAST:event_btnLayMKActionPerformed

    private void txtKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKQActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLayMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMail;
    private javax.swing.JLabel lblMK;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSo1;
    private javax.swing.JLabel lblSo2;
    private javax.swing.JTextField txtKQ;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
