/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpdateDanhMuc;

import DanhMuc1.DanhMuc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
/**
 *
 * @author tt
 */
public class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        
            String dbUser = "sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Ket noi thanh cong");
            
            DanhMuc dm = new DanhMuc(1, "Giang2312", "Dep", 1);
            
            String query = "UPDATE [dbo].[danh_muc]" +
"   SET [ten] = ?" +
"      ,[mo_ta] = ?" +
"      ,[trang_thai] = ?" +
" WHERE id=?";
            PreparedStatement pr = conn.prepareStatement(query);
            
            pr.setString(1, dm.getTen());
            pr.setString(2, dm.getMo_ta());
            pr.setInt(3, dm.getTrang_thai());
            pr.setInt(4, dm.getId());
            pr.execute();
            System.out.println("Thuc thi thanh cong");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
