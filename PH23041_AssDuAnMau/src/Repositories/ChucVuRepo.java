/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import java.sql.Connection;
import DomainModels.ChucVu;
import Utilities.DBContext;
import static Utilities.DBContext.getConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author tt
 */

public class ChucVuRepo implements IChucVuRepo{
    
    @Override
    public ArrayList<ChucVu> all(){
        ArrayList<ChucVu> listCV = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT Id "
                    + ",Ma "
                    + ",Ten "
                    + "FROM ChucVu ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("Id");
                String ma = ee.getString("Ma");
                String ten = ee.getString("Ten");
                ChucVu cv = new ChucVu(id, ma, ten);
                listCV.add(cv);
            }
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        return listCV;
    }
    @Override
    public ChucVu insert(ChucVu cv){
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO CHUCVU "
                    + "(Ma,Ten)"
                    + "VALUES(?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, cv.getMa());
            pr.setString(2, cv.getTen());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cv;
    }
    @Override
    public ChucVu update(ChucVu cv,String id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE ChucVu "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, cv.getMa());
            pr.setString(2, cv.getTen());
            pr.setString(3, id);
            pr.execute();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cv;
    }
    @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
             String query = " DELETE FROM ChucVu "
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
