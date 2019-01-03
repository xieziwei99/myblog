package test_annotation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    static String ip = "localhost";
    static int port = 3306;
    static String database = "hero";
    static String timezone = "UTC";
    static String loginName = "xzw";
    static String password = "12345678";
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s?serverTimezone=%s", ip, port, database, timezone);
        return DriverManager.getConnection(url, loginName, password);
    }
    
    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }
}
