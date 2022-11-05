/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tac_Gia;

import java.sql.Connection;
import Tac_Gia.jdbcUtilTG;
import java.sql.DriverManager;
import java.sql.SQLException;
import lesson5.jdbcUtil;

/**
 *
 * @author tt
 */
public class jdbcUtilTG {
    private static Connection conn;
    
    static Connection getConnection(){
        if(jdbcUtilTG.conn==null){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser="sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=ql_sach_lt1"
                    + ";encrypt=true;trustServerCertificate=true;";
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Thanh cong");
                } catch (SQLException ex) {
                    ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
            }
            
        }
        return jdbcUtilTG.conn;
    }
}
