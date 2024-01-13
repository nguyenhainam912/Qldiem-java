/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.connect;
import java.math.BigDecimal;
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
        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_bangdiem Order By id_sinhvien ASC"); ResultSet rs = ps.executeQuery()) {
            // lấy dữ liệu từ db -> add vào list 
            while (rs.next()) {
                int id = rs.getInt("id");
                BigDecimal diem_chuyen_can = rs.getBigDecimal("diem_chuyen_can");
                BigDecimal diem_thi = rs.getBigDecimal("diem_thi");
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

    public static ArrayList<BangDiem> find(int _id_sv, int _id_hp) {
        ArrayList<BangDiem> list = new ArrayList<>();
        BangDiem item = null;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_bangdiem WHERE id_sinhvien = ISNULL(?, id_sinhvien) And id_hocphan = ISNULL(?, id_hocphan)")) {
            if(_id_sv == 0) {
                ps.setNull(1, java.sql.Types.INTEGER);
            } else {
                ps.setInt(1, _id_sv);

            }
            if(_id_hp == 0) {
                ps.setNull(2, java.sql.Types.INTEGER);
            } else {
               ps.setInt(2, _id_hp);
            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                BigDecimal diem_chuyen_can = rs.getBigDecimal("diem_chuyen_can");
                BigDecimal diem_thi = rs.getBigDecimal("diem_thi");
                Date ngay_thi = rs.getDate("ngay_thi");
                int id_sinhvien = rs.getInt("id_sinhvien");
                int id_hocphan= rs.getInt("id_hocphan");

                item = new BangDiem(id, diem_chuyen_can, diem_thi, ngay_thi, id_sinhvien, id_hocphan);
                list.add(item);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return list;
    }

    public static int create(BangDiem item) {
        int rows = 0;

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_bangdiem(diem_chuyen_can, diem_thi, ngay_thi, id_sinhvien, id_hocphan) VALUES (?, ?, ?, ?, ?)")) {

            ps.setBigDecimal(1, item.getDiem_chuyen_can());
            ps.setBigDecimal(2, item.getDiem_thi());
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

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("UPDATE tbl_bangdiem SET diem_chuyen_can=?,diem_thi=?,ngay_thi=?,id_sinhvien=?,id_hocphan=? WHERE id = ?")) {
            ps.setBigDecimal(1, item.getDiem_chuyen_can());
            ps.setBigDecimal(2, item.getDiem_thi());
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

        try (Connection con = connect(); PreparedStatement ps = con.prepareStatement("DELETE FROM tbl_bangdiem WHERE id = ?")) {

            ps.setInt(1, id);

            rows = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return rows;
    }
}


