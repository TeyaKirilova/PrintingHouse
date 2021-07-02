package com.company.printinghouse;

import com.company.accounting.Order;
import com.company.enums.PageSize;
import com.company.enums.PaperType;

public class Edition extends Order {
    private final String title;
    private PageSize pageSize;
    private PaperType paperType;
    private int pageCount;

    public Edition(int count, String title, PageSize pageSize, PaperType paperType, int pageCount) {
        super(count);
        this.title = title;
        this.pageSize = pageSize;
        this.paperType = paperType;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public PageSize getPageSize() {
        return pageSize;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getEditionPrice() {
        double price = this.getPageCount()
                * this.getPageSize().getFormatValue()
                * this.getPageSize().getFormatValue();

        return price;
    }

    public double sellingPrice() {
        return this.getEditionPrice() * 1.7;
    }

    public double sumTotalExpenses() {
        return this.getEditionPrice() * this.getCount();
    }
}
