package cn.dingli.edu.common;

public class Test {
    public static void main(String[] args) {
        Heroes heroes1 = new Heroes("后羿", 20);
        Heroes heroes2 = new Heroes("后羿", 20);


        String str = "sfjowafelaoufoawhf sfhwaefuafowe fwo   ";
        System.out.println(str.length()); // 字符串长度
        System.out.println(str.indexOf("f"));
        System.out.println(str.lastIndexOf("f"));
        System.out.println(str.substring(8, 29));
        System.out.println(str.trim());
        String[] arr = str.split(" ");
        for (String s:arr) {
            System.out.println(s);
        }

        String test = "abc";
        String demo = test + "bcd";
        System.out.println(demo);

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("bcd");
        System.out.println(stringBuffer.toString());
    }
}
