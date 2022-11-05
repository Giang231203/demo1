/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.awt.event.FocusEvent;
import java.util.ArrayList;
import model.Cuahang;
import repo.repoCuahnag;

/**
 *
 * @author User
 */
public interface serviceCuahang {

    ArrayList<Cuahang> getall();

    String insert(Cuahang ch);

    String update(Cuahang ch, String ma);

    String delete(String ma);
}
