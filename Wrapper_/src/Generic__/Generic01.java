package Generic__;

import java.util.*;

@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        Person<Integer> person = new Person<Integer>(15);
        person.fun();
        System.out.println(person.getS());
        Person<Integer> integerPerson = new Person<Integer>(15);
        System.out.println(integerPerson.getS());
        System.out.println(integerPerson.s.getClass());
        ArrayList<Person> PeopleArr = new ArrayList<Person>();
        Person<Integer> integerPerson1 = new Person<Integer>(45);
        Person<String> stringPerson = new Person<>("matianci");
        PeopleArr.add(integerPerson1);
        PeopleArr.add(integerPerson);
        PeopleArr.add(stringPerson);
        Iterator iterator01 = PeopleArr.iterator();
        while (iterator01.hasNext()) {
            Object next =  iterator01.next();
            System.out.println(next.toString());
        }
        for (Person integerPerson2 :PeopleArr) {
            System.out.println(integerPerson2.toString());
        }

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student stu01 = new Student("ma",20);
        Student stu02 = new Student("li",21);
        Student stu03 = new Student("liu",18);
        studentArrayList.add(stu01);
        studentArrayList.add(stu02);
        studentArrayList.add(stu03);
        for (Student student01 : studentArrayList) {
            System.out.println(student01.toString());
        }
        MapTree<Integer, String> mapTree = new MapTree<Integer, String>(15,"matianci");
        System.out.println(mapTree);
        // 给泛型指向数据类型时，需要用应用类型不能是基本数据类型
        ArrayList<String> strings = new ArrayList<>();
        // 没有指定的话就是 默认为Object
//        Person personTest = new Person();
//        personTest.fun();
        // 使用泛型的数组不能初始化 在类加载时，对象还没有创建
        Person<String> stringPerson1 = new Person<>();
        System.out.println(stringPerson1.MM);
    }
}



class Person<E>{
    E s;
    E[] MM;
    Person()
    {}

    public void fun()
    {
        System.out.println("fun is used");
        System.out.println(s.getClass());
    }


    public E getS() {
        return s;
    }

    public void setS(E s) {
        this.s = s;
    }

    public Person(E s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Person{" +
                "s=" + s +
                '}';
    }
    public void GetClass()
    {
        System.out.println(s.getClass());
    }
}
class Student{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class MapTree<T,V>{
    private T s;
    private V m;

    public MapTree(T s, V m) {
        this.s = s;
        this.m = m;
    }

    @Override
    public String toString() {
        return "MapTree{" +
                "s=" + s +
                ", m=" + m +
                '}';
    }

    public T getS() {
        return s;
    }

    public void setS(T s) {
        this.s = s;
    }

    public V getM() {
        return m;
    }

    public void setM(V m) {
        this.m = m;
    }
}