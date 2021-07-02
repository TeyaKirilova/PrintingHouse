package com.company.enums;

public enum PaperType {
    NEWSPAPER(0.02), STANDARD(0.03), GLOSSY(0.04);

    private double paperTypeValue;

    PaperType(double paperTypeValue) {
        this.paperTypeValue = paperTypeValue;
    }

    public double getFormatValue() {
        return paperTypeValue;
    }
}
