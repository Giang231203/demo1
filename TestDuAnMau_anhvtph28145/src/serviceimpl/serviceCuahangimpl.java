/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.Cuahang;
import repo.repoCuahnag;
import repoimpl.repoCuahnagmpl;

/**
 *
 * @author User
 */
public class serviceCuahangimpl implements serviceCuahang {

    repoCuahnag repocuahang = new repoCuahnagmpl();

    @Override
    public ArrayList<Cuahang> getall() {
        return repocuahang.getAll();
    }

    @Override
    public String insert(Cuahang ch) {
        boolean insert = repocuahang.insert(ch);
        if (insert) {
            return "Them thanh cong!";
        }
        return "Them that bai!";
    }

    @Override
    public String update(Cuahang ch, String ma) {
        boolean update = repocuahang.update(ch, ma);
        if (update) {
            return "update thanh cong!";
        }
        return "Update that bai!";
    }

    @Override
    public String delete(String ma) {
        boolean delete = repocuahang.delete(ma);
        if (delete) {
            return "Thanh cong!";
        }
        return "Thai bai!";
    }

}
