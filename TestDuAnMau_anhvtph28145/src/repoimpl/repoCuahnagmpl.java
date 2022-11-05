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
import model.Cuahang;

/**
 *
 * @author User
 */
public class repoCuahnagmpl implements repoCuahnag {

    @Override
    public ArrayList<Cuahang> getAll() {
        ArrayList<Cuahang> listch = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String query = " select * from Cuahang";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String diachi = rs.getString("diachi");
                String thanhpho = rs.getString("thanhpho");
                String quocgia = rs.getString("quocgia");

                Cuahang ch = new Cuahang(id, ma, ten, diachi, thanhpho, quocgia);
                listch.add(ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listch;
    }

    @Override
    public boolean insert(Cuahang ch) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "insert into Cuahang(ma, ten, diachi, thanhpho, quocgia) values(?, ?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ch.getMa());
            ps.setString(2, ch.getTen());
            ps.setString(3, ch.getDiachi());
            ps.setString(4, ch.getThanhpho());
            ps.setString(5, ch.getQuocgia());

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(Cuahang ch, String ma) {
          try {
            Connection conn = DBContext.getConnection();
            String query = "update Cuahang set ten = ?, diachi =?, thanhpho =?, quocgia =? where ma = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ch.getTen());
            ps.setString(2, ch.getDiachi());
            ps.setString(3, ch.getThanhpho());
            ps.setString(4, ch.getQuocgia());
            ps.setString(5, ma);
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
            String query = "DELETE nhanvien WHERE idch IN ( SELECT id FROM cuahang WHERE cuahnag.ma = ?)\n"
                    + "		DELETE cuahang WHERE cuahang.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            ps.setString(2, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

//     public ArrayList<Cuahang> getall() {
//        ArrayList<Cuahang> listch = new ArrayList<>();
//
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = " select * from Cuahang";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.execute();
//
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String ma = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//                String diachi = rs.getString("diachi");
//                String thanhpho = rs.getString("thanhpho");
//                String quocgia = rs.getString("quocgia");
//
//                Cuahang ch = new Cuahang(id, ma, ten, diachi, thanhpho, quocgia);
//                listch.add(ch);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listch;
//    }
//
//    public void insert(Cuahang ch) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "insert into Cuahang(ma, ten, diachi, thanhpho, quocgia) values(?, ?,?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, ch.getMa());
//            ps.setString(2, ch.getTen());
//            ps.setString(3, ch.getDiachi());
//            ps.setString(4, ch.getThanhpho());
//            ps.setString(5, ch.getQuocgia());
//
//            ps.execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void update(Cuahang ch, String ma) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "update Cuahang set ten = ?, diachi =?, thanhpho =?, quocgia =? where ma = ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, ch.getTen());
//            ps.setString(2, ch.getDiachi());
//            ps.setString(3, ch.getThanhpho());
//            ps.setString(4, ch.getQuocgia());
//            ps.setString(5, ma);
//            ps.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void delete(String ma) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String query = "DELETE nhanvien WHERE idch IN ( SELECT id FROM cuahang WHERE cuahnag.ma = ?)\n"
//                    + "		DELETE cuahang WHERE cuahang.ma= ?";
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
