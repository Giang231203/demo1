/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author homna
 */
public class NhanVien {
    private String maNv;
    private String tenNV;
    private boolean gioiTinh;
    private int namSinh;
    private String chucVu;
    private int soGioLam;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNv, String tenNV, boolean gioiTinh, int namSinh, String chucVu, int soGioLam, double luong) {
        this.maNv = maNv;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chucVu = chucVu;
        this.soGioLam = soGioLam;
        this.luong = luong;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public String hienThiGioiTinh() {
        if (gioiTinh) {
            return "Nam";
        }
        return "Nữ";
    }
    
}
