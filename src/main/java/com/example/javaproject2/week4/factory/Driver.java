package com.example.javaproject2.week4.factory;

public class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        boltBall.identify();
        kittyTower.identify();

    }
}
