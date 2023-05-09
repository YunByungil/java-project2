package com.example.javaproject2.week4;

public class AbstractTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.cry();
        Animal b = new Cat();
        b.cry();
    }
}
