/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connect.jdbcUtil;
import entity.Diem;
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
public class DiemRepository {

    public void save(Diem d) {

//        try {
//            Connection conn = jdbcUtil.getConnection();
//        String query ="INSERT INTO [dbo].[GRADE]" +
//"           ([ID]" +
//"           [MASV]" +
//"           ,[Tienganh]" +
//"           ,[Tinhoc]" +
//"           ,[GDTC])" +
//"     VALUES(?,?,?,?)";
//            PreparedStatement pr = conn.prepareStatement(query);
//            pr.setInt(1, d.getMaSV());
//            pr.setInt(2, d.getTiengAnh());
//            pr.setInt(3, d.getTinHoc());
//            pr.setInt(4, d.getGDTC());
//            
//            pr.execute();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
    }

    public void update(int MaSV, Diem d) {

        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "UPDATE [dbo].[GRADE]"
                    + "      SET [tienganh] = ?"
                    + "      ,[tinhoc] = ?"
                    + "      ,[gdtc] = ?"
                    + " WHERE masv =?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, d.getTiengAnh());
            pr.setInt(2, d.getTinHoc());
            pr.setInt(3, d.getGDTC());
            pr.setInt(4, MaSV);
            pr.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void delete(int MaSV) {

        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "DELETE FROM [dbo].[GRADE]"
                    + "      WHERE masv=?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, MaSV);
            pr.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Diem> all() {
        ArrayList<Diem> listD = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "SELECT STUDENTS.MASV,Hoten,Tienganh,Tinhoc,GDTC, (Tienganh+Tinhoc+GDTC)/3 AS DIEMTB "
                    + "FROM GRADE JOIN STUDENTS ON GRADE.MASV=STUDENTS.MASV";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet re = pr.getResultSet();
            while (re.next()) {
                int id = re.getInt("MASV");
                int masv = re.getInt("MASV");
                String ten = re.getString("Hoten");
                int tienganh = re.getInt("Tienganh");
                int tinhoc = re.getInt("Tinhoc");
                int gdtc = re.getInt("GDTC");
                int diemTB = re.getInt("DIEMTB");
                Diem d = new Diem(masv, ten, tienganh, tinhoc, gdtc, diemTB);
                listD.add(d);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listD;

    }
}
