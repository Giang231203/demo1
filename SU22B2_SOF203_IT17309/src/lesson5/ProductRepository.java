package lesson5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class ProductRepository {

    public void insert(Product sp) {
        try {
            
            Connection conn = jdbcUtil.getConnection();

            String query = "INSERT INTO san_pham"
                    + "(ten, so_luong, mau_sac, don_gia, danh_muc_id)"
                    + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, sp.getTenSP());
            ps.setInt(2, sp.getSoLuong());
            ps.setString(3, sp.getMauSac());
            ps.setDouble(4, sp.getDonGia());
            ps.setInt(5, sp.getDanhMuc());
            
            System.out.println("Thuc thi thanh cong");

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(int id, Product sp) {
        try {
            
            Connection conn = jdbcUtil.getConnection();

            String query = "UPDATE san_pham SET "
                    + "ten = ?, "
                    + "so_luong = ? , "
                    + "mau_sac = ? , "
                    + "don_gia = ?, "
                    + "danh_muc_id = ? "
                    + "WHERE id = ?";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, sp.getTenSP());
            ps.setInt(2, sp.getSoLuong());
            ps.setString(3, sp.getMauSac());
            ps.setDouble(4, sp.getDonGia());
            ps.setInt(5, sp.getDanhMuc());
            ps.setInt(6, sp.getID());
            System.out.println("Thuc thi thanh cong");
            
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        try {
            
            Connection conn = jdbcUtil.getConnection();

            String query = "DELETE FROM san_pham "
                    + "WHERE id = ? ";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, id);

            ps.execute();
            
            System.out.println("Thuc thi thanh cong");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Product> all() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            
            Connection conn = jdbcUtil.getConnection();

            String query = "SELECT * FROM san_pham";

            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {                
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String mauSac = rs.getString("mau_sac");
                int soLg = rs.getInt("so_luong");
                double donGia = rs.getDouble("don_gia");
                int danhMucId = rs.getInt("danh_muc_id");

                Product pr = new Product(id, ten, soLg, donGia, mauSac, danhMucId);
                
                list.add(pr);
                
                System.out.println("Thuc thi thanh cong");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
