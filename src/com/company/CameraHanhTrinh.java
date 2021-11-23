package com.company;

public class CameraHanhTrinh extends CondimentDecorator {
    XeToyouta xeToyouta;
    public CameraHanhTrinh(XeToyouta xeToyouta) {
        this.xeToyouta = xeToyouta;
    }
    public String getDescription() {
        return xeToyouta.getDescription() + ", CameraHanhTrinh";
    }
    public double cost() {
        return 8 + xeToyouta.cost();
    }
}