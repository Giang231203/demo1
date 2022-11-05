/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ban;
import static repository.DBContext.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author tt
 */
public class BanRepository {

    public void update(Ban ban, String Ma) {
        try {
            Connection conn = getConnection();
            String query = "UPDATE [dbo].[Ban]"
                    + "   SET [Ten] = ?"
                    + "      ,[NgaySinh] = ?"
                    + "      ,[SoThich] = ?"
                    + "      ,[TrangThai] = ?"
                    + " WHERE Ma = ?";
            PreparedStatement pr = conn.prepareCall(query);
            pr.setString(1, ban.getTen());
            pr.setDate(2, ban.getNgaySinh());
            pr.setString(3, ban.getSoThich());
            pr.setInt(4, ban.getTrangThai());
            pr.setString(5, ban.getMa());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(BanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Delete(String Ma){
        try {
            Connection conn = getConnection();
            String query = "DELETE FROM [dbo].[Ban]" +
"      WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, Ma);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(BanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insert(Ban b) {
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO [dbo].[Ban]"
                    + "           [Ma]"
                    + "           ,[Ten]"
                    + "           ,[NgaySinh]"
                    + "           ,[SoThich]"
                    + "           ,[TrangThai])"
                    + "     VALUES(?,?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, b.getMa());
            pr.setString(2, b.getTen());
            pr.setDate(3, b.getNgaySinh());
            pr.setString(4, b.getSoThich());
            pr.setInt(5, b.getTrangThai());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public ArrayList<Ban> all() {
        ArrayList<Ban> listBan = new ArrayList<>();

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
                int trangthai = ee.getInt("TrangThai");
                Ban ban = new Ban(ma, ten, ngaysinh, sothich, trangthai);
                listBan.add(ban);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listBan;
    }

}
