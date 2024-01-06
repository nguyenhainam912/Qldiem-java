package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SinhVien;

public class SinhVienDAO extends DAO {

    public static ArrayList<SinhVien> list() {
        ArrayList<SinhVien> list = new ArrayList<>();
// 
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_sinhvien"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String dia_chi = rs.getString("dia_chi");
                BigDecimal gpa = rs.getBigDecimal("gpa");
                int id_lopbienche = rs.getInt("id_lopbienche");

                SinhVien item = new SinhVien(id, ten, ngay_sinh, gioi_tinh, sdt, email, dia_chi, gpa, id_lopbienche);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static SinhVien find(int _id) {
        SinhVien item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_sinhvien WHERE id = ?")) {

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
                BigDecimal gpa = rs.getBigDecimal("gpa");
                int id_lopbienche = rs.getInt("id_lopbienche");

                item = new SinhVien(id, ten, ngay_sinh, gioi_tinh, sdt, email, dia_chi, gpa, id_lopbienche);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return item;
    }

    public static int create(SinhVien item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_sinhvien ( ten, ngay_sinh, gioi_tinh, sdt, email, dia_chi, gpa, id_lopbienche) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

            ps.setString(1, item.getTen());
            ps.setDate(2, item.getNgay_sinh());
            ps.setString(3, item.getGioi_tinh());
            ps.setString(4, item.getSđt());
            ps.setString(5, item.getEmail());
            ps.setString(6, item.getDia_chi());
            ps.setBigDecimal(7, item.getGpa());
            ps.setInt(8, item.getId_lopbienche());

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int update(SinhVien item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE tbl_sinhvien SET ten=?,ngay_sinh=?,gioi_tinh=?,sdt=?,email=?,dia_chi=?,gpa=?,id_lopbienche=? WHERE id = ?")) {
            ps.setString(1, item.getTen());
            ps.setDate(2, item.getNgay_sinh());
            ps.setString(3, item.getGioi_tinh());
            ps.setString(4, item.getSđt());
            ps.setString(5, item.getEmail());
            ps.setString(6, item.getDia_chi());
            ps.setBigDecimal(7, item.getGpa());
            ps.setInt(8, item.getId_lopbienche());
            ps.setInt(9, item.getId());
            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int delete(int id) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM tbl_sinhvien WHERE id = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}
