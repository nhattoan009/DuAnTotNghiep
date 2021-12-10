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
import model.HopDong;

public class DoanhThuThang extends javax.swing.JPanel {

    PhongDAO pDao = new PhongDAO();
    HoaDonDAO hdDao = new HoaDonDAO();
    DienNuocDAO dnDao = new DienNuocDAO();
    HopDongDAO hopDongDAO = new HopDongDAO();

    public DoanhThuThang() {
        initComponents();
        fillDoanhThu();
        fillComboBoxNam();

    }

    private void fillDoanhThu() {

        List<model.HoaDon> list = hdDao.select();
        List<model.DienNuoc> list2 = dnDao.select();

        double tongTien1 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("1"))
                .mapToDouble(s -> s.getTienPhong())
                .sum();
        double tongTienDien1 = list2.stream()
                .filter(s -> s.isTrangThai() == true)
                .filter(s -> s.getThang().equals("Tháng 1"))
                .mapToDouble(s -> s.getTongTienDien() + s.getTongTienNuoc())
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

        lblThang25.setText(String.valueOf(gia1));
        lblThang26.setText(String.valueOf(gia2));
        lblThang27.setText(String.valueOf(gia3));
        lblThang28.setText(String.valueOf(gia4));
        lblThang29.setText(String.valueOf(gia5));
        lblThang30.setText(String.valueOf(gia6));
        lblThang31.setText(String.valueOf(gia7));
        lblThang32.setText(String.valueOf(gia8));
        lblThang33.setText(String.valueOf(gia9));
        lblThang34.setText(String.valueOf(gia10));
        lblThang35.setText(String.valueOf(gia11));
        lblThang36.setText(String.valueOf(gia12));
        
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
        
        lblThang13.setText(String.valueOf(p1));
        lblThang14.setText(String.valueOf(p2));
        lblThang15.setText(String.valueOf(p3));
        lblThang16.setText(String.valueOf(p4));
        lblThang17.setText(String.valueOf(p5));
        lblThang18.setText(String.valueOf(p6));
        lblThang19.setText(String.valueOf(p7));
        lblThang20.setText(String.valueOf(p8));
        lblThang21.setText(String.valueOf(p9));
        lblThang22.setText(String.valueOf(p10));
        lblThang23.setText(String.valueOf(p11));
        lblThang24.setText(String.valueOf(p12));
        
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
        
        lblThang37.setText(String.valueOf(dn1));
        lblThang38.setText(String.valueOf(dn2));
        lblThang39.setText(String.valueOf(dn3));
        lblThang40.setText(String.valueOf(dn4));
        lblThang41.setText(String.valueOf(dn5));
        lblThang42.setText(String.valueOf(dn6));
        lblThang43.setText(String.valueOf(dn7));
        lblThang44.setText(String.valueOf(dn8));
        lblThang45.setText(String.valueOf(dn9));
        lblThang46.setText(String.valueOf(dn10));
        lblThang47.setText(String.valueOf(dn11));
        lblThang48.setText(String.valueOf(dn12));

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnChon = new javax.swing.JButton();
        cboNam = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblThang13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblThang14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblThang15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblThang16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblThang17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblThang18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblThang19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblThang20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblThang21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblThang22 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblThang23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblThang24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
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
        lblThang37 = new javax.swing.JLabel();
        lblThang38 = new javax.swing.JLabel();
        lblThang39 = new javax.swing.JLabel();
        lblThang40 = new javax.swing.JLabel();
        lblThang41 = new javax.swing.JLabel();
        lblThang42 = new javax.swing.JLabel();
        lblThang43 = new javax.swing.JLabel();
        lblThang44 = new javax.swing.JLabel();
        lblThang45 = new javax.swing.JLabel();
        lblThang46 = new javax.swing.JLabel();
        lblThang47 = new javax.swing.JLabel();
        lblThang48 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Doanh thu tháng");

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

        btnChon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnChon.setText("Xem doanh thu");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("Phòng: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tổng thu");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tháng 1: ");

        lblThang13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang13.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tháng 2: ");

        lblThang14.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang14.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tháng 3: ");

        lblThang15.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang15.setText("0");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Tháng 4: ");

        lblThang16.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang16.setText("0");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Tháng 5: ");

        lblThang17.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang17.setText("0");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Tháng 6: ");

        lblThang18.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang18.setText("0");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Tháng 7: ");

        lblThang19.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang19.setText("0");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Tháng 8: ");

        lblThang20.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang20.setText("0");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Tháng 9: ");

        lblThang21.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang21.setText("0");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setText("Tháng 10: ");

        lblThang22.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang22.setText("0");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Tháng 11: ");

        lblThang23.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang23.setText("0");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("Tháng 12: ");

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

        lblThang37.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang37.setText("0");

        lblThang38.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang38.setText("0");

        lblThang39.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang39.setText("0");

        lblThang40.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang40.setText("0");

        lblThang41.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang41.setText("0");

        lblThang42.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang42.setText("0");

        lblThang43.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang43.setText("0");

        lblThang44.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang44.setText("0");

        lblThang45.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang45.setText("0");

        lblThang46.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang46.setText("0");

        lblThang47.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang47.setText("0");

        lblThang48.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblThang48.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
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
                                .addComponent(lblThang36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblThang37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblThang38, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang40, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang41, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang42, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang43, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang44, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang45, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang46, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang47, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThang48, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel17)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel33)
                    .addComponent(jLabel25)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang13)
                    .addComponent(lblThang14)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang37)
                    .addComponent(lblThang38)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblThang39)
                        .addComponent(lblThang40)
                        .addComponent(lblThang41, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblThang42, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblThang44)
                    .addComponent(lblThang45)
                    .addComponent(lblThang48)
                    .addComponent(lblThang43)
                    .addComponent(lblThang46)
                    .addComponent(lblThang47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang25)
                    .addComponent(lblThang26)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(31, 31, 31))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Phòng");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Diện nước");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGap(163, 163, 163)
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 265, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed

    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        this.fillDoanhThu();
    }//GEN-LAST:event_btnChonActionPerformed
    int index = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblThang13;
    private javax.swing.JLabel lblThang14;
    private javax.swing.JLabel lblThang15;
    private javax.swing.JLabel lblThang16;
    private javax.swing.JLabel lblThang17;
    private javax.swing.JLabel lblThang18;
    private javax.swing.JLabel lblThang19;
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
    private javax.swing.JLabel lblThang30;
    private javax.swing.JLabel lblThang31;
    private javax.swing.JLabel lblThang32;
    private javax.swing.JLabel lblThang33;
    private javax.swing.JLabel lblThang34;
    private javax.swing.JLabel lblThang35;
    private javax.swing.JLabel lblThang36;
    private javax.swing.JLabel lblThang37;
    private javax.swing.JLabel lblThang38;
    private javax.swing.JLabel lblThang39;
    private javax.swing.JLabel lblThang40;
    private javax.swing.JLabel lblThang41;
    private javax.swing.JLabel lblThang42;
    private javax.swing.JLabel lblThang43;
    private javax.swing.JLabel lblThang44;
    private javax.swing.JLabel lblThang45;
    private javax.swing.JLabel lblThang46;
    private javax.swing.JLabel lblThang47;
    private javax.swing.JLabel lblThang48;
    // End of variables declaration//GEN-END:variables
}
