/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Mausac;

import repo.repoMausac;

/**
 *
 * @author User
 */
public interface serviceMausac {

    ArrayList<Mausac> getall();

    String insert(Mausac ms);

    String update(Mausac ms, String ma);

    String delete(String ma);
}
