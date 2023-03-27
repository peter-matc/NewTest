package Generic__;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// 泛型的继承和通配
public class Generic04 {
    public static void main(String[] args) {
        ArrayList<Object> objects01 = new ArrayList<>();
        ArrayList<String> objects02 = new ArrayList<>();
        ArrayList<A> objects03 = new ArrayList<>();
        ArrayList<B> objects04 = new ArrayList<>();
        ArrayList<C> objects05 = new ArrayList<>();
        PrintInf01(objects01);
        PrintInf01(objects02);
        PrintInf01(objects03);
        PrintInf01(objects04);
        PrintInf01(objects05);
        ArrayList<Integer> integers = new ArrayList<>();
        Prrr(integers);
    }
    public static void Prrr(List<Integer> m)
    {

    }
    public static void PrintInf01(List<?> c)
    {
        System.out.println("asd");
        for (Object o :c) {
            System.out.println(c);
            System.out.println("123");
        }
    }
    public static void PrintInf02(List<? extends A> c)
    {
        for (Object o :c) {
            System.out.println(o);
            System.out.println(" 123 ");
        }
    }
    public static void PrintInf03(List<? super A> c){
        for (Object o :c) {
            System.out.println(o);
        }

    }
}
class A{
    @Test
    public void showINN()
    {
        System.out.println("asd");
    }
}

class B extends A{
}

class C extends B{}

