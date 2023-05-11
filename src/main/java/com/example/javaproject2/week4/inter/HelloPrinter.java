package com.example.javaproject2.week4.inter;

import java.io.IOException;

public class HelloPrinter {
    Printer2 printer2;

    public HelloPrinter(Printer2 printer2) {
        this.printer2 = printer2;
    }

//    public void print(String message) {
//        System.out.println("message = " + message);
//    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer2.print(message);
        }
    }

    public static void main(String[] args) throws IOException {

        HelloPrinter hp = new HelloPrinter(new ConsolePrinter());
//        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(5, "Hello");

    }
}
