package com.example.javaproject2.ch14.sec03.exam03;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000); // 0.5초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.start();

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("띵");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        PrintThread pt = new PrintThread();
        pt.start();
    }
}
