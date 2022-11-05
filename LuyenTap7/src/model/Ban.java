/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tt
 */
public class Ban {
    private String Ma;
    private String Ten;
    private String SoThich;
    private int GioiTinh;
    public String gioiTinh(){
        if(GioiTinh==1){
            return "Nu";
        }
        return "Nam";
    }
    public Ban() {
    }

    public Ban(String Ma, String Ten, String SoThich, int GioiTinh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.SoThich = SoThich;
        this.GioiTinh = GioiTinh;
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

    public String getSoThich() {
        return SoThich;
    }

    public void setSoThich(String SoThich) {
        this.SoThich = SoThich;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
}
