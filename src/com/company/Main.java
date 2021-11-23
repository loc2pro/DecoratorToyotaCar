package com.company;

public class Main {

    public static void main(String[] args) {
        XeToyouta xeToyouta = new ToyotaAT();
        System.out.println(xeToyouta.getDescription()
                + " $" + xeToyouta.cost());
        XeToyouta xeToyouta2 = new ToyotaCVT();
        xeToyouta2 = new ManHinh(xeToyouta2);
        xeToyouta2 = new Tham(xeToyouta2);
        xeToyouta2 = new CameraHanhTrinh(xeToyouta2);
        System.out.println(xeToyouta2.getDescription()
                + " $" + xeToyouta2.cost());
        XeToyouta xeToyouta3 = new ToyotaMT();
        xeToyouta3 = new ManHinh(xeToyouta3);
        xeToyouta3 = new CameraLui(xeToyouta3);
        xeToyouta3 = new CameraHanhTrinh(xeToyouta3);
        System.out.println(xeToyouta3.getDescription()
                + " $" + xeToyouta3.cost());
    }
}
