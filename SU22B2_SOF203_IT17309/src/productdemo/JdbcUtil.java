/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tt
 */
public class JdbcUtil {
    private static Connection conn;
    
    public static Connection getConnection(){
        if(JdbcUtil.conn==null){
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            
            String dbUser="sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=su22b2_sof203"+";encrypt=true;trustServerCertificate=true;";
            
             conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Ket noi thanh cong");
            }catch (SQLException ex) {
                Logger.getLogger(JdbcUtil.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JdbcUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return JdbcUtil.conn;
    }
}
