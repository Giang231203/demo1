/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tac_Gia;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */
public class TacGiaRepository {
    public void insert(TacGia tg){
        try {
        Connection conn = jdbcUtilTG.getConnection();
        String query = "INSERT INTO [dbo].[tac_gia]" +
"           ([ten]" +
"           ,[sdt]" +
"           ,[email])" +
"     VALUES(?,?,?)";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, tg.getTen());
            pr.setString(2, tg.getSdt());
            pr.setString(3, tg.getEmail());
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TacGiaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(int id,TacGia tg){
        try {
        Connection conn = jdbcUtilTG.getConnection();
        String query = "UPDATE [dbo].[tac_gia]" +
"   SET [ten] = ?" +
"      ,[sdt] = ?" +
"      ,[email] = ?" +
" WHERE id=?";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, tg.getTen());
            pr.setString(2, tg.getSdt());
            pr.setString(3, tg.getEmail());
            pr.setInt(4, id);
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TacGiaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(int id){
       try {
        Connection conn = jdbcUtilTG.getConnection();
        String query ="DELETE FROM [dbo].[tac_gia]" +
"      WHERE id=?";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TacGiaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<TacGia> all(){
        ArrayList<TacGia> listTG = new ArrayList<>();
        try {
        Connection conn = jdbcUtilTG.getConnection();
        String query = "SELECT [id]" +
"      ,[ten]" +
"      ,[sdt]" +
"      ,[email]" +
"  FROM [dbo].[tac_gia]";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                int id = ee.getInt("id");
                String ten = ee.getString("ten");
                String sdt = ee.getString("sdt");
                String email = ee.getString("email");
                TacGia tg = new TacGia(id, ten, sdt, email);
                listTG.add(tg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TacGiaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTG;
    }
}
