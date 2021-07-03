package com.company.enums;

public enum PageSize {
    A1(0.20),A2(0.20),A3(0.20),A4(0.20),A5(0.20);

    private double pageSizeValue;

    PageSize(double paperTypeValue) {
        this.pageSizeValue = paperTypeValue;
    }

    public double getFormatValue() {
        return pageSizeValue;
    }
}
