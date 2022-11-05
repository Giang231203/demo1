/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.CuaHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface ICuaHangRepo {
    ArrayList<CuaHang> all();
    CuaHang insert(CuaHang ch);
    CuaHang update(CuaHang ch,String id);
    String delete(String id);
}
