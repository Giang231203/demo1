/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhanVien;
import static repository.DBContext.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tt
 */
public class NhanVienRepo {
    public NhanVien Tim(String Ma){
        NhanVien n = new NhanVien();
        try {
            Connection conn = getConnection();
            String query = "SELECT "
                    + "      [Ten]"
                    + "      ,[GioiTinh]"
                    + "      ,[DiaChi]"
                    + "  FROM [dbo].[NhanVien] "
                    + "WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, Ma);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String ten = ee.getString("Ten");
                String gioitinh = ee.getString("GioiTinh");
                String diachi = ee.getString("DiaChi");
                 n = new NhanVien();
                 n.setTen(ten);
                 n.setGioiTinh(gioitinh);
                 n.setDiaChi(diachi);
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }
    public void them(NhanVien nv) {
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO NHANVIEN "
                    + "(Ma,Ten,GioiTinh,DiaChi)"
                    + " VALUES(?,?,?,?)";
                    
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, nv.getMa());
            pr.setString(2, nv.getTen());
            pr.setString(3, nv.getGioiTinh());
            pr.setString(4, nv.getDiaChi());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<NhanVien> all() {
        ArrayList<NhanVien> listN = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT [Ma]"
                    + "      ,[Ten]"
                    + "      ,[GioiTinh]"
                    + "      ,[DiaChi]"
                    + "  FROM [dbo].[NhanVien]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                String gioitinh = ee.getString("GioiTinh");
                String diachi = ee.getString("DiaChi");
                NhanVien n = new NhanVien(ma, ten, gioitinh, diachi);
                listN.add(n);
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listN;
    }
}
