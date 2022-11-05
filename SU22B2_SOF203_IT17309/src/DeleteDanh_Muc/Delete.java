/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeleteDanh_Muc;

import DanhMuc1.DanhMuc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
/**
 *
 * @author tt
 */
public class Delete {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Ket noi thanh cong");
            DanhMuc sm = new DanhMuc(1, "Giang2312", "Dep", 1);
            String query = "DELETE FROM [dbo].[danh_muc]" +
"      WHERE id=?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, sm.getId());
            pr.execute();
            System.out.println("Thanh cong");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
