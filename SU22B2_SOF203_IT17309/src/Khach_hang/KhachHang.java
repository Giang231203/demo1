/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khach_hang;

/**
 *
 * @author tt
 */
public class KhachHang {
    private int id;
    private String ten;
    private String dia_chi;
    private String email;
    private int tuoi;
    private int gioi_tinh;
    public String GioiTinh(){
        if(gioi_tinh==1){
            return "Nam";
        }
        return "Nu";
    }
    public KhachHang() {
    }

    public KhachHang(int id, String ten, String dia_chi, String email, int tuoi, int gioi_tinh) {
        this.id = id;
        this.ten = ten;
        this.dia_chi = dia_chi;
        this.email = email;
        this.tuoi = tuoi;
        this.gioi_tinh = gioi_tinh;
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

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(int gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }
    
}
