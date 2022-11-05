/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.NhanVien;
import repository.NhanVienRepo;

/**
 *
 * @author tt
 */
public class NhanVienS {
    NhanVienRepo nRP;

    public NhanVienS() {
        nRP = new NhanVienRepo();
    }
    public void them(NhanVien nv) {
        nRP.them(nv);
    }
    public NhanVien Tim(String Ma){
        return nRP.Tim(Ma);
    }
    public ArrayList<NhanVien> getList() {
        return nRP.all();
    }
}
