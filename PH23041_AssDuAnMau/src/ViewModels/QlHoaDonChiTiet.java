/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.math.BigDecimal;

/**
 *
 * @author tt
 */
public class QlHoaDonChiTiet {
    private String IdHoaDon;
    private String IdChiTietSP;
    private int SoLuong;
    private BigDecimal DonGia;

    public QlHoaDonChiTiet() {
    }

    public QlHoaDonChiTiet(String IdHoaDon, String IdChiTietSP, int SoLuong, BigDecimal DonGia) {
        this.IdHoaDon = IdHoaDon;
        this.IdChiTietSP = IdChiTietSP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(String IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
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
}
