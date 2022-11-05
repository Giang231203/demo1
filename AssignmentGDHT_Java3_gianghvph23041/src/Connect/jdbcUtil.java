/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tt
 */
public class jdbcUtil {
    private static Connection conn;
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String dbUser="sa",dbPass = "123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=ASS_JAVA3_GIANGHVPH "
                        + ";encrypt=true;trustServerCertificate=true;";
        conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Ket noi thanh cong");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return jdbcUtil.conn;
    }
}
