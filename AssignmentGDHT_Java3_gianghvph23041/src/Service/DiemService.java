/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.DiemRepository;
import entity.Diem;
import java.util.ArrayList;



/**
 *
 * @author tt
 */
public class DiemService {
    DiemRepository dRP;

    public DiemService() {
        dRP = new DiemRepository();
    }
    
    public void save(Diem d){
//        dRP.save(d);
    }
    public void update(int MaSV,Diem d){
        dRP.update(MaSV, d);
    }
    public void delete(int MaSV){
        dRP.delete(MaSV);
    }
    public ArrayList<Diem> search(ArrayList<Diem> listIN,int ma){
        ArrayList<Diem> listSvS = new ArrayList<>();
        for (Diem d : listIN) {
            if (d.getMaSV()==ma) {
                listSvS.add(d);
            }
        }
        return listSvS;
    }
    public ArrayList<Diem> getListD(){
        return dRP.all();
    }
            
}
