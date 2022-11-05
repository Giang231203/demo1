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
import model.Mausac;

/**
 *
 * @author User
 */
public class repoMausacmpl implements repoMausac {

    @Override
    public ArrayList<Mausac> getAll() {
        ArrayList<Mausac> listmausac = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String query = " select * from MauSac";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Mausac mausac = new Mausac(id, ma, ten);
                listmausac.add(mausac);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listmausac;
    }

    @Override
    public boolean insert(Mausac ms) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "insert into MauSac(ma, ten) values(?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ms.getMa());
            ps.setString(2, ms.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(Mausac ms, String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "update MauSac set ten = ? where ma = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ms.getTen());
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
            String query = "DELETE ChiTietSP WHERE idmausac IN ( SELECT id FROM mausac WHERE mausac.ma = ?)\n"
                    + "		DELETE mausac WHERE mausac.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            ps.setString(2, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

//    public ArrayList<Mausac> getall() {
//        ArrayList<Mausac> listmausac = new ArrayList<>();
//
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = " select * from MauSac";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.execute();
//
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String ma = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//
//                Mausac mausac = new Mausac(id, ma, ten);
//                listmausac.add(mausac);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listmausac;
//    }
//
//    public void insert(Mausac mausac) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "insert into MauSac(ma, ten) values(?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, mausac.getMa());
//            ps.setString(2, mausac.getTen());
//
//            ps.execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void update(Mausac mausac, String ma) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "update MauSac set ten = ? where ma = ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, mausac.getTen());
//            ps.setString(2, ma);
//            ps.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void delete(String ma) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "DELETE ChiTietSP WHERE idmausac IN ( SELECT id FROM mausac WHERE mausac.ma = ?)\n"
//                    + "		DELETE mausac WHERE mausac.ma= ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, ma);
//            ps.setString(2, ma);
//
//            ps.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
