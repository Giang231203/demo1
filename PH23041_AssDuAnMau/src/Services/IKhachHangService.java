/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLKhachHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IKhachHangService {
    ArrayList<QLKhachHang> getList();
    QLKhachHang insert(QLKhachHang k);
    QLKhachHang update(QLKhachHang k,String Id);
    String delete(String id);
}
