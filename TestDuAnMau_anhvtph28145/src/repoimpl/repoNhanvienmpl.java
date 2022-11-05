/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repoimpl;

import repo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Nhanvien;

/**
 *
 * @author User
 */
public class repoNhanvienmpl implements repoNhanvien {

    @Override
    public ArrayList<Nhanvien> getAll() {
        ArrayList<Nhanvien> listSv = new ArrayList<>();

        try {
            Connection conn = DBContext.getConnection();
            String query = " select * from nhanvien";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String tendem = rs.getString("Tendem");
                String ho = rs.getString("ho");
                String gioitinh = rs.getString("gioitinh");
                String ngaysinh = rs.getString("ngaysinh");
                String diachi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                String matkhau = rs.getString("matkhau");
                String idch = rs.getString("idch");
                String idcv = rs.getString("idcv");
                String idguibc = rs.getString("idguibc");
                int trangthai = rs.getInt("trangthai");
                Nhanvien nv = new Nhanvien(id, ma, ten, tendem, ho, gioitinh, ngaysinh, diachi, sdt, matkhau, idch, idcv, idguibc, trangthai);
                listSv.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSv;
    }

    @Override
    public boolean insert(Nhanvien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "insert into NhanVien(ma, ho, tendem, ten,gioitinh, ngaysinh, diachi, sdt,MatKhau, idch, idcv, trangthai ) values(?, ?,?,?,?,cast( ? as date),?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getTenho());
            ps.setString(3, nv.getTendem());
            ps.setString(4, nv.getTen());
            ps.setString(5, nv.getGioitinh());
            ps.setString(6, nv.getNgaysinh());
            ps.setString(7, nv.getDiachi());
            ps.setString(8, nv.getSdt());
            ps.setString(9, nv.getMatkhau());
            ps.setString(10, nv.getIdch());
            ps.setString(11, nv.getIdcv());
            ps.setInt(12, nv.getTrangthai());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(Nhanvien nv, String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "UPDATE [dbo].[NhanVien]"
                    + " SET\n"
                    + "   [Ten] = ?" //1
                    + " ,[TenDem] = ?" //2
                    + "      ,[Ho] = ?" //3
                    + "      ,[NgaySinh] = ?" //4
                    + "      ,[DiaChi] = ?" //5
                    + "      ,[Sdt] = ?"//6
                    + "      ,[MatKhau] = ?" //7
                    + "      ,[IdCH] = ?"//8
                    + "      ,[IdCV] = ?"//9
                    + "      ,[TrangThai] = ?"//10
                    + " WHERE ma= ?"; //11
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getTendem());
            ps.setString(3, nv.getTenho());
            ps.setString(4, nv.getNgaysinh());
            ps.setString(5, nv.getDiachi());
            ps.setString(6, nv.getSdt());
            ps.setString(7, nv.getMatkhau());
            ps.setString(8, nv.getIdch());
            ps.setString(9, nv.getIdcv());
            ps.setInt(10, nv.getTrangthai());
            ps.setString(11, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        try {
            Connection conn = DBContext.getConnection();
            String query = "DELETE HoaDonChiTiet WHERE IdHoaDon IN ( SELECT id FROM HoaDon WHERE HoaDon.Id  = (select id from HoaDon where IdNV = ?))\n"
                    + "DELETE HoaDon WHERE IdNV IN ( SELECT id FROM NhanVien WHERE NhanVien.Id =?)\n"
                    + "delete from NhanVien where id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, id);
            ps.setString(3, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
