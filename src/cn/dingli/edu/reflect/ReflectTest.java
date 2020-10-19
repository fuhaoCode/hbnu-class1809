package cn.dingli.edu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Heroes heroes = new Heroes("铠", 18);
        // 1、通过类名获取字节码对象
        Class clazz1 = Heroes.class;

        // 2、通过对象的getClass()方法获取字节码对象
        Class clazz2 = heroes.getClass();

        // 3、通过Class的静态方法forName()获取字节码对象
        Class clazz3 = Class.forName("cn.dingli.edu.reflect.Heroes");

        // 4、通过反射机制的构造方法创建对象
        try {
            Constructor constructor = clazz3.getConstructor(String.class, int.class); // 获取指定构造器
            Heroes houyi = (Heroes) constructor.newInstance("后羿", 18); // 通过反射创建对象
            System.out.println(houyi.getName() + ":" + houyi.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 5、通过字节码对象创建对象
            Heroes heroes1 = (Heroes)clazz3.newInstance();

            // 6、通过反射获取类中的属性
            Field[] fields = clazz3.getFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                System.out.print(field.getName() + " ");
            }
            System.out.println();

            Field[] declaredFields = clazz3.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                Field declaredField = declaredFields[i];
                System.out.print(declaredField.getName() + " ");
            }
            System.out.println();

            Field age = clazz3.getField("age");
            age.set(heroes1, 25);
            int a = (int) age.get(heroes1);
            System.out.println(a);

            Field name = clazz3.getDeclaredField("name");
            name.setAccessible(true);
            name.set(heroes1, "妲己");
            String n = (String) name.get(heroes1);
            System.out.println(n);

            // 7、调用方法
            Method[] methods = clazz3.getMethods(); // 获取所有的公共方法
            for (int i = 0; i < methods.length; i++) {
                Method method = methods[i];
                System.out.print(method.getName() + " ");
            }

            Method[] declaredMethods = clazz3.getDeclaredMethods();
            for (int i = 0; i < declaredMethods.length; i++) {
                Method declaredMethod = declaredMethods[i];
                System.out.print(declaredMethod.getName() + " ");
            }

            Method hello = clazz3.getDeclaredMethod("hello");
            hello.setAccessible(true);
            String str = (String) hello.invoke(heroes1);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
