/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tt
 */
public class SinhVien {
    private int id ;
    private String ten;
    private String ma_nv;
    private String sdt;
    private int tuoi;
    private int vai_tro;
    public String VaiTro(){
        if(vai_tro==1){
            return "Quan ly";
        }
        return "Nhan vien";
    }
    public SinhVien() {
    }

    public SinhVien(int id, String ten, String ma_nv, String sdt, int tuoi, int vai_tro) {
        this.id = id;
        this.ten = ten;
        this.ma_nv = ma_nv;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.vai_tro = vai_tro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getVai_tro() {
        return vai_tro;
    }

    public void setVai_tro(int vai_tro) {
        this.vai_tro = vai_tro;
    }
    
}
