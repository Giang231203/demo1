
package model;

import java.util.Date;

public class Hoc_ky {
    private int id;
    private String ten;
    private String co_so;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int SoSv;

    public Hoc_ky() {
    }

    public Hoc_ky(int id, String ten, String co_so, Date ngayBatDau, Date ngayKetThuc, int SoSv) {
        this.id = id;
        this.ten = ten;
        this.co_so = co_so;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.SoSv = SoSv;
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

    public String getCo_so() {
        return co_so;
    }

    public void setCo_so(String co_so) {
        this.co_so = co_so;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getSoSv() {
        return SoSv;
    }

    public void setSoSv(int SoSv) {
        this.SoSv = SoSv;
    }
    
    
    
}
