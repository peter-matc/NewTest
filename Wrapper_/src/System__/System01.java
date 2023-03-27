package System__;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Vector;

public class System01 {
    public static void main(String[] args) {
        System.out.println("aaa");
//        System.exit(0);
        System.out.println("aasdasd");
//        Scanner in = new Scanner(System.in);
//        Integer a=  in.nextInt();
//        System.out.println(a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add("156");
        arrayList.add("asdsadasd");
//        System.out.println(arrayList.get(2));
        for (int i = 0;i<arrayList.size();i++)
            System.out.println(arrayList.get(i));
        Vector<Object> objects = new Vector<>();
        objects.add("asd");
        System.out.println(objects);
    }
}
