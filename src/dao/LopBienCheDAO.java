package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.LopBienChe;

public class LopBienCheDAO extends DAO {

    public static ArrayList<LopBienChe> list() {
        ArrayList<LopBienChe> list = new ArrayList<>();
// 
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_lopbienche"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten_lop = rs.getString("ten_lop");
                int id_giangvien = rs.getInt("id_giangvien");

                LopBienChe item = new LopBienChe(id, ten_lop, id_giangvien);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static LopBienChe find(int _id) {
        LopBienChe item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_lopbienche WHERE id = ?")) {

            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String ten_lop = rs.getString("ten_lop");
                int id_giangvien = rs.getInt("id_giangvien");

                item = new LopBienChe(id, ten_lop, id);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return item;
    }

     public static int create(LopBienChe item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_lopbienche( ten_lop, id_giangvien) VALUES (?, ?)")) {

            ps.setString(1, item.getTen_lop());
            ps.setInt(2, item.getId_giangvien());
          

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
    public static int update(LopBienChe item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE tbl_lopbienche SET ten_lop=?,id_giangvien=? WHERE id = ?")) {
            ps.setString(1, item.getTen_lop());
            ps.setInt(2, item.getId_giangvien());
//            ps.setInt(3, item.getId());
            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int delete(int id) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM tbl_lopbienche WHERE id = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}
