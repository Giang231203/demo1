/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.CuaHang;
import Repositories.CuaHangRePo;
import ViewModels.QLChucVu;
import ViewModels.QLCuaHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class CuaHangService implements ICuaHangService{
    
    CuaHangRePo chRP;
    
    public CuaHangService() {
        chRP= new CuaHangRePo();
    }
    
    @Override
    public ArrayList<QLCuaHang> getList(){
        ArrayList<QLCuaHang> listCh = new ArrayList<>();
        var x = chRP.all();
        for (CuaHang cuaHang : x) {
            listCh.add(new QLCuaHang(cuaHang.getId(),cuaHang.getMa(),cuaHang.getTen(),cuaHang.getDiaChi(),cuaHang.getThanhPho(),cuaHang.getQuocGia()));
        }
        return listCh;
    }
    @Override
    public QLCuaHang add(QLCuaHang cuaHang){
        var x = chRP.insert(new CuaHang(cuaHang.getId(),cuaHang.getMa(),cuaHang.getTen(),cuaHang.getDiaChi(),cuaHang.getThanhPho(),cuaHang.getQuocGia()));
        return new QLCuaHang(x.getId(),x.getMa(),x.getTen(),x.getDiaChi(),x.getThanhPho(),x.getQuocGia());
    }
    @Override
    public String delete(String id){
        return chRP.delete(id);
    }
    @Override
    public QLCuaHang update(QLCuaHang ch,String id){
        var x = chRP.update(new CuaHang(ch.getId(),ch.getMa(),ch.getTen(),ch.getDiaChi(),ch.getThanhPho(),ch.getQuocGia()),id);
        return new QLCuaHang(x.getId(),x.getMa(),x.getTen(),x.getDiaChi(),x.getThanhPho(),x.getQuocGia());
    }

}
