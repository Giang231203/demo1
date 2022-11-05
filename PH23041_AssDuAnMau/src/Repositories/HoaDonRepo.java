/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
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
public class HoaDonRepo implements IHoaDonRepo {

    @Override
    public ArrayList<HoaDon> all() {
        ArrayList<HoaDon> listHD = new ArrayList<>();
        try {

            Connection conn = getConnection();
            String query = "SELECT [Id]\n"
                    + "      ,[IdKH]\n"
                    + "      ,[IdNV]\n"
                    + "      ,[Ma]\n"
                    + "      ,[NgayTao]\n"
                    + "      ,[NgayThanhToan]\n"
                    + "      ,[NgayShip]\n"
                    + "      ,[NgayNhan]\n"
                    + "      ,[TinhTrang]\n"
                    + "      ,[TenNguoiNhan]\n"
                    + "      ,[DiaChi]\n"
                    + "      ,[Sdt]\n"
                    + "  FROM [dbo].[HoaDon]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String id = ee.getString("Id");
                String idkh = ee.getString("IdKH");
                String idnv = ee.getString("IdNV");
                String ma = ee.getString("Ma");
                Date ngayTao = ee.getDate("NgayTao");
                Date ngayTt = ee.getDate("NgayThanhToan");
                Date ngayship = ee.getDate("NgayShip");
                Date ngaynhan = ee.getDate("NgayNhan");
                int tinhtrang = ee.getInt("TinhTrang");
                String tennguoinhan = ee.getString("TenNguoiNhan");
                String diachi = ee.getString("DiaChi");
                String sdt = ee.getString("Sdt");
                HoaDon hd = new HoaDon(id, idkh, idnv, ma, ngayTao, ngaynhan, ngayship, ngaynhan, tinhtrang, tennguoinhan, diachi, sdt);
                listHD.add(hd);
            }
        } catch (Exception ex) {
            Logger.getLogger(HoaDonRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHD;
    }

    @Override
    public HoaDon insert(HoaDon hd) {
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO [dbo].[HoaDon]\n"
                    + "           ([IdKH]\n"
                    + "           ,[IdNV]\n"
                    + "           ,[Ma]\n"
                    + "           ,[NgayTao]\n"
                    + "           ,[NgayThanhToan]\n"
                    + "           ,[NgayShip]\n"
                    + "           ,[NgayNhan]\n"
                    + "           ,[TinhTrang]\n"
                    + "           ,[TenNguoiNhan]\n"
                    + "           ,[DiaChi]\n"
                    + "           ,[Sdt])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, hd.getIdKH());
            pr.setString(2, hd.getIdNV());
            pr.setString(3, hd.getMa());
            pr.setDate(4, hd.getNgayTao());
            pr.setDate(5, hd.getNgayThanhToan());
            pr.setDate(6, hd.getNgayShip());
            pr.setDate(7, hd.getNgayNhan());
            pr.setInt(8, hd.getTinhTrang());
            pr.setString(9, hd.getTenNguoiNhan());
            pr.setString(10, hd.getDiaChi());
            pr.setString(11, hd.getSdt());
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(HoaDonRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hd;
    }

    @Override
    public HoaDon update(HoaDon hd, String id) {
        try {
            Connection conn = getConnection();
            String query = " UPDATE HoaDon "
                    + " SET IdKH = ? "
                    + " ,IdNV = ? "
                    + " ,Ma = ? "
                    + " ,NgayTao = ? "
                    + " ,NgayThanhToan = ? "
                    + " ,NgayShip = ? "
                    + " ,NgayNhan = ? "
                    + " ,TinhTrang = ? "
                    + " ,TenNguoiNhan = ? "
                    + " ,DiaChi = ? "
                    + " ,Sdt = ? "
                    + " WHERE Id = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, hd.getIdKH());
            pr.setString(2, hd.getIdNV());
            pr.setString(3, hd.getMa());
            pr.setDate(4, hd.getNgayTao());
            pr.setDate(5, hd.getNgayThanhToan());
            pr.setDate(6, hd.getNgayShip());
            pr.setDate(7, hd.getNgayNhan());
            pr.setInt(8, hd.getTinhTrang());
            pr.setString(9, hd.getTenNguoiNhan());
            pr.setString(10, hd.getDiaChi());
            pr.setString(11, hd.getSdt());
            pr.setString(12, id);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(HoaDonRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hd;
    }

    @Override
    public String Delete(String id) {
        try {
            Connection conn = getConnection();
            String query = " DELETE FROM HoaDon "
                    + "WHERE ID = ? ";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, id);
            pr.execute();
        } catch (Exception ex) {
            Logger.getLogger(HoaDonRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
