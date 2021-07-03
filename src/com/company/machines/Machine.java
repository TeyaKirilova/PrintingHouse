package com.company.machines;

import com.company.enums.Color;
import com.company.printinghouse.Edition;

import java.util.List;
import java.util.UUID;

public class Machine {
    private final Color color;
    private final int maxCapacity;
    private final UUID uuid;
    private final int pagesPerMinute;


    public Machine(Color color, int maxCapacity, int pagesPerMinute) {
        this.color = color;
        this.maxCapacity = maxCapacity;
        this.pagesPerMinute = pagesPerMinute;
        this.uuid = UUID.randomUUID();
    }

    public Color getColor() {
        return color;
    }

    public void print(List<Edition> ed) {
        int production = 0;
        for (var e : ed) {
            var tmp = e.getCount() * e.getPageCount();
            production += tmp;
        }
        var delay = (long) ((double) 60 / (double) this.pagesPerMinute * 1000);
        for (int i = 0; i < production; i++) {
            try {
                Thread.sleep(delay);
                var str = String.format("Machine %s printed in %s color", this.uuid.toString(), getColor());
                System.out.println(str);
            } catch (InterruptedException e) {
                var s = String.format("Machine %s broke down!", this.uuid.toString());
                System.out.println(s);
            }
        }
    }


}
