/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

public class LopHocPhan {

    public static void create(LopHocPhan sv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int id;
    private String ten;
    private int id_giangvien;
    private Date ngay_bat_dau;
    private Date ngay_ket_thuc;
    private Date ngay_thi;

    public LopHocPhan() {
    }

    public LopHocPhan(int id, String ten, int id_giangvien, Date ngay_bat_dau, Date ngay_ket_thuc, Date ngay_thi) {
        this.id = id;
        this.ten = ten;
        this.id_giangvien = id_giangvien;
        this.ngay_bat_dau = ngay_bat_dau;
        this.ngay_ket_thuc = ngay_ket_thuc;
        this.ngay_thi = ngay_thi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId_giangvien() {
        return id_giangvien;
    }

    public void setId_giangvien(int id_giangvien) {
        this.id_giangvien = id_giangvien;
    }

    public Date getNgay_bat_dau() {
        return ngay_bat_dau;
    }

    public void setNgay_bat_dau(Date ngay_bat_dau) {
        this.ngay_bat_dau = ngay_bat_dau;
    }

    public Date getNgay_ket_thuc() {
        return ngay_ket_thuc;
    }

    public void setNgay_ket_thuc(Date ngay_ket_thuc) {
        this.ngay_ket_thuc = ngay_ket_thuc;
    }

    public Date getNgay_thi() {
        return ngay_thi;
    }

    public void setNgay_thi(Date ngay_thi) {
        this.ngay_thi = ngay_thi;
    }

}
