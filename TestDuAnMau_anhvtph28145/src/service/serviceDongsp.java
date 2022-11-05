/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Dongsp;
import repo.repodongsp;

/**
 *
 * @author User
 */
public interface serviceDongsp {

    ArrayList<Dongsp> getall();

    String insert(Dongsp sp);

    String update(Dongsp sp, String ma );

    String delete(String ma);

}
