/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Connect.jdbcUtil;
import entity.SinhVien;
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
public class SinhVienRepository {
    public void insert(SinhVien nv){
        
        try {
            Connection conn = jdbcUtil.getConnection();
        String query ="INSERT INTO STUDENTS(MASV,Hoten,Email,SoDT,Gioitinh,Diachi,Hinh)" +
"VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, nv.getMaSV());
            pr.setString(2, nv.getHoTen());
            pr.setString(3, nv.getEmail());
            pr.setString(4, nv.getSoDT());
            pr.setBoolean(5, nv.isGioiTinh());
            pr.setString(6, nv.getDiaChi());
            pr.setString(7, nv.getHinhAnh());
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
     public void update(int ma,SinhVien nv){
        
        try {
            Connection conn = jdbcUtil.getConnection();
        String query ="UPDATE [dbo].[STUDENTS]" +
"   SET [MASV] = ?" +
"      ,[Hoten] = ?" +
"      ,[Email] = ?" +
"      ,[SoDT] = ?" +
"      ,[Gioitinh] = ?" +
"      ,[Diachi] = ?" +
"      ,[Hinh] = ?" +
" WHERE MASV=?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, nv.getMaSV());
            pr.setString(2, nv.getHoTen());
            pr.setString(3, nv.getEmail());
            pr.setString(4, nv.getSoDT());
            pr.setBoolean(5, nv.isGioiTinh());
            pr.setString(6, nv.getDiaChi());
            pr.setString(7, nv.getHinhAnh());
            pr.setInt(8, ma);
            pr.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public void delete(int ma){
        
        try {
            Connection conn = jdbcUtil.getConnection();
        String query ="DELETE GRADE WHERE masv IN (SELECT masv FROM STUDENTS WHERE masv = ?)" +
"DELETE STUDENTS WHERE masv = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, ma);
            pr.setInt(2, ma);
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<SinhVien> all(){
        ArrayList<SinhVien> listSV = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "SELECT * FROM STUDENTS";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet re = pr.getResultSet();
            while (re.next()) {                
                int masv = re.getInt("MASV");
                String ten = re.getString("Hoten");
                String email = re.getString("Email");
                String SoDT = re.getString("SoDT");
                Boolean gioitinh = re.getBoolean("Gioitinh");
                String diachi = re.getString("Diachi");
                String hinhanh = re.getString("Hinh");
                SinhVien sv1 = new SinhVien(masv, ten, email, SoDT, gioitinh, diachi, hinhanh);
                listSV.add(sv1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listSV;
        
    }
}
