/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Iplm;

import DomainModel.DongSanPham;
import Service.IManagerDongSanPhamService;
import ViewModel.QuanLyDongSanPham;
import java.util.List;
import Respository.Iplm.dongSanPhamService;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class IManagerDongSanPhamIplm implements IManagerDongSanPhamService {

    dongSanPhamService dpsSv = new dongSanPhamService();
    List<QuanLyDongSanPham> listQLDongSP = new ArrayList<>();

    @Override
    public List<QuanLyDongSanPham> getAll() {
        var dongSanPham = dpsSv.getAll();
        for (DongSanPham qlDongSP : dongSanPham) {
            listQLDongSP.add(new QuanLyDongSanPham(qlDongSP.getMaDongSanPham(), qlDongSP.getTenDongSanPham()));
        }
        return listQLDongSP;
    }

}
