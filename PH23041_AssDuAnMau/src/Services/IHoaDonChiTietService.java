/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlHoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IHoaDonChiTietService {
    ArrayList<QlHoaDonChiTiet> getList();
    QlHoaDonChiTiet insert(QlHoaDonChiTiet qlhdct);
}
