package lesson5;

/**
 *
 * @author dell
 */
public class Product {
    private int ID;
    private String tenSP;
    private String mauSac;
    private int soLuong;
    private double donGia;
    private int danhMuc;

    public Product() {
    }

    public Product(int ID, String tenSP,  int soLuong, double donGia,String mauSac, int danhMuc) {
        this.ID = ID;
        this.tenSP = tenSP;
        this.mauSac = mauSac;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.danhMuc = danhMuc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(int danhMuc) {
        this.danhMuc = danhMuc;
    }
    
    
}
