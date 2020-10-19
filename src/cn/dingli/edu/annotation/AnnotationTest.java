package cn.dingli.edu.annotation;

@MyAnnotation(name = "jixin1809", colleage = "")
public class AnnotationTest {
    private String name;

    @SuppressWarnings("")
    public static void main(String[] args) {
        test();
    }

    @Deprecated
    public static void test() {
        System.out.println("deprecated......");
    }

    @MyAnnotation(name = "jixin1809", colleage = "")
    public static void test1() {

    }

    @Override
    public String toString() {
        return "AnnotationTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
