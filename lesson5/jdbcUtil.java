package lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcUtil {

    private static Connection conn;

    public static Connection getConnection() {
        if (jdbcUtil.conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                String dbUser = "sa", dbPass = "123456",
                        dbUrl = "jdbc:sqlserver://localhost:1433;"
                        + "databaseName = su22b2_sof203 "
                        + ";encrypt=true;trustServerCertificate=true;";
               
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return jdbcUtil.conn;
    }
}
