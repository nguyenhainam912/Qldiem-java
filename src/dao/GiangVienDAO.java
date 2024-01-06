/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.GiangVien;
/**
 *
 * @author Admin
 */
public class GiangVienDAO extends DAO {

    public static ArrayList<GiangVien> list() {
        ArrayList<GiangVien> list = new ArrayList<>();
// 
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_giangvien"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String dia_chi = rs.getString("dia_chi");
                GiangVien item = new GiangVien(id, ten, ngay_sinh, gioi_tinh, sdt, email, dia_chi);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static GiangVien find(int _id) {
        GiangVien item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM `tbl_giangvien` WHERE id = ?")) {

            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String dia_chi = rs.getString("dia_chi");
                item = new GiangVien(id, ten, ngay_sinh, gioi_tinh, sdt, email, dia_chi);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return item;
    }

    public static int create(GiangVien item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO `tbl_giangvien`(`ten`, `ngay_sinh`, `gioi_tinh`, `sdt`, `email`,`dia_chi`) VALUES (?, ?, ?, ?, ?,?)")) {

            ps.setString(1, item.getTen());
            ps.setDate(2, item.getNgay_sinh());
            ps.setString(3, item.getGioi_tinh());
            ps.setString(4, item.getSdt());
            ps.setString(5, item.getEmail());
            ps.setString(6, item.getDia_chi());
            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int update(GiangVien item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE `tbl_giangvien` SET `ten`=?,`ngay_sinh`=?,`gioi_tinh`=?,`sdt`=?,`email`=?, `dia_chi`= ? WHERE `id` = ?")) {

            ps.setString(1, item.getTen());
            ps.setDate(2, item.getNgay_sinh());
            ps.setString(3, item.getGioi_tinh());
            ps.setString(4, item.getSdt());
            ps.setString(5, item.getEmail());
            ps.setString(6, item.getDia_chi());
            ps.setInt(7, item.getId());

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int delete(int id) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM `tbl_giangvien` WHERE `id` = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}
