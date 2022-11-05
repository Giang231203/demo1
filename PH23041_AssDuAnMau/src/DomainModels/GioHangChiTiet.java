/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;

/**
 *
 * @author tt
 */
public class GioHangChiTiet {
    private String IdGioHang;
    private String IdChiTietSP;
    private int SoLuong;
    private BigDecimal DonGia;
    private BigDecimal DonGiaKhiGiam;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(String IdGioHang, String IdChiTietSP, int SoLuong, BigDecimal DonGia, BigDecimal DonGiaKhiGiam) {
        this.IdGioHang = IdGioHang;
        this.IdChiTietSP = IdChiTietSP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.DonGiaKhiGiam = DonGiaKhiGiam;
    }

    public String getIdGioHang() {
        return IdGioHang;
    }

    public void setIdGioHang(String IdGioHang) {
        this.IdGioHang = IdGioHang;
    }

    public String getIdChiTietSP() {
        return IdChiTietSP;
    }

    public void setIdChiTietSP(String IdChiTietSP) {
        this.IdChiTietSP = IdChiTietSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public BigDecimal getDonGiaKhiGiam() {
        return DonGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(BigDecimal DonGiaKhiGiam) {
        this.DonGiaKhiGiam = DonGiaKhiGiam;
    }
    
}
