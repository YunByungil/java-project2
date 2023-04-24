package com.example.javaproject2.week2;

public class FloatAndDouble {
    public static void main(String[] args) {
        float f = 1.23e10f;
        double d = 1.23e10;

        System.out.printf("%f\n", f);
        System.out.printf("%f\n", d);

        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double d10 = 1.23e10;

        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        System.out.println("d10 = " + d10);

        float f1 = 3.141592653589793f;
        System.out.println(f1);
    }
}
