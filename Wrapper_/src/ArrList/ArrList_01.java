package ArrList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrList_01 {
    public static void main(String[] args) {
        List  list01 = new ArrayList();
        list01.add("asd");
        list01.add("zxc");
        list01.add(true);
        Integer int01 = new Integer(15);
        list01.add(int01);
        // add 增加某个元素
        System.out.println(list01);
        // remove 移除某个元素
        list01.remove(int01);
        list01.remove("asd");
        System.out.println(list01);
        Character char01 = new Character('a');
        // contains 查询某个元素是否存在
        System.out.println(list01.contains(char01));
        // clear 清空所有元素

        // isEmpty 判断是否为空

        // addALL 添加多个元素 这个里面加入的是collection 类
        ArrayList List02 = new ArrayList();
        System.out.println(List02);
        List02.addAll(list01);

        List list06 = new ArrayList();
        list06.add("xiguya");
        list06.add("123465");
        List02.addAll(0,list06);
        System.out.println(List02);
    }
}
