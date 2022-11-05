/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectDemo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import productdemo.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */
public class SlectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String dbUser = "sa",dsPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";
        Connection conn = DriverManager.getConnection(dbUrl, dbUser, dsPass);
        
            System.out.println("Kết nói thành công");
            
            ArrayList<Product> listSp = new ArrayList<>();
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
                
                Product sp = new Product(id, soLg, ten, donGia, mauSac, danhMucId);
                listSp.add(sp);
            }
            System.out.println("Thực thi thành công");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SlectDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SlectDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
