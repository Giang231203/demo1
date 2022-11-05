/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

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
public interface serviceSanpham {

    ArrayList<Sanpham> getall();

    String insert(Sanpham sp);

    String update(Sanpham sp, String ma);

    String delete(String ma);

}
