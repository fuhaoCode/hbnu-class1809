package cn.dingli.edu.jdbc;

/**
 * SQL server实现接口
 *
 * @author 陈迪凯
 * @date 2020-10-21 16:52
 */
public class SqlServerJdbc implements JdbcInterface {
    @Override
    public void getConnection() {
        System.out.println("成功连接SQLSERVER数据库......");
    }
}
