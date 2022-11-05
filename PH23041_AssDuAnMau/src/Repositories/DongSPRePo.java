/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.DongSanPham;
import java.sql.Connection;
import Utilities.DBContext;
import static Utilities.DBContext.getConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;;

/**
 *
 * @author tt
 */
public class DongSPRePo implements IDongSPRepo{
    @Override
    public ArrayList<DongSanPham> all(){
        ArrayList<DongSanPham> listDSP = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT Id "
                    + ",Ma "
                    + ",Ten "
                    + "FROM DongSP ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("Id");
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                DongSanPham dsp = new DongSanPham(id, ma, ten);
                listDSP.add(dsp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listDSP;
    }
    @Override
    public DongSanPham insert(DongSanPham dsp){
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO DongSP "
                    + "(Ma,Ten)"
                    + "VALUES(?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, dsp.getMa());
            pr.setString(2, dsp.getTen());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsp;
    }
    @Override
    public DongSanPham update(DongSanPham dsp,String id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE DongSP "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, dsp.getMa());
            pr.setString(2, dsp.getTen());
            pr.setString(3, id);
            pr.execute();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsp;
    }
    @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
             String query = " DELETE FROM DongSP "
                     + "WHERE ID = ? ";
             PreparedStatement pr = conn.prepareStatement(query);
             pr.setString(1, id);
             pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return id;
    }
}
