package view;

import dao.DienNuocDAO;
import dao.HoaDonDAO;
import dao.HopDongDAO;
import dao.PhongDAO;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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
                .mapToDouble(s -> s.getTongTienDien() + s.getMaDienNuoc())
                .sum();

        double tongTien2 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("2"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien2 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 2"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien3 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("3"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien3 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 3"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien4 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("4"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien4 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 4"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien5 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("5"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien5 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 5"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien6 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("6"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien6 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 6"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien7 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("7"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien7 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 7"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien8 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("8"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien8 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 8"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien9 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("9"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien9 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 9"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien10 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("10"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien10 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 10"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien11 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("11"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien11 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 11"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();

        double tongTien12 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("12"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien12 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 12"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
                .sum();
        
        //tổng tiền
        
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
        String gia1 = currencyFormatter.format(t1);
        String gia2 = currencyFormatter.format(t2);
        String gia3 = currencyFormatter.format(t3);
        String gia4 = currencyFormatter.format(t4);
        String gia5 = currencyFormatter.format(t5);
        String gia6 = currencyFormatter.format(t6);
        String gia7 = currencyFormatter.format(t7);
        String gia8 = currencyFormatter.format(t8);
        String gia9 = currencyFormatter.format(t9);
        String gia10 = currencyFormatter.format(t10);
        String gia11 = currencyFormatter.format(t11);
        String gia12 = currencyFormatter.format(t12);
        
        lblThang13.setText(String.valueOf(gia1));
        lblThang14.setText(String.valueOf(gia2));
        lblThang15.setText(String.valueOf(gia3));
        lblThang16.setText(String.valueOf(gia4));
        lblThang17.setText(String.valueOf(gia5));
        lblThang18.setText(String.valueOf(gia6));
        lblThang19.setText(String.valueOf(gia7));
        lblThang20.setText(String.valueOf(gia8));
        lblThang21.setText(String.valueOf(gia9));
        lblThang22.setText(String.valueOf(gia10));
        lblThang23.setText(String.valueOf(gia11));
        lblThang24.setText(String.valueOf(gia12));
        
        //tiền phòng
        String p1 = currencyFormatter.format(tongTien1);
        String p2 = currencyFormatter.format(tongTien2);
        String p3 = currencyFormatter.format(tongTien3);
        String p4 = currencyFormatter.format(tongTien4);
        String p5 = currencyFormatter.format(tongTien5);
        String p6 = currencyFormatter.format(tongTien6);
        String p7 = currencyFormatter.format(tongTien7);
        String p8 = currencyFormatter.format(tongTien8);
        String p9 = currencyFormatter.format(tongTien9);
        String p10 = currencyFormatter.format(tongTien10);
        String p11 = currencyFormatter.format(tongTien11);
        String p12 = currencyFormatter.format(tongTien12);
        
        lblThang1.setText(String.valueOf(p1));
        lblThang2.setText(String.valueOf(p2));
        lblThang3.setText(String.valueOf(p3));
        lblThang4.setText(String.valueOf(p4));
        lblThang5.setText(String.valueOf(p5));
        lblThang6.setText(String.valueOf(p6));
        lblThang7.setText(String.valueOf(p7));
        lblThang8.setText(String.valueOf(p8));
        lblThang9.setText(String.valueOf(p9));
        lblThang10.setText(String.valueOf(p10));
        lblThang11.setText(String.valueOf(p11));
        lblThang12.setText(String.valueOf(p12));
        
        //tiền điện nước

        String dn1 = currencyFormatter.format(tongTienDien1);
        String dn2 = currencyFormatter.format(tongTienDien2);
        String dn3 = currencyFormatter.format(tongTienDien3);
        String dn4 = currencyFormatter.format(tongTienDien4);
        String dn5 = currencyFormatter.format(tongTienDien5);
        String dn6 = currencyFormatter.format(tongTienDien6);
        String dn7 = currencyFormatter.format(tongTienDien7);
        String dn8 = currencyFormatter.format(tongTienDien8);
        String dn9 = currencyFormatter.format(tongTienDien9);
        String dn10 = currencyFormatter.format(tongTienDien10);
        String dn11 = currencyFormatter.format(tongTienDien11);
        String dn12 = currencyFormatter.format(tongTienDien12);
        
        lblThang25.setText(String.valueOf(dn1));
        lblThang26.setText(String.valueOf(dn2));
        lblThang27.setText(String.valueOf(dn3));
        lblThang28.setText(String.valueOf(dn4));
        lblThang29.setText(String.valueOf(dn5));
        lblThang30.setText(String.valueOf(dn6));
        lblThang31.setText(String.valueOf(dn7));
        lblThang32.setText(String.valueOf(dn8));
        lblThang33.setText(String.valueOf(dn9));
        lblThang34.setText(String.valueOf(dn10));
        lblThang35.setText(String.valueOf(dn11));
        lblThang36.setText(String.valueOf(dn12));
        
        double tong = t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11+t12;
        String tong1 = currencyFormatter.format(tong);
        
        lblTong.setText(String.valueOf(tong1));

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
        btnLamMoi1 = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        cboPhong = new javax.swing.JComboBox<>();
        btnChon = new javax.swing.JButton();
        cboNam = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblThang1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblThang2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblThang3 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        lblThang13 = new javax.swing.JLabel();
        lblThang14 = new javax.swing.JLabel();
        lblThang15 = new javax.swing.JLabel();
        lblThang16 = new javax.swing.JLabel();
        lblThang17 = new javax.swing.JLabel();
        lblThang18 = new javax.swing.JLabel();
        lblThang19 = new javax.swing.JLabel();
        lblThang20 = new javax.swing.JLabel();
        lblThang21 = new javax.swing.JLabel();
        lblThang22 = new javax.swing.JLabel();
        lblThang23 = new javax.swing.JLabel();
        lblThang24 = new javax.swing.JLabel();
        lblThang25 = new javax.swing.JLabel();
        lblThang26 = new javax.swing.JLabel();
        lblThang27 = new javax.swing.JLabel();
        lblThang28 = new javax.swing.JLabel();
        lblThang29 = new javax.swing.JLabel();
        lblThang30 = new javax.swing.JLabel();
        lblThang31 = new javax.swing.JLabel();
        lblThang32 = new javax.swing.JLabel();
        lblThang33 = new javax.swing.JLabel();
        lblThang34 = new javax.swing.JLabel();
        lblThang35 = new javax.swing.JLabel();
        lblThang36 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Doanh thu phòng");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Đóng");

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnLamMoi1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi1.setText("Export excel");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi1)
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
                            .addComponent(btnLamMoi)
                            .addComponent(btnLamMoi1))
                        .addContainerGap())))
        );

        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        lblMessage.setText(" ");

        cboPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongActionPerformed(evt);
            }
        });

        btnChon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnChon.setText("Xem doanh thu");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("Phòng: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tháng 1: ");

        lblThang1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang1.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tháng 2: ");

        lblThang2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang2.setText("0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tháng 3: ");

        lblThang3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang3.setText("0");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Tháng 4: ");

        lblThang4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang4.setText("0");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Tháng 5: ");

        lblThang5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang5.setText("0");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Tháng 6: ");

        lblThang6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang6.setText("0");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Tháng 7: ");

        lblThang7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang7.setText("0");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Tháng 8: ");

        lblThang8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang8.setText("0");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Tháng 9: ");

        lblThang9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang9.setText("0");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Tháng 10: ");

        lblThang10.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang10.setText("0");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Tháng 11: ");

        lblThang11.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang11.setText("0");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Tháng 12: ");

        lblThang12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang12.setText("0");

        lblThang13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang13.setText("0");

        lblThang14.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang14.setText("0");

        lblThang15.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang15.setText("0");

        lblThang16.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang16.setText("0");

        lblThang17.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang17.setText("0");

        lblThang18.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang18.setText("0");

        lblThang19.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang19.setText("0");

        lblThang20.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang20.setText("0");

        lblThang21.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang21.setText("0");

        lblThang22.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang22.setText("0");

        lblThang23.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang23.setText("0");

        lblThang24.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang24.setText("0");

        lblThang25.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang25.setText("0");

        lblThang26.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang26.setText("0");

        lblThang27.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang27.setText("0");

        lblThang28.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang28.setText("0");

        lblThang29.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang29.setText("0");

        lblThang30.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang30.setText("0");

        lblThang31.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang31.setText("0");

        lblThang32.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang32.setText("0");

        lblThang33.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang33.setText("0");

        lblThang34.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang34.setText("0");

        lblThang35.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang35.setText("0");

        lblThang36.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang36.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblThang2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThang12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblThang13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblThang14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblThang25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblThang26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel16)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel30)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang1)
                    .addComponent(lblThang2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblThang3)
                        .addComponent(lblThang4)
                        .addComponent(lblThang5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblThang6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblThang8)
                    .addComponent(lblThang9)
                    .addComponent(lblThang12)
                    .addComponent(lblThang7)
                    .addComponent(lblThang10)
                    .addComponent(lblThang11))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang25)
                    .addComponent(lblThang26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblThang27)
                        .addComponent(lblThang28)
                        .addComponent(lblThang29, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblThang30, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblThang32)
                    .addComponent(lblThang33)
                    .addComponent(lblThang36)
                    .addComponent(lblThang31)
                    .addComponent(lblThang34)
                    .addComponent(lblThang35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang13)
                    .addComponent(lblThang14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblThang15)
                        .addComponent(lblThang16)
                        .addComponent(lblThang17, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblThang18, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblThang20)
                    .addComponent(lblThang21)
                    .addComponent(lblThang24)
                    .addComponent(lblThang19)
                    .addComponent(lblThang22)
                    .addComponent(lblThang23))
                .addGap(31, 31, 31))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tổng thu");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Tổng: ");

        lblTong.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTong.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Phòng");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Diện nước");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 921, Short.MAX_VALUE)
                                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTong))
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        fillDoanhThu();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        this.fillDoanhThu();
    }//GEN-LAST:event_btnChonActionPerformed

    private void cboPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPhongActionPerformed

    private void btnLamMoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoi1ActionPerformed
    int index = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLamMoi1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblThang1;
    private javax.swing.JLabel lblThang10;
    private javax.swing.JLabel lblThang11;
    private javax.swing.JLabel lblThang12;
    private javax.swing.JLabel lblThang13;
    private javax.swing.JLabel lblThang14;
    private javax.swing.JLabel lblThang15;
    private javax.swing.JLabel lblThang16;
    private javax.swing.JLabel lblThang17;
    private javax.swing.JLabel lblThang18;
    private javax.swing.JLabel lblThang19;
    private javax.swing.JLabel lblThang2;
    private javax.swing.JLabel lblThang20;
    private javax.swing.JLabel lblThang21;
    private javax.swing.JLabel lblThang22;
    private javax.swing.JLabel lblThang23;
    private javax.swing.JLabel lblThang24;
    private javax.swing.JLabel lblThang25;
    private javax.swing.JLabel lblThang26;
    private javax.swing.JLabel lblThang27;
    private javax.swing.JLabel lblThang28;
    private javax.swing.JLabel lblThang29;
    private javax.swing.JLabel lblThang3;
    private javax.swing.JLabel lblThang30;
    private javax.swing.JLabel lblThang31;
    private javax.swing.JLabel lblThang32;
    private javax.swing.JLabel lblThang33;
    private javax.swing.JLabel lblThang34;
    private javax.swing.JLabel lblThang35;
    private javax.swing.JLabel lblThang36;
    private javax.swing.JLabel lblThang4;
    private javax.swing.JLabel lblThang5;
    private javax.swing.JLabel lblThang6;
    private javax.swing.JLabel lblThang7;
    private javax.swing.JLabel lblThang8;
    private javax.swing.JLabel lblThang9;
    private javax.swing.JLabel lblTong;
    // End of variables declaration//GEN-END:variables
}
