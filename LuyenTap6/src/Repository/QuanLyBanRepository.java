/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.QuanLyBan;
import static Repository.DBContext.getConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author tt
 */
public class QuanLyBanRepository {

    public ArrayList<QuanLyBan> all() {
        ArrayList<QuanLyBan> listBan = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT [Ma]"
                    + "      ,[Ten]"
                    + "      ,[NgaySinh]"
                    + "      ,[SoThich]"
                    + "      ,[TrangThai]"
                    + "  FROM [dbo].[Ban]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                Date ngaysinh = ee.getDate("NgaySinh");
                String sothich = ee.getString("SoThich");
                int lienlac = ee.getInt("TrangThai");
                QuanLyBan qlb = new QuanLyBan(ma, ten, ngaysinh, sothich, lienlac);
                listBan.add(qlb);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listBan;
    }

    public void delete(String Ma) {
        try {
            Connection conn = getConnection();
            String query = "DELETE [dbo].[Ban]"
                    + "      WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, Ma);
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void update(QuanLyBan qlb, String Ma) {
        try {
            Connection conn = getConnection();
            String query = "UPDATE [dbo].[Ban] SET"
                    + "         [Ten] = ?"
                    + "      ,[NgaySinh] = ?"
                    + "      ,[SoThich] = ?"
                    + "      ,[TrangThai] = ?"
                    + " WHERE Ma =?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, qlb.getTen());
            pr.setDate(2, qlb.getNgaySinh());
            pr.setString(3, qlb.getSoThich());
            pr.setInt(4, qlb.getLienLac());
            pr.setString(5, qlb.getMa());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
