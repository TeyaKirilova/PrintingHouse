package com.company.printinghouse;

import com.company.machines.Machine;

import java.util.List;

public class PrintingHouse {
    private List<Employee> employees;
    private List<Machine> machines;

    public PrintingHouse(List<Employee> employees, List<Machine> machines) {
        this.employees = employees;
        this.machines = machines;
    }

    public void startPrinting(Edition ed){
        this.machines
                .forEach(machine -> new Thread(() -> machine.print(ed)).start());
    }
}
