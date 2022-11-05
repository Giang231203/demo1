/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class SachService {
    SachRepository sRP;

    public SachService() {
        sRP = new SachRepository();
    }
    public void insert(Sach s){
        sRP.insert(s);
    }
    public void update(int id,Sach s){
        sRP.update(id, s);
    }
    public void delete(int id){
        sRP.delete(id);
    }
    public ArrayList<Sach> getList(){
        return sRP.all();
    }
}
