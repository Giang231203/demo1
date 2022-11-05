/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoGiaoDien;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class SanPhamService {
    private ArrayList<SanPham> listSP;
    
    public SanPhamService(){
        this.listSP = new ArrayList<>();
    }
    public void insert(SanPham sp){
        this.listSP.add(sp);
    }    
    public void update(int id,SanPham sp){
        for (int i = 0; i < this.listSP.size(); i++) {
            if(this.listSP.get(i).getId()==id){
                this.listSP.set(i,sp);
            }
        }
    }  
    public void delete(int id){
        for (int i = 0; i < this.listSP.size(); i++) {
            if(this.listSP.get(i).getId()==id){
                this.listSP.remove(i);
            }
        }
    }
    public ArrayList<SanPham> getList(){
        return  listSP;
    }
    
}
