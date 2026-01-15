/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_012_oop;

/**
 *
 * @author FPT
 */
public class XeMay extends PhuongTien{
    private String dungTichBinhXang;
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String dungTichBinhXang, String congSuat, String soKhung, String nhanHieu, double giaBan) {
        super(soKhung, nhanHieu, giaBan);
        this.dungTichBinhXang = dungTichBinhXang;
        this.congSuat = congSuat;
    }

    public String getDungTichBinhXang() {
        return dungTichBinhXang;
    }

    public void setDungTichBinhXang(String dungTichBinhXang) {
        this.dungTichBinhXang = dungTichBinhXang;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String hienThiThongTin() {
        return super.hienThiThongTin() + ", Dung Tích Bình Xăng: " + dungTichBinhXang + ", Công Suất: " + congSuat + "(XE MÁY)"; 
    }
    
}
