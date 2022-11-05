/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLMauSac;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IMauSacService {
     ArrayList<QLMauSac> getList();
     QLMauSac insert(QLMauSac ms);
     QLMauSac update(QLMauSac ms,String id);
     String delete(String id);
}
