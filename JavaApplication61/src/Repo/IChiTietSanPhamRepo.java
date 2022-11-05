/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repo;

import DomenModel.ChiTietSanPham;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IChiTietSanPhamRepo {

    ArrayList<ChiTietSanPham> all();

    ChiTietSanPham insert(ChiTietSanPham ctsp);

    ChiTietSanPham update(ChiTietSanPham ctsp, String id);

    String delete(String id);
    ArrayList<ChiTietSanPham> findata(int NamBH);
}
