/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Danh_Muc;

import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class DanhMucService {
    DanhMucrepository dmRe;

    public DanhMucService() {
        this.dmRe = new DanhMucrepository();
    }
    public void insert(DanhMuc dm){
        dmRe.insert(dm);
    }
    public void update(int id,DanhMuc dm ){
        dmRe.update(id, dm);
    }
    public void delete(int id){
        dmRe.delete(id);
    }
    public ArrayList<DanhMuc> getList(){
        return dmRe.all();
    }
}
