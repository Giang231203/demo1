/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.Mausac;

import repo.repoMausac;
import repoimpl.repoMausacmpl;

/**
 *
 * @author User
 */
public class serviceMausacimpl implements serviceMausac {

    repoMausac repomausac = new repoMausacmpl();

    @Override
    public ArrayList<Mausac> getall() {
        return repomausac.getAll();
    }

    @Override
    public String insert(Mausac ms) {
        boolean insert = repomausac.insert(ms);
        if (insert) {
            return "Thanh cong!";
        } else {
            return "That bai !";
        }
    }

    @Override
    public String update(Mausac ms, String ma) {
        boolean update = repomausac.update(ms, ma);
        if (update) {
            return "Thanh cong!";
        } else {
            return "That bai !";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = repomausac.delete(ma);
        if (delete) {
            return "Thanh cong!";
        } else {
            return "That bai !";
        }
    }

}
