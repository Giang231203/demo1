/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tac_Gia;

import java.util.ArrayList;

/**
 *
 * @author tt
 */
public class TacGiaService {
    TacGiaRepository tgRP;
    public TacGiaService() {
        tgRP = new TacGiaRepository();
    }
    public void insert(TacGia tg){
            tgRP.insert(tg);
    }
    public void update(int id,TacGia tg){
        tgRP.update(id, tg);
    }
    public void delete(int id){
        tgRP.delete(id);
    }
    public ArrayList<TacGia> getList(){
        return tgRP.all();
    }
}
