/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IHoaDonRepo {
    ArrayList<HoaDon> all();
    HoaDon insert(HoaDon hd);
    HoaDon update(HoaDon hd,String id);
    String Delete(String id);
}
