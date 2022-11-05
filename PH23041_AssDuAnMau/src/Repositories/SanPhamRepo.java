/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.SanPham;
import static Utilities.DBContext.getConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tt
 */
public class SanPhamRepo implements ISanPhamRepo{
     @Override
     public ArrayList<SanPham> all(){
        ArrayList<SanPham> listSP = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT Id "
                    + ",Ma "
                    + ",Ten "
                    + "FROM SanPham ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("Id");
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                SanPham sp = new SanPham(id, ma, ten);
                listSP.add(sp);
            }
        } catch (Exception ex) {
            Logger.getLogger(NSXRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSP;
    }
     @Override
    public SanPham insert(SanPham sp){
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO SanPham "
                    + "(Ma,Ten)"
                    + "VALUES(?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, sp.getMa());
            pr.setString(2, sp.getTen());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
     @Override
    public SanPham update(SanPham sp,String id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE SanPham "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, sp.getMa());
            pr.setString(2, sp.getTen());
            pr.setString(3, id);
            pr.execute();
            
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
     @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
             String query = " DELETE FROM SanPham "
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
