/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.NSX;
import repo.repoNSX;
import repoimpl.repoNSXmpl;

/**
 *
 * @author User
 */
public class serviceNSximpl implements serviceNSx {

    repoNSX nSX = new repoNSXmpl();

    @Override
    public ArrayList<NSX> getall() {
        return nSX.getAll();
    }

    @Override
    public String insert(NSX nsx) {
        boolean insert = nSX.insert(nsx);
        if (insert) {
            return "Thanh cong!";
        } else {
            return "That bai !";
        }
    }

    @Override
    public String update(NSX nsx, String ma) {
        boolean update = nSX.update(nsx, ma);
        if (update) {
            return "Thanh cong!";
        } else {
            return "That bai !";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = nSX.delete(ma);
        if (delete) {
            return "Thanh cong!";
        } else {
            return "That bai !";
        }
    }

}
