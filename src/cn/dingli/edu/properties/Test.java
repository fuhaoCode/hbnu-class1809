package cn.dingli.edu.properties;

public class Test {
    public static void main(String[] args) {
        Heroes heroes01 = new HouYi();
        Heroes heroes02 = new Kai();

        heroes01.move();
        System.out.println(heroes01.id);

        heroes02.move();
        System.out.println(heroes02.id);

    }
}
