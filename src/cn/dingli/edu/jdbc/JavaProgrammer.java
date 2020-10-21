package cn.dingli.edu.jdbc;

import java.util.ResourceBundle;

/**
 * 模拟Java程序员
 *
 * @author 陈迪凯
 * @date 2020-10-21 16:53
 */
public class JavaProgrammer {
    public static void main(String[] args) throws Exception {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");

//        JdbcInterface jdbcInterface = new MysqlJdbc(); // 多态
        Class clazz = Class.forName(driver); // 获取字节码对象
        JdbcInterface jdbcInterface = (JdbcInterface) clazz.newInstance(); // 多态
        jdbcInterface.getConnection();
    }
}
