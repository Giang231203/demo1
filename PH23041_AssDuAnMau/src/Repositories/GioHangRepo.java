/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHang;
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
public class GioHangRepo implements IGioHangRepo {

    @Override
    public ArrayList<GioHang> all() {
        ArrayList<GioHang> listGH = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT [Id]\n"
                    + "      ,[IdKH]\n"
                    + "      ,[IdNV]\n"
                    + "      ,[Ma]\n"
                    + "      ,[NgayTao]\n"
                    + "      ,[NgayThanhToan]\n"
                    + "      ,[TenNguoiNhan]\n"
                    + "      ,[DiaChi]\n"
                    + "      ,[Sdt]\n"
                    + "      ,[TinhTrang]\n"
                    + "  FROM [dbo].[GioHang]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String id = ee.getString("Id");
                String idkh = ee.getString("IdKH");
                String idnv = ee.getString("IdNV");
                String ma = ee.getString("Ma");
                Date ngaytao = ee.getDate("NgayTao");
                Date ngaythanhtoan = ee.getDate("NgayThanhToan");
                String tennguoinhan = ee.getString("TenNguoiNhan");
                String diachi = ee.getString("DiaChi");
                String sdt = ee.getString("Sdt");
                int tinhtrang = ee.getInt("TinhTrang");
                GioHang gh = new GioHang(id, idkh, idnv, ma, ngaytao, ngaythanhtoan, tennguoinhan, diachi, sdt, tinhtrang);
                listGH.add(gh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listGH;
    }

    @Override
    public GioHang insert(GioHang gh) {
        try {
            Connection conn = getConnection();
           
            String query = "INSERT INTO [dbo].[GioHang]\n"
                    + "           ([IdKH]\n"
                    + "           ,[IdNV]\n"
                    + "           ,[Ma]\n"
                    + "           ,[NgayTao]\n"
                    + "           ,[NgayThanhToan]\n"
                    + "           ,[TenNguoiNhan]\n"
                    + "           ,[DiaChi]\n"
                    + "           ,[Sdt]\n"
                    + "           ,[TinhTrang])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, gh.getIdKH());
            pr.setString(2, gh.getIdNV());
            pr.setString(3, gh.getMa());
            pr.setDate(4, gh.getNgayTao());
            pr.setDate(5, gh.getNgayThanhToan());
            pr.setString(6, gh.getTenNguoiNhan());
            pr.setString(7, gh.getDiaChi());
            pr.setString(8, gh.getSdt());
            pr.setInt(9, gh.getTinhTrang());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return gh;
    }

    @Override
    public GioHang update(GioHang gh, String Id) {
        try {
            Connection conn = getConnection();
            String query = "UPDATE [dbo].[GioHang]\n"
                    + "   SET  \n"
                    + "      [IdKH] = ?\n"
                    + "      ,[IdNV] = ?\n"
                    + "      ,[Ma] = ?\n"
                    + "      ,[NgayTao] = ?\n"
                    + "      ,[NgayThanhToan] = ?\n"
                    + "      ,[TenNguoiNhan] = ?\n"
                    + "      ,[DiaChi] = ?\n"
                    + "      ,[Sdt] = ?\n"
                    + "      ,[TinhTrang] = ?\n"
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, gh.getIdKH());
            pr.setString(2, gh.getIdNV());
            pr.setString(3, gh.getMa());
            pr.setDate(4, gh.getNgayTao());
            pr.setDate(5, gh.getNgayThanhToan());
            pr.setString(6, gh.getTenNguoiNhan());
            pr.setString(7, gh.getDiaChi());
            pr.setString(8, gh.getSdt());
            pr.setInt(9, gh.getTinhTrang());
            pr.setString(10, Id);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(GioHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gh;
    }

    @Override
    public String delete(String id) {
        try {
            Connection conn = getConnection();
            String query = "DELETE FROM GioHang   "
                    + "      WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            
            pr.setString(1, id);
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return id;
    }

}
