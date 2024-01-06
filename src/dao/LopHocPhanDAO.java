package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.LopHocPhan;

public class LopHocPhanDAO extends DAO {

    public static ArrayList<LopHocPhan> list() {
        ArrayList<LopHocPhan> list = new ArrayList<>();
// 
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_lophocphan"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int id_giangvien = rs.getInt("id_giangvien");
                Date ngay_bat_dau = rs.getDate("ngay_bat_dau");
                Date ngay_ket_thuc = rs.getDate("ngay_ket_thuc");
                Date ngay_thi = rs.getDate("ngay_thi");

                LopHocPhan item = new LopHocPhan(id, ten, id_giangvien, ngay_bat_dau, ngay_ket_thuc, ngay_thi);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static LopHocPhan find(int _id) {
        LopHocPhan item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_lophocphan WHERE id = ?")) {

            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int id_giangvien = rs.getInt("id_giangvien");
                Date ngay_bat_dau = rs.getDate("ngay_bat_dau");
                Date ngay_ket_thuc = rs.getDate("ngay_ket_thuc");
                Date ngay_thi = rs.getDate("ngay_thi");

                item = new LopHocPhan(id, ten, id_giangvien, ngay_bat_dau, ngay_ket_thuc, ngay_thi);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return item;
    }

    public static int create(LopHocPhan item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO `tbl_lophocphan`( `ten`, `id_giangvien`, `ngay_bat_dau`, `ngay_ket_thuc`, `ngay_thi`) VALUES (?, ?, ?, ?, ?)")) {

            ps.setString(1, item.getTen());
            ps.setInt(2, item.getId_giangvien());
            ps.setDate(3, item.getNgay_bat_dau());
            ps.setDate(4, item.getNgay_ket_thuc());
            ps.setDate(5, item.getNgay_thi());

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int update(LopHocPhan item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE `tbl_lophocphan` SET `ten`=?,`id_giangvien`=?,`ngay_bat_dau`=?,`ngay_ket_thuc`=?,`ngay_thi`=? WHERE `id` = ?")) {
            ps.setString(1, item.getTen());
            ps.setInt(2, item.getId_giangvien());
            ps.setDate(3, item.getNgay_bat_dau());
            ps.setDate(4, item.getNgay_ket_thuc());
            ps.setDate(5, item.getNgay_thi());
            ps.setInt(6, item.getId());
            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int delete(int id) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM `tbl_lophocphan` WHERE `id` = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}
