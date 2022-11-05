/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.Chucvu;
import model.Nhanvien;
import repo.repoNhanvien;
import repoimpl.repoNhanvienmpl;

/**
 *
 * @author User
 */
public class serviceNhanvienimpl implements serviceNhanvien {

    repoNhanvien reponhanvien = new repoNhanvienmpl();

    @Override
    public ArrayList<Nhanvien> getall() {
        return reponhanvien.getAll();
    }

    @Override
    public String insert(Nhanvien nv) {
        boolean insert = reponhanvien.insert(nv);
        if (insert) {
            return "Thanh cong!";
        } else {
            return "That bai!";
        }
    }

    @Override
    public String update(Nhanvien nv, String ma) {
        boolean update = reponhanvien.update(nv, ma);
        if (update) {
            return "Thanh cong!";
        } else {
            return "That bai!";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = reponhanvien.delete(id);
        if (delete) {
            return "Thanh cong!";
        } else {
            return "That bai!";
        }
    }

}
