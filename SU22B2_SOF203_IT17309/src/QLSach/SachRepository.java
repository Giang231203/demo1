/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

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
public class SachRepository {
    
    public void insert(Sach s){
        try {
        Connection conn = jdbcUtil.getConnection();
        String query = "INSERT INTO [dbo].[sach]" +
"           ([ten]" +
"           ,[so_luong]" +
"           ,[don_gia]" +
"           ,[tac_gia_id])" +
"     VALUES(?,?,?,?)";
        
        PreparedStatement pr = conn.prepareStatement(query);
        pr.setString(1, s.getTen());
        pr.setInt(2, s.getSo_luong());
        pr.setFloat(3, s.getDon_gia());
        pr.setInt(4, s.getTac_gia_id());
        pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public void update(int id,Sach s){
         try {
        Connection conn = jdbcUtil.getConnection();
        String query = "UPDATE [dbo].[sach]" +
"   SET [ten] = ?" +
"      ,[so_luong] = ?" +
"      ,[don_gia] = ?" +
"      ,[tac_gia_id] = ?" +
" WHERE id = ?";
       
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, s.getTen());
            pr.setInt(2, s.getSo_luong());
            pr.setFloat(3, s.getDon_gia());
            pr.setInt(4, s.getTac_gia_id());
            pr.setInt(5, id);
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SachRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void delete(int id){
        try {
        Connection conn = jdbcUtil.getConnection();
        String query = "DELETE FROM [dbo].[sach]" +
"      WHERE id = ?";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SachRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ArrayList<Sach> all(){
        ArrayList<Sach> listS = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "SELECT * FROM sach";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                int id = ee.getInt("id");
                String ten = ee.getString("ten");
                int soluong = ee.getInt("so_luong");
                float dongia=ee.getFloat("don_gia");
                int tacgiaid= ee.getInt("tac_gia_id");
                Sach sach1 = new Sach(id, ten, soluong, dongia, tacgiaid);
                listS.add(sach1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listS;
    }
}
