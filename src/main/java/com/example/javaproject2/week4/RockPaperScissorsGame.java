package com.example.javaproject2.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissorsGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = (int) (Math.random() * 3) + 1;
//        System.out.println("com = " + com);
        while (true) {
            System.out.println("바위: 0, 가위: 1, 보: 2 입력하세요.");
            int me = Integer.parseInt(br.readLine());
            if (game(me, com)) {
                break;
            }
        }
    }

    public static boolean game(int me, int com) {
        if (me == 0 && com == 1) {
            System.out.println("이겼습니다.");
            return true;
        } else if (me == 1 && com == 2) {
            System.out.println("이겼습니다.");
            return true;
        } else if (me == 2 && com == 0) {
            System.out.println("이겼습니다.");
            return true;
        } else if (me == com) {
            System.out.println("비겼습니다.");
            return false;
        } else {
            System.out.println("졌습니다.");
            return false;
        }
    }
}
