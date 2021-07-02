package com.company.accounting;

import com.company.printinghouse.Edition;

public class Order {
    private int count;

    public Order(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "count=" + count +
                '}';
    }
}
