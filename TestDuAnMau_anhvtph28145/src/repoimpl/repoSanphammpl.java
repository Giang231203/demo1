/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repoimpl;

import repo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Sanpham;

/**
 *
 * @author User
 */
public class repoSanphammpl implements repoSanpham {

    @Override
    public ArrayList<Sanpham> getall() {
        ArrayList<Sanpham> listSanpham = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String query = " select * from SanPham";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Sanpham sp = new Sanpham(id, ma, ten);
                listSanpham.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanpham;
    }

    @Override
    public boolean insert(Sanpham sp) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "insert into SanPham(ma, ten) values(?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sp.getMa());
            ps.setString(2, sp.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(Sanpham sp, String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "update Sanpham set ten = ? where ma = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sp.getTen());
            ps.setString(2, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "DELETE ChiTietSP WHERE idsp IN ( SELECT id FROM sanpham WHERE sanpham.ma = ?)\n"
                    + "	DELETE sanpham WHERE sanpham.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            ps.setString(2, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
