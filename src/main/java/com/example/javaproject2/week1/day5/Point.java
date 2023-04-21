package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        return x == y;
    }

    double getDistance(Point p2) {
        int resultX = p2.x - this.x;
        int resultY = p2.y - this.y;

        return Math.sqrt(Math.pow(resultX, 2) + Math.pow(resultY, 2));
    }
}
