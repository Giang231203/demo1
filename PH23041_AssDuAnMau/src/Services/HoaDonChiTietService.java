/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HoaDonChiTiet;
import Repositories.HoaDonChiTietRepo;
import ViewModels.QlHoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class HoaDonChiTietService implements IHoaDonChiTietService{
    HoaDonChiTietRepo hdctRP;
    

    public HoaDonChiTietService() {
        hdctRP = new HoaDonChiTietRepo();
    }
    @Override
    public ArrayList<QlHoaDonChiTiet> getList(){
        ArrayList<QlHoaDonChiTiet> listQLHDCT = new ArrayList<>();
        var x = hdctRP.all();
        for (HoaDonChiTiet h : x) {
            listQLHDCT.add(new QlHoaDonChiTiet(h.getIdHoaDon(),h.getIdChiTietSP(),h.getSoLuong(),h.getDonGia()));
        }
        return listQLHDCT;
    }

    @Override
    public QlHoaDonChiTiet insert(QlHoaDonChiTiet qlhdct) {
         var x = hdctRP.insert(new HoaDonChiTiet(qlhdct.getIdHoaDon(),qlhdct.getIdChiTietSP(),qlhdct.getSoLuong(),qlhdct.getDonGia()));
         return new QlHoaDonChiTiet(x.getIdHoaDon(),x.getIdChiTietSP(),x.getSoLuong(),x.getDonGia());
    }
    
    
}
