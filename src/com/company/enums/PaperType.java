package com.company.enums;

public enum PaperType {
    NEWSPAPER(0.20), STANDARD(0.20), GLOSSY(0.20);

    private double paperTypeValue;

    PaperType(double paperTypeValue) {
        this.paperTypeValue = paperTypeValue;
    }

    public double getFormatValue() {
        return paperTypeValue;
    }
}
