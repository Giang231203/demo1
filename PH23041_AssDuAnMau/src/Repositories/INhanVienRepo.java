/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface INhanVienRepo {
    ArrayList<NhanVien> all();
    NhanVien insert(NhanVien nv);
    NhanVien update(NhanVien nv, String id);
    String delete(String id);
}
