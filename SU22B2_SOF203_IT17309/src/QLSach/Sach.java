/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

/**
 *
 * @author tt
 */
public class Sach {
    private int id;
    private String ten;
    private int so_luong;
    private float don_gia;
    private int tac_gia_id;

    public Sach() {
    }

    public Sach(int id, String ten, int so_luong, float don_gia, int tac_gia_id) {
        this.id = id;
        this.ten = ten;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.tac_gia_id = tac_gia_id;
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

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public float getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(float don_gia) {
        this.don_gia = don_gia;
    }

    public int getTac_gia_id() {
        return tac_gia_id;
    }

    public void setTac_gia_id(int tac_gia_id) {
        this.tac_gia_id = tac_gia_id;
    }
    
}
