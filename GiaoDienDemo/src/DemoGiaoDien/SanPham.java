/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoGiaoDien;

/**
 *
 * @author tt
 */
public class SanPham {
    private int id;
    private String tenSp;
    private int SoLuong;
    private double gia;
    private String mau;
    private int danhMuc;

    public SanPham() {
    }

    public SanPham(int id, String tenSp, int SoLuong, double gia, String mau, int danhMuc) {
        this.id = id;
        this.tenSp = tenSp;
        this.SoLuong = SoLuong;
        this.gia = gia;
        this.mau = mau;
        this.danhMuc = danhMuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(int danhMuc) {
        this.danhMuc = danhMuc;
    }

   
    
}
