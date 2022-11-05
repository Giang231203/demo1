/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhaSanXuat;
import static Utilities.DBContext.getConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */
public class NSXRePo implements INSXRepo{
    @Override
    public ArrayList<NhaSanXuat> all(){
        ArrayList<NhaSanXuat> listNSX = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT Id "
                    + ",Ma "
                    + ",Ten "
                    + "FROM NSX ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("Id");
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                NhaSanXuat nsx = new NhaSanXuat(id, ma, ten);
                listNSX.add(nsx);
            }
        } catch (Exception ex) {
            Logger.getLogger(NSXRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNSX;
    }
    @Override
    public NhaSanXuat insert(NhaSanXuat nsx){
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO NSX "
                    + "(Ma,Ten)"
                    + "VALUES(?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, nsx.getMa());
            pr.setString(2, nsx.getTen());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nsx;
    }
    @Override
    public NhaSanXuat update(NhaSanXuat nsx,String id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE NSX "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, nsx.getMa());
            pr.setString(2, nsx.getTen());
            pr.setString(3, id);
            pr.execute();
            
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nsx;
    }
    @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
             String query = " DELETE FROM NSX "
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
