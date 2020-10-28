package cn.dingli.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * 封装数据库工具类
 *
 * @author 陈迪凯
 * @date 2020-10-28 17:33
 */
public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    private JDBCUtils() {
    }

    static {
        // 从配置文件获取数据库信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        driver = resourceBundle.getString("driver");
        url = resourceBundle.getString("url");
        user = resourceBundle.getString("user");
        password = resourceBundle.getString("password");

        // 注册驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return 返回数据库连接对象
     * @throws SQLException 异常
     */
    public static Connection getConnection() throws SQLException {
        // 获取数据库连接
        Connection connection = DriverManager.getConnection(url, user, password);

        return connection;
    }

    /**
     * 释放资源
     *
     * @param rs   查询结果集资源
     * @param stmt 数据库操作对象资源
     * @param conn 数据库连接对象资源
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
