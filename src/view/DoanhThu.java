package view;

import EasyXLS.Constants.Alignment;
import EasyXLS.Constants.Border;
import EasyXLS.Constants.DataType;
import EasyXLS.ExcelDocument;
import EasyXLS.ExcelStyle;
import EasyXLS.ExcelTable;
import EasyXLS.ExcelWorksheet;
import dao.DienNuocDAO;
import dao.HoaDonDAO;
import dao.HopDongDAO;
import dao.PhongDAO;
import java.awt.Color;
import java.math.BigDecimal;
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

        BigDecimal tongTien1 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("1"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien1 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("1"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien2 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("2"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien2 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("2"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien3 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("3"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien3 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("3"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien4 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("4"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien4 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("4"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien5 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("5"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien5 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("5"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien6 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("6"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien6 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("6"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien7 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("7"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien7 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("7"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien8 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("8"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien8 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("8"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien9 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("9"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien9 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("9"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien10 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("10"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien10 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("10"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien11 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("11"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien11 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("11"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tongTien12 = list.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("12"))
                .map(s -> s.getTienPhong()) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal tongTienDien12 = list2.stream()
                .filter(s -> s.getTrangThai().trim().length() == 6)
                .filter(s -> s.getThang().equals("12"))
                .map(s -> s.getTongTienDien().add(s.getTongTienNuoc())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        //tổng tiền
        BigDecimal t1 = tongTien1.add(tongTienDien1);
        BigDecimal t2 = tongTien2.add(tongTienDien2);
        BigDecimal t3 = tongTien3.add(tongTienDien3);
        BigDecimal t4 = tongTien4.add(tongTienDien4);
        BigDecimal t5 = tongTien5.add(tongTienDien5);
        BigDecimal t6 = tongTien6.add(tongTienDien6);
        BigDecimal t7 = tongTien7.add(tongTienDien7);
        BigDecimal t8 = tongTien8.add(tongTienDien8);
        BigDecimal t9 = tongTien9.add(tongTienDien9);
        BigDecimal t10 = tongTien10.add(tongTienDien10);
        BigDecimal t11 = tongTien11.add(tongTienDien11);
        BigDecimal t12 = tongTien12.add(tongTienDien12);

        Locale locale = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String gia1 = formatter.format(t1);
        String gia2 = formatter.format(t2);
        String gia3 = formatter.format(t3);
        String gia4 = formatter.format(t4);
        String gia5 = formatter.format(t5);
        String gia6 = formatter.format(t6);
        String gia7 = formatter.format(t7);
        String gia8 = formatter.format(t8);
        String gia9 = formatter.format(t9);
        String gia10 = formatter.format(t10);
        String gia11 = formatter.format(t11);
        String gia12 = formatter.format(t12);

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
        String p1 = formatter.format(tongTien1);
        String p2 = formatter.format(tongTien2);
        String p3 = formatter.format(tongTien3);
        String p4 = formatter.format(tongTien4);
        String p5 = formatter.format(tongTien5);
        String p6 = formatter.format(tongTien6);
        String p7 = formatter.format(tongTien7);
        String p8 = formatter.format(tongTien8);
        String p9 = formatter.format(tongTien9);
        String p10 = formatter.format(tongTien10);
        String p11 = formatter.format(tongTien11);
        String p12 = formatter.format(tongTien12);

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
        String dn1 = formatter.format(tongTienDien1);
        String dn2 = formatter.format(tongTienDien2);
        String dn3 = formatter.format(tongTienDien3);
        String dn4 = formatter.format(tongTienDien4);
        String dn5 = formatter.format(tongTienDien5);
        String dn6 = formatter.format(tongTienDien6);
        String dn7 = formatter.format(tongTienDien7);
        String dn8 = formatter.format(tongTienDien8);
        String dn9 = formatter.format(tongTienDien9);
        String dn10 = formatter.format(tongTienDien10);
        String dn11 = formatter.format(tongTienDien11);
        String dn12 = formatter.format(tongTienDien12);

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

        BigDecimal tong = t1.add(t2).add(t3).add(t4).add(t5).add(t6).add(t7).add(t8).add(t9).add(t10).add(t11).add(t12);
//                t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11+t12;
        String tong1 = formatter.format(tong);

        lblTong.setText(String.valueOf(tong1));

    }

    private void fillComboBoxNam() {
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

    private void Export() {
        try {
            ExcelDocument workbook = new ExcelDocument(2);
            // Set the sheet names
            workbook.easy_getSheetAt(0).setSheetName("Doanh thu");
//            workbook.easy_getSheetAt(1).setSheetName("Second tab");

            // Get the table of data for the first worksheet
            ExcelTable xlsFirstTable = ((ExcelWorksheet) workbook.easy_getSheetAt(0)).easy_getExcelTable();
            ExcelStyle xlsStyleData = new ExcelStyle();
            xlsStyleData.setForeground(Color.DARK_GRAY);
            xlsStyleData.setBorderStyles(1, 1, 1, 1);
            xlsStyleData.setDataType(DataType.STRING);
            xlsFirstTable.easy_setRangeStyle("A1:M5", xlsStyleData);
            xlsFirstTable.setRowHeight(30);
            
            // Add data in cells for report header
            for (int t = 1; t <= 12; t++) {
                xlsFirstTable.easy_getCell(0, t).setValue("Tháng " + t);
                xlsFirstTable.easy_getCell(0, t).setDataType(DataType.STRING);
                xlsFirstTable.easy_getCell(0, t).setForeground(Color.DARK_GRAY);
            }
            for (int t = 0; t <= 12; t++) {
                xlsFirstTable.setColumnWidth(t, 100);
            }

            xlsFirstTable.easy_getCell(1, 0).setValue("Tiền phòng");
            xlsFirstTable.easy_getCell(2, 0).setValue("Tiền điện nước");
            xlsFirstTable.easy_getCell(3, 0).setValue("Tổng thu");
            xlsFirstTable.easy_getCell(4, 0).setValue("Tổng");
            xlsFirstTable.setColumnWidth(0, 100);

            xlsFirstTable.easy_getCell(1, 1).setValue(lblThang1.getText());
            xlsFirstTable.easy_getCell(1, 2).setValue(lblThang2.getText());
            xlsFirstTable.easy_getCell(1, 3).setValue(lblThang3.getText());
            xlsFirstTable.easy_getCell(1, 4).setValue(lblThang4.getText());
            xlsFirstTable.easy_getCell(1, 5).setValue(lblThang5.getText());
            xlsFirstTable.easy_getCell(1, 6).setValue(lblThang6.getText());
            xlsFirstTable.easy_getCell(1, 7).setValue(lblThang7.getText());
            xlsFirstTable.easy_getCell(1, 8).setValue(lblThang8.getText());
            xlsFirstTable.easy_getCell(1, 9).setValue(lblThang9.getText());
            xlsFirstTable.easy_getCell(1, 10).setValue(lblThang10.getText());
            xlsFirstTable.easy_getCell(1, 11).setValue(lblThang11.getText());
            xlsFirstTable.easy_getCell(1, 12).setValue(lblThang12.getText());

            xlsFirstTable.easy_getCell(2, 1).setValue(lblThang25.getText());
            xlsFirstTable.easy_getCell(2, 2).setValue(lblThang26.getText());
            xlsFirstTable.easy_getCell(2, 3).setValue(lblThang27.getText());
            xlsFirstTable.easy_getCell(2, 4).setValue(lblThang28.getText());
            xlsFirstTable.easy_getCell(2, 5).setValue(lblThang20.getText());
            xlsFirstTable.easy_getCell(2, 6).setValue(lblThang30.getText());
            xlsFirstTable.easy_getCell(2, 7).setValue(lblThang31.getText());
            xlsFirstTable.easy_getCell(2, 8).setValue(lblThang32.getText());
            xlsFirstTable.easy_getCell(2, 9).setValue(lblThang33.getText());
            xlsFirstTable.easy_getCell(2, 10).setValue(lblThang34.getText());
            xlsFirstTable.easy_getCell(2, 11).setValue(lblThang35.getText());
            xlsFirstTable.easy_getCell(2, 12).setValue(lblThang36.getText());

            xlsFirstTable.easy_getCell(3, 1).setValue(lblThang13.getText());
            xlsFirstTable.easy_getCell(3, 2).setValue(lblThang14.getText());
            xlsFirstTable.easy_getCell(3, 3).setValue(lblThang15.getText());
            xlsFirstTable.easy_getCell(3, 4).setValue(lblThang16.getText());
            xlsFirstTable.easy_getCell(3, 5).setValue(lblThang17.getText());
            xlsFirstTable.easy_getCell(3, 6).setValue(lblThang18.getText());
            xlsFirstTable.easy_getCell(3, 7).setValue(lblThang19.getText());
            xlsFirstTable.easy_getCell(3, 8).setValue(lblThang20.getText());
            xlsFirstTable.easy_getCell(3, 9).setValue(lblThang21.getText());
            xlsFirstTable.easy_getCell(3, 10).setValue(lblThang22.getText());
            xlsFirstTable.easy_getCell(3, 11).setValue(lblThang23.getText());
            xlsFirstTable.easy_getCell(3, 12).setValue(lblThang24.getText());

            xlsFirstTable.easy_getCell(4, 1).setValue(lblTong.getText());

            // Add data in cells for report values
//            for (int row = 0; row < 4; row++) {
//                for (int column = 1; column <= 12; column++) {
//                    xlsFirstTable.easy_getCell(row + 1, column).setValue("Data 1");
//                    xlsFirstTable.easy_getCell(row + 1, column).setDataType(DataType.STRING);
//                }
//            }
            workbook.easy_WriteXLSXFile("D:\\DemoExcel.xlsx");

            // Confirm export of Excel file
            if (workbook.easy_getError().equals("")) {
                System.out.println("File successfully created.");
                JOptionPane.showMessageDialog(this, "Xuất file thàng công");
            } else {
                System.out.println("Error encountered: " + workbook.easy_getError());
            }

            // Dispose memory
            workbook.Dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
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

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_available_updates_20px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Xls_Export_20px.png"))); // NOI18N
        btnExport.setText("Xuất excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
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
                .addComponent(btnExport)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLamMoi)
                            .addComponent(btnExport))
                        .addContainerGap())))
        );

        lblMessage.setForeground(new java.awt.Color(0, 153, 255));
        lblMessage.setText(" ");

        cboPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongActionPerformed(evt);
            }
        });

        btnChon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnChon.setText("Xem doanh thu");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        cboNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Chọn Phòng: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Tháng 1: ");

        lblThang1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang1.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Tháng 2: ");

        lblThang2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang2.setText("0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Tháng 3: ");

        lblThang3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang3.setText("0");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("Tháng 4: ");

        lblThang4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang4.setText("0");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setText("Tháng 5: ");

        lblThang5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang5.setText("0");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setText("Tháng 6: ");

        lblThang6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang6.setText("0");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setText("Tháng 7: ");

        lblThang7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang7.setText("0");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setText("Tháng 8: ");

        lblThang8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang8.setText("0");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setText("Tháng 9: ");

        lblThang9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang9.setText("0");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel26.setText("Tháng 10: ");

        lblThang10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang10.setText("0");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setText("Tháng 11: ");

        lblThang11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang11.setText("0");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel30.setText("Tháng 12: ");

        lblThang12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang12.setText("0");

        lblThang13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang13.setText("0");

        lblThang14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang14.setText("0");

        lblThang15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang15.setText("0");

        lblThang16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang16.setText("0");

        lblThang17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang17.setText("0");

        lblThang18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang18.setText("0");

        lblThang19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang19.setText("0");

        lblThang20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang20.setText("0");

        lblThang21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang21.setText("0");

        lblThang22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang22.setText("0");

        lblThang23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang23.setText("0");

        lblThang24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang24.setText("0");

        lblThang25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang25.setText("0");

        lblThang26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang26.setText("0");

        lblThang27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang27.setText("0");

        lblThang28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang28.setText("0");

        lblThang29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang29.setText("0");

        lblThang30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang30.setText("0");

        lblThang31.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang31.setText("0");

        lblThang32.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang32.setText("0");

        lblThang33.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang33.setText("0");

        lblThang34.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang34.setText("0");

        lblThang35.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang35.setText("0");

        lblThang36.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblThang36.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblThang2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblThang14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThang26, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblThang3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblThang27, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblThang4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(lblThang28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblThang5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblThang29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblThang6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblThang13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblThang25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(126, 126, 126)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblThang30, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblThang15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblThang16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblThang17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblThang18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblThang31, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblThang7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThang19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblThang8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(lblThang32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThang20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblThang33, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(lblThang9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThang21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblThang34, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lblThang10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblThang22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblThang35, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(lblThang11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThang23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblThang12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblThang36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblThang24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(118, Short.MAX_VALUE))
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
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblThang9)
                        .addComponent(lblThang10)
                        .addComponent(lblThang11)
                        .addComponent(lblThang12))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblThang7)
                        .addComponent(lblThang8)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblThang26)
                        .addComponent(lblThang27)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblThang29)
                            .addComponent(lblThang28)
                            .addComponent(lblThang30)
                            .addComponent(lblThang31)
                            .addComponent(lblThang32)
                            .addComponent(lblThang33)
                            .addComponent(lblThang34)
                            .addComponent(lblThang35)
                            .addComponent(lblThang36))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThang13)
                    .addComponent(lblThang14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblThang15)
                        .addComponent(lblThang16)
                        .addComponent(lblThang17)
                        .addComponent(lblThang18)
                        .addComponent(lblThang19)
                        .addComponent(lblThang20)
                        .addComponent(lblThang21)
                        .addComponent(lblThang22)
                        .addComponent(lblThang23)
                        .addComponent(lblThang24)))
                .addGap(31, 31, 31))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tổng thu tháng:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Tổng thu năm:");

        lblTong.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTong.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tiền phòng:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Tiền điện nước:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 317, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnChon)
                        .addGap(836, 836, 836)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChon)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblTong)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
//        fillDoanhThu();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        this.fillDoanhThu();

    }//GEN-LAST:event_btnChonActionPerformed

    private void cboPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPhongActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        Export();

    }//GEN-LAST:event_btnExportActionPerformed
    int index = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboPhong;
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
