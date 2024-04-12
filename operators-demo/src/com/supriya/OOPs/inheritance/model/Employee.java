package com.supriya.OOPs.inheritance.model;

public class Employee extends Person{
    public String name ;
    public String city;
    public int employeeId;
    public String dept;
    public int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", employeeId=" + employeeId +
                ", dept='" + dept + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
