/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.HoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IHoaDonChiTietRepo {
    ArrayList<HoaDonChiTiet> all();
    HoaDonChiTiet insert(HoaDonChiTiet hdct);
}
