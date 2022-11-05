/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.Dongsp;
import repo.repodongsp;
import repoimpl.repodongspmpl;

/**
 *
 * @author User
 */
public class serviceDongspimpl implements serviceDongsp {

    repodongsp repodongsp = new repodongspmpl();

    @Override
    public ArrayList<Dongsp> getall() {
        return repodongsp.getAll();
    }

    @Override
    public String insert(Dongsp sp) {
        boolean insert = repodongsp.insert(sp);
        if (insert) {
            return "Them thanh cong!";
        }
        return "Them that bai!";
    }

    @Override
    public String update(Dongsp sp, String ma) {
        boolean update = repodongsp.update(sp, ma);
        if (update) {
            return "update thanh cong!";
        }
        return "Update that bai!";
    }

    @Override
    public String delete(String ma) {
        boolean delete = repodongsp.delete(ma);
        if (delete) {
            return "Thanh cong!";
        }
        return "Thai bai!";
    }

}
