/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productdemo;

/**
 *
 * @author homna
 */
public class Product {
    private int id;
    private int soLuong;
    private String tenSp;
    private double donGia;
    private String mauSac;
    private int danhMuc;

    public Product() {
    }

    public Product(int id, int soLuong, String tenSp, double donGia, String mauSac, int danhMuc) {
        this.id = id;
        this.soLuong = soLuong;
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.mauSac = mauSac;
        this.danhMuc = danhMuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(int danhMuc) {
        this.danhMuc = danhMuc;
    }

    
    
    
}
