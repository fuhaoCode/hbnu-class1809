package cn.dingli.edu.common;

import java.util.Date;
import java.util.Objects;

public class DaJi {
    private String name;
    private int age;

    public DaJi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name + ";age:" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DaJi)) {
            return false;
        } else {
            DaJi daJi = (DaJi)obj;
            return this.age == daJi.age && this.name.equals(daJi.name);
        }
    }

}
