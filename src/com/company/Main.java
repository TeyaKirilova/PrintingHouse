package com.company;

import com.company.accounting.BookService;
import com.company.enums.PageSize;
import com.company.enums.PaperType;
import com.company.printinghouse.Edition;

public class Main {

    public static void main(String[] args) {
        Edition ed = new Edition("Mathematics", PageSize.A3, PaperType.STANDARD, 300);
        BookService bk = new BookService(ed);
        System.out.printf("Price is : %.2f %n", bk.getEditionPrice(ed));
        System.out.printf("Selling Price is : %.2f %n", bk.sellingPrice(ed));
        System.out.printf("Outcome is:  %.2f %n", bk.outcome(ed, 10));
    }
}
