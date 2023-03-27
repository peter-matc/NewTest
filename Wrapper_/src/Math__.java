import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Math__ {
    public static void main(String[] args) {
        Integer a = Math.abs(-5);
        System.out.println(a);
        //1 - 10
        Integer m = (int)(Math.random()*10+1);
        System.out.println(m);

        Float T1 = (float)(Math.random()*5+1);
        System.out.println(T1);
        Integer[] ee = {1,53,65,54,2,-7,32};
        //遍历数组
        System.out.println(Arrays.toString(ee));
        // 遍历数组输出
        // sort是重载的也可以传入一个接口
        Arrays.sort(ee);
        //
        System.out.println(Arrays.toString(ee));
//        Arrays.sort(ee, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        System.out.println(Arrays.toString(ee));
        // binarySearch只能进行升序查找
        Integer mmmm = Arrays.binarySearch(ee,53);
        System.out.println(mmmm);
        Integer[] arrr = {-5,32,65,32,5,6,2};
        System.out.println(Arrays.binarySearch(arrr,6));
        Integer[] ass;
        // 拷贝后面多了的话加个null
        ass = Arrays.copyOf(arrr,10);
        System.out.println(Arrays.toString(ass));
        // negative 否定的
//        Arrays.fill(ass,56);
        // 使用这个数字56 去替换所有元素
        System.out.println(Arrays.toString(ass));
        System.out.println(Arrays.equals(ass,arrr));
        List<Integer> objects = Arrays.asList(ass);
        // 获得运行类型

        System.out.println(objects.getClass());
        System.out.println(objects.toString());

    }
}
