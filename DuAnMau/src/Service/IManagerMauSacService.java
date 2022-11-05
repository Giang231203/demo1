/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.MauSac;
import ViewModel.QuanLyMauSac;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IManagerMauSacService {

    List<QuanLyMauSac> getAll();

    QuanLyMauSac add(QuanLyMauSac ms);

    String delete(String ma);

    QuanLyMauSac update(QuanLyMauSac qlMauSac,String ma);
}
