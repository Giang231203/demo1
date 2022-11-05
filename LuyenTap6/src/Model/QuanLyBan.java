/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author tt
 */
public class QuanLyBan {
	private String Ma;
	private String Ten;
	private Date NgaySinh;
        private String SoThich;
        private int LienLac;

       public String ConLienLac(){
           if(LienLac==1){
               return "Khong";
           }
           return "Con";
       }
    public QuanLyBan() {
    }

    public QuanLyBan(String Ma, String Ten, Date NgaySinh, String SoThich, int LienLac) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.SoThich = SoThich;
        this.LienLac = LienLac;
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

    public int getLienLac() {
        return LienLac;
    }

    public void setLienLac(int LienLac) {
        this.LienLac = LienLac;
    }
        
}
