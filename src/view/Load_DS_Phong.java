package view;

import dao.PhongDAO;
import java.util.ArrayList;
import java.util.List;
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
                .addContainerGap()
                .addComponent(btnNut, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(949, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNut, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
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
        loadPhong();
    }//GEN-LAST:event_btnNutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNut;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
