/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHangChiTiet;
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
public class GioHangChiTietRepo implements IGioHangChiTietRepo {

    @Override
    public ArrayList<GioHangChiTiet> all() {
        ArrayList<GioHangChiTiet> listGHCT = new ArrayList<>();
        try {
            Connection conn = getConnection();
            String query = "SELECT [IdGioHang]\n"
                    + "      ,[IdChiTietSP]\n"
                    + "      ,[SoLuong]\n"
                    + "      ,[DonGia]\n"
                    + "      ,[DonGiaKhiGiam]\n"
                    + "  FROM [dbo].[GioHangChiTiet]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String idgh = ee.getString("IdGioHang");
                String idctsp = ee.getString("IdChiTietSP");
                int soluong = ee.getInt("SoLuong");
                BigDecimal dongia = ee.getBigDecimal("DonGia");
                BigDecimal dongiakhigiam = ee.getBigDecimal("DonGiaKhiGiam");
                GioHangChiTiet ghct = new GioHangChiTiet(idgh, idctsp, soluong, dongia, dongiakhigiam);
                listGHCT.add(ghct);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listGHCT;
    }

    @Override
    public GioHangChiTiet insert(GioHangChiTiet ghct) {
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO [dbo].[GioHangChiTiet]\n"
                    + "           ([IdGioHang]\n"
                    + "           ,[IdChiTietSP]\n"
                    + "           ,[SoLuong]\n"
                    + "           ,[DonGia]\n"
                    + "           ,[DonGiaKhiGiam])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, ghct.getIdGioHang());
            pr.setString(2, ghct.getIdChiTietSP());
            pr.setInt(3, ghct.getSoLuong());
            pr.setBigDecimal(4, ghct.getDonGia());
            pr.setBigDecimal(5, ghct.getDonGiaKhiGiam());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ghct;
    }

}
