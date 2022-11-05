/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.LopHoc;
import model.SinhVien;

/**
 *
 * @author nguyenvv
 */
public interface QuanLySinhVienService {
    
    ArrayList<SinhVien> getListSinhVien();
    
    ArrayList<LopHoc> getListLopHoc();
    
    String addSinhVien(SinhVien sinhVien);
}
