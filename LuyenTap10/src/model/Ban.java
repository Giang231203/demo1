/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author tt
 */
public class Ban {
    private String Ma;
    private String Ten;
    private Date NgaySinh;
    private String SoThich;
    private int TrangThai;
    public String lienlac(){
        if(TrangThai==1){
            return "Con";
        }
        return "Khong";
    }
    public Ban() {
    }

    public Ban(String Ma, String Ten, Date NgaySinh, String SoThich, int TrangThai) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.SoThich = SoThich;
        this.TrangThai = TrangThai;
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

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoThich() {
        return SoThich;
    }

    public void setSoThich(String SoThich) {
        this.SoThich = SoThich;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
