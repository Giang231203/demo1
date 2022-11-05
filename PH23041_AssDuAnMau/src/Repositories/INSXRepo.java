/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.NhaSanXuat;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface INSXRepo {
    ArrayList<NhaSanXuat> all();
    NhaSanXuat insert(NhaSanXuat nsx);
    NhaSanXuat update(NhaSanXuat nsx,String id);
    String delete(String id);
}
