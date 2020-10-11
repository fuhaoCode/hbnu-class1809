package com.hbnudingli.edu;

public class Heroes {
    private String name;
    private String role;
    private double blood;
    static final double PI = 3.1415926;
    static int roleId;

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public Heroes() {
        this("后羿", "射手", 450.0);
        System.out.println("王者荣耀");
    }

    public Heroes(String name, String role, double blood) {
        this.name = name;
        this.role = role;
        this.blood = blood;
    }

    public void run() {
        System.out.println("行走....");
    }

    public void fight() {
        System.out.println("干架..." + this.role);
    }

    public static void bloodReturning(int num) {

        System.out.println("回血..." + num);
    }

}
