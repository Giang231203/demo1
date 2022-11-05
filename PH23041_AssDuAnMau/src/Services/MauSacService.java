/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.MauSac;
import Repositories.MauSacRepo;
import ViewModels.QLMauSac;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class MauSacService implements IMauSacService{
    MauSacRepo msRP;
    
    public MauSacService() {
        msRP = new MauSacRepo();
    }
    @Override
    public ArrayList<QLMauSac> getList(){
        ArrayList<QLMauSac> listMS = new ArrayList<>();
        var x = msRP.all();
        for (MauSac ms : x) {
            listMS.add(new QLMauSac(ms.getId(),ms.getMa(),ms.getTen()));
        }
        return listMS;
    }
    @Override
    public QLMauSac insert(QLMauSac ms){
        var x = msRP.insert(new MauSac(ms.getId(),ms.getMa(),ms.getTen()));
        return new QLMauSac(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public QLMauSac update(QLMauSac ms,String id){
        var x = msRP.update(new MauSac(ms.getId(),ms.getMa(),ms.getTen()),id);
        return new QLMauSac(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public String delete(String id){
        return msRP.delete(id);
    }
}
