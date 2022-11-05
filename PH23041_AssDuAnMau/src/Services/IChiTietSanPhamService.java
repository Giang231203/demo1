/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLChiTietSanPham;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IChiTietSanPhamService {
    ArrayList<QLChiTietSanPham> getList();
    QLChiTietSanPham insert(QLChiTietSanPham c);
    QLChiTietSanPham update(QLChiTietSanPham c,String id);
    String delete(String id);
}
