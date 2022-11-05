/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectDanh_Muc;

import DanhMuc1.DanhMuc;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */
public class Select {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        
            String dbUser = "sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";
                Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Ket noi thanh cong");
                ArrayList<DanhMuc> listDm = new ArrayList<>();
            String query = "SELECT * FROM danh_muc";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {                
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String mota = rs.getString("mo_ta");
                int trangthai = rs.getInt("trang_thai");
                
                DanhMuc dm = new DanhMuc(id, ten, mota, trangthai);
                listDm.add(dm);
            }
            System.out.println("Thực thi thành công");
            } catch (SQLException ex) {
                Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
