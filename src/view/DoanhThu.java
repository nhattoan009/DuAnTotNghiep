package view;

import dao.DienNuocDAO;
import dao.HoaDonDAO;
import dao.HopDongDAO;
import dao.PhongDAO;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HopDong;
import model.Phong;

public class DoanhThu extends javax.swing.JPanel {

    PhongDAO pDao = new PhongDAO();
    HoaDonDAO hdDao = new HoaDonDAO();
    DienNuocDAO dnDao = new DienNuocDAO();
    HopDongDAO hopDongDAO = new HopDongDAO();

    public DoanhThu() {
        initComponents();
        this.loadComboBoxPhong();
        fillDoanhThu();
        fillComboBoxNam();

    }

    private void fillDoanhThu() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThuPhong.getModel();
        model.setRowCount(0);

        String maPhong = cboPhong.getSelectedItem().toString();
        List<model.HoaDon> list = hdDao.selectByMaPhong(maPhong);
        List<model.DienNuoc> list2 = dnDao.selectByMaPhong(maPhong);
        
        double tongTien1 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("1"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien1 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 1"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien2 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("2"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien2 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 2"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien3 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("3"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien3 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 3"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien4 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("4"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien4 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 4"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien5 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("5"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien5 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 5"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien6 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("6"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien6 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 6"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien7 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("7"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien7 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 7"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien8 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("8"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien8 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 8"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien9 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("9"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien9 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 9"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien10 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("10"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien10 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 10"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien11 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("11"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien11 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 11"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        
        double tongTien12 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("12"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien12 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 12"))
                .mapToDouble(s -> s.getTongTienDien())
                .sum();
        double t1 = tongTien1 + tongTienDien1;
        double t2 = tongTien2 + tongTienDien2;
        double t3 = tongTien3 + tongTienDien3;
        double t4 = tongTien4 + tongTienDien4;
        double t5 = tongTien5 + tongTienDien5;
        double t6 = tongTien6 + tongTienDien6;
        double t7 = tongTien7 + tongTienDien7;
        double t8 = tongTien8 + tongTienDien8;
        double t9 = tongTien9 + tongTienDien9;
        double t10 = tongTien10 + tongTienDien10;
        double t11 = tongTien11 + tongTienDien11;
        double t12 = tongTien12 + tongTienDien12;
        
        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String gia1 = currencyFormatter.format(t1);String gia2 = currencyFormatter.format(t2);
        String gia3 = currencyFormatter.format(t3);String gia4 = currencyFormatter.format(t4);
        String gia5 = currencyFormatter.format(t5);String gia6 = currencyFormatter.format(t6);
        String gia7 = currencyFormatter.format(t7);String gia8 = currencyFormatter.format(t8);
        String gia9 = currencyFormatter.format(t9);String gia10 = currencyFormatter.format(t10);
        String gia11 = currencyFormatter.format(t11);String gia12 = currencyFormatter.format(t12);
        
        lblThang1.setText(String.valueOf(gia1));
        lblThang2.setText(String.valueOf(gia2));
        lblThang3.setText(String.valueOf(gia3));
        lblThang4.setText(String.valueOf(gia4));
        lblThang5.setText(String.valueOf(gia5));
        lblThang6.setText(String.valueOf(gia6));
        lblThang7.setText(String.valueOf(gia7));
        lblThang8.setText(String.valueOf(gia8));
        lblThang9.setText(String.valueOf(gia9));
        lblThang10.setText(String.valueOf(gia10));
        lblThang11.setText(String.valueOf(gia11));
        lblThang12.setText(String.valueOf(gia12));

    }

    void fillComboBoxNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        List<HopDong> list = hopDongDAO.select();

        for (HopDong hd : list) {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("yyyy");
            String format = simpleDateFormat.format(hd.getNgayTao());
            if (model.getIndexOf(format) < 0) {
                model.addElement(format);
            }

        }
        cboNam.setSelectedIndex(0);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhThuPhong = new javax.swing.JTable();
        cboPhong = new javax.swing.JComboBox<>();
        btnChon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        lblThang3 = new javax.swing.JLabel();
        lblThang2 = new javax.swing.JLabel();
        lblThang1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblThang4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblThang5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblThang6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblThang7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblThang8 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblThang9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblThang10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblThang11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblThang12 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Doanh thu phòng");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Đóng");

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setText("Export excel");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(btnLamMoi))
                        .addContainerGap())))
        );

        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        lblMessage.setText(" ");

        tblDoanhThuPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phòng", "Tháng", "Tổng thu"
            }
        ));
        jScrollPane1.setViewportView(tblDoanhThuPhong);

        cboPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongActionPerformed(evt);
            }
        });

        btnChon.setText("Xem");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tháng 1: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tháng 2: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tháng 3: ");

        lblThang3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang3.setText("0");

        lblThang2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang2.setText("0");

        lblThang1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang1.setText("0");

        jLabel15.setText("Phòng: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Tháng 4: ");

        lblThang4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang4.setText("0");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Tháng 5: ");

        lblThang5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang5.setText("0");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Tháng 6: ");

        lblThang6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang6.setText("0");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Tháng 7: ");

        lblThang7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang7.setText("0");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Tháng 8: ");

        lblThang8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang8.setText("0");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Tháng 9: ");

        lblThang9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang9.setText("0");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Tháng 10: ");

        lblThang10.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang10.setText("0");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Tháng 11: ");

        lblThang11.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang11.setText("0");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Tháng 12: ");

        lblThang12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang12.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 921, Short.MAX_VALUE)
                                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblThang2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblThang8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblThang7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(655, 655, 655)
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addGap(0, 0, 0)
                        .addComponent(lblThang12)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed

    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        this.fillDoanhThu();
    }//GEN-LAST:event_btnChonActionPerformed

    private void cboPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPhongActionPerformed
    int index = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblThang1;
    private javax.swing.JLabel lblThang10;
    private javax.swing.JLabel lblThang11;
    private javax.swing.JLabel lblThang12;
    private javax.swing.JLabel lblThang2;
    private javax.swing.JLabel lblThang3;
    private javax.swing.JLabel lblThang4;
    private javax.swing.JLabel lblThang5;
    private javax.swing.JLabel lblThang6;
    private javax.swing.JLabel lblThang7;
    private javax.swing.JLabel lblThang8;
    private javax.swing.JLabel lblThang9;
    private javax.swing.JTable tblDoanhThuPhong;
    // End of variables declaration//GEN-END:variables
}
