/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect_demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import productdemo.Product;
import java.sql.PreparedStatement;

/**
 *
 * @author tt
 */
public class DemoConnect {

    public static void main(String[] args) {
        try {
            //B1:Nạp driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            //B2:Kết nối
            String dbUser = "sa", dbPass = "123456",
                    dbUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";

            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");
            
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
