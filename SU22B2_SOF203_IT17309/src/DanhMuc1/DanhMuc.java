/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhMuc1;

/**
 *
 * @author tt
 */
public class DanhMuc {
    private int id;
    private String ten;
    private String mo_ta;
    private int trang_thai;

    public DanhMuc() {
    }

    public DanhMuc(int id, String ten, String mo_ta, int trang_thai) {
        this.id = id;
        this.ten = ten;
        this.mo_ta = mo_ta;
        this.trang_thai = trang_thai;
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

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public int getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(int trang_thai) {
        this.trang_thai = trang_thai;
    }
    
}
