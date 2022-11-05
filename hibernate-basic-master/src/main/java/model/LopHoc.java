/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author nguyenvv
 */
@Entity
@Table(name = "lophoc")
public class LopHoc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_lop")
    private Integer maLop;

    @Column(name = "ten_lop")
    private String tenLop;

    @OneToMany(mappedBy = "lopHoc", fetch = FetchType.LAZY)
    private List<SinhVien> listSinhVien;

    public LopHoc() {
    }

    public LopHoc(Integer maLop, String tenLop, List<SinhVien> listSinhVien) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.listSinhVien = listSinhVien;
    }

    public Integer getMaLop() {
        return maLop;
    }

    public void setMaLop(Integer maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public void setListSinhVien(List<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }

    @Override
    public String toString() {
        return tenLop;
    }

}
