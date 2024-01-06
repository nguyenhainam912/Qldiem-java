/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class LopBienChe {

    private int id;
    private String ten_lop;
    private int id_giangvien;

    public LopBienChe() {
    }

    public LopBienChe(int id, String ten_lop, int id_giangvien) {
        this.id = id;
        this.ten_lop = ten_lop;
        this.id_giangvien = id_giangvien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen_lop() {
        return ten_lop;
    }

    public void setTen_lop(String ten_lop) {
        this.ten_lop = ten_lop;
    }

    public int getId_giangvien() {
        return id_giangvien;
    }

    public void setId_giangvien(int id_giangvien) {
        this.id_giangvien = id_giangvien;
    }

}
