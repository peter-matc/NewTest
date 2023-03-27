package ListInterface;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class ListDetail01 {
    public static void main(String[] args) {
        List list01 = new ArrayList();
        list01.add("asd");
        ArrayList<Integer> ww = new ArrayList<Integer>();
        ww.add(15);
        list01.add("1546asd31");
        list01.add("nidemingzi");
        list01.add("ming");
        // 返回 fromIndex<= subList < toIndex
        List list02 = list01.subList(0,2);
        System.out.println(list01);
        System.out.println(list02);
        for (int i = 0; i<list01.size();i++)
        {
            Object next = list01.get(i);
            System.out.println(i+" "+next);
        }
        for(Object ee : list02)
        {
            System.out.println(ee);
        }

        List ArrList = new ArrayList();
        ArrList.add(new book("红楼梦",100,"曹雪芹"));
        ArrList.add(new book("西游记",10,"吴承恩"));
        ArrList.add(new book("水浒传",90,"施耐庵"));
        ArrList.add(new book("三国演义",80,"罗贯中"));
        for(Object ee : ArrList)
        {
            System.out.println(ee);
        }

    }
}
