/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository.Iplm;

import DomainModel.DongSanPham;
import Respository.IDongSanPhamService;
import java.util.List;
import java.sql.*;
import Utilities.SQLServerConnection;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class dongSanPhamService implements IDongSanPhamService{

    @Override
    public List<DongSanPham> getAll() {
          String query = "select * from FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041.dbo.DongSP";
          try(Connection con =SQLServerConnection.getConnection();
              PreparedStatement ps = con.prepareCall(query)) {
            List<DongSanPham> listDongSp = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
              while (rs.next()) {                  
                  DongSanPham dongSP = new DongSanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                  listDongSp.add(dongSP);
              }
               return listDongSp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
           return null;
    }
    
    public static void main(String[] args) {
        List<DongSanPham> listDongsp = new ArrayList<>();
        for (DongSanPham dongSanPham : listDongsp) {
            System.out.println(dongSanPham.toString());
        }
    }
}
