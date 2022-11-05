/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLDongSP;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IDongSPService {
    ArrayList<QLDongSP> getList();
    QLDongSP insert(QLDongSP dsp);
    QLDongSP update(QLDongSP dsp,String id);
    String delete(String id);
}
