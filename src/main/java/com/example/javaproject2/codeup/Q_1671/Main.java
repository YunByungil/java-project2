package com.example.javaproject2.codeup.Q_1671;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 바위 = 0, 가위 = 1, 보 = 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int me = Integer.parseInt(st.nextToken());
        int com = Integer.parseInt(st.nextToken());

        startGame(me, com);
    }

    public static void startGame(int me, int com) {
        if (me == com) {
            System.out.println("tie");
            return;
        }

        if (me == 0 && com == 1) {
            System.out.println("win");
        } else if (me == 1 && com == 2) {
            System.out.println("win");
        } else if (me == 2 && com == 0) {
            System.out.println("win");
        } else if (me == com) {
            System.out.println("tie");
        } else {
            System.out.println("lose");
        }

//        if (me == 0) {
//            if (com == 1) {
//                System.out.println("win");
//            }
//
//            if (com == 2) {
//                System.out.println("lose");
//            }
//        }
//
//        if (me == 1) {
//            if (com == 2) {
//                System.out.println("win");
//            }
//
//            if (com == 0) {
//                System.out.println("lose");
//            }
//        }
//
//        if (me == 2) {
//            if (com == 0) {
//                System.out.println("win");
//            }
//
//            if (com == 1) {
//                System.out.println("lose");
//            }
//        }
    }
}
