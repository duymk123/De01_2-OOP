/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_012_oop;

/**
 *
 * @author FPT
 */
public class Oto extends PhuongTien{
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto() {
    }

    public Oto(int soChoNgoi, String kieuDongCo, String soKhung, String nhanHieu, double giaBan) {
        super(soKhung, nhanHieu, giaBan);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String hienThiThongTin() {
        return super.hienThiThongTin() + ", Số Chỗ Ngồi: " + soChoNgoi + ", Kiểu Động Cơ: " + kieuDongCo + "(Ô TÔ)"; 
    }
    
}
