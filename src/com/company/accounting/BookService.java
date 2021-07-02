package com.company.accounting;

import com.company.printinghouse.Edition;

public class BookService implements IBookService {

    public BookService(Edition ed) {
    }

    public double getEditionPrice(Edition ed) {
            double price = ed.getPageCount()
                    * ed.getPageSize().getFormatValue()
                    * ed.getPageSize().getFormatValue();
            return price;
    }


    public double sellingPrice(Edition edition) {
        return getEditionPrice(edition) * 1.7;
    }

    public double outcome(Edition edition, int x) {
         return sellingPrice(edition) * x;
    }
}
