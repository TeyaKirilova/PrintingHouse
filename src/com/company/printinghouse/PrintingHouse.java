package com.company.printinghouse;

import java.util.List;

public class PrintingHouse {
    private List<Employee> employees;
    private List<Edition> editions;

    public PrintingHouse(List<Employee> employees, List<Edition> editions) {
        this.employees = employees;
        this.editions = editions;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Edition> getEditions() {
        return editions;
    }
}
