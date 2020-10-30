package cn.dingli.edu.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 演示悲观锁
 *
 * @author 陈迪凯
 * @date 2020-10-30 8:09
 */
public class JdbcTest12 {
    public static void main(String[] args) {
        // 声明变量
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // 1、注册驱动和获取连接
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false); // 开启事务

            // 3、获取数据库操作对象
            String sql = "update userinfo set salary = ? where username = ?";
            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            ps.setDouble(1, 40000);
            ps.setString(2, "1");
            int count = ps.executeUpdate();
            System.out.println(">>>:" + count);

            // 5、处理查询结果集
            conn.commit(); // 提交事务
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback(); // 回滚事务
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // 6、释放资源
            JDBCUtils.close(null, ps, conn);
        }
    }
}
