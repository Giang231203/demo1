/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repoimpl;

import repo.*;
import java.util.ArrayList;
import model.NSX;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class repoNSXmpl implements repoNSX {

    @Override
    public ArrayList<NSX> getAll() {
        ArrayList<NSX> listnsx = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String query = " select * from NSX";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");

                NSX nsx = new NSX(id, ma, ten);
                listnsx.add(nsx);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listnsx;
    }

    @Override
    public boolean insert(NSX nsx) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "insert into NSX(ma, ten) values(?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nsx.getMa());
            ps.setString(2, nsx.getTen());

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(NSX nsx, String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "update NSX set ten = ? where ma = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nsx.getTen());
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
            String query = "DELETE ChiTietSP WHERE idnsx IN ( SELECT id FROM nsx WHERE nsx.ma = ?)\n"
                    + "		DELETE nsx WHERE nsx.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            ps.setString(2, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

//    public ArrayList<NSX> getall() {
//        ArrayList<NSX> listnsx = new ArrayList<>();
//
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = " select * from NSX";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.execute();
//
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String ma = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//
//                NSX nsx = new NSX(id, ma, ten);
//                listnsx.add(nsx);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listnsx;
//    }
//
//    public void insert(NSX nsx) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "insert into NSX(ma, ten) values(?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, nsx.getMa());
//            ps.setString(2, nsx.getTen());
//
//            ps.execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void update(NSX nsx, String ma) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "update NSX set ten = ? where ma = ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, nsx.getTen());
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
//            String query = "DELETE ChiTietSP WHERE idnsx IN ( SELECT id FROM nsx WHERE nsx.ma = ?)\n"
//                    + "		DELETE nsx WHERE nsx.ma= ?";
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
