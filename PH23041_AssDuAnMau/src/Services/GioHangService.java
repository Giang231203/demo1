/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.GioHang;
import Repositories.GioHangRepo;
import ViewModels.QlGioHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class GioHangService implements IGioHangService{
    
    GioHangRepo ghRp;

    public GioHangService() {
        ghRp = new GioHangRepo();
    }
    
    @Override
    public ArrayList<QlGioHang> getList() {
        ArrayList<QlGioHang> listQlGH = new ArrayList<>();
        var x = ghRp.all();
        for (GioHang giohang : x) {
            listQlGH.add(new QlGioHang(giohang.getId(),giohang.getIdKH(),giohang.getIdNV(),giohang.getMa(),giohang.getNgayTao(),giohang.getNgayThanhToan(),giohang.getTenNguoiNhan(),giohang.getDiaChi(),giohang.getSdt(),giohang.getTinhTrang()));
        }
        return listQlGH;
    }

    @Override
    public QlGioHang insert(QlGioHang qlgh) {
        var x = ghRp.insert(new GioHang(qlgh.getId(),qlgh.getIdKH(),qlgh.getIdNV(),qlgh.getMa(),qlgh.getNgayTao(),qlgh.getNgayThanhToan(),qlgh.getTenNguoiNhan(),qlgh.getDiaChi(),qlgh.getSdt(),qlgh.getTinhTrang()));
        return new QlGioHang(x.getId(),x.getIdKH(),x.getIdNV(),x.getMa(),x.getNgayTao(),x.getNgayThanhToan(),x.getTenNguoiNhan(),x.getDiaChi(),x.getSdt(),x.getTinhTrang());
    }

    @Override
    public QlGioHang update(QlGioHang qlgh, String Id) {
        var x = ghRp.update(new GioHang(qlgh.getId(),qlgh.getIdKH(),qlgh.getIdNV(),qlgh.getMa(),qlgh.getNgayTao(),qlgh.getNgayThanhToan(),qlgh.getTenNguoiNhan(),qlgh.getDiaChi(),qlgh.getSdt(),qlgh.getTinhTrang()), Id);
        return new QlGioHang(x.getId(),x.getIdKH(),x.getIdNV(),x.getMa(),x.getNgayTao(),x.getNgayThanhToan(),x.getTenNguoiNhan(),x.getDiaChi(),x.getSdt(),x.getTinhTrang());
    }

    @Override
    public String delete(String Id) {
        return ghRp.delete(Id);
    }
    
}
