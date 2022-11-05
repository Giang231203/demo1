/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.GioHangChiTiet;
import Repositories.GioHangChiTietRepo;
import ViewModels.QLGioHangChiTiet;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class GioHangChiTietService implements IGioHangChiTietService{
    GioHangChiTietRepo ghctRP;

    public GioHangChiTietService() {
        ghctRP = new GioHangChiTietRepo();
    }
    
    @Override
    public ArrayList<QLGioHangChiTiet> getList() {
        ArrayList<QLGioHangChiTiet> listQLGH = new ArrayList<>();
        var x = ghctRP.all();
        for (GioHangChiTiet gioHangChiTiet : x) {
            listQLGH.add(new QLGioHangChiTiet(gioHangChiTiet.getIdGioHang(),gioHangChiTiet.getIdChiTietSP(),gioHangChiTiet.getSoLuong(),gioHangChiTiet.getDonGia(),gioHangChiTiet.getDonGiaKhiGiam()));
        }
        return listQLGH;
    }

    @Override
    public QLGioHangChiTiet insert(QLGioHangChiTiet qlghct) {
        var x = ghctRP.insert(new GioHangChiTiet(qlghct.getIdGioHang(),qlghct.getIdChiTietSP(),qlghct.getSoLuong(),qlghct.getDonGia(),qlghct.getDonGiaKhiGiam()));
        return new QLGioHangChiTiet(qlghct.getIdGioHang(),qlghct.getIdChiTietSP(),qlghct.getSoLuong(),qlghct.getDonGia(),qlghct.getDonGiaKhiGiam());
    }
    
}
