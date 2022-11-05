/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import static Utilities.DBContext.getConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */
public class MauSacRepo implements IMauSacRepo{
    @Override
    public ArrayList<MauSac> all(){
        ArrayList<MauSac> listMS = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT Id "
                    + ",Ma "
                    + ",Ten "
                    + "FROM MauSac ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("Id");
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                MauSac ms = new MauSac(id, ma, ten);
                listMS.add(ms);
            }
        } catch (Exception ex) {
            Logger.getLogger(NSXRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listMS;
    }
    @Override
    public MauSac insert(MauSac ms){
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO MauSac "
                    + "(Ma,Ten)"
                    + "VALUES(?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ms.getMa());
            pr.setString(2, ms.getTen());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ms;
    }
    @Override
    public MauSac update(MauSac ms,String id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE MauSac "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ms.getMa());
            pr.setString(2, ms.getTen());
            pr.setString(3, id);
            pr.execute();
            
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ms;
    }
    @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
             String query = " DELETE FROM MauSac "
                     + "WHERE ID = ? ";
             PreparedStatement pr = conn.prepareStatement(query);
             pr.setString(1, id);
             pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
