/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import service.*;
import java.util.ArrayList;
import model.NSX;
import model.Sanpham;
import repo.repoNSX;
import repo.repoSanpham;
import repoimpl.repoSanphammpl;

/**
 *
 * @author User
 */
public class serviceSanphamimpl implements serviceSanpham{
    repoSanpham reposanpham = new repoSanphammpl();

    @Override
    public ArrayList<Sanpham> getall() {
        return reposanpham.getall();
    }

    @Override
    public String insert(Sanpham sp) {
        boolean insert = reposanpham.insert(sp);
        if(insert == true){
            return "Thanh cong!";
        }else{
            return "That bai!";
        }
    }

    @Override
    public String update(Sanpham sp, String ma) {
        boolean update = reposanpham.update(sp, ma);
        if(update == true){
            return "thanh cong!";
        }else{
            return "thai bai";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = reposanpham.delete(ma);
        if(delete == true){
            return "Thanh cong!";
        }else{
            return "That bai!";
        }
    }
}
