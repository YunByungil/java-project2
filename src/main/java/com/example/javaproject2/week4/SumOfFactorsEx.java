package com.example.javaproject2.week4;

public class SumOfFactorsEx {
    public int sumOfFactors(int num) {
        int sum = 1;
//        int divisor = 2;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void printResult(int num) {
        System.out.println(num + "의 약수의 합은 " + sumOfFactors(num) + "입니다.");

    }
}
