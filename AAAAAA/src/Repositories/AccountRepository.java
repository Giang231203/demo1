
package Repositories;
import Connection.jdbcUtil;
import Model.Account;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccountRepository {
    
    public Account login(String user, String pass) {
        Account account = new Account();
        try {
            Connection conn = jdbcUtil.getConnection();

            String query = "SELECT users, pass FROM ACCOUNT "
                    + "WHERE users = ? AND pass = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                String userStr = rs.getString("users");
                String passStr = rs.getString("pass");
                
                
                account = new Account(userStr, passStr);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return account;
        }
    
}
