/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlGioHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IGioHangService {
    ArrayList<QlGioHang> getList();
    QlGioHang insert(QlGioHang qlgh);
    QlGioHang update(QlGioHang qlgh,String Id);
    String delete(String Id);
}
