package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

//    protected static String hostName = "localhost:3306";
//    protected static String dbName = "quan_ly_diem_sinh_vien";
//    protected static String username = "root";
//    protected static String password = "";
//    protected static String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

    protected static String connectionURL = "jdbc:sqlserver://192.168.1.179\\SQLEXPRESS;databaseName=qlDiem;integratedSecurity=true;encrypt=false";
    protected static String username = "sa";
    protected static String password = "123456";
    
    public static Connection connect() {
        // Connect đến database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            System.out.println("Kết nối không thành công");
        }
        return conn;
    }
}
