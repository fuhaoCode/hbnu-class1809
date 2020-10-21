package cn.dingli.edu.jdbc;

/**
 * ORACLE数据库厂商实现接口
 *
 * @author 陈迪凯
 * @date 2020-10-21 16:51
 */
public class OracleJdbc implements JdbcInterface {
    @Override
    public void getConnection() {
        System.out.println("成功连接Oracle数据库......");
    }
}
