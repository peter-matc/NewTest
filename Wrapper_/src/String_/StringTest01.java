package String_;

public class StringTest01 {
    public static void main(String[] args) {
        // string 中的字符一个字符占用两个字节 使用Unicode字符编码
        String name = "asdasdazxcasdzasdzcfdasd";
        //string可以串行化  即可以在网络上传输
        // Serializable 实现的话可以串行化
        // Comparable 可以实现比较大小
        // final 类不能被继承
        // 本质上还是 private final char value[];用于存放字符串内容
        // 地址不可以修改 内容可以修改   不可以指向一个新的对象

        System.out.println(name);

        Character mm = 'a';

//        name = mm.toString();
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name.lastIndexOf('a'));

        String str1 = "hellow ";
        String str2 = "Hellow ";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(name.substring(0,5)); // 截取掉最后面的内容 不包括最后一部分

        System.out.println(str1.indexOf("ll"));

        String name1 = "matianci";
        int age = 21;
        float Score = 12.12f;
        String ss = "我的姓名是%s,年龄为%d,成绩为:%.2f";
        String asdas = String.format(ss,name1,age,Score);
        System.out.println(asdas);
        // 需要相对应的类型

        StringBuffer a = new StringBuffer("hellow ");
         // 大小100
        StringBuffer tt = new StringBuffer(100);
        // 创建StringBuffer长度是name的长度加16
        StringBuffer stringBuffer = new StringBuffer(name);
        //way1 使用构造器对本身没有影响
        String str6 = "Hellwo owe";
        //
        StringBuffer stringBuffer1 = new StringBuffer(str6);
        //way2
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2 = stringBuffer2.append(str6);
        // append 是追加

        //way3 自身也发生改变
        String sss = stringBuffer2.toString();
        //
        String mmm = new String(stringBuffer2);
        System.out.println(sss);

        //
    }

}
