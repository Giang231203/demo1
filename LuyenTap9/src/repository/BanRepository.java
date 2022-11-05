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

/**
 *
 * @author tt
 */
public class BanRepository {

    public void Update(Ban b, String Ma) {
        try {
            Connection conn = getConnection();
            String query = "UPDATE [dbo].[Ban]"
                    + "   SET [Ten] = ?"
                    + "      ,[SoThich] = ?"
                    + "      ,[GioiTinh] = ?"
                    + " WHERE Ma = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, b.getTen());
            pr.setString(2, b.getSoThich());
            pr.setInt(3, b.getGioiTinh());
            pr.setString(4, b.getMa());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(BanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void Delete(String Ma){
        try {
            Connection conn = getConnection();
            String query = "DELETE [dbo].[Ban]"
                    +"WHERE Ma = ?";
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
                    + "      ,[SoThich]"
                    + "      ,[GioiTinh]"
                    + "  FROM [dbo].[Ban]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                String st = ee.getString("SoThich");
                int gt = ee.getInt("GioiTinh");
                Ban b = new Ban(ma, ten, st, gt);
                listB.add(b);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listB;
    }
}
