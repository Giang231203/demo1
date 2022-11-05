/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connect.jdbcUtil;
import Model.SinhVien;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */
public class SinhVienRepository {
    public void delete(int id){
        try {
        Connection conn = jdbcUtil.getConnection();
        String query = "DELETE FROM [dbo].[nhan_vien]" +
"      WHERE id = ?";
         PreparedStatement pr;
        
            pr = conn.prepareStatement(query);
             pr.setInt(1, id);
         pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public void update(int id,SinhVien sv){
        try {
        Connection conn = jdbcUtil.getConnection();
        String query = "UPDATE [dbo].[nhan_vien]" +
"   SET [ten] = ?" +
"      ,[ma_nv] = ?" +
"      ,[sdt] = ?" +
"      ,[tuoi] = ?" +
"      ,[vai_tro] = ?" +
" WHERE id = ?";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1,sv.getTen());
            pr.setString(2, sv.getMa_nv());
            pr.setString(3, sv.getSdt());
            pr.setInt(4, sv.getTuoi());
            pr.setInt(5, sv.getVai_tro());
            pr.setInt(6, id);
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void insert(SinhVien sv){
        try {
        Connection conn = jdbcUtil.getConnection();
        String query = "INSERT INTO [dbo].[nhan_vien]" +
"           ([ten]" +
"           ,[ma_nv]" +
"           ,[sdt]" +
"           ,[tuoi]" +
"           ,[vai_tro])" +
"     VALUES(?,?,?,?,?) ";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1,sv.getTen());
            pr.setString(2, sv.getMa_nv());
            pr.setString(3, sv.getSdt());
            pr.setInt(4, sv.getTuoi());
            pr.setInt(5, sv.getVai_tro());
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<SinhVien> all(){
        ArrayList<SinhVien> listSV = new ArrayList<>();
        try {
        Connection conn = jdbcUtil.getConnection();
        String query = "SELECT [id]" +
"      ,[ten]" +
"      ,[ma_nv]" +
"      ,[sdt]" +
"      ,[tuoi]" +
"      ,[vai_tro]" +
"  FROM [dbo].[nhan_vien]";
        
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                int id = ee.getInt("id");
                String ten = ee.getString("ten");
                String manv =ee.getString("ma_nv");
                String sdt =ee.getString("sdt");
                int tuoi= ee.getInt("tuoi");
                int vaitro= ee.getInt("vai_tro");
                SinhVien sv = new SinhVien(id, ten, manv, sdt, tuoi, vaitro);
                listSV.add(sv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listSV;
    }
}
