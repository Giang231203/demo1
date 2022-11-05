/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Asus
 */
public class QuanLyDongSanPham {

    private String id;
    private String maDongSanPham;
    private String tenDongSanPham;

    public QuanLyDongSanPham() {
    }

    public QuanLyDongSanPham(String maDongSanPham, String tenDongSanPham) {
        this.maDongSanPham = maDongSanPham;
        this.tenDongSanPham = tenDongSanPham;
    }

    public QuanLyDongSanPham(String id, String maDongSanPham, String tenDongSanPham) {
        this.id = id;
        this.maDongSanPham = maDongSanPham;
        this.tenDongSanPham = tenDongSanPham;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaDongSanPham() {
        return maDongSanPham;
    }

    public void setMaDongSanPham(String maDongSanPham) {
        this.maDongSanPham = maDongSanPham;
    }

    public String getTenDongSanPham() {
        return tenDongSanPham;
    }

    public void setTenDongSanPham(String tenDongSanPham) {
        this.tenDongSanPham = tenDongSanPham;
    }

    public Object[] arriveData() {
        return new Object[]{id, maDongSanPham, tenDongSanPham};
    }
}
