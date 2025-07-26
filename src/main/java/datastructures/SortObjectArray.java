package datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortObjectArray {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Rob", "Milton", 55);
        Employee emp2 = new Employee("Robin", "London", 25);
        Employee emp3 = new Employee("Kevin", "Subway", 23);
        Employee emp4 = new Employee("Nick", "Delhi", 57);
        Employee emp5 = new Employee("Julia", "Uptown", 35);
        Employee emp6 = new Employee("John","NewYork", 38);
        Employee emp7 = new Employee("Mike", "Toronto", 35);

        Employee[] employeeArr = { emp1, emp2, emp3, emp4, emp5, emp6, emp7};
        List<Employee> empList1 = Arrays.asList(employeeArr);
        System.out.println(empList1);

        //sorting employees by Name
        Arrays.sort(employeeArr, (e1,e2) -> {
            return e1.getName().compareTo(e2.getName());
        });
        List<Employee> empByName = Arrays.asList(employeeArr);
        System.out.println(empByName);

        //sorting employees by age
        Arrays.sort(employeeArr, Comparator.comparing(Employee::getAge));
        List<Employee> empByAge = Arrays.asList(employeeArr);
        System.out.println(empByAge);

    }
}
