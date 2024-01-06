package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HocPhan;

public class HocPhanDAO extends DAO{

    public static ArrayList<HocPhan> list() {
        ArrayList<HocPhan> list = new ArrayList<>();
// 
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_hocphan"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten_hocphan = rs.getString("ten_hocphan");
                int so_tin_chi = rs.getInt("so_tin_chi");

                HocPhan item = new HocPhan(id, ten_hocphan, so_tin_chi);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static HocPhan find(int _id) {
        HocPhan item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM `tbl_hocphan` WHERE id = ?")) {

            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String ten_hocphan = rs.getString("ten_hocphan");
                int so_tin_chi = rs.getInt("so_tin_chi");

                item = new HocPhan(id, ten_hocphan, so_tin_chi);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return item;
    }

    public static int create(HocPhan item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO `tbl_hocphan`(`ten_hocphan`, `so_tin_chi`) VALUES (?, ?)")) {

            ps.setString(1, item.getTen_hocphan());
            ps.setInt(2, item.getSo_tin_chi());

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int update(HocPhan item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE `tbl_hocphan` SET `ten_hocphan`=?,`so_tin_chi`=? WHERE `id` = ?")) {

            ps.setString(1, item.getTen_hocphan());
            ps.setInt(2, item.getSo_tin_chi());
            ps.setInt(3, item.getId());

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }

    public static int delete(int id) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM `tbl_hocphan` WHERE `id` = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}
