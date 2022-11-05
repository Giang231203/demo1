/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khach_hang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author tt
 */
public class jdbcUtil {
    private static Connection conn;
    
    static Connection getConnection(){
        if(jdbcUtil.conn==null){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser="sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=su22b2_sof203"
                    + ";encrypt=true;trustServerCertificate=true;";
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Thanh cong");
                } catch (SQLException ex) {
                    ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
            }
            
        }
        return jdbcUtil.conn;
}
}
