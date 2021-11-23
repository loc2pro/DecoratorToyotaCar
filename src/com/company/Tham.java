package com.company;

public class Tham extends CondimentDecorator {
    XeToyouta xeToyouta;
    public Tham(XeToyouta xeToyouta) {
        this.xeToyouta = xeToyouta;
    }
    public String getDescription() {
        return xeToyouta.getDescription() + ", Tham";
    }
    public double cost() {
        return 1 + xeToyouta.cost();
    }
}