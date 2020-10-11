package cn.dingli.edu.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        System.out.println(simpleDateFormat.format(time));

        Calendar instance = Calendar.getInstance(); // 获取日期时间对象
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH) + 1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        System.out.println(simpleDateFormat.format(instance.getTime()));
    }
}
