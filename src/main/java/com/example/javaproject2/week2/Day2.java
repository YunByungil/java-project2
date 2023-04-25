package com.example.javaproject2.week2;

public class Day2 {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0, 1) == str2);
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());

        System.out.println(str1.hashCode());
        System.out.println("GOLD".hashCode());
        System.out.println("new String(\"GOLD\").hashCode() = " + new String("GOLD").hashCode());
    }
}
