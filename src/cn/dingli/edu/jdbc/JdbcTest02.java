package cn.dingli.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 执行sql语句，释放资源
 *
 * @author 陈迪凯
 * @date 2020-10-23 8:04
 */
public class JdbcTest02 {

    public static void main(String[] args) {

        // 声明变量
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8";
            String user = "root";
            String password = "chendikai";
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行sql语句
            String sql = "insert into userinfo(username,password,realname,salary) values('jixin1809','1809','计信1809班',80000) ";
            int count = stmt.executeUpdate(sql); // 对于数据库的增、删、改这三种操作，调用的是executeUpdate()方法
            System.out.println("影响的数据条数：" + count);

            // 5、处理查询结果集
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            try {
                if (stmt != null ) {
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
}
