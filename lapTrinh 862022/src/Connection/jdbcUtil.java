
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class jdbcUtil {
     public static Connection conn;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String dbUser = "sa", dbPass = "123456",
                            dbUrl = "jdbc:sqlserver://localhost:1433;"
                            + "databaseName=QLNV"
                            + ";encrypt=true;trustServerCertificate=true;";
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return conn;
    }
}
