/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.QuanLyBan;
import Repository.QuanLyBanRepository;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class QLBService {
    QuanLyBanRepository qlbRP;
    public QLBService() {
        qlbRP = new QuanLyBanRepository();
    }
    
    public ArrayList<QuanLyBan> getList(){
        return qlbRP.all();
    }
    public void delete(String Ma){
        qlbRP.delete(Ma);
    }
    public void update(QuanLyBan qlb, String Ma) {
        qlbRP.update(qlb, Ma);
    }
}
