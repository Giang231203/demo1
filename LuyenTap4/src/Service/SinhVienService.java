/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import Repository.SinhVienRepository;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class SinhVienService {
    SinhVienRepository svRP;

    public SinhVienService() {
        svRP = new SinhVienRepository();
    }
    public void insert(SinhVien sv){
        svRP.insert(sv);
    }
    public void update(int id,SinhVien sv){
        svRP.update(id, sv);
    }
    public void delete(int id){
        svRP.delete(id);
    }
    public ArrayList<SinhVien> getList(){
        return svRP.all();
    }
}
