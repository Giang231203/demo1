/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLNhaSanXuat;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface INSXService {
    ArrayList<QLNhaSanXuat> getList();
    QLNhaSanXuat insert(QLNhaSanXuat nsx);
    QLNhaSanXuat update(QLNhaSanXuat nsx,String id);
    String delete(String id);
}
