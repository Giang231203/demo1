/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomenModel;

import java.math.BigDecimal;

/**
 *
 * @author tt
 */
public class ChiTietSanPham {
    private String iD;
    private String idSP;
    private String idNSX;
    private String IDMauSac;
    private String idDongSP;
    private int NamBH;
    private String MoTa;
    private int SoLuongTon;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String iD, String idSP, String idNSX, String IDMauSac, String idDongSP, int NamBH, String MoTa, int SoLuongTon, BigDecimal GiaNhap, BigDecimal GiaBan) {
        this.iD = iD;
        this.idSP = idSP;
        this.idNSX = idNSX;
        this.IDMauSac = IDMauSac;
        this.idDongSP = idDongSP;
        this.NamBH = NamBH;
        this.MoTa = MoTa;
        this.SoLuongTon = SoLuongTon;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIDMauSac() {
        return IDMauSac;
    }

    public void setIDMauSac(String IDMauSac) {
        this.IDMauSac = IDMauSac;
    }

    public String getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(String idDongSP) {
        this.idDongSP = idDongSP;
    }

    public int getNamBH() {
        return NamBH;
    }

    public void setNamBH(int NamBH) {
        this.NamBH = NamBH;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(BigDecimal GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }
    
}
