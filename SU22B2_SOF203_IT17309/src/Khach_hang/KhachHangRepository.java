/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khach_hang;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */
public class KhachHangRepository {
    public void insert(KhachHang kh){
        try {
        Connection conn = jdbcUtil.getConnection();
        String query = "INSERT INTO [dbo].[khach_hang]" +
"           ([ten]" +
"           ,[dia_chi]" +
"           ,[email]" +
"           ,[tuoi]" +
"           ,[gioi_tinh])" +
"     VALUES(?,?,?,?,?)";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, kh.getTen());
            pr.setString(2, kh.getDia_chi());
            pr.setString(3, kh.getEmail());
            pr.setInt(4, kh.getTuoi());
            pr.setInt(5, kh.getGioi_tinh());
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void delete(int id){
         try {
        Connection conn = jdbcUtil.getConnection();
        String query = "DELETE FROM [dbo].[khach_hang]" +
"      WHERE id=?";
       
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            pr.execute();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    public void update(int id ,KhachHang kh){
        try {
        Connection conn = jdbcUtil.getConnection();
        String query ="UPDATE [dbo].[khach_hang]" +
"   SET [ten] =?" +
"      ,[dia_chi] = ?" +
"      ,[email] = ?" +
"      ,[tuoi] = ?" +
"      ,[gioi_tinh] = ?" +
" WHERE id=?";
        PreparedStatement pr = conn.prepareStatement(query);
        pr.setString(1, kh.getTen());
            pr.setString(2, kh.getDia_chi());
            pr.setString(3, kh.getEmail());
            pr.setInt(4, kh.getTuoi());
            pr.setInt(5, kh.getGioi_tinh());
            pr.setInt(6, id);
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
    }
    public ArrayList<KhachHang> all(){
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
        Connection conn = jdbcUtil.getConnection();
        
        String query = "SELECT [id]" +
"      ,[ten]" +
"      ,[dia_chi]" +
"      ,[email]" +
"      ,[tuoi]" +
"      ,[gioi_tinh]" +
"  FROM [dbo].[khach_hang]";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee= pr.getResultSet();
            while (ee.next()) {                
                 int id = ee.getInt("id");
                String ten = ee.getString("ten");
                String diachi = ee.getString("dia_chi");
                String email = ee.getString("email");
                int tuoi = ee.getInt("tuoi");
                int gioitinh = ee.getInt("gioi_tinh");
                KhachHang kh = new KhachHang(id, ten, diachi, email, tuoi, gioitinh);
                listKH.add(kh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listKH;
    }
}
