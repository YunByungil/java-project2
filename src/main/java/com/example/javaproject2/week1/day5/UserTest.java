package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "윤병일";
        user.phoneNumber = "010-1234-5678";
        user.age = 27;

        User user2 = new User();
        user2.name = "홍길동";
        user2.phoneNumber = "010-1234-5678";
        user2.age = 24;

        User user3 = new User();
        user3.name = "고길동";
        user3.phoneNumber = "010-1234-5678";
        user3.age = 15;

        System.out.printf("%s님은 성인입니까? %s\n", user2.name, user2.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", user3.name, user3.isAdult());


    }
}
