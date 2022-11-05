/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.SanPham;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface ISanPhamRepo {
    ArrayList<SanPham> all();
    SanPham insert(SanPham sp);
    SanPham update(SanPham sp,String id);
    String delete(String id);
}
