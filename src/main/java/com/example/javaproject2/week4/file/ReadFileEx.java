package com.example.javaproject2.week4.file;

import java.io.*;
import java.io.FileReader;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dbsqu\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv"));
        System.out.println("br.readLine() = " + br.readLine());


    }
}
