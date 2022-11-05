/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Chitietsp {

    private String id;
    private String idsp;
    private String idnsx;
    private String idmausac;
    private String iddongsp;
    private int nambh;
    private String mota;
    private int soluongton;
    private double gianhap;
    private double giaban;

    public Chitietsp(String id, String idsp, String idnsx, String idmausac, String iddongsp, int nambh, String mota, int soluongton, double gianhap, double giaban) {
        this.id = id;
        this.idsp = idsp;
        this.idnsx = idnsx;
        this.idmausac = idmausac;
        this.iddongsp = iddongsp;
        this.nambh = nambh;
        this.mota = mota;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public Chitietsp() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getIdnsx() {
        return idnsx;
    }

    public void setIdnsx(String idnsx) {
        this.idnsx = idnsx;
    }

    public String getIdmausac() {
        return idmausac;
    }

    public void setIdmausac(String idmausac) {
        this.idmausac = idmausac;
    }

    public String getIddongsp() {
        return iddongsp;
    }

    public void setIddongsp(String iddongsp) {
        this.iddongsp = iddongsp;
    }

    public int getNambh() {
        return nambh;
    }

    public void setNambh(int nambh) {
        this.nambh = nambh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(int soluongton) {
        this.soluongton = soluongton;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

}
