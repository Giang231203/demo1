/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.DongSanPham;
import Repositories.DongSPRePo;
import ViewModels.QLDongSP;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class DongSPService implements IDongSPService{
    DongSPRePo dspRP;
    

    public DongSPService() {
        dspRP = new DongSPRePo();
    }
    @Override
    public ArrayList<QLDongSP> getList(){
        ArrayList<QLDongSP> listDSP = new ArrayList<>();
        var x = dspRP.all();
        for (DongSanPham d : x) {
            listDSP.add(new QLDongSP(d.getId(),d.getMa(),d.getTen()));
        }
        return listDSP;
    }
    @Override
    public QLDongSP insert(QLDongSP dsp){
        var x = dspRP.insert(new DongSanPham(dsp.getId(),dsp.getMa(),dsp.getTen()));
        return new QLDongSP(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public QLDongSP update(QLDongSP dsp,String id){
        var x = dspRP.update(new DongSanPham(dsp.getId(),dsp.getMa(),dsp.getTen()), id);
        return new QLDongSP(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public String delete(String id){
        return dspRP.delete(id);
    }
}
