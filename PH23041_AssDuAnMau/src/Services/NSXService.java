/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhaSanXuat;
import Repositories.NSXRePo;
import ViewModels.QLNhaSanXuat;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class NSXService implements INSXService{
    NSXRePo nsxRP;
    
    public NSXService() {
        nsxRP = new NSXRePo();
    }
    @Override
    public ArrayList<QLNhaSanXuat> getList(){
        ArrayList<QLNhaSanXuat> listNSX = new ArrayList<>();
        var x = nsxRP.all();
        for (NhaSanXuat nhaSanXuat : x) {
            listNSX.add(new QLNhaSanXuat(nhaSanXuat.getId(),nhaSanXuat.getMa(),nhaSanXuat.getTen()));
        }
        return listNSX;
    }
    @Override
    public QLNhaSanXuat insert(QLNhaSanXuat nsx){
        var x = nsxRP.insert(new NhaSanXuat(nsx.getId(),nsx.getMa(),nsx.getTen()));
        return new QLNhaSanXuat(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public QLNhaSanXuat update(QLNhaSanXuat nsx,String id){
        var x = nsxRP.update(new NhaSanXuat(nsx.getId(),nsx.getMa(),nsx.getTen()),id);
        return new QLNhaSanXuat(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public String delete(String id){
        return nsxRP.delete(id);
    }
}
