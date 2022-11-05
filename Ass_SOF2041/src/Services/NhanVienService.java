/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import Repositories.NhanVienRePo;
import ViewModels.QLNhanVien;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class NhanVienService implements INhanVienService{

    NhanVienRePo nvRP;
    
    
    public NhanVienService() {
        nvRP = new NhanVienRePo();
    }

    @Override
    public ArrayList<QLNhanVien> getList() {
        ArrayList<QLNhanVien> listNV = new ArrayList<>();
        var x = nvRP.all();
        for (NhanVien n : x) {
            QLNhanVien qlnv = new QLNhanVien();
            qlnv.setHo(n.getHo());
            qlnv.setTenDem(n.getTenDem());
            qlnv.setTen(n.getTen());
            qlnv.setHoVaTen(n.getHo()+n.getTenDem()+n.getTen());
            listNV.add(new QLNhanVien(n.getId(), n.getMa(), n.getTen(), n.getTenDem(), n.getHo(),qlnv.getHoVaTen(), n.getGioiTinh(), n.getNgaySinh(), n.getDiaChi(), n.getSdt(), n.getMatKhau(), n.getIdCH(), n.getIdCV(), n.getIdGBC(), n.getTrangThai()));
        }
        return listNV;
    }

    @Override
    public QLNhanVien insert(QLNhanVien n) {
        var x = nvRP.insert(new NhanVien(n.getId(), n.getMa(), n.getTen(), n.getTenDem(), n.getHo(), n.getGioiTinh(), n.getNgaySinh(), n.getDiaChi(), n.getSdt(), n.getMatKhau(), n.getIdCH(), n.getIdCV(), n.getIdGBC(), n.getTrangThai()));
        return new QLNhanVien(x.getId(), x.getMa(), x.getTen(), x.getTenDem(), x.getHo(),"", x.getGioiTinh(), x.getNgaySinh(), x.getDiaChi(), x.getSdt(), x.getMatKhau(), x.getIdCH(), x.getIdCV(), x.getIdGBC(), x.getTrangThai());
    }

    @Override
    public QLNhanVien findate(String ma) {
   
        var x = nvRP.search(ma);
        return new QLNhanVien(x.getId(), x.getMa(), x.getTen(), x.getTenDem(), x.getHo(),"", x.getGioiTinh(), x.getNgaySinh(), x.getDiaChi(), x.getSdt(), x.getMatKhau(), x.getIdCH(), x.getIdCV(), x.getIdGBC(), x.getTrangThai());
        
    }

    @Override
    public QLNhanVien update(QLNhanVien n, String ma) {
        var x = nvRP.update(new NhanVien(n.getId(), n.getMa(), n.getTen(), n.getTenDem(), n.getHo(), n.getGioiTinh(), n.getNgaySinh(), n.getDiaChi(), n.getSdt(), n.getMatKhau(), n.getIdCH(), n.getIdCV(), n.getIdGBC(), n.getTrangThai()), ma);
        return new QLNhanVien(x.getId(), x.getMa(), x.getTen(), x.getTenDem(), x.getHo(),"", x.getGioiTinh(), x.getNgaySinh(), x.getDiaChi(), x.getSdt(), x.getMatKhau(), x.getIdCH(), x.getIdCV(), x.getIdGBC(), x.getTrangThai());
    }

    @Override
    public String Delete(String ma) {
        return nvRP.delete(ma);
    }

    
}
