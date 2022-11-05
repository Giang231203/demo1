/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repoimpl;

import repo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Chitietsp;

/**
 *
 * @author User
 */
public class repoChitietsanphamimpl implements repoChitietsanpham {

    @Override
    public ArrayList<Chitietsp> getAll() {
        ArrayList<Chitietsp> listChiTietSP = new ArrayList<>();
        try {

            Connection conn = DBContext.getConnection();
            String select = "select * from chitietsp";
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String idsp = rs.getString("idsp");
                String idnsx = rs.getString("idnsx");
                String idmausac = rs.getString("idmausac");
                String iddongsp = rs.getString("iddongsp");
                int nambh = rs.getInt("nambh");
                String mota = rs.getString("mota");
                int soluong = rs.getInt("soluongton");
                double gianhap = rs.getDouble("gianhap");
                double giaban = rs.getDouble("giaban");
                Chitietsp ctsp = new Chitietsp(id, idsp, idnsx, idmausac, iddongsp, nambh, mota, soluong, gianhap, giaban);
                listChiTietSP.add(ctsp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listChiTietSP;
    }

    @Override
    public boolean insert(Chitietsp ctsp) {
        try {
            Connection conn = DBContext.getConnection();
            String insert = "insert into ChiTietSP"
                    + "(IDSP,IdNSX,IdMauSac,IdDongSP,NamBH,Mota,SoLuongTon,GiaNhap,GiaBan)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, ctsp.getIdsp());
            ps.setString(2, ctsp.getIdnsx());
            ps.setString(3, ctsp.getIdmausac());
            ps.setString(4, ctsp.getIddongsp());
            ps.setInt(5, ctsp.getNambh());
            ps.setString(6, ctsp.getMota());
            ps.setInt(7, ctsp.getSoluongton());
            ps.setDouble(8, ctsp.getGianhap());
            ps.setDouble(9, ctsp.getGiaban());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(Chitietsp ctsp, String id) {
        try {
            Connection conn = DBContext.getConnection();
            String update = "update ChiTietSP set IdDongSP = ?, IdMauSac = ?,IdNsx = ?,NamBH = ?,SoLuongTon = ?,MoTa =?,GiaNhap =?, giaban = ? where id=?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, ctsp.getIddongsp());
            ps.setString(2, ctsp.getIdmausac());
            ps.setString(3, ctsp.getIdnsx());
            ps.setInt(4, ctsp.getNambh());
            ps.setInt(5, ctsp.getSoluongton());
            ps.setString(6, ctsp.getMota());
            ps.setDouble(7, ctsp.getGianhap());
            ps.setDouble(8, ctsp.getGiaban());
            ps.setString(9, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        try {
            Connection conn = DBContext.getConnection();
            String delete = "delete from chitietsp where id=?";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
}

//    public ArrayList<Chitietsp> getAll() {
//        ArrayList<Chitietsp> listChiTietSP = new ArrayList<>();
//        try {
//
//            Connection conn = DBContext.getConnection();
//            String select = "select * from chitietsp";
//            PreparedStatement ps = conn.prepareStatement(select);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String idsp = rs.getString("idsp");
//                String idnsx = rs.getString("idnsx");
//                String idmausac = rs.getString("idmausac");
//                String iddongsp = rs.getString("iddongsp");
//                int nambh = rs.getInt("nambh");
//                String mota = rs.getString("mota");
//                int soluong = rs.getInt("soluongton");
//                double gianhap = rs.getDouble("gianhap");
//                double giaban = rs.getDouble("giaban");
//                Chitietsp ctsp = new Chitietsp(id, idsp, idnsx, idmausac, iddongsp, nambh, mota, soluong, gianhap, giaban);
//                listChiTietSP.add(ctsp);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return listChiTietSP;
//    }
//
//    public void insert(Chitietsp ctsp) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String insert = "insert into ChiTietSP"
//                    + "(IDSP,IdNSX,IdMauSac,IdDongSP,NamBH,Mota,SoLuongTon,GiaNhap,GiaBan)"
//                    + "VALUES(?,?,?,?,?,?,?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(insert);
//            ps.setString(1, ctsp.getIdsp());
//            ps.setString(2, ctsp.getIdnsx());
//            ps.setString(3, ctsp.getIdmausac());
//            ps.setString(4, ctsp.getIddongsp());
//            ps.setInt(5, ctsp.getNambh());
//            ps.setString(6, ctsp.getMota());
//            ps.setInt(7, ctsp.getSoluongton());
//            ps.setDouble(8, ctsp.getGianhap());
//            ps.setDouble(9, ctsp.getGiaban());
//            ps.execute();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public void update(String id, Chitietsp ctsp) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String update = "update ChiTietSP set IdDongSP = ?, IdMauSac = ?,IdNsx = ?,NamBH = ?,SoLuongTon = ?,MoTa =?,GiaNhap =?, giaban = ? where id=?";
//            PreparedStatement ps = conn.prepareStatement(update);
//            ps.setString(1, ctsp.getIddongsp());
//            ps.setString(2, ctsp.getIdmausac());
//            ps.setString(3, ctsp.getIdnsx());
//            ps.setInt(4, ctsp.getNambh());
//            ps.setInt(5, ctsp.getSoluongton());
//            ps.setString(6, ctsp.getMota());
//            ps.setDouble(7, ctsp.getGianhap());
//            ps.setDouble(8, ctsp.getGiaban());
//            ps.setString(9, id);
//            ps.execute();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public void delete(String id) {
//        try {
//            Connection conn = DBContext.getConnection();
//            String delete = "delete from chitietsp where id=?";
//            PreparedStatement ps = conn.prepareStatement(delete);
//            ps.setString(1, id);
//            ps.execute();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

