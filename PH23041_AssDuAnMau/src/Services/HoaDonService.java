/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import Repositories.HoaDonRepo;
import ViewModels.QlHoaDon;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class HoaDonService implements IHoaDonService{
    HoaDonRepo hdRP;

    public HoaDonService() {
        hdRP = new HoaDonRepo();
    }
    
    @Override
    public ArrayList<QlHoaDon> getList() {
        ArrayList<QlHoaDon> listQL = new ArrayList<>();
        var x = hdRP.all();
        for (HoaDon h : x) {
            listQL.add(new QlHoaDon(h.getId(), h.getIdKH(), h.getIdNV(), h.getMa(), h.getNgayTao(), h.getNgayThanhToan(), h.getNgayShip(), h.getNgayNhan(),h.getTinhTrang(), h.getTenNguoiNhan(), h.getDiaChi(), h.getSdt()));
        }
        return listQL;
    }

    @Override
    public QlHoaDon insert(QlHoaDon qlhd) {
        var x = hdRP.insert(new HoaDon(qlhd.getId(), qlhd.getIdKH(), qlhd.getIdNV(), qlhd.getMa(), qlhd.getNgayTao(), qlhd.getNgayThanhToan(), qlhd.getNgayShip(), qlhd.getNgayNhan(),qlhd.getTinhTrang(), qlhd.getTenNguoiNhan(), qlhd.getDiaChi(), qlhd.getSdt()));
        return new QlHoaDon(x.getId(), x.getIdKH(), x.getIdNV(), x.getMa(), x.getNgayTao(), x.getNgayThanhToan(), x.getNgayShip(), x.getNgayNhan(),x.getTinhTrang(), x.getTenNguoiNhan(), x.getDiaChi(), x.getSdt());
    }

    @Override
    public QlHoaDon update(QlHoaDon qlhd, String id) {
        var x = hdRP.update(new HoaDon(qlhd.getId(), qlhd.getIdKH(), qlhd.getIdNV(), qlhd.getMa(), qlhd.getNgayTao(), qlhd.getNgayThanhToan(), qlhd.getNgayShip(), qlhd.getNgayNhan(),qlhd.getTinhTrang(), qlhd.getTenNguoiNhan(), qlhd.getDiaChi(), qlhd.getSdt()), id);
        return new QlHoaDon(x.getId(), x.getIdKH(), x.getIdNV(), x.getMa(), x.getNgayTao(), x.getNgayThanhToan(), x.getNgayShip(), x.getNgayNhan(),x.getTinhTrang(), x.getTenNguoiNhan(), x.getDiaChi(), x.getSdt());
    }

    @Override
    public String delete(String id) {
        return hdRP.Delete(id);
    }
    
}
