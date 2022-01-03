package view;

import dao.HopDongDAO;
import dao.PhongDAO;
import dao.SinhVienDAO;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.HopDong;
import model.Phong;
import model.SinhVien;

public class ThongKeThuTien extends javax.swing.JPanel {

    PhongDAO pDao = new PhongDAO();
    HopDongDAO hdDao = new HopDongDAO();
    SinhVienDAO svDao = new SinhVienDAO();

    public ThongKeThuTien() {
        initComponents();
        this.loadAll();
        this.loadComboBoxPhong();
    }

    private void loadComboBoxPhong() {
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

    private void loadPhong() {
        DefaultTableModel model = (DefaultTableModel) tblTKTT.getModel();
        model.setRowCount(0);
        String maPhong = cboPhong.getSelectedItem().toString();
        String Thang = cboThang.getSelectedItem().toString();
        try {
            List<HopDong> list = hdDao.selectByMaPhongAndThang(maPhong, Thang);
            System.out.println("-=-=-=-=-" + list);
            for (HopDong sv : list) {
                Object[] row = {
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getMaPhong(),
                    sv.getGiaThue(),
                    sv.getThang(),
                    sv.getTrangThaiThu()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void loadAll() {
        DefaultTableModel model = (DefaultTableModel) tblTKTT.getModel();
        model.setRowCount(0);

        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        tblTKTT.setFont(font);
        tblTKTT.setRowHeight(30);
        tblTKTT.setBackground(Color.decode("#ffffff"));
        tblTKTT.setForeground(Color.decode("#505160"));

        JTableHeader tableHeader = tblTKTT.getTableHeader();
        tableHeader.setBackground(Color.decode("#B7B8B6"));
        tableHeader.setForeground(Color.decode("#0099FF"));
        Font headerFont = new Font("Segoe UI", Font.BOLD, 16);
        tableHeader.setFont(headerFont);

        try {
            List<HopDong> list = hdDao.select();
            for (HopDong sv : list) {
                Object[] row = {
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getMaPhong(),
                    sv.getGiaThue(),
                    sv.getThang(),
                    sv.getTrangThaiThu()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void Sendmail() {
        String Masinhvien = (String) tblTKTT.getValueAt(this.index, 0);
        String Thang = (String) tblTKTT.getValueAt(this.index, 4);
        Double TienPhong = (Double) tblTKTT.getValueAt(this.index, 3);
        System.out.println(Masinhvien);
        SinhVien sv = svDao.findById(Masinhvien.trim());
        final String username = "Toanhnpc00366@fpt.edu.vn";
        final String password = "nhattoan009";

        JOptionPane.showMessageDialog(this, "Đang gửi đến " + sv.getEmail().toUpperCase() + " ...");

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
            message.setFrom(new InternetAddress("Toanhnpc00366@fpt.edu.vn"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(sv.getEmail())
            );
            message.setSubject("Hóa đơn tiền phòng tháng " + Thang);
            message.setText("Tiền phòng tháng " + Thang + " Là " + TienPhong);
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Đã gửi email thành công đến: " + sv.getEmail().toUpperCase());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi");
            System.out.println("" + e);
        }
    }

    private void Sendmail2() {
        String Masinhvien = (String) tblTKTT.getValueAt(this.index, 0);
        String Thang = (String) tblTKTT.getValueAt(this.index, 4);
        BigDecimal TienPhong = (BigDecimal) tblTKTT.getValueAt(this.index, 3);

        System.out.println(Masinhvien);
        SinhVien sv = svDao.findById(Masinhvien.trim());
        final String username = "Toanhnpc00366@fpt.edu.vn";
        final String password = "nhattoan009";

        JOptionPane.showMessageDialog(this, "Đang gửi đến " + sv.getEmail().toUpperCase() + " ...");

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
            message.setFrom(new InternetAddress("Toanhnpc00366@fpt.edu.vn"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(sv.getEmail())
            );
            message.setSubject("Bạn chưa hoàn thành tiền phòng " + Thang);
            message.setText("Tiền phòng tháng " + Thang + " Là " + TienPhong + "vui lòng thanh toán");
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Đã gửi email thành công đến: " + sv.getEmail().toUpperCase());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi");
            System.out.println("" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        btnSendMail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTKTT = new javax.swing.JTable();
        cboPhong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Thống kê thu tiền");

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_available_updates_20px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnSendMail.setBackground(new java.awt.Color(204, 204, 204));
        btnSendMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSendMail.setForeground(new java.awt.Color(51, 51, 51));
        btnSendMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_forward_message_20px.png"))); // NOI18N
        btnSendMail.setText("Gửi email");
        btnSendMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSendMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnSendMail))
                .addContainerGap())
        );

        tblTKTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Mã phòng", "Giá thuê", "Tháng", "Trạng thái thu"
            }
        ));
        tblTKTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTKTTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTKTT);

        cboPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phòng");

        cboThang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tháng");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_eye_20px.png"))); // NOI18N
        jButton1.setText("Xem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMessage.setForeground(new java.awt.Color(0, 204, 255));
        lblMessage.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
                                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPhong))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        loadAll();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    int index = 0;
    private void tblTKTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTKTTMouseClicked
        if (evt.getClickCount() == 1) {
            this.index = tblTKTT.rowAtPoint(evt.getPoint());

            System.out.println(index);
            System.out.println("click");
        }
    }//GEN-LAST:event_tblTKTTMouseClicked

    private void cboPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPhongActionPerformed

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboThangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadPhong();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSendMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMailActionPerformed
        String TrangThai = (String) tblTKTT.getValueAt(this.index, 5);
        System.out.println(TrangThai);
        if (TrangThai.equals("Chưa thu")) {
            Sendmail2();
        } else {
            Sendmail();
        }
    }//GEN-LAST:event_btnSendMailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSendMail;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblTKTT;
    // End of variables declaration//GEN-END:variables
}
