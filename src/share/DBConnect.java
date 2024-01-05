/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package share;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nguye
 */
public class DBConnect {
    
    public static Connection getConnection() {
        Connection cons = null;
        try {
            //Class.forName("com.mssql.jdbc.Driver");
            
            String url = "jdbc:sqlserver://192.168.1.179\\SQLEXPRESS;databaseName=QLDiem;integratedSecurity=true;encrypt=false";
            String user = "sa";
            String password = "123456";

            // Tạo kết nối
            
            cons = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Lỗi kết nối");
        }
        return cons;
    }

    public static void main(String[] args) {
        Connection c = getConnection();
        System.out.println(c.toString());
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
