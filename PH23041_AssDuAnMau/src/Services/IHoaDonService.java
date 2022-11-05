/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlHoaDon;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IHoaDonService {
    ArrayList<QlHoaDon> getList();
    QlHoaDon insert(QlHoaDon qlhd);
    QlHoaDon update(QlHoaDon qlhd,String id);
    String delete(String id);
}
