package cn.dingli.edu.practice;

import java.util.Objects;

public class User {
    private String username; // 用户名
    private String password; // 密码

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User)o;
        return this.username.equals(user.username) && this.password.equals(user.password);
    }

}
