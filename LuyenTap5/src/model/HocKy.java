/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tt
 */
public class HocKy {
    private int id;
    private String ten;
    private String co_so;
    private int so_sv_nhap_hoc;

    public HocKy() {
    }

    public HocKy(int id, String ten, String co_so, int so_sv_nhap_hoc) {
        this.id = id;
        this.ten = ten;
        this.co_so = co_so;
        this.so_sv_nhap_hoc = so_sv_nhap_hoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCo_so() {
        return co_so;
    }

    public void setCo_so(String co_so) {
        this.co_so = co_so;
    }

    public int getSo_sv_nhap_hoc() {
        return so_sv_nhap_hoc;
    }

    public void setSo_sv_nhap_hoc(int so_sv_nhap_hoc) {
        this.so_sv_nhap_hoc = so_sv_nhap_hoc;
    }
    
}
