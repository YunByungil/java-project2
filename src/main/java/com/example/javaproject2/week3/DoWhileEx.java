package com.example.javaproject2.week3;

public class DoWhileEx {
    public static void main(String[] args) {
        // 0이 나올 때 까지 출력해보세요
        int num = 10;
        do {
            System.out.println("num = " + num);
            num -= 10;
        } while (num == 0);
    }
}
