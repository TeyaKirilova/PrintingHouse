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

    public int getPageCount() {
        return pageCount;
    }

    public double getEditionPrice() { // calculate material expenses for each book
        double price = this.getPageCount()
                * this.getPageSize().getFormatValue()
                * this.getPageSize().getFormatValue();

        return price;
    }

    public double sellingPrice() {
        return getCount() * (this.getEditionPrice() + (this.getEditionPrice() * 0.7));
    } //
    // make book printing profitable

    //sum expenses for all requested editions
    public double sumTotalExpenses() {
        return this.getEditionPrice() * this.getCount();
    }
}
