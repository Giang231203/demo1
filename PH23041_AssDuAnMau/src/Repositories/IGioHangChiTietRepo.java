/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.GioHangChiTiet;
import java.util.ArrayList;

/**
 *
 * @author tt
 */
public interface IGioHangChiTietRepo {
    ArrayList<GioHangChiTiet> all();
    GioHangChiTiet insert(GioHangChiTiet ghct);
}
