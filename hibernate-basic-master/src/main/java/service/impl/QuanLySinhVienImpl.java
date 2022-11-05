/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.LopHoc;
import model.SinhVien;
import reopsitory.LopHocRepository;
import reopsitory.SinhVienRepository;
import service.QuanLySinhVienService;

/**
 *
 * @author nguyenvv
 */
public class QuanLySinhVienImpl implements QuanLySinhVienService {

    private SinhVienRepository sinhVienRepository = new SinhVienRepository();

    private LopHocRepository lopHocRepository = new LopHocRepository();

    @Override
    public ArrayList<SinhVien> getListSinhVien() {
        return sinhVienRepository.getList();
    }

    @Override
    public ArrayList<LopHoc> getListLopHoc() {
        return lopHocRepository.getList();
    }

    @Override
    public String addSinhVien(SinhVien sinhVien) {
        if (sinhVienRepository.add(sinhVien)) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

}
