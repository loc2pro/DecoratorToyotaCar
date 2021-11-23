package com.company;

public class CameraLui extends CondimentDecorator {
    XeToyouta xeToyouta;
    public CameraLui(XeToyouta xeToyouta) {
        this.xeToyouta = xeToyouta;
    }
    public String getDescription() {
        return xeToyouta.getDescription() + ", CameraLui";
    }
    public double cost() {
        return 5 + xeToyouta.cost();
    }
}