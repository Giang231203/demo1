/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLGioHangChiTiet;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IGioHangChiTietService {
    ArrayList<QLGioHangChiTiet> getList();
    QLGioHangChiTiet insert(QLGioHangChiTiet qlghct);
}
