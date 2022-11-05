/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import static Utilities.DBContext.getConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
/**
 *
 * @author tt
 */
public class KhachHangRePo implements IKhachHangRepo{
    @Override
    public ArrayList<KhachHang> all(){
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT ID"
                    + ",MA"
                    + ",TEN"
                    + ",TENDEM"
                    + ",HO"
                    + ",NGAYSINH"
                    + ",SDT"
                    + ",DIACHI"
                    + ",THANHPHO"
                    + ",QUOCGIA"
                    + ",MATKHAU"
                    + " FROM KhachHang";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {                
                String id = ee.getString("ID");
                String ma = ee.getString("MA");
                String ten = ee.getString("TEN");
                String tendem = ee.getString("TENDEM");
                String ho = ee.getString("HO");
                Date ngaysinh = ee.getDate("NGAYSINH");
                String sdt = ee.getString("SDT");
                String diachi = ee.getString("DIACHI");
                String thanhpho = ee.getString("THANHPHO");
                String quocgia = ee.getString("QUOCGIA");
                String matkhau = ee.getString("MATKHAU");
                KhachHang kh = new KhachHang(id, ma, ten, tendem, ho, ngaysinh, sdt, diachi, thanhpho, quocgia, matkhau);
                listKH.add(kh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listKH;
    }
    @Override
    public KhachHang insert(KhachHang kh){
        try {
            Connection conn = getConnection();
            String query = " INSERT INTO KhachHang "
                    + " (Ma,Ten,TENDEM,HO,NGAYSINH,SDT,DIACHI,THANHPHO,QUOCGIA,MATKHAU) "
                    + " VALUES(?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, kh.getMa());
            pr.setString(2, kh.getTen());
            pr.setString(3, kh.getTenDem());
            pr.setString(4, kh.getHo());
            pr.setDate(5, kh.getNgaySinh());
            pr.setString(6, kh.getSdt());
            pr.setString(7, kh.getDiaChi());
            pr.setString(8, kh.getThanhPho());
            pr.setString(9, kh.getQuocGia());
            pr.setString(10, kh.getMatKhau());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kh;
    }
    @Override
    public KhachHang update(KhachHang kh,String Id){
        try {
            Connection conn = getConnection();
            String query = " UPDATE KhachHang "
                    + " SET Ma = ? "
                    + " ,Ten = ? "
                    + " ,TENDEM = ? "
                    + " ,HO = ? "
                    + " ,NGAYSINH = ? "
                    + " ,SDT = ? "
                    + " ,DIACHI = ? "
                    + " ,THANHPHO = ? "
                    + " ,QUOCGIA = ? "
                    + " ,MATKHAU = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, kh.getMa());
            pr.setString(2, kh.getTen());
            pr.setString(3, kh.getTenDem());
            pr.setString(4, kh.getHo());
            pr.setDate(5, kh.getNgaySinh());
            pr.setString(6, kh.getSdt());
            pr.setString(7, kh.getDiaChi());
            pr.setString(8, kh.getThanhPho());
            pr.setString(9, kh.getQuocGia());
            pr.setString(10, kh.getMatKhau());
            pr.setString(11, Id);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kh;
    }
    @Override
    public String delete(String id){
        try {
            Connection conn = getConnection();
            String query = " DELETE FROM KhachHang "
                     + "WHERE ID = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, id);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRePo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
