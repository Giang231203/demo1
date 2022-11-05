/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Ban;
import repository.BanRepository;

/**
 *
 * @author tt
 */
public class BanService {
    BanRepository banRp;

    public BanService() {
        banRp = new BanRepository();
    }
    public void Update(Ban b, String Ma) {
        banRp.Update(b, Ma);
    }
    public void Delete(String Ma){
        banRp.Delete(Ma);
    }
    public ArrayList<Ban> getList() {
        return banRp.all();
    }
}
