/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tt
 */
public class NhanVien {
    
    private String Ma;
    private String Ten;
    private String GioiTinh;
    private String DiaChi;

    public NhanVien() {
    }

    public NhanVien(String Ma, String Ten, String GioiTinh, String DiaChi) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    
    
}
