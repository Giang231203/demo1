/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Chitietsp;
import model.Dongsp;
import model.Mausac;
import model.NSX;
import model.Sanpham;
import service.serviceChitietsanpham;
import service.serviceDongsp;
import service.serviceMausac;
import service.serviceNSx;
import service.serviceSanpham;
import serviceimpl.serviceChitietsanphamimpl;
import serviceimpl.serviceDongspimpl;
import serviceimpl.serviceMausacimpl;
import serviceimpl.serviceNSximpl;
import serviceimpl.serviceSanphamimpl;

/**
 *
 * @author User
 */
public class QLChitietsp extends javax.swing.JFrame {

    /**
     * Creates new form QLChitietsp
     */
    private serviceSanpham svsp = new serviceSanphamimpl();
    private serviceChitietsanpham svctsp = new serviceChitietsanphamimpl();
    private serviceNSx svnsx = new serviceNSximpl();
    private serviceDongsp svdongsp = new serviceDongspimpl();
    private serviceMausac svmausac = new serviceMausacimpl();

    public QLChitietsp() {
        initComponents();
        cbbNSX();
        cbbDongSP();
        cbbSanPham();
        cbbMauSac();
        loadtable();
    }

    public void loadtable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tb_chitietsp.getModel();
        defaultTableModel.setRowCount(0);

