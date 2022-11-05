/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Chitietsp;
import repo.repoChitietsanpham;

/**
 *
 * @author User
 */
public interface serviceChitietsanpham {

    ArrayList<Chitietsp> getall();

    String insert(Chitietsp ctsp);

    String update(Chitietsp ctsp, String id);

    String delete(String id);

}
