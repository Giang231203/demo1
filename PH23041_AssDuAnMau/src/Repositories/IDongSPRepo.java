/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.DongSanPham;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IDongSPRepo {
    ArrayList<DongSanPham> all();
    DongSanPham insert(DongSanPham dsp);
    DongSanPham update(DongSanPham dsp,String id);
    String delete(String id);
}
