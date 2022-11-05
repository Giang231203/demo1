/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Ban;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import static repository.DBContext.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author tt
 */
public class BanRepository {

    public void update(Ban b, String Ma) {
        try {
            Connection conn = getConnection();
            String query = "UPDATE [dbo].[Ban]"
                    + "   SET [Ten] = ?"
                    + "      ,[NgaySinh] = ?"
                    + "      ,[SoThich] = ?"
                    + "      ,[TrangThai] = ?"
                    + " WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, b.getTen());
            pr.setDate(2, b.getNgaySinh());
            pr.setString(3, b.getSoThich());
            pr.setInt(4, b.getTrangThai());
            pr.setString(5, b.getMa());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(BanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String Ma) {
        try {
            Connection conn = getConnection();
            String query = "DELETE FROM [dbo].[Ban]"
                    + "      WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, Ma);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(BanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Ban> all() {
        ArrayList<Ban> listB = new ArrayList<>();
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
                String st = ee.getString("SoThich");
                int trangthai = ee.getInt("TrangThai");
                Ban b = new Ban(ma, ten, ngaysinh, st, trangthai);
                listB.add(b);
            }
        } catch (Exception ex) {
            Logger.getLogger(BanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listB;
    }
}
