package com.example.javaproject2.week4;

public class MaxAndMinTest extends MaxAndMin{
    @Override
    public int getMax(int a, int b) {
        return super.getMax(a, b);
    }

    @Override
    public int getMin(int a, int b) {
        return super.getMin(a, b);
    }

    public static void main(String[] args) {
        MaxAndMinTest m = new MaxAndMinTest();
        System.out.println(m.getMax(1,1));
    }
}
