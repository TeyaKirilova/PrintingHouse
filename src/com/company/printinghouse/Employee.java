package com.company.printinghouse;

import com.company.enums.EmployeeType;

public class Employee {
    private EmployeeType employeeType;
    private double salary;

    public Employee(EmployeeType employeeType, double salary) {
        this.employeeType = employeeType;
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isManager() {
        if (this.employeeType == EmployeeType.MANAGER) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeType=" + employeeType +
                ", salary=" + salary +
                '}';
    }
}
