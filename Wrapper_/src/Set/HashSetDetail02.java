package Set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetDetail02 {
    public static void main(String[] args) {
        MyData myData = new MyData(2022,01,02);
        emp emp01 = new emp("ma",35212.1,myData);
        emp emp02 = new emp("ma1",35212.1,myData);
        emp emp03 = new emp("ma1",35212.1,myData);

        HashSet<emp> empHashSet = new HashSet<>();
        empHashSet.add(emp01);
        empHashSet.add(emp02);
        empHashSet.add(emp03);
        for (emp o :empHashSet) {
            System.out.println(o);
        }

    }
}

class MyData{
    private int Year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        Year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "Year=" + Year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return Year == myData.Year && month == myData.month && day == myData.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Year, month, day);
    }
}

class emp{
    @Override
    public String toString() {
        return "emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    private String name;
    private double sal;
    private MyData birthday;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        emp emp = (emp) o;
        return Objects.equals(name, emp.name) && Objects.equals(birthday, emp.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    public emp(String name, double sal, MyData birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
}