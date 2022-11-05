/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.Chucvu;
import repo.repoChucvu;
import repoimpl.repoChucvuimpl;

/**
 *
 * @author User
 */
public class serviceChucvuimpl implements serviceChucvu {

    repoChucvu repochucvu = new repoChucvuimpl();

    @Override
    public ArrayList<Chucvu> getall() {
        return repochucvu.getAll();
    }

    @Override
    public String insert(Chucvu sp) {
        boolean insert = repochucvu.insert(sp);
        if (insert) {
            return "Thanh cong!";
        } else {
            return "That bai!";
        }
    }

    @Override
    public String update(Chucvu sp, String ma) {
        boolean update = repochucvu.update(sp, ma);
        if (update) {
            return "Thanh cong!";
        } else {
            return "That bai!";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = repochucvu.delete(id);
        if (delete) {
            return "Thanh cong!";
        } else {
            return "That bai!";
        }
    }

}
