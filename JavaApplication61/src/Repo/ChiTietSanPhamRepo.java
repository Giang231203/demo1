/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repo;

import DomenModel.ChiTietSanPham;
import static Utilities.DBContext.getConnection;
import java.math.BigDecimal;
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
public class ChiTietSanPhamRepo implements IChiTietSanPhamRepo{

    @Override
    public ArrayList<ChiTietSanPham> all() {
        ArrayList<ChiTietSanPham> listCTSP = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT Id, "
                    + "IdSP,"
                    + "IdNsx,"
                    + "IdMauSac,"
                    + "IdDongSP,"
                    + "NamBH,"
                    + "MoTa,"
                    + "SoLuongTon,"
                    + "GiaNhap,"
                    + "GiaBan "
                    + "FROM ChiTietSP ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("Id");
                String idsp = ee.getString("IdSP");
                String idnsx = ee.getString("IdNsx");
                String idmausac = ee.getString("IdMauSac");
                String iddongsp = ee.getString("IdDongSP");
                int namBH = ee.getInt("NamBH");
                String mota = ee.getString("MoTa");
                int soluongton = ee.getInt("SoLuongTon");
                BigDecimal gianhap = ee.getBigDecimal("GiaNhap");
                BigDecimal giaban = ee.getBigDecimal("GiaBan");
                ChiTietSanPham ctsp = new ChiTietSanPham(id, idsp, idnsx, idmausac, iddongsp, namBH, mota, soluongton, gianhap, giaban);
                listCTSP.add(ctsp);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listCTSP;
    }
    @Override
    public ChiTietSanPham insert(ChiTietSanPham ctsp){
        try {
            Connection conn = getConnection();
            String query = " INSERT INTO ChiTietSP (IdSP,IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan) "
                    + " VALUES(?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ctsp.getIdSP());
            pr.setString(2, ctsp.getIdNSX());
            pr.setString(3, ctsp.getIDMauSac());
            pr.setString(4, ctsp.getIdDongSP());
            pr.setInt(5, ctsp.getNamBH());
            pr.setString(6, ctsp.getMoTa());
            pr.setInt(7, ctsp.getSoLuongTon());
            pr.setBigDecimal(8, ctsp.getGiaNhap());
            pr.setBigDecimal(9, ctsp.getGiaBan());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ctsp;
    }
    @Override
    public ChiTietSanPham update(ChiTietSanPham ctsp,String id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE ChiTietSP "
                    + " SET IdSP = ? "
                    + " ,IdNsx = ? "
                    + " ,IdMauSac = ? "
                    + " ,IdDongSP = ? "
                    + " ,NamBH = ? "
                    + " ,MoTa = ? "
                    + " ,SoLuongTon = ? "
                    + " ,GiaNhap = ? "
                    + " ,GiaBan = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ctsp.getIdSP());
            pr.setString(2, ctsp.getIdNSX());
            pr.setString(3, ctsp.getIDMauSac());
            pr.setString(4, ctsp.getIdDongSP());
            pr.setInt(5, ctsp.getNamBH());
            pr.setString(6, ctsp.getMoTa());
            pr.setInt(7, ctsp.getSoLuongTon());
            pr.setBigDecimal(8, ctsp.getGiaNhap());
            pr.setBigDecimal(9, ctsp.getGiaBan());
            pr.setString(10, id);
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ctsp;
    }
    @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
            String query = " DELETE FROM ChiTietSP "
                     + "WHERE ID = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, id);
            pr.execute();
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        return id;
    }

    @Override
    public ArrayList<ChiTietSanPham> findata(int NamBH) {
        ArrayList<ChiTietSanPham> listC = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT * FROM ChiTietSP WHERE NAMBH = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, NamBH);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("Id");
                String idsp = ee.getString("IdSP");
                String idnsx = ee.getString("IdNsx");
                String idmausac = ee.getString("IdMauSac");
                String iddongsp = ee.getString("IdDongSP");
                int namBH = ee.getInt("NamBH");
                String mota = ee.getString("MoTa");
                int soluongton = ee.getInt("SoLuongTon");
                BigDecimal gianhap = ee.getBigDecimal("GiaNhap");
                BigDecimal giaban = ee.getBigDecimal("GiaBan");
                ChiTietSanPham ctsp = new ChiTietSanPham(id, idsp, idnsx, idmausac, iddongsp, namBH, mota, soluongton, gianhap, giaban);
                listC.add(ctsp);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listC;
    }

}
