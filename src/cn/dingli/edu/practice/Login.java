package cn.dingli.edu.practice;

import java.util.Scanner;

public class Login {
    private static final int COUNT = 3;

    public static void main(String[] args) {
        User user = new User("hbnu1809", "jixin1809"); // 真实的用户名和密码

        int count = 0; // 用户输入的次数
        while (count < COUNT) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入账号：");
            String username = scanner.next();

            System.out.println("请输入密码：");
            String password = scanner.next();
            User user1 = new User(username, password);

            if (user1.equals(user)) {
                System.out.println("恭喜用户" + username + "成功登陆本系统！！！！！");
                break;
            }
            count++;
            if (count != 3) {
                System.out.println("请重新输入用户名和密码");
            }

        }

        if (count == COUNT) {
            System.out.println("你输入的次数过多，请稍后再试，或者联系系统管理员");
        }

    }
}
