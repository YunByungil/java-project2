package com.example.javaproject2.codeup.Q_3108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static class User{
        private int num;
        private String name;

        public User() {
        }

        public User(int num) {
            this.num = num;
        }

        public User(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public String getName() {
            return name;
        }

    }
    public static int n, index;
    public static List<User> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int inputNum = Integer.parseInt(st.nextToken());
            String userName = st.nextToken();
            if (str.equals("I")) {
                if (findNum(inputNum)) {
                    continue;
                }
                list.add(new User(inputNum, userName));
            } else {
                if (!findNum(inputNum)) {
                    continue;
                }
                list.remove(findIndex(inputNum));
            }
        }

//        Collections.sort(list, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if (o1.getNum() > o2.getNum()) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        });
//
//        for (User user : list) {
//            System.out.println("user.getNum() = " + user.getNum());
//        }

        List<User> collect = list.stream()
                .sorted(Comparator.comparing(User::getNum))
                .collect(Collectors.toList());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int getIndex = Integer.parseInt(st.nextToken());
            System.out.print(collect.get(getIndex - 1).num + " " + collect.get(getIndex - 1).name);
            System.out.println();
        }

    }

    public static boolean findNum(int inputNum) {
        for (User user : list) {
            if (inputNum == user.getNum()) {
                return true;
            }
        }
        return false;
    }

    public static int findIndex(int inputNum) {
        index = -1;
        for (User user : list) {
            index++;
            if (inputNum == user.getNum()) {
                return index;
            }
        }
        return 0;
    }

}
