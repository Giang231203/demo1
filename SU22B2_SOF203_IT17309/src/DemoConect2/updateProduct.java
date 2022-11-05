/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoConect2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import productdemo.Product;
import java.sql.PreparedStatement;

/**
 *
 * @author tt
 * 
 */
public class updateProduct {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        
        String dbUser="sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;" + "databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";
        
        Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        System.out.println("Kết nối thành công");
        
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
