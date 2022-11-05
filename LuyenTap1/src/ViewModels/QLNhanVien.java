/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;



/**
 *
 * @author tt
 */
public class QLNhanVien {
    private String Ma;
    private String Ten;
    private String TenDem;
    private String Ho;
    private String HoVaTen;
    private String GioiTinh;
    private String Sdt;
    public String HoTen(){
        String hotennv = Ho+" "+TenDem+" "+Ten;
        return hotennv;
    }
    public QLNhanVien() {
    }

    public QLNhanVien(String Ma, String Ten, String TenDem, String Ho, String HoVaTen, String GioiTinh, String Sdt) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.Ho = Ho;
        this.HoVaTen = HoVaTen;
        this.GioiTinh = GioiTinh;
        this.Sdt = Sdt;
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

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    
    
    
}
