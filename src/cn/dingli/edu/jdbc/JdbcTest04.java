package cn.dingli.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * 采用反射注册数据库驱动
 *
 * @author 陈迪凯
 * @date 2020-10-23 14:21
 */
public class JdbcTest04 {
    public static void main(String[] args) {

        // 读取配置文件的信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动
            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName(driver);

            // 2、获取数据库连接
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行sql语句
            String sql = "select username as name,password,realname,salary from userinfo";
            rs = stmt.executeQuery(sql);  // 查询操作，调用的是executeQuery()方法

            // 5、处理查询结果集
            while (rs.next()) {
                /*
                // 5.1 根据字段下标，用string接收数据
                String name = rs.getString(1);
                String pwd = rs.getString(2);
                String real = rs.getString(3);
                String sal = rs.getString(4);
                */

                /*
                // 5.2 根据字段下标，用具体类型接收数据
                String name = rs.getString(1);
                String pwd = rs.getString(2);
                String real = rs.getString(3);
                double sal = rs.getDouble(4);
                */

                /*
                // 5.3 根据查询结果的字段名，用string接收数据
                String name = rs.getString("name");
                String pwd = rs.getString("password");
                String real = rs.getString("realname");
                String sal = rs.getString("salary");
                */

                // 5.4 根据查询结果字段名，用具体的数据类型接收数据
                String name = rs.getString("name");
                String pwd = rs.getString("password");
                String real = rs.getString("realname");
                double sal = rs.getDouble("salary");

                System.out.println(name + "\t" + pwd + "\t" + real + "\t" + sal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
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
}