        for (Chitietsp chitietsp : svctsp.getall()) {
            String ma = "";
            String ten = "";
            for (Sanpham sanpham : svsp.getall()) {
                if (sanpham.getId().equals(chitietsp.getIdsp())) {
                    ma = sanpham.getMa();
                    ten = sanpham.getTen();
                    break;
                }
            }
            defaultTableModel.addRow(new Object[]{
                ma, ten, getmansx(chitietsp.getIdnsx()), getmamausac(chitietsp.getIdmausac()), getmadongsp(chitietsp.getIddongsp()), chitietsp.getNambh(), chitietsp.getMota(), chitietsp.getSoluongton(), chitietsp.getGianhap(), chitietsp.getGiaban(), chitietsp.getId()
            });

        }

    }

    public String getmansx(String idnsx) {
        String mansx = "";
        for (NSX nsx : svnsx.getall()) {
            if (nsx.getId().equalsIgnoreCase(idnsx)) {
                mansx = nsx.getMa();
                break;
            }
        }
        return mansx;
    }

    public String getmamausac(String idmausac) {
        String mamausac = "";
        for (Mausac mausac : svmausac.getall()) {
            if (mausac.getId().equalsIgnoreCase(idmausac)) {
                mamausac = mausac.getMa();
                break;
            }
        }
        return mamausac;
    }

    public String getmadongsp(String iddongsp) {
        String madongsp = "";
        for (Dongsp dongsp : svdongsp.getall()) {
            if (dongsp.getId().equalsIgnoreCase(iddongsp)) {
                madongsp = dongsp.getMa();
                break;
            }
        }
        return madongsp;
    }

    void cbbNSX() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cb_nsx.getModel();
        ArrayList<String> listnsx = new ArrayList<>();
        for (NSX nsx : svnsx.getall()) {
            listnsx.add(nsx.getMa());
        }
        for (String addNSX : listnsx) {
            dcbm.addElement(addNSX);
        }
    }

    void cbbDongSP() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cb_dongsp.getModel();
        ArrayList<String> listDongsp = new ArrayList<>();
        for (Dongsp dongsp : svdongsp.getall()) {
            listDongsp.add(dongsp.getMa());
        }
        for (String addDongSP : listDongsp) {
            dcbm.addElement(addDongSP);
        }
    }

    void cbbSanPham() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cb_sp.getModel();
        ArrayList<String> listSP = new ArrayList<>();
        for (Sanpham sp : svsp.getall()) {
            listSP.add(sp.getMa());
        }
        for (String addSanPham : listSP) {
            dcbm.addElement(addSanPham);
        }
    }

    void cbbMauSac() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cb_mausac.getModel();
        ArrayList<String> listMauSac = new ArrayList<>();
        for (Mausac ms : svmausac.getall()) {
            listMauSac.add(ms.getMa());
        }
        for (String addMauSac : listMauSac) {
            dcbm.addElement(addMauSac);
        }
    }

    public void clear() {
        txt_giaban.setText("");
        txt_gianhap.setText("");
        txt_mota.setText("");
        txt_nambh.setText("");
        txt_soluongton.setText("");
        cb_dongsp.setSelectedIndex(0);
        cb_mausac.setSelectedIndex(0);
        cb_nsx.setSelectedIndex(0);
        cb_sp.setSelectedIndex(0);
    }

    public String IdMau(String mamauSac) {
        String idString = "";
        for (Mausac ms : svmausac.getall()) {
            if (mamauSac.trim().equals(ms.getMa().trim())) {
                idString = ms.getId();
                break;
            }
        }
        return idString;
    }

    public String Idnsx(String maNsx) {
        String idString = "";
        for (NSX nsx : svnsx.getall()) {
            if (maNsx.equals(nsx.getMa().trim())) {
                idString = nsx.getId();
                break;
            }
        }
        return idString;
    }

    public String IdDongsp(String maDongsp) {
        String idString = "";
        for (Dongsp dongsp : svdongsp.getall()) {
            if (maDongsp.equals(dongsp.getMa().trim())) {
                idString = dongsp.getId();
                break;
            }
        }
        return idString;
    }

    public String IdSP(String masanpham) {
        String idString = "";
        for (Sanpham sp : svsp.getall()) {
            if (masanpham.trim().equals(sp.getMa().trim())) {
                idString = sp.getId();
                break;
            }
        }
        return idString;
    }

    public Chitietsp getforminsert() {

        Chitietsp ctsp = new Chitietsp();
        int nambh = Integer.parseInt(txt_nambh.getText().trim().toString());
        String moTa = txt_mota.getText().toString().trim();
        int SL = Integer.parseInt(txt_soluongton.getText().toString().trim());
        double giaNhap = Double.parseDouble(txt_gianhap.getText().toString());
        double giaBan = Double.parseDouble(txt_giaban.getText().toString());
        String mamauSac = cb_mausac.getSelectedItem().toString();
        String masanPham = cb_sp.getSelectedItem().toString();
        String madongSP = cb_dongsp.getSelectedItem().toString();
        String mansx = cb_nsx.getSelectedItem().toString();

        ctsp.setIdsp(IdSP(masanPham));
        ctsp.setIdmausac(IdMau(mamauSac));
        ctsp.setIddongsp(IdDongsp(madongSP));
        ctsp.setIdnsx(Idnsx(mansx));
        ctsp.setNambh(nambh);
        ctsp.setMota(moTa);
        ctsp.setSoluongton(SL);
        ctsp.setGianhap(giaNhap);
        ctsp.setGiaban(giaBan);
        return ctsp;
    }

    public Chitietsp getnewform() {
        int nambh = Integer.parseInt(txt_nambh.getText().trim().toString());
        String moTa = txt_mota.getText().toString().trim();
        String Slstr = txt_soluongton.getText().trim();
        String giapnhapstr = txt_gianhap.getText().trim();
        String giabanstr = txt_giaban.getText().trim();
        if (moTa.length() == 0 || Slstr.length() == 0 || giabanstr.length() == 0 || giapnhapstr.length() == 0) {
            JOptionPane.showMessageDialog(this, "Khong de trong thong tin !");
            return null;
        }

        int SL = Integer.parseInt(txt_soluongton.getText().toString().trim());
        double giaNhap = Double.parseDouble(txt_gianhap.getText().toString());
        double giaBan = Double.parseDouble(txt_giaban.getText().toString());
        String mamauSac = cb_mausac.getSelectedItem().toString();
        String masanPham = cb_sp.getSelectedItem().toString();
        String madongSP = cb_dongsp.getSelectedItem().toString();
        String mansx = cb_nsx.getSelectedItem().toString();
        Chitietsp ctsp = new Chitietsp();

        ctsp.setIdsp(IdSP(masanPham));
        ctsp.setIdmausac(IdMau(mamauSac));
        ctsp.setIddongsp(IdDongsp(madongSP));
        ctsp.setIdnsx(Idnsx(mansx));
        ctsp.setNambh(nambh);
        ctsp.setMota(moTa);
        ctsp.setSoluongton(SL);
        ctsp.setGianhap(giaNhap);
        ctsp.setGiaban(giaBan);
        return ctsp;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_sp = new javax.swing.JComboBox<>();
        cb_dongsp = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb_mausac = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_nsx = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nambh = new javax.swing.JTextField();
        txt_mota = new javax.swing.JTextField();
        txt_soluongton = new javax.swing.JTextField();
        txt_gianhap = new javax.swing.JTextField();
        txt_giaban = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_chitietsp = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_addSP = new javax.swing.JButton();
        btn_addDongsp = new javax.swing.JButton();
        btn_addcolor = new javax.swing.JButton();
        btn_addnsx = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quan ly thông  tin san pham");

        jLabel2.setText("San Pham");

        jLabel3.setText("Dong san pham");

        jLabel4.setText("mau Sac");

        jLabel5.setText("NSX");

        jLabel6.setText("Nam BH");

        jLabel7.setText("Mo ta");

        jLabel8.setText("So luong ton");

        jLabel9.setText("gianhap");

        jLabel10.setText("Giaban");

        tb_chitietsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma sp", "ten sp", "NSX", "MauSac", "Dong sp", "nam bh", "Mo ta", "so luong ton", "Gia nhap", "Gia ban", "idctsp"
            }
        ));
        tb_chitietsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_chitietspMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_chitietsp);

        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
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

        btn_addSP.setText("Them san pham");
        btn_addSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSPActionPerformed(evt);
            }
        });

        btn_addDongsp.setText("Them Dong Sp");
        btn_addDongsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addDongspActionPerformed(evt);
            }
        });

        btn_addcolor.setText("them mau sac");
        btn_addcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addcolorActionPerformed(evt);
            }
        });

        btn_addnsx.setText("them nsx");
        btn_addnsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addnsxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 700, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_sp, 0, 220, Short.MAX_VALUE)
                                    .addComponent(cb_dongsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_mausac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_nsx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nambh)
                                    .addComponent(txt_mota)
                                    .addComponent(txt_soluongton)
                                    .addComponent(txt_gianhap)
                                    .addComponent(txt_giaban))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_addDongsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_sua))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_addnsx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_xoa))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_addSP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_them)))
                                    .addComponent(btn_addcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(302, 302, 302))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them)
                    .addComponent(btn_addSP))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_dongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addDongsp)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_sua)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addcolor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_nsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btn_addnsx)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_xoa)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_mota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_soluongton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        Chitietsp ctsp = this.getforminsert();
        JOptionPane.showMessageDialog(this, svctsp.insert(ctsp)
        );

        loadtable();

    }//GEN-LAST:event_btn_themActionPerformed

    private void tb_chitietspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_chitietspMouseClicked
        // TODO add your handling code here:
        int row = tb_chitietsp.getSelectedRow();

        cb_sp.setSelectedItem(tb_chitietsp.getValueAt(row, 0));
        cb_mausac.setSelectedItem(tb_chitietsp.getValueAt(row, 3));
        cb_dongsp.setSelectedItem(tb_chitietsp.getValueAt(row, 4));
        cb_nsx.setSelectedItem(tb_chitietsp.getValueAt(row, 2));
        txt_giaban.setText(tb_chitietsp.getValueAt(row, 9).toString());
        txt_gianhap.setText(tb_chitietsp.getValueAt(row, 8).toString());
        txt_mota.setText(tb_chitietsp.getValueAt(row, 6).toString());
        txt_nambh.setText(tb_chitietsp.getValueAt(row, 5).toString());
        txt_soluongton.setText(tb_chitietsp.getValueAt(row, 7).toString());

    }//GEN-LAST:event_tb_chitietspMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int row = tb_chitietsp.getSelectedRow();
        String id = tb_chitietsp.getValueAt(row, 10).toString().trim();
        Chitietsp ctsp = this.getforminsert();
        if (ctsp == null) {
            return;
        }
        JOptionPane.showMessageDialog(this, svctsp.update(ctsp, id)
        );
        loadtable();

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int row = tb_chitietsp.getSelectedRow();
        String id = tb_chitietsp.getValueAt(row, 10).toString().trim();
        JOptionPane.showMessageDialog(this, svctsp.delete(id));

        loadtable();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_addSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSPActionPerformed
        // TODO add your handling code here:
        QLSanpham qlsp = new QLSanpham();
        qlsp.setVisible(true);


    }//GEN-LAST:event_btn_addSPActionPerformed

    private void btn_addDongspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addDongspActionPerformed
        // TODO add your handling code here:
        QLdongsp qldsp = new QLdongsp();
        qldsp.setVisible(true);
    }//GEN-LAST:event_btn_addDongspActionPerformed

    private void btn_addcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addcolorActionPerformed
        // TODO add your handling code here:
        QLMausac qlms = new QLMausac();
        qlms.setVisible(true);
    }//GEN-LAST:event_btn_addcolorActionPerformed

    private void btn_addnsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnsxActionPerformed
        // TODO add your handling code here:
        QLNsx qlnsx = new QLNsx();
        qlnsx.setVisible(true);
    }//GEN-LAST:event_btn_addnsxActionPerformed

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
            java.util.logging.Logger.getLogger(QLChitietsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLChitietsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLChitietsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLChitietsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLChitietsp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addDongsp;
    private javax.swing.JButton btn_addSP;
    private javax.swing.JButton btn_addcolor;
    private javax.swing.JButton btn_addnsx;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_dongsp;
    private javax.swing.JComboBox<String> cb_mausac;
    private javax.swing.JComboBox<String> cb_nsx;
    private javax.swing.JComboBox<String> cb_sp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_chitietsp;
    private javax.swing.JTextField txt_giaban;
    private javax.swing.JTextField txt_gianhap;
    private javax.swing.JTextField txt_mota;
    private javax.swing.JTextField txt_nambh;
    private javax.swing.JTextField txt_soluongton;
    // End of variables declaration//GEN-END:variables
}
