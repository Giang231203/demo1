/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IKhachHangRepo {
    ArrayList<KhachHang> all();
    KhachHang insert(KhachHang kh);
    KhachHang update(KhachHang kh,String Id);
    String delete(String id);
}
