package cn.dingli.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 注册驱动、获取连接
 *
 * @author 陈迪凯
 * @date 2020-10-21 17:16
 */
public class JdbcTest01 {
    public static void main(String[] args) {
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/hbnu?useSSL=false&serverTimezone=GMT&characterEncoding=utf-8"; // 协议://ip地址:数据库端口/数据库名
            String user = "root";
            String password = "chendikai";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
