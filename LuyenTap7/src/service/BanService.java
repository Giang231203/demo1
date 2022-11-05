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
    public void Update(Ban ban, String ma) {
        banRP.Update(ban, ma);
    }
    public void delete(String ma) {
        banRP.delete(ma);
    }
    public ArrayList<Ban> getList() {
        return banRP.all();
    }
}
