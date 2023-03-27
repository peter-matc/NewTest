package Generic__;

public class Generic03 {
    public static void main(String[] args) {
        stu stu = new stu();
        stu.fun("asd",15);
        Cat cat01 = new Cat();
        String name = "BMW";
        int a = 4521;
        Integer asd = a;
        cat01.Test(asd);
        cat01.Test(name);
        cat01.Test(100.5);
    }
}
// 泛型的接口不能有泛型的成员变量
interface IUsb<T,E>
{
    int n = 10;
    // T name; 这样会报错
    public void fun(T t,E e);
}
interface IA extends IUsb<String,Integer>{

}
class stu implements IA{
    @Override
    public void fun(String s, Integer integer) {
        System.out.println(s+integer);
    }
}
class BB implements IUsb<Integer,Float>{
    @Override
    public void fun(Integer integer, Float aFloat) {

    }
    // 泛型方法

}
class Cat{
    public<T> void Test(T e)
    {
        System.out.println(e.getClass());
    }
}