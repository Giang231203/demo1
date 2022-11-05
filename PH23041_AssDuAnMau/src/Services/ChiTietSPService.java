/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChiTietSanPham;
import Repositories.ChiTietSanPhamRepo;
import Repositories.IChiTietSanPhamRepo;
import ViewModels.QLChiTietSanPham;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class ChiTietSPService implements IChiTietSanPhamService{
    IChiTietSanPhamRepo ctspRP;
    
    public ChiTietSPService() {
        ctspRP = new ChiTietSanPhamRepo();
    }
    @Override
    public ArrayList<QLChiTietSanPham> getList() {
        ArrayList<QLChiTietSanPham> listQLCTSP = new ArrayList<>();
        var x = ctspRP.all();
        for (ChiTietSanPham c : x) {
            listQLCTSP.add(new QLChiTietSanPham(c.getiD(),c.getIdSP(),c.getIdNSX(),c.getIDMauSac(),c.getIdDongSP(),c.getNamBH(),c.getMoTa(),c.getSoLuongTon(),c.getGiaNhap(),c.getGiaBan()));
            
        }
        return listQLCTSP;
    }
    @Override
    public QLChiTietSanPham insert(QLChiTietSanPham c){
        var x = ctspRP.insert(new ChiTietSanPham(c.getiD(),c.getIdSP(),c.getIdNSX(),c.getIDMauSac(),c.getIdDongSP(),c.getNamBH(),c.getMoTa(),c.getSoLuongTon(),c.getGiaNhap(),c.getGiaBan()));
        return new QLChiTietSanPham(x.getiD(),x.getIdSP(),x.getIdNSX(),x.getIDMauSac(),x.getIdDongSP(),x.getNamBH(),x.getMoTa(),x.getSoLuongTon(),x.getGiaNhap(),x.getGiaBan());
    }
    @Override
    public QLChiTietSanPham update(QLChiTietSanPham c,String id){
        var x = ctspRP.update(new ChiTietSanPham(c.getiD(),c.getIdSP(),c.getIdNSX(),c.getIDMauSac(),c.getIdDongSP(),c.getNamBH(),c.getMoTa(),c.getSoLuongTon(),c.getGiaNhap(),c.getGiaBan()) , id);
        return new QLChiTietSanPham(x.getiD(),x.getIdSP(),x.getIdNSX(),x.getIDMauSac(),x.getIdDongSP(),x.getNamBH(),x.getMoTa(),x.getSoLuongTon(),x.getGiaNhap(),x.getGiaBan());
    }
    @Override
    public String delete(String id){
        return ctspRP.delete(id);
    }
}
