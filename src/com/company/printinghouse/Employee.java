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

    public boolean isManager() { //bool function to check if the current employee is manager,
        //it is done in order to help us divide the profit between the managers;
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
