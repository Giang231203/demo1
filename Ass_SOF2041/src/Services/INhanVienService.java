/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLNhanVien;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface INhanVienService {
    ArrayList<QLNhanVien> getList();
    QLNhanVien insert(QLNhanVien n);
    QLNhanVien update(QLNhanVien nv,String ma);
    String Delete(String ma);
    QLNhanVien findate(String ma);
}
