package com.example.javaproject2.week5;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        Character[] c = {'f','a','b','g','e','c'};

        sortAsc(c);
        System.out.println("Asc = " + Arrays.toString(c));
        sortDesc(c);
        System.out.println("Desc = " + Arrays.toString(c));

    }

    private static void sortAsc(Character[] c) {
        Arrays.sort(c, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        });
    }
    private static void sortDesc(Character[] c) {
        Arrays.sort(c, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
    }
}
