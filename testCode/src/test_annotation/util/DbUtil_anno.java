package test_annotation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import test_annotation.JDBCConfig;

@JDBCConfig(database = "hero", ip = "localhost", loginName = "xzw", password = "12345678", timezone = "UTC")
public class DbUtil_anno {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        JDBCConfig config = DbUtil_anno.class.getAnnotation(JDBCConfig.class);
        
        String database = config.database();
        String ip = config.ip();
        int port = config.port();
        String timezone = config.timezone();
        String loginName = config.loginName();
        String password = config.password();
        
        String url = String.format("jdbc:mysql://%s:%d/%s?serverTimezone=%s", ip, port, database, timezone);
        return DriverManager.getConnection(url, loginName, password);
    }
    
    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }
}
