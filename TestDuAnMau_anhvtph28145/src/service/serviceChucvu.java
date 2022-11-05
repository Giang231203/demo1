/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Chucvu;
import repo.repoChucvu;

/**
 *
 * @author User
 */
public interface serviceChucvu {

    ArrayList<Chucvu> getall();

    String insert(Chucvu sp);

    String update(Chucvu sp, String ma);

    String delete(String id);
}
