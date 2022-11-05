/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLSanPham;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface ISanPhamService {
    ArrayList<QLSanPham> getList();
    QLSanPham insert(QLSanPham qlsp);
    QLSanPham update(QLSanPham qlsp,String id);
    String delete(String id);
}
