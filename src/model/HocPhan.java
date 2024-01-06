/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class HocPhan {

    private int id;
    private String ten_hocphan;
    private int so_tin_chi;

    public HocPhan() {
    }

    public HocPhan(int id, String ten_hocphan, int so_tin_chi) {
        this.id = id;
        this.ten_hocphan = ten_hocphan;
        this.so_tin_chi = so_tin_chi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen_hocphan() {
        return ten_hocphan;
    }

    public void setTen_hocphan(String ten_hocphan) {
        this.ten_hocphan = ten_hocphan;
    }

    public int getSo_tin_chi() {
        return so_tin_chi;
    }

    public void setSo_tin_chi(int so_tin_chi) {
        this.so_tin_chi = so_tin_chi;
    }

}
