/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author tt
 */
public class Diem {
    private int MaSV;
    private String HoTen;
    private int TiengAnh;
    private int TinHoc;
    private int GDTC;
    private int DiemTB;

    public Diem() {
    }

    public Diem(int MaSV, String HoTen, int TiengAnh, int TinHoc, int GDTC, int DiemTB) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.TiengAnh = TiengAnh;
        this.TinHoc = TinHoc;
        this.GDTC = GDTC;
        this.DiemTB = DiemTB;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(int TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public int getTinHoc() {
        return TinHoc;
    }

    public void setTinHoc(int TinHoc) {
        this.TinHoc = TinHoc;
    }

    public int getGDTC() {
        return GDTC;
    }

    public void setGDTC(int GDTC) {
        this.GDTC = GDTC;
    }

    public int getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(int DiemTB) {
        this.DiemTB = DiemTB;
    }
    
}
