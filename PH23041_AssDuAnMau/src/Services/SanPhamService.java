/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import Repositories.SanPhamRepo;
import ViewModels.QLSanPham;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class SanPhamService implements ISanPhamService{
    SanPhamRepo spRP;
    

    public SanPhamService() {
        spRP = new SanPhamRepo();
    }
    @Override
    public ArrayList<QLSanPham> getList(){
        ArrayList<QLSanPham> listQLSP = new ArrayList<>();
        var x = spRP.all();
        for (SanPham s : x) {
            listQLSP.add(new QLSanPham(s.getId(),s.getMa(),s.getTen()));
        }
        return listQLSP;
    }
    @Override
    public QLSanPham insert(QLSanPham qlsp){
        var x = spRP.insert(new SanPham(qlsp.getId(),qlsp.getMa(),qlsp.getTen()));
        return new QLSanPham(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public QLSanPham update(QLSanPham qlsp,String id){
        var x = spRP.update(new SanPham(qlsp.getId(),qlsp.getMa(),qlsp.getTen()),id);
        return new QLSanPham(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public String delete(String id){
        return spRP.delete(id);
    }
    
}
