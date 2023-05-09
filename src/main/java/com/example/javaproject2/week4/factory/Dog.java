package com.example.javaproject2.week4.factory;

public class Dog extends Animal{
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
