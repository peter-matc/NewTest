package Generic__;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        Mydate Birthday01 = new Mydate(21,4,2001);
        Employee emp01 = new Employee("ma",35212,Birthday01);
        Employee emp02 = new Employee("liu",45215,Birthday01);
        Employee emp03 = new Employee("zhang",45631,Birthday01);
        ArrayList<Employee> employeeArrayList = new ArrayList<>(5);
        employeeArrayList.add(emp01);
        employeeArrayList.add(emp02);
        employeeArrayList.add(emp03);
        for (Employee employee01 :employeeArrayList) {
            System.out.println(employee01);

        }



    }
}

