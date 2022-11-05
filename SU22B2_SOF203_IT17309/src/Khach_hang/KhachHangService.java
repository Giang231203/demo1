/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khach_hang;

import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class KhachHangService {
    KhachHangRepository khRP;

    public KhachHangService() {
        khRP= new KhachHangRepository();
    }
    public void insert(KhachHang kh){
        khRP.insert(kh);
    }
    public void update(int id ,KhachHang kh){
        khRP.update(id, kh);
    }
    public void delete(int id){
        khRP.delete(id);
    }
    public ArrayList<KhachHang> getList(){
        return khRP.all();
    }
   
}
