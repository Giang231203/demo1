/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.HocKy;
import repository.HocKyRepository;

/**
 *
 * @author tt
 */
public class HocKyServiece {
    HocKyRepository hkRP;

    public HocKyServiece() {
        hkRP = new HocKyRepository();
    }
    public void delete(int id){
        hkRP.delete(id);
    }
    public ArrayList<HocKy> getList(){
        return hkRP.all();
    }
}
