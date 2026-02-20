package com.example.componentScan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    private int EmployeeId;
    @Value("${java.home}")// injecting paths or other value use ${}
    private String firstname;
    @Value("last name")
    private String lastname;
    @Value("#{5*5}")// injecting expressions #{exp}
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
