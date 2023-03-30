package Set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise01 {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        Employee Emp01 = new Employee("smith",18);
        Employee Emp02 = new Employee("smith",18);
        Employee Emp03 = new Employee("Twitter",18);
        employees.add(Emp01);
        employees.add(Emp02);
        employees.add(Emp03);
        for (Employee employee :employees) {
            System.out.println(employee);
        }

    }
}
class Employee {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}