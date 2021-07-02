package com.company.enums;

public enum PageSize {
    A1(0.25),A2(0.20),A3(0.15),A4(0.10),A5(0.05);

    private double pageSizeValue;

    PageSize(double paperTypeValue) {
        this.pageSizeValue = paperTypeValue;
    }

    public double getFormatValue() {
        return pageSizeValue;
    }
}
