/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IMauSacRepo {
    ArrayList<MauSac> all();
    MauSac insert(MauSac ms);
    MauSac update(MauSac ms,String id);
    String delete(String id);
}
