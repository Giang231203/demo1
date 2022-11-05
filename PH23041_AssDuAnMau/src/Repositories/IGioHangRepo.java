/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.GioHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IGioHangRepo {
    ArrayList<GioHang> all();
    GioHang insert(GioHang gh);
    GioHang update(GioHang gh,String Id);
    String delete(String id);
}
