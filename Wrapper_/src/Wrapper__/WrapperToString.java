package Wrapper__;

public class WrapperToString {
    public static void main(String[] args) {
        // 包装类转化为String
        Integer i = 100;
        //way 1
        String str1 = i + "";
        //way 2
        String str2 = i.toString();
        //way 3
        String str3 = String.valueOf(i);

        // String -> wrapper
        String str4 =  "456";
        Integer i2 = Integer.parseInt(str4);

        //way2
        Integer integer = new Integer(str4);
        System.out.println(i2);

        Integer i1 = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i1 == j);

        Integer m = 1 ;
        Integer n = 1;
        System.out.println(m == n);
        // 在 -128 - 127 直接返回不需要new 其他的是true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
