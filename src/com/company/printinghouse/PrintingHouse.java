package com.company.printinghouse;

import com.company.machines.Machine;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintingHouse {
    private final List<Employee> employees;
    private final List<Machine> machines;

    public PrintingHouse(List<Employee> employees, List<Machine> machines) {
        this.employees = employees;
        this.machines = machines;
    }

    public void startPrinting(List<Edition> ed){
        this.machines
                .forEach(machine -> new Thread(() ->
                        machine.print(ed))
                        .start());
    }
}
