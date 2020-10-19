package cn.dingli.edu.reflect;

public class Heroes {
    private String name;
    public int age;

    public Heroes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Heroes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void hello() {
        System.out.println("hello");
    }
}
