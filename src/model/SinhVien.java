package model;

import java.math.BigDecimal;
import java.sql.Date;

public class SinhVien {

    private int id;
    private String ten;
    private Date ngay_sinh;
    private String gioi_tinh;
    private String sđt;
    private String email;
    private String dia_chi;
    private BigDecimal  gpa;
    private int id_lopbienche;

    public SinhVien() {
    }

    public SinhVien(int id, String ten, Date ngay_sinh, String gioi_tinh, String sđt, String email, String dia_chi, BigDecimal gpa, int id_lopbienche) {
        this.id = id;
        this.ten = ten;
        this.ngay_sinh = ngay_sinh;
        this.gioi_tinh = gioi_tinh;
        this.sđt = sđt;
        this.email = email;
        this.dia_chi = dia_chi;
        this.gpa = gpa;
        this.id_lopbienche = id_lopbienche;
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

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getSđt() {
        return sđt;
    }

    public void setSđt(String sđt) {
        this.sđt = sđt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public BigDecimal getGpa() {
        return gpa;
    }

    public void setGpa(BigDecimal gpa) {
        this.gpa = gpa;
    }

    public int getId_lopbienche() {
        return id_lopbienche;
    }

    public void setId_lopbienche(int id_lopbienche) {
        this.id_lopbienche = id_lopbienche;
    }

}
