/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.HocKy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tt
 */
public class HocKyRepository {
    public void delete(int id){
        Connection conn;
        try {
            conn = DBContext.getConnection();
            String query = "DELETE FROM [dbo].[hoc_ky]" +
"      WHERE id = ?";
        PreparedStatement pr = conn.prepareStatement(query);
        pr.setInt(1, id);
        pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(HocKyRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ArrayList<HocKy> all(){
         ArrayList<HocKy> listHK = new ArrayList<>();
        try {
         Connection   conn = DBContext.getConnection();
            
        String query = "SELECT [id]"
                + "      ,[ten]"
                + "      ,[co_so]"
                + "      ,[ngay_bat_dau]"
                + "      ,[ngay_ket_thuc]"
                + "      ,[so_sv_nhap_hoc]"
                + "  FROM [dbo].[hoc_ky]";
        PreparedStatement pr = conn.prepareStatement(query);
        pr.execute();
        ResultSet ee = pr.getResultSet();
        while (ee.next()) {
            int ID = ee.getInt("id");
            String ten = ee.getString("ten");
            String coso = ee.getString("co_so");
            int soSv = ee.getInt("so_sv_nhap_hoc");
            HocKy hk = new HocKy(ID, ten, coso, soSv);
            listHK.add(hk);
        }
        }catch (Exception ex) {
            Logger.getLogger(HocKyRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
        return listHK;
}
        }
