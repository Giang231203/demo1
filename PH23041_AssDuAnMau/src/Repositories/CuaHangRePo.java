/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.CuaHang;
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
public class CuaHangRePo implements ICuaHangRepo{
    @Override
    public ArrayList<CuaHang> all(){
        ArrayList<CuaHang> listCH = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = " SELECT ID"
                    + ",MA"
                    + ",TEN"
                    + ",DIACHI"
                    + ",THANHPHO"
                    + ",QUOCGIA"
                    + " FROM CuaHang ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("ID");
                String ma = ee.getString("MA");
                String ten = ee.getString("TEN");
                String diachi = ee.getString("DIACHI");
                String thanhpho = ee.getString("THANHPHO");
                String quocgia = ee.getString("QUOCGIA");
                CuaHang ch = new CuaHang(id, ma, ten, diachi, thanhpho, quocgia);
                listCH.add(ch);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listCH;
    }
    @Override
    public CuaHang insert(CuaHang ch){
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO CUAHANG "
                    + "(Ma,Ten,DiaChi,ThanhPho,QuocGia)"
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ch.getMa());
            pr.setString(2, ch.getTen());
            pr.setString(3, ch.getDiaChi());
            pr.setString(4, ch.getThanhPho());
            pr.setString(5, ch.getQuocGia());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ch;
    }
    @Override
    public CuaHang update(CuaHang ch,String id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE CuaHang "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " ,DiaChi = ? "
                    + " ,ThanhPho = ? "
                    + " ,QuocGia = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ch.getMa());
            pr.setString(2, ch.getTen());
            pr.setString(3, ch.getDiaChi());
            pr.setString(4, ch.getThanhPho());
            pr.setString(5, ch.getQuocGia());
            pr.setString(6, id);
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ch;
    }
    @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
            String query = " DELETE FROM CuaHang "
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
