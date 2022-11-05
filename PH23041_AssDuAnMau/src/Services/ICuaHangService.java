/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLCuaHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface ICuaHangService {
    ArrayList<QLCuaHang> getList();
    QLCuaHang add(QLCuaHang cuaHang);
    String delete(String id);
    QLCuaHang update(QLCuaHang ch,String id);
}
