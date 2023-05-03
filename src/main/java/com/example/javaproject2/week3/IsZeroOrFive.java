package com.example.javaproject2.week3;

public class IsZeroOrFive {
    public static void main(String[] args) {
        int num = 555;
        String flagText = "0또는 5로만 이루어진 숫자입니다.";

        while (num > 0) {
            int remainder = num % 10;
            System.out.println("remainder = " + remainder);
            if (remainder % 5 != 0) {
                flagText = "x";
                break;
            }
            num /= 10;
        }

        System.out.println("flagText = " + flagText);
    }
}
