package com.example.javaproject2.week4.factory;

public class Cat extends Animal{
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
