package cn.dingli.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 更新与删除数据库记录
 *
 * @author 陈迪凯
 * @date 2020-10-23 9:21
 */
public class JdbcTest03 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2、获取连接
            String url = "jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8";
            String user = "root";
            String password = "chendikai";
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行sql语句
            String sql = "update userinfo set realname='小可爱' where username='2222'";
            int count = stmt.executeUpdate(sql);
            System.out.println("影响的数据数目：" + count);

            // 5、处理查询结果集
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放数据库资源
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
}
