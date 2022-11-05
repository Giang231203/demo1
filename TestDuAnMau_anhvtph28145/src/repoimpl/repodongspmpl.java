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

import model.Dongsp;

/**
 *
 * @author User
 */
public class repodongspmpl implements repodongsp {

    @Override
    public ArrayList<Dongsp> getAll() {
        ArrayList<Dongsp> listdongsp = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String query = " select * from Dongsp";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");

                Dongsp dongsp = new Dongsp(id, ma, ten);
                listdongsp.add(dongsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listdongsp;
    }

    @Override
    public boolean insert(Dongsp sp) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "insert into Dongsp(ma, ten) values(?, ?)";
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
    public boolean update(Dongsp sp, String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "update Dongsp set ten = ? where ma = ?";
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
            String query = "DELETE ChiTietSP WHERE iddongsp IN ( SELECT id FROM dongsp WHERE dongsp.ma = ?)\n"
                    + "		DELETE dongsp WHERE dongsp.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            ps.setString(2, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

//    public ArrayList<Dongsp> getall() {
//        ArrayList<Dongsp> listdongsp = new ArrayList<>();
//
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = " select * from Dongsp";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.execute();
//
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String ma = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//
//                Dongsp dongsp = new Dongsp(id, ma, ten);
//                listdongsp.add(dongsp);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listdongsp;
//    }
//
//    public void insert(Dongsp dongsp) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "insert into Dongsp(ma, ten) values(?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, dongsp.getMa());
//            ps.setString(2, dongsp.getTen());
//
//            ps.execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void update(Dongsp dongsp, String ma) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "update Dongsp set ten = ? where ma = ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, dongsp.getTen());
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
//            String query = "DELETE ChiTietSP WHERE iddongsp IN ( SELECT id FROM dongsp WHERE dongsp.ma = ?)\n"
//                    + "		DELETE dongsp WHERE dongsp.ma= ?";
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
