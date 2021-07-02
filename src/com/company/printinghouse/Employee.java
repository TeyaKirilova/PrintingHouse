package com.company.printinghouse;

import com.company.enums.EmployeeType;

public class Employee {
    private EmployeeType employeeType;
    private static final double salary = 900;

    public Employee(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public boolean isManager(EmployeeType et) {
        if (et == EmployeeType.MANAGER) {
            return true;
        }
        return false;

    }
}
