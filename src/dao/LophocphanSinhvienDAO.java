package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.LophocphanSinhvien;

public class LophocphanSinhvienDAO extends DAO {

    public static ArrayList<LophocphanSinhvien> list() {
        ArrayList<LophocphanSinhvien> list = new ArrayList<>();
// 
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_lophocphan_sinhvien"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                int id_sinhvien = rs.getInt("id_sinhvien");
                int id_lophocphan = rs.getInt("id_lophocphan");

                LophocphanSinhvien item = new LophocphanSinhvien(id,id_sinhvien, id_lophocphan);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static LophocphanSinhvien find(int _id) {
        LophocphanSinhvien item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_lophocphan_sinhvien WHERE id = ?")) {

            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                int id_sinhvien = rs.getInt("id_sinhvien");
                int id_lophocphan = rs.getInt("id_lophocphan");

                item = new LophocphanSinhvien(id, id_sinhvien, id_lophocphan);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return item;
    }

     public static int create(LophocphanSinhvien item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_lophocphan_sinhvien( id_sinhvien, id_lophocphan) VALUES (?, ?)")) {

            ps.setInt(1, item.getId_sinhvien());
            ps.setInt(2, item.getId_lophocphan());
          

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
   public static int update(LophocphanSinhvien item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE tbl_lophocphan_sinhvien SET id_sinhvien=?,id_lophocphan=? WHERE id= ?")) {
            ps.setInt(1, item.getId_sinhvien()); 
            ps.setInt(2, item.getId_lophocphan());
            ps.setInt(3, item.getId());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int delete(int id) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM tbl_lophocphan_sinhvien WHERE id = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}

