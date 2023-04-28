package com.example.javaproject2.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "일";
        String time = "휴진";
        switch (day) {
            case "월", "화", "목", "금":
                time = "09:30-18:30";
                break;
            case "토":
                time = "09:30-13:00";
                break;
            case "수", "일":
                time = "휴진";
                break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
