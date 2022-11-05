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
    BanRepository banRP;
    
    public BanService() {
        banRP = new BanRepository();
    }
    public void update(Ban ban, String Ma) {
        banRP.update(ban, Ma);
    }
    public void Delete(String Ma){
        banRP.Delete(Ma);
    }
    public void insert(Ban b) {
        banRP.insert(b);
    }
    public ArrayList<Ban> getList() {
        return banRP.all();
    }
}
