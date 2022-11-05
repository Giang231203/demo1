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
import java.sql.PreparedStatement;
import static repository.DBContext.getConnection;
import java.sql.ResultSet;

/**
 *
 * @author tt
 */
public class BanRepository {

    public void Update(Ban ban, String ma) {
        try {
            Connection conn = getConnection();
            String query = "UPDATE [dbo].[Ban]"
                    + "   SET [Ten] = ? "
                    + "      ,[SoThich] = ?"
                    + "      ,[GioiTinh] = ?"
                    + " WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ban.getTen());
            pr.setString(2, ban.getSoThich());
            pr.setInt(3, ban.getGioiTinh());
            pr.setString(4, ban.getMa());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(BanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(String ma) {
        try {
            Connection conn = getConnection();
            String query = "DELETE [dbo].[Ban]"
                    + "      WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ma);
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
                    + "      ,[SoThich]"
                    + "      ,[GioiTinh]"
                    + "  FROM [dbo].[Ban]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                String sothich = ee.getString("SoThich");
                int gioiTinh = ee.getInt("GioiTinh");
                Ban ban = new Ban(ma, ten, sothich, gioiTinh);
                listBan.add(ban);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listBan;
    }
}
