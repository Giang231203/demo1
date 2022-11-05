/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import productdemo.Product;
import java.sql.PreparedStatement;
/**
 *
 * @author tt
 */
public class delete {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        
        String dbUser = "sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";
        Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        System.out.println("Ket noi thanh cong");
        
        Product pr = new Product(2, 10, "Ao 12", 100000, "black", 1);
        
        String query = "DELETE FROM [dbo].[san_pham]"+
      "WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, pr.getId());
        
        ps.execute();
        System.out.println("Ket noi thanh cong");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
