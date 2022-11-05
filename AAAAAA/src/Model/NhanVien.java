
package Model;

import java.io.Serializable;


public class NhanVien implements Serializable{
    private String maNv;
    private String tenNV;
    private boolean gioiTinh;
    private int namSinh;
    private String chucVu;
    private double soGioLam;
    private double luong;
    private String anh;

    public NhanVien() {
    }

    public NhanVien(String maNv, String tenNV, boolean gioiTinh, int namSinh, String chucVu, double soGioLam, double luong, String anh) {
        this.maNv = maNv;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chucVu = chucVu;
        this.soGioLam = soGioLam;
        this.luong = luong;
        this.anh = anh;
    }

    

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    
    
    
    public String hienThiGioiTinh() {
        if (gioiTinh) {
            return "Nam";
        }
        return "Nữ";
    }
    
    public double luongTb(String chucvu,double soGio, double luongGoc1){
    double luonggoc = 0;
    double luongtang = 0;
    double luongnv = 0;
    luonggoc = soGio * luongGoc1;
        if (chucvu.equals("Trưởng phòng") && soGio < 180) {
            luongtang = luonggoc * 0.15;
            luongnv = luonggoc + luongtang;
            return luongnv;
        } 
        
        if (chucvu.equals("Trưởng phòng") && soGio > 180) {
            luongtang = luonggoc * 0.25;
            luongnv = luonggoc + luongtang;
            return luongnv;
        }
        
        if (soGio > 180) {
            luongtang = luonggoc * 0.10;
            luongnv = luonggoc + luongtang;
            return luongnv;
        }
        
        return luonggoc;
               
    }
        
    
}
