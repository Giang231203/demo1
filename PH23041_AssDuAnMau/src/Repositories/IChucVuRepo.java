/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IChucVuRepo {
    ArrayList<ChucVu> all();
    ChucVu insert(ChucVu cv);
    ChucVu update(ChucVu cv,String id);
    String delete(String id);
}
