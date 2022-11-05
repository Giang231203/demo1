/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Danh_Muc;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tt
 */
public class DanhMucrepository {
    
    public void insert(DanhMuc dm){
        
        try {
            Connection conn = jdbcUtil.getConnection();
        String query ="INSERT INTO [dbo].[danh_muc]" +
"           ([ten]" +
"           ,[mo_ta]" +
"           ,[trang_thai])" +
"     VALUES(?,?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, dm.getTen());
            pr.setString(2, dm.getMo_ta());
            pr.setInt(3, dm.getTrang_thai());
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public void update(int id,DanhMuc dm){
        
        try {
            Connection conn = jdbcUtil.getConnection();
        String query ="UPDATE [dbo].[danh_muc]" +
"   SET [ten] = ?" +
"      ,[mo_ta] = ?" +
"      ,[trang_thai] = ?" +
" WHERE id=?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, dm.getTen());
            pr.setString(2, dm.getMo_ta());
            pr.setInt(3, dm.getTrang_thai());
            pr.setInt(4, id);
            pr.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public void delete(int id){
        
        try {
            Connection conn = jdbcUtil.getConnection();
        String query ="DELETE FROM [dbo].[danh_muc]" +
            "WHERE id=?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, id);
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<DanhMuc> all(){
        ArrayList<DanhMuc> listDm = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "SELECT * FROM danh_muc";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet re = pr.getResultSet();
            while (re.next()) {                
                int id = re.getInt("id");
                String ten = re.getString("ten");
                String mota = re.getString("mo_ta");
                int trangthai = re.getInt("trang_thai");
                
                DanhMuc dm = new DanhMuc(id, ten, mota, trangthai);
                listDm.add(dm);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listDm;
        
    }
}
