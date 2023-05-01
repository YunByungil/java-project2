package com.example.javaproject2.ch14.sec03.exam01;

public class BeepPrintExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // 0.5초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
