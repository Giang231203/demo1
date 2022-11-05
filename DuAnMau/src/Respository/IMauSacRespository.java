/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Respository;

import DomainModel.MauSac;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IMauSacRespository {

    List<MauSac> getAll();

    MauSac add(MauSac ms);

    boolean delete(String ma);

    MauSac update(MauSac ms,String ma);
}
