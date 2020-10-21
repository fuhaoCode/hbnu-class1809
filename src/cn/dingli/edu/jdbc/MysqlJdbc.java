package cn.dingli.edu.jdbc;

/**
 * Mysql数据库厂商实现接口
 *
 * @author 陈迪凯
 * @date 2020-10-21 16:50
 */
public class MysqlJdbc implements JdbcInterface {
    @Override
    public void getConnection() {
        System.out.println("成功连接mysql数据库......");
    }
}
