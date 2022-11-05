/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChucVu;
import Repositories.ChucVuRepo;
import ViewModels.QLChucVu;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class ChucVuService implements IChucVuService{
    ChucVuRepo cvRP;
    

    public ChucVuService() {
        cvRP = new ChucVuRepo();
    }
    @Override
    public ArrayList<QLChucVu> getList(){
        ArrayList<QLChucVu> listcv = new ArrayList<>();
        var x = cvRP.all();
        for (ChucVu chucVu : x) {
            listcv.add(new QLChucVu(chucVu.getId(),chucVu.getMa(),chucVu.getTen()));
        }
        return listcv;
    }
    @Override
    public QLChucVu add(QLChucVu chucvu){
        var x = cvRP.insert(new ChucVu(chucvu.getId(),chucvu.getMa(),chucvu.getTen()));
        return new QLChucVu(x.getId(),x.getMa(),x.getTen());
    }
    @Override
    public String delete(String id){
        return cvRP.delete(id);
    }
    @Override
    public QLChucVu update(QLChucVu ql,String id){
        var x = cvRP.update(new ChucVu(ql.getId(),ql.getMa(),ql.getTen()),id);
        return new QLChucVu(x.getId(),x.getMa(),x.getTen());
    }
}
