
package Repositories;

import Connection.jdbcUtil;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienRepository {
    
    public void delete(String maNv) {
        try {
            Connection conn = jdbcUtil.getConnection();

            String query = "DELETE nhan_vien WHERE ma_nv = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maNv);
            
            
            ps.execute(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void update(String maNv,NhanVien nv) {
        try {
            Connection conn = jdbcUtil.getConnection();

            String query = "UPDATE nhan_vien SET "
                    
                    + " ten_nv = ?, "
                    + " gioi_tinh = ?, "
                    + " nam_sinh = ?, "
                    + " chuc_vu = ?, "
                    + " so_gio_lam = ?, "
                    + " luong = ?, "
                    + " anh = ? "
                    + " WHERE ma_nv = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, nv.getTenNV());
            ps.setBoolean(2, nv.getGioiTinh());
            ps.setInt(3, nv.getNamSinh());
            ps.setString(4, nv.getChucVu());
            ps.setDouble(5, nv.getSoGioLam());
            ps.setDouble(6, nv.getLuong());
            ps.setString(7, nv.getAnh());
            ps.setString(8, nv.getMaNv());
            
            ps.execute(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void insert(NhanVien nv) {
        try {
            Connection conn = jdbcUtil.getConnection();

            String query = "INSERT INTO nhan_vien(ma_nv, ten_nv, gioi_tinh, "
                    + "nam_sinh, chuc_vu, so_gio_lam, luong, anh) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nv.getMaNv());
            ps.setString(2, nv.getTenNV());
            ps.setBoolean(3, nv.getGioiTinh());
            ps.setInt(4, nv.getNamSinh());
            ps.setString(5, nv.getChucVu());
            ps.setDouble(6, nv.getSoGioLam());
            ps.setDouble(7, nv.getLuong());
            ps.setString(8, nv.getAnh());
            
            
            ps.execute(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<NhanVien> getSearch(String maNv1) {
        ArrayList<NhanVien> listNv = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();

            String query = "SELECT * FROM nhan_vien WHERE ma_nv = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, maNv1);
            
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                String maNv = rs.getString("ma_nv");
                String tenNv = rs.getString("ten_nv");
                boolean gioiTinh = rs.getBoolean("gioi_tinh");
                int namSinh = rs.getInt("nam_sinh");
                String chucVu = rs.getString("chuc_vu");
                double soGioLam = rs.getDouble("so_gio_lam");
                double luong = rs.getDouble("luong");
                String anh = rs.getString("anh");
                
                NhanVien nv = new NhanVien(maNv, tenNv, gioiTinh,
                          namSinh, chucVu, soGioLam, luong, anh);
                listNv.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return listNv;
    }
    
    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> listNv = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();

            String query = "SELECT * FROM nhan_vien";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                String maNv = rs.getString("ma_nv");
                String tenNv = rs.getString("ten_nv");
                boolean gioiTinh = rs.getBoolean("gioi_tinh");
                int namSinh = rs.getInt("nam_sinh");
                String chucVu = rs.getString("chuc_vu");
                double soGioLam = rs.getDouble("so_gio_lam");
                double luong = rs.getDouble("luong");
                String anh = rs.getString("anh");
                
                NhanVien nv = new NhanVien(maNv, tenNv, gioiTinh,
                        namSinh, chucVu, soGioLam, luong, anh);
                listNv.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return listNv;
    }
    
}
