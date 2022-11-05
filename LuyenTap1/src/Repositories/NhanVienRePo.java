/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import static Connections.DBContext.getConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author tt
 */
public class NhanVienRePo implements INhanVienRepo{

    @Override
    public ArrayList<NhanVien> all() {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT ID"
                    + ",MA"
                    + ",TEN"
                    + ",TENDEM"
                    + ",HO"
                    + ",GIOITINH"
                    + ",NGAYSINH"
                    + ",DIACHI"
                    + ",SDT"
                    + ",MATKHAU"
                    + ",IdCH"
                    + ",IdCV"
                    + ",IdGuiBC"
                    + ",TRANGTHAI"
                    + " FROM NhanVien";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String id = ee.getString("ID");
                String ma = ee.getString("MA");
                String ten = ee.getString("TEN");
                String tendem = ee.getString("TENDEM");
                String ho = ee.getString("HO");
                String gioitinh = ee.getString("GIOITINH");
                Date ngaysinh = ee.getDate("NGAYSINH");
                String diachi = ee.getString("DIACHI");
                String sdt = ee.getString("SDT");
                String mk = ee.getString("MATKHAU");
                String idCH = ee.getString("IdCH");
                String idCV = ee.getString("IdCV");
                String idGBC = ee.getString("IdGuiBC");
                int trangthai = ee.getInt("TRANGTHAI");
                NhanVien nv = new NhanVien(id, ma, ten, tendem, ho, gioitinh, ngaysinh, diachi, sdt, mk, idCH, idCV, idGBC, trangthai);
                listNV.add(nv);
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNV;
    }

    @Override
    public NhanVien insert(NhanVien nv) {
        try {
            Connection conn = getConnection();
            String query = " INSERT INTO NhanVien (Ma,Ten,TENDEM,HO,GIOITINH,NGAYSINH,DIACHI,SDT,MATKHAU,IdCH,IdCV,TRANGTHAI) "
                    + "                     VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ";

            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, nv.getMa());
            pr.setString(2, nv.getTen());
            pr.setString(3, nv.getTenDem());
            pr.setString(4, nv.getHo());
            pr.setString(5, nv.getGioiTinh());
            pr.setDate(6, nv.getNgaySinh());
            pr.setString(7, nv.getDiaChi());
            pr.setString(8, nv.getSdt());
            pr.setString(9, nv.getMatKhau());
            pr.setString(10, nv.getIdCH());
            pr.setString(11, nv.getIdCV());
            pr.setInt(12, nv.getTrangThai());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return nv;
    }

    @Override
    public NhanVien update(NhanVien nv, String id) {
        try {
            Connection conn = getConnection();
            String query = " UPDATE NhanVien "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " ,TENDEM = ? "
                    + " ,HO = ? "
                    + " ,GIOITINH = ? "
                    + " ,NGAYSINH = ? "
                    + " ,DIACHI = ? "
                    + " ,SDT = ? "
                    + " ,MATKHAU = ? "
                    + " ,IDCH = ? "
                    + " ,IDCV = ? "
                    + " ,TRANGTHAI = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, nv.getMa());
            pr.setString(2, nv.getTen());
            pr.setString(3, nv.getTenDem());
            pr.setString(4, nv.getHo());
            pr.setString(5, nv.getGioiTinh());
            pr.setDate(6, nv.getNgaySinh());
            pr.setString(7, nv.getDiaChi());
            pr.setString(8, nv.getSdt());
            pr.setString(9, nv.getMatKhau());
            pr.setString(10, nv.getIdCH());
            pr.setString(11, nv.getIdCV());
            pr.setInt(12, nv.getTrangThai());
            pr.setString(13, id);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nv;
    }

    @Override
    public String delete(String id) {
        try {
            Connection conn = getConnection();
            String query = " DELETE FROM NhanVien "
                    + "WHERE ID = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, id);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public ArrayList<NhanVien> find(String ma) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT * FROM NHANVIEN"
                    + " WHERE MA LIKE ? ";
                    

            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, "%"+ma+"%");
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String id = ee.getString("ID");
                String ma1 = ee.getString("MA");
                String ten = ee.getString("TEN");
                String tendem = ee.getString("TENDEM");
                String ho = ee.getString("HO");
                String gioitinh = ee.getString("GIOITINH");
                Date ngaysinh = ee.getDate("NGAYSINH");
                String diachi = ee.getString("DIACHI");
                String sdt = ee.getString("SDT");
                String mk = ee.getString("MATKHAU");
                String idCH = ee.getString("IdCH");
                String idCV = ee.getString("IdCV");
                String idGBC = ee.getString("IdGuiBC");
                int trangthai = ee.getInt("TRANGTHAI");
                NhanVien nv = new NhanVien(id, ma1, ten, tendem, ho, gioitinh, ngaysinh, diachi, sdt, mk, idCH, idCV, idGBC, trangthai);
                list.add(nv);
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

}
