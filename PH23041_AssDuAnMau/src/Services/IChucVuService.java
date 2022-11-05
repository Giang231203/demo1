/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLChucVu;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IChucVuService {
    ArrayList<QLChucVu> getList();
    QLChucVu add(QLChucVu chucvu);
    String delete(String id);
    QLChucVu update(QLChucVu ql,String id);
}
