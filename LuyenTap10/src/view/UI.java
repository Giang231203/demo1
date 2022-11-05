/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Ban;
import service.BanService;

/**
 *
 * @author tt
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    DefaultTableModel defaultTableModel;
    Ban ban = new Ban();
    BanService banSV = new BanService();
    public UI() {
        initComponents();
        setLocationRelativeTo(null);
    }
public void LoadData(){
    defaultTableModel = (DefaultTableModel) tb_Ban.getModel();
    defaultTableModel.setRowCount(0);
    for (Ban b : banSV.getList()) {
        Object[] row = {
            b.getMa(),b.getTen(),b.getNgaySinh(),b.getSoThich(),b.lienlac()
        };
        defaultTableModel.addRow(row);
    }
}
private Ban getForm(){
    String ma = lblMa.getText().trim();
    String ten = txt_Ten.getText().trim();
    String ngaysinh = txt_Ngaysinh.getText().trim();
    String sothich = txt_Sothich.getText().trim();
    if(ten.length()==0||ngaysinh.length()==0||sothich.length()==0){
        JOptionPane.showMessageDialog(this, "Thong tin khong de trong");
        return null;
    }
    int trangthai = 0;
    if(chk_lienlac.isSelected()){
        trangthai=1;
    }
    Date NgaySinh = null;
    try {
        NgaySinh = Date.valueOf(ngaysinh);
    } catch (IllegalCallerException e) {
        e.printStackTrace();
    }
    Ban b = new Ban(ma, ten, NgaySinh, sothich, trangthai);
    return b;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Ngaysinh = new javax.swing.JTextField();
        txt_Ten = new javax.swing.JTextField();
        txt_Sothich = new javax.swing.JTextField();
        btn_hienthi = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        chk_lienlac = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Ban = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ma");

        lblMa.setText("-");

        jLabel3.setText("Ngay Sinh");

        jLabel4.setText("Ten");

        jLabel5.setText("Sơ Thich");

        btn_hienthi.setText("Hien thi");
        btn_hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hienthiActionPerformed(evt);
            }
        });

        btn_sua.setText("Sua");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xoa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        chk_lienlac.setText("Con lien lac");

        tb_Ban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma", "Ten", "Ngay Sinh", "So thich", "Lien lac"
            }
        ));
        tb_Ban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_BanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Ban);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_hienthi)
                                .addGap(28, 28, 28)
                                .addComponent(btn_sua)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Ten)
                                    .addComponent(txt_Sothich, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_xoa)
                                .addGap(29, 29, 29)
                                .addComponent(chk_lienlac)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMa)
                    .addComponent(jLabel4)
                    .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txt_Ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sothich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hienthi)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(chk_lienlac))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hienthiActionPerformed
        LoadData();
    }//GEN-LAST:event_btn_hienthiActionPerformed

    private void tb_BanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_BanMouseClicked
        int r = tb_Ban.getSelectedRow();
        lblMa.setText(tb_Ban.getValueAt(r, 0).toString());
        txt_Ten.setText(tb_Ban.getValueAt(r, 1).toString());
        txt_Ngaysinh.setText(tb_Ban.getValueAt(r, 2).toString());
        txt_Sothich.setText(tb_Ban.getValueAt(r, 3).toString());
        if(tb_Ban.getValueAt(r, 4).toString().equals("Con")){
            chk_lienlac.setSelected(true);
        }else{
            chk_lienlac.setSelected(false);
        }
    }//GEN-LAST:event_tb_BanMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        int r = tb_Ban.getSelectedRow();
        if(r==-1){
            JOptionPane.showMessageDialog(this, "Chon 1 dong de sua");
            return;
        }
        Ban b = getForm();
        if(b==null){
            return;
        }
        banSV.update(b, b.getMa());
        LoadData();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int r = tb_Ban.getSelectedRow();
        if(r==-1){
            JOptionPane.showMessageDialog(this, "Chon 1 dong de xoa");
            return;
        }
        Ban b = getForm();
        if(b==null){
            return;
        }
        banSV.delete(b.getMa());
        LoadData();
    }//GEN-LAST:event_btn_xoaActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hienthi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JCheckBox chk_lienlac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMa;
    private javax.swing.JTable tb_Ban;
    private javax.swing.JTextField txt_Ngaysinh;
    private javax.swing.JTextField txt_Sothich;
    private javax.swing.JTextField txt_Ten;
    // End of variables declaration//GEN-END:variables
}