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
import model.Chucvu;

/**
 *
 * @author User
 */
public class repoChucvuimpl implements repoChucvu {

    @Override
    public ArrayList<Chucvu> getAll() {
        ArrayList<Chucvu> listcv = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String query = " select * from Chucvu ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Chucvu cv = new Chucvu(id, ma, ten);
                listcv.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listcv;
    }

    @Override
    public boolean insert(Chucvu cv) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "insert into Chucvu(ma, ten) values(?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(Chucvu cv, String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "update chucvu set ten = ? where ma = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cv.getTen());
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
            String query = "DELETE Nhanvien WHERE idcv IN ( SELECT id FROM chucvu WHERE chucvu.ma = ?)\n"
                    + "		DELETE chucvu WHERE chucvu.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            ps.setString(2, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

//    public ArrayList<Chucvu> getall() {
//        ArrayList<Chucvu> listcv = new ArrayList<>();
//
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = " select * from Chucvu ";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.execute();
//
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String ma = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//
//                Chucvu cv = new Chucvu(id, ma, ten);
//                listcv.add(cv);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listcv;
//    }
//
//    public void insert(Chucvu cv) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "insert into Chucvu(ma, ten) values(?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, cv.getMa());
//            ps.setString(2, cv.getTen());
//
//            ps.execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void update(Chucvu cv, String ma) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "update chucvu set ten = ? where ma = ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, cv.getTen());
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
//            String query = "DELETE Nhanvien WHERE idcv IN ( SELECT id FROM chucvu WHERE chucvu.ma = ?)\n"
//                    + "		DELETE chucvu WHERE chucvu.ma= ?";
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
