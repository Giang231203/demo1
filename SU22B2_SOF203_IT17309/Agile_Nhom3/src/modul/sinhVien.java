package modul;

import java.io.Serializable;

/**
 *
 * @author KenTiz
 */
public class sinhVien implements Serializable {

    private String maSv;
    private String name;
    private double diemToan, diemVan, diemAnh;

    public sinhVien() {

    }

    public sinhVien(String maSv, String name, double diemToan, double diemVan, double diemAnh) {
        this.maSv = maSv;
        this.name = name;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getDiemTB() {
        return Math.round((diemAnh + diemToan + diemVan) / 3 * 100.0) / 100.0;
    }

    public String getHocLuc() {
        if (getDiemTB() >= 9) {
            return "Xuất Sắc";
        } else if (getDiemTB() >= 8) {
            return "Giỏi";
        } else if (getDiemTB() >= 6.5) {
            return "Khá";
        } else if (getDiemTB() >= 4.5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    @Override
    public String toString() {
        return "sinhVien{" + "maSv=" + maSv + ", name=" + name + ", diemToan=" + diemToan + ", diemVan=" + diemVan + ", diemAnh=" + diemAnh + ", diemTB=" + getDiemTB() + ", hocLuc=" + getHocLuc() + "}";
    }

}
