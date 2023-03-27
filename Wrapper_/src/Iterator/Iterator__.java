package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator__ {
    public static void main(String[] args) {
        ArrayList col = new ArrayList();
        col.add(new Book("三国演绎","罗贯中",16.45));
        col.add(new Book("西游记","吴承恩",11.25));
        col.add(new Book("红楼梦","曹雪芹",8.95));
//
        col.add("jack");
        col.add(15.65);
        Iterator iterator;
        // 这个地方就是创建一个 Iterator 成员变量
        iterator = col.iterator();
        //新创建的迭代器变量指向col 迭代器开始

//        while(iterator.hasNext()){
//            // 返回下一个元素，类型是Object
//            Object next = iterator.next();
//            System.out.println("obj = "+ next);
//        }
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.getClass());
        }
        // 如果需要再次遍历需要重置迭代器
        iterator = col.iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            System.out.println(next);
//        }
        //也可以用在数组上面
        int[] nums = {1,45,321,56,789,3621};
        //  在数组中使用
        for (Integer i : nums)
        {
            System.out.println(" i = "+i);

        }
        // 底层任然是迭代器
        for (Object aa : col)
        {
            System.out.println(aa);
        }

    }
}
class Book{
    private String name;
    private String autor;
    private double price;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name, String autor, double price) {
        this.name = name;
        this.autor = autor;
        this.price = price;
    }

}