/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.SinhVienRepository;
import entity.SinhVien;
import java.util.ArrayList;


/**
 *
 * @author tt
 */
public class SinhVienService {
    
    SinhVienRepository svR;
    
    public SinhVienService() {
        this.svR = new SinhVienRepository();
    }
    
    public ArrayList<SinhVien> getlist(){
        return svR.all();
    }
    
    public void insert(SinhVien nv){
        this.svR.insert(nv);
    }
    
    public void update(int ma,SinhVien nv){
        svR.update(ma, nv);
    }
    
    public void delete(int ma){
        svR.delete(ma);
    }
}
