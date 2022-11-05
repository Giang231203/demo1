/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productdemo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import productdemo.Product;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tt
 */
public class ProductRepository {
    public void them(Product p) {
        try {
            Connection conn = JdbcUtil.getConnection();
            Product pr = new Product(0, 10, "Ao 123", 100000, "white", 1);
            
            String query="INSERT INTO [dbo].[san_pham]" +
"           ([ten]" +
"           ,[so_luong]" +
"           ,[mau_sac]" +
"           ,[don_gia]" +
"           ,[danh_muc_id])" +
"     VALUES(?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, pr.getTenSp());
            ps.setInt(2, pr.getSoLuong());
            ps.setString(3, pr.getMauSac());
            ps.setDouble(4, pr.getDonGia());
            ps.setInt(5, pr.getDanhMuc());
            
            ps.execute();
            System.out.println("Thuc thi thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void sua(int id, Product prd) {
        try {
        Connection conn = JdbcUtil.getConnection();
        Product pr = new Product(2, 10, "Ao 12", 100000, "black", 1);
        
        String query = "UPDATE san_pham" 
                          + " SET "
                          +"ten = " + " ?," 
                          + "so_luong = " + " ?,"
                          + "mau_sac = " + " ?,"
                          + "don_gia = " + " ?,"
                          + "danh_muc_id = " + " ?"
                          + " WHERE id = " + " ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        
            ps.setString(1, pr.getTenSp());
            ps.setInt(2, pr.getSoLuong());
            ps.setString(3, pr.getMauSac());
            ps.setDouble(4, pr.getDonGia());
            ps.setInt(5, pr.getDanhMuc());
            ps.setInt(6, pr.getId());
            ps.execute();
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void xoa(int id) {
        try {
        Connection conn = JdbcUtil.getConnection();
        Product pr = new Product(2, 10, "Ao 12", 100000, "black", 1);
        
        String query = "DELETE FROM [dbo].[san_pham]"+
      "WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, pr.getId());
        
        ps.execute();
        System.out.println("Ket noi thanh cong");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Product> all(){
        ArrayList<Product> listPr = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "SELECT * FROM san_pham";
            PreparedStatement pr;
            pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet re = pr.getResultSet();
            
            while(re.next()){
                int id = re.getInt("id");
                String ten = re.getString("ten");
                String mauSac = re.getString("mau_sac");
                int soLg = re.getInt("so_luong");
                double donGia = re.getDouble("don_gia");
                int danhMucId = re.getInt("danh_muc_id");
                
                Product sp = new Product(id, soLg, ten, donGia, mauSac, danhMucId);
                listPr.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listPr;
    }
}
