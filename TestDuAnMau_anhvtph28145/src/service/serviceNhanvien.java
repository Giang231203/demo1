/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Chucvu;
import model.Nhanvien;
import repo.repoNhanvien;

/**
 *
 * @author User
 */
public interface serviceNhanvien {

    ArrayList<Nhanvien> getall();

    String insert(Nhanvien nv);

    String update(Nhanvien nv, String ma);

    String delete(String id);
}
