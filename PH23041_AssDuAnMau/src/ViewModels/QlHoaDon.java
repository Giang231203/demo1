/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.sql.Date;

/**
 *
 * @author tt
 */
public class QlHoaDon {
    private String Id;
    private String IdKH;
    private String IdNV;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private Date NgayShip;
    private Date NgayNhan;
    private int TinhTrang;
    private String TenNguoiNhan;
    private String DiaChi;
    private String Sdt;
    public String trangthai(){
        if(TinhTrang==0){
            return "Da Thanh Toan";
        }
        return "Chua Thanh Toan";
    }
    public QlHoaDon() {
    }

    public QlHoaDon(String Id, String IdKH, String IdNV, String Ma, Date NgayTao, Date NgayThanhToan, Date NgayShip, Date NgayNhan, int TinhTrang, String TenNguoiNhan, String DiaChi, String Sdt) {
        this.Id = Id;
        this.IdKH = IdKH;
        this.IdNV = IdNV;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.NgayShip = NgayShip;
        this.NgayNhan = NgayNhan;
        this.TinhTrang = TinhTrang;
        this.TenNguoiNhan = TenNguoiNhan;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdKH() {
        return IdKH;
    }

    public void setIdKH(String IdKH) {
        this.IdKH = IdKH;
    }

    public String getIdNV() {
        return IdNV;
    }

    public void setIdNV(String IdNV) {
        this.IdNV = IdNV;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public Date getNgayShip() {
        return NgayShip;
    }

    public void setNgayShip(Date NgayShip) {
        this.NgayShip = NgayShip;
    }

    public Date getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(Date NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
}
