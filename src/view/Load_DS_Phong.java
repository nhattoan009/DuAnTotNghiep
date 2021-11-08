package view;

import dao.PhongDAO;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Phong;

public class Load_DS_Phong extends javax.swing.JPanel {

    List<Phong> arrPhong = new ArrayList<>();
    PhongDAO dao = new PhongDAO();

    public Load_DS_Phong() {
        initComponents();
    }

    void loadPhong() {
        List<Phong> listPhong = new ArrayList<>();

        List<Phong> list = dao.select();
        for (Phong sv : list) {
            sv.getMaPhong();
            sv.getTenPhong();
            sv.getGiaPhong();
            sv.isTrangThai();// ? "Hoạt động" : "Không hoạt động";
            listPhong.add(sv);
        }
//        System.out.println(listPhong);
//        System.out.println(listPhong.get(0));

        for (int i = 0; i < listPhong.size(); i++) {
            System.out.println(listPhong.get(i));
            String ma = listPhong.get(i).getMaPhong();
            String ten = listPhong.get(i).getTenPhong();
            double g = listPhong.get(i).getGiaPhong();
//            lblA.setText(ma);
//            lblB.setText(ten);
//            lblC.setText(String.valueOf(g));

        }
        ridLayoutExam1();
    }

    void ridLayoutExam1() {
        JFrame frame = new JFrame();
        for (int i = 0; i < 5; i++) {
            frame.add(new JButton());
        }
//        JButton b1 = new JButton("1");
//        JButton b2 = new JButton("2");
//        JButton b3 = new JButton("3");
//        JButton b4 = new JButton("4");
//        JButton b5 = new JButton("5");
//        JButton b6 = new JButton("6");
//        JButton b7 = new JButton("7");
//        JButton b8 = new JButton("8");
//        JButton b9 = new JButton("9");
//        JButton b12 = new JButton("9");
//        JPanel bb = new JPanel();
//        bb.setBackground(Color.red);
//
//        frame.add(b1);
//        frame.add(b2);
//        frame.add(b3);
//        frame.add(b4);
//        frame.add(b5);
//        frame.add(b6);
//        frame.add(b7);
//        frame.add(b8);
//        frame.add(b9);
//        frame.add(b12);
//        frame.add(bb);

        // thiet lap 3 hang va 3 cot cho grid layout
        frame.setLayout(new GridLayout(3, 7));
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        btnNut = new javax.swing.JButton();

        pnl.setBackground(new java.awt.Color(204, 204, 204));

        btnNut.setText("nút");
        btnNut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnNut, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(590, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnNut, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNutActionPerformed
        
    }//GEN-LAST:event_btnNutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNut;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
