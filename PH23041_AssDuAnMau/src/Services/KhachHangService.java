/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import Repositories.KhachHangRePo;
import ViewModels.QLKhachHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class KhachHangService implements IKhachHangService{
    KhachHangRePo khRP;
    
    public KhachHangService(){
        khRP = new KhachHangRePo();
    }
    @Override
    public ArrayList<QLKhachHang> getList(){
        ArrayList<QLKhachHang> listKH = new ArrayList<>();
        var x = khRP.all();
        for (KhachHang k : x) {
            listKH.add(new QLKhachHang(k.getId(),k.getMa(),k.getTen(),k.getTenDem(),k.getHo(),k.getNgaySinh(),k.getSdt(),k.getDiaChi(),k.getThanhPho(),k.getQuocGia(),k.getMatKhau()));
            
        }
        return listKH;
    }
    @Override
    public QLKhachHang insert(QLKhachHang k){
        var x = khRP.insert(new KhachHang(k.getId(),k.getMa(),k.getTen(),k.getTenDem(),k.getHo(),k.getNgaySinh(),k.getSdt(),k.getDiaChi(),k.getThanhPho(),k.getQuocGia(),k.getMatKhau()));
        return new QLKhachHang(x.getId(),x.getMa(),x.getTen(),x.getTenDem(),x.getHo(),x.getNgaySinh(),x.getSdt(),x.getDiaChi(),x.getThanhPho(),x.getQuocGia(),x.getMatKhau());
    }
    @Override
    public QLKhachHang update(QLKhachHang k,String Id){
        var x = khRP.update(new KhachHang(k.getId(),k.getMa(),k.getTen(),k.getTenDem(),k.getHo(),k.getNgaySinh(),k.getSdt(),k.getDiaChi(),k.getThanhPho(),k.getQuocGia(),k.getMatKhau()), Id);
        return new QLKhachHang(x.getId(),x.getMa(),x.getTen(),x.getTenDem(),x.getHo(),x.getNgaySinh(),x.getSdt(),x.getDiaChi(),x.getThanhPho(),x.getQuocGia(),x.getMatKhau());
    }
    @Override
    public String delete(String id){
        return khRP.delete(id);
    }
}
