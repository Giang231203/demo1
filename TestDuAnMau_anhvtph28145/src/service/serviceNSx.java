/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.NSX;
import repo.repoNSX;

/**
 *
 * @author User
 */
public interface serviceNSx {

    ArrayList<NSX> getall();

    String insert(NSX nsx);

    String update(NSX nsx, String ma);

    String delete(String ma);

}
