package com.li.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {

        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSub(Employee e) {

        this.subordinates.add(e);
    }

    public void removeSub(Employee e) {

        this.subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {

        return this.subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
