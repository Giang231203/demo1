/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author tt
 */
public class SinhVien {
    private int maSV;
    private String HoTen;
    private String email;
    private String soDT;
    private boolean GioiTinh;
    private String diaChi;
    private String hinhAnh;

    public SinhVien() {
    }

    public SinhVien(int maSV, String HoTen, String email, String soDT, boolean GioiTinh, String diaChi, String hinhAnh) {
        this.maSV = maSV;
        this.HoTen = HoTen;
        this.email = email;
        this.soDT = soDT;
        this.GioiTinh = GioiTinh;
        this.diaChi = diaChi;
        this.hinhAnh = hinhAnh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    public String hienThiGioiTinh() {
        if (GioiTinh) {
            return "Nam";
        }
        return "Nữ";
    }
    
}
