/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_012_oop;

/**
 *
 * @author FPT
 */
public class PhuongTien {
    protected String soKhung;
    protected String nhanHieu;
    protected double giaBan;

    public PhuongTien() {
    }

    public PhuongTien(String soKhung, String nhanHieu, double giaBan) {
        this.soKhung = soKhung;
        this.nhanHieu = nhanHieu;
        this.giaBan = giaBan;
    }

    public String getSoKhung() {
        return soKhung;
    }

    public void setSoKhung(String soKhung) {
        this.soKhung = soKhung;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public String hienThiThongTin(){
        return "Số Khung: " + soKhung
                + ", Nhãn Hiệu: " + nhanHieu
                + ", Giá Bán: " + giaBan;
    }
}
