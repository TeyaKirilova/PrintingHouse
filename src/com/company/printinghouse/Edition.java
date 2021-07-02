package com.company.printinghouse;

import com.company.enums.PageSize;
import com.company.enums.PaperType;

public class Edition {
    private final String title;
    private PageSize pageSize;
    private PaperType paperType;
    private int pageCount;

    public Edition(String title, PageSize pageSize, PaperType paperType, int pageCount) {
        this.title = title;
        this.pageSize = pageSize;
        this.paperType = paperType;
        this.pageCount = pageCount;
    }

    public double price(){
        double price = this.pageCount * this.pageSize.getFormatValue() * this.paperType.getFormatValue();
        return price;
    }

    public double sellingPrice() {
        return price() * 1.7;
    }
}
