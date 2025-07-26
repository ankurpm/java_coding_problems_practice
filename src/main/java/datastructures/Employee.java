package datastructures;

import java.util.Objects;

public class Employee {

    private String name;
    private String city;
    private int age;

    public Employee() {
    }

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName()) && Objects.equals(getCity(), employee.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity(), getAge());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
