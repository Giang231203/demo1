/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connect.jdbcUtil;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author tt
 */
public class AcountRepository {
    Account account = new Account();

    public Account login(String user, String pass) {
        
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "SELECT * FROM Users WHERE "
                    + "username = ? AND passwords = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ps.execute();
            ResultSet rs = ps.getResultSet();    
            while (rs.next()) {                
                String user1 = rs.getString("username");
                String pass1 = rs.getString("passwords");
                String role = rs.getString("roles");
                account = new Account(user1, pass1, role);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }                
        return account;
    }
}
