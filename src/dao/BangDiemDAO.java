/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.connect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.BangDiem;
/**
 *
 * @author Admin
 */
public class BangDiemDAO {
     public static ArrayList<BangDiem> list() {
        ArrayList<BangDiem> list = new ArrayList<>();
// 
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_bangdiem"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                double diem_chuyen_can = rs.getDouble("diem_chuyen_can");
                double diem_thi = rs.getDouble("diem_thi");
                Date ngay_thi = rs.getDate("ngay_thi");
                int id_sinhvien = rs.getInt("id_sinhvien");
                int id_hocphan= rs.getInt("id_hocphan");

               

                BangDiem item = new BangDiem(id, diem_chuyen_can, diem_thi, ngay_thi, id_sinhvien, id_hocphan);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static BangDiem find(int _id) {
        BangDiem item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_bangdiem WHERE id = ?")) {

            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                double diem_chuyen_can = rs.getDouble("diem_chuyen_can");
                double diem_thi = rs.getDouble("diem_thi");
                Date ngay_thi = rs.getDate("ngay_thi");
                int id_sinhvien = rs.getInt("id_sinhvien");
                int id_hocphan= rs.getInt("id_hocphan");


                item = new BangDiem(id, diem_chuyen_can, diem_thi, ngay_thi, id_sinhvien, id_hocphan);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return item;
    }

    public static int create(BangDiem item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO `tbl_bangdiem`(`diem_chuyen_can`, `diem_thi`, `ngay_thi`, `id_sinhvien`, `id_hocphan`) VALUES (?, ?, ?, ?, ?)")) {

            ps.setDouble(1, item.getDiem_chuyen_can());
            ps.setDouble(2, item.getDiem_thi());
            ps.setDate(3, item.getNgay_thi());
            ps.setInt(4, item.getId_sinhvien());
            ps.setInt(5, item.getId_hocphan());
            
            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int update(BangDiem item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE `tbl_bangdiem` SET `diem_chuyen_can`=?,`diem_thi`=?,`ngay_thi`=?,`id_sinhvien`=?,`id_hocphan`=? WHERE `id` = ?")) {
            ps.setDouble(1, item.getDiem_chuyen_can());
            ps.setDouble(2, item.getDiem_thi());
            ps.setDate(3, item.getNgay_thi());
            ps.setInt(4, item.getId_sinhvien());
            ps.setInt(5, item.getId_hocphan());
            ps.setInt(6, item.getId());
            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int delete(int id) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM `tbl_bangdiem` WHERE `id` = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}


