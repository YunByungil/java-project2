package com.example.javaproject2.week4;

public class Pyramid2 {
    private String space;
    private String star;

    public Pyramid2(String space, String star) {
        this.space = space;
        this.star = star;
    }

    public String makeALine(int n, int i) {
        return String.format("%s%s\n", space.repeat(i), star.repeat(n + 3 - (i * 2)));
    }
    public String makeParallelogramALine(int n, int i) {
        return String.format("%s%s\n", space.repeat(i), star.repeat(n));
    }

    public static void main(String[] args) {
        Pyramid2 p = new Pyramid2(" ", "*");
        int n = 4;
        for (int i = 0; i < n; i++) {
            System.out.print(p.makeALine(n, i));
        }


        System.out.println("============================");
        for (int i = 0; i < n; i++) {
            System.out.print(p.makeParallelogramALine(n, i));
        }

        System.out.println("============================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("============================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0");
            }
            for (int j = 0; j < n + 3 - (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
