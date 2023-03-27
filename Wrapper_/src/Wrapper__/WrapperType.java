package Wrapper__;

public class WrapperType {
    public static void main(String[] args) {
        // 手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
//        Integer integer1 =

// 自动装箱
        int n2 = 200;
        Integer integer2 = n2;
        char m = 'a';
        Character aa = m;
        System.out.println(aa);
        // 三元运算符
        // 三元运算符是个整体要看精度最好的那个
        Object i = true? new Integer(1):new Double(2.0);
        System.out.println(i);

        Object i2;
        if(true)
        {
            i2 = new Integer(1);
        }
        else {
            i2 = new Double(2.0);
        }
        System.out.println(i2);


    }
}
