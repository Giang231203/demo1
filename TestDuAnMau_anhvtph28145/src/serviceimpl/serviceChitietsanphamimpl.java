/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.Chitietsp;
import repo.repoChitietsanpham;
import repoimpl.repoChitietsanphamimpl;

/**
 *
 * @author User
 */
public class serviceChitietsanphamimpl implements serviceChitietsanpham {

    repoChitietsanpham repochitietsp = new repoChitietsanphamimpl();

    @Override
    public ArrayList<Chitietsp> getall() {
        return repochitietsp.getAll();
    }

    @Override
    public String insert(Chitietsp ctsp) {
        boolean insert = repochitietsp.insert(ctsp);
        if (insert) {
            return "Them thanh cong!";
        }
        return "Them that bai!";
    }

    @Override
    public String update(Chitietsp ctsp, String id) {
        boolean update = repochitietsp.update(ctsp, id);
        if (update) {
            return "update thanh cong!";
        }
        return "Update that bai!";

    }

    @Override
    public String delete(String id) {
        boolean delete = repochitietsp.delete(id);
        if (delete) {
            return "Thanh cong!";
        }
        return "Thai bai!";
    }

}
