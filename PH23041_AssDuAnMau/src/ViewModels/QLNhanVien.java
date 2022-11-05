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
public class QLNhanVien {
    private String Id;
    private String Ma;
    private String Ten;
    private String TenDem;
    private String Ho;
    private String GioiTinh;
    private Date NgaySinh;
    private String DiaChi;
    private String Sdt;
    private String MatKhau;
    private String idCH;
    private String idCV;
    private String idGBC;
    private int TrangThai;
    
    public QLNhanVien() {
    }
    
    public QLNhanVien(String Id, String Ma, String Ten, String TenDem, String Ho, String GioiTinh, Date NgaySinh, String DiaChi, String Sdt, String MatKhau, String idCH, String idCV, String idGBC, int TrangThai) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.Ho = Ho;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.MatKhau = MatKhau;
        this.idCH = idCH;
        this.idCV = idCV;
        this.idGBC = idGBC;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
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

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getIdCH() {
        return idCH;
    }

    public void setIdCH(String idCH) {
        this.idCH = idCH;
    }

    public String getIdCV() {
        return idCV;
    }

    public void setIdCV(String idCV) {
        this.idCV = idCV;
    }

    public String getIdGBC() {
        return idGBC;
    }

    public void setIdGBC(String idGBC) {
        this.idGBC = idGBC;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    public String trangThai1(){
        if(TrangThai==0){
            return "Con lien lac";
        }else{
            return "Khong con lien lac";
        }
    }
}
