package model;

public class LophocphanSinhvien {

    private int id;
    private int id_sinhvien;
    private int id_lophocphan;

    public LophocphanSinhvien() {
    }

    public LophocphanSinhvien(int id, int id_sinhvien, int id_lophocphan) {
        this.id = id;
        this.id_sinhvien = id_sinhvien;
        this.id_lophocphan = id_lophocphan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_sinhvien() {
        return id_sinhvien;
    }

    public void setId_sinhvien(int id_sinhvien) {
        this.id_sinhvien = id_sinhvien;
    }

    public int getId_lophocphan() {
        return id_lophocphan;
    }

    public void setId_lophocphan(int id_lophocphan) {
        this.id_lophocphan = id_lophocphan;
    }

}
