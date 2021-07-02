package com.company.accounting;

import com.company.printinghouse.Edition;

public interface IBookService {
     double getEditionPrice(Edition ed);


    double sellingPrice(Edition edition);

    double outcome(Edition edition, int x);
}
