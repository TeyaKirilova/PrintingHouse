package com.company.printinghouse;

import com.company.machines.Machine;
import java.util.List;

public class PrintingHouse {
    private final List<Machine> machines;

    public PrintingHouse(List<Machine> machines) {
        this.machines = machines;
    }

    public void startPrinting(List<Edition> ed){
        this.machines
                .forEach(machine -> new Thread(() ->
                        machine.print(ed))
                        .start());
    }
}
