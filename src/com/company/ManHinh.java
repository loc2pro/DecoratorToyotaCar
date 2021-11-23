package com.company;

public class ManHinh extends CondimentDecorator {
    XeToyouta xeToyouta;
    public ManHinh(XeToyouta xeToyouta) {
        this.xeToyouta = xeToyouta;
    }
    public String getDescription() {
        return xeToyouta.getDescription() + ", ManHinh";
    }
    public double cost() {
        return 7 + xeToyouta.cost();
    }
}