/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDonChiTiet;
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
public class HoaDonChiTietRepo implements IHoaDonChiTietRepo {

    @Override
    public ArrayList<HoaDonChiTiet> all() {
        ArrayList<HoaDonChiTiet> listHDCT = new ArrayList<>();
        try {

            Connection conn = getConnection();
            String query = "SELECT [IdHoaDon]\n"
                    + "      ,[IdChiTietSP]\n"
                    + "      ,[SoLuong]\n"
                    + "      ,[DonGia]\n"
                    + "  FROM [dbo].[HoaDonChiTiet]";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.execute();
            ResultSet ee = pr.getResultSet();
            while (ee.next()) {
                String idhd = ee.getString("IdHoaDon");
                String idctsp = ee.getString("IdChiTietSP");
                int soluong = ee.getInt("SoLuong");
                BigDecimal dongia = ee.getBigDecimal("DonGia");
                HoaDonChiTiet hdct = new HoaDonChiTiet(idhd, idctsp, soluong, dongia);
                listHDCT.add(hdct);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listHDCT;

    }

    @Override
    public HoaDonChiTiet insert(HoaDonChiTiet hdct) {
        try {
            Connection conn = getConnection();
            String query = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                    + "           ([IdHoaDon]\n"
                    + "           ,[IdChiTietSP]\n"
                    + "           ,[SoLuong]\n"
                    + "           ,[DonGia])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, hdct.getIdHoaDon());
            pr.setString(2, hdct.getIdChiTietSP());
            pr.setInt(3, hdct.getSoLuong());
            pr.setBigDecimal(4, hdct.getDonGia());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            return hdct;
    }

}
