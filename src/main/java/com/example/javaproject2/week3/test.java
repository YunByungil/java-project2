package com.example.javaproject2.week3;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Set<Integer> set = sol(17);
        for (Integer integer : set) {
            System.out.println("integer = " + integer);
        }

    }

    public static Set<Integer> sol(int n) {
        Set<Integer> set = new HashSet<>();
        int i = 2;
        while (n > 0) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return set;
    }
}
