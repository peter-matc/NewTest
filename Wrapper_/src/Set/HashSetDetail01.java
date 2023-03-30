package Set;

import java.util.HashSet;

/*
1.HashSet 底层是HashMap
2.添加一个元素时 会先得到hash数值 在转化为索引数值
3.如果有调用equals比较 ， 如果相同，就放弃添加 ，如果不同加入到后面
4.当一条链表个数大于8，并且table 到达 64 转化为红黑树
5.临界值(threshold) = 数组长度  * 加载因子(LoadFactor) 0.75  = 12;
6.每次扩容扩大一倍;


 */
@SuppressWarnings({"all"})
public class HashSetDetail01 {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        objects.add("java");
        objects.add("php");
        objects.add("java");
        System.out.println(objects);
        objects.clear();
        for (int i = 0; i < 15; i++) {
            objects.add(new A(i));
        }
        System.out.println(objects);
    }
    /*
    1.先执行
    public HashSet() {
        map = new HashMap<>();
    }
     */
}
class A{
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "A{" +
                "n=" + n +
                '}';
    }

    @Override
    public int hashCode() {
        return 100;
    }
}