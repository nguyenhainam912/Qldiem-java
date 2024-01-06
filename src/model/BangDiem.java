/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class BangDiem {

    private int id;
    private double diem_chuyen_can;
    private double diem_thi;
    private Date ngay_thi;
    private int id_sinhvien;
    private int id_hocphan;

    public BangDiem() {
    }

    public BangDiem(int id, double diem_chuyen_can, double diem_thi, Date ngay_thi, int id_sinhvien, int id_hocphan) {
        this.id = id;
        this.diem_chuyen_can = diem_chuyen_can;
        this.diem_thi = diem_thi;
        this.ngay_thi = ngay_thi;
        this.id_sinhvien = id_sinhvien;
        this.id_hocphan = id_hocphan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiem_chuyen_can() {
        return diem_chuyen_can;
    }

    public void setDiem_chuyen_can(double diem_chuyen_can) {
        this.diem_chuyen_can = diem_chuyen_can;
    }

    public double getDiem_thi() {
        return diem_thi;
    }

    public void setDiem_thi(double diem_thi) {
        this.diem_thi = diem_thi;
    }

    public Date getNgay_thi() {
        return ngay_thi;
    }

    public void setNgay_thi(Date ngay_thi) {
        this.ngay_thi = ngay_thi;
    }

    public int getId_sinhvien() {
        return id_sinhvien;
    }

    public void setId_sinhvien(int id_sinhvien) {
        this.id_sinhvien = id_sinhvien;
    }

    public int getId_hocphan() {
        return id_hocphan;
    }

    public void setId_hocphan(int id_hocphan) {
        this.id_hocphan = id_hocphan;
    }

}
