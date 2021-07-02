package com.company;

import com.company.enums.PageSize;
import com.company.enums.PaperType;
import com.company.printinghouse.Edition;

public class Main {

    public static void main(String[] args) {
        Edition ed = new Edition("kur", PageSize.A3, PaperType.STANDARD, 300);
        System.out.printf("Price is : %.2f %n", ed.price());
        System.out.printf("Selling Price is : %.2f %n", ed.sellingPrice());
    }
}
