package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExercise {
    public static void main(String[] args) {
        ArrayList List01 = new ArrayList();
        List01.add(new Dog("xiaohua",15));
        List01.add(new Dog("WhiteBull",10));
        List01.add(new Dog("blues",3));
        Iterator I1 = List01.iterator();
        while (I1.hasNext()) {
            Object next =  I1.next();
            System.out.println(next);
        }
        for (Object iii : List01)
        {
            System.out.println(iii);
        }
    }
}
