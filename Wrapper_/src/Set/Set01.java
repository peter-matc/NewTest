package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Set01 {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        // set 接口实现的对象不能够存放重复的元素
        // set 接口存放的对象是无序的
        // 取出的顺序是固定的
        objects.add("john");
        objects.add(null);
        objects.add("lucy");
        objects.add("john");
        objects.add(null);
        objects.add("asdasd");
        System.out.println(objects);
        Iterator iterator = objects.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object o :objects) {
            System.out.println(o);
        }
        String m = "qwe";
        System.out.println(m.hashCode());
        String q = "qwer";
        System.out.println(q.hashCode());
    }
}
