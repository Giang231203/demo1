/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Connect.jdbcUtil;
import Model.KhachHang;
import java.util.ArrayList;
import java.sql.Connection;

/**
 *
 * @author tt
 */
public class KhachHangRepository {
    public ArrayList<KhachHang> all(){
        ArrayList<KhachHang> listKH = new ArrayList<>();
        Connection conn = jdbcUtil.getConnection();
        
        String query = "SELECt * FROM khach_hang";
        Pre
    }
}
