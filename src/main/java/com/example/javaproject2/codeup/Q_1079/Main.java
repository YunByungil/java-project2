package com.example.javaproject2.codeup.Q_1079;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char word = 0;
        while (word != 'q') {
            word = st.nextToken().charAt(0);
            System.out.println(word);
        }

    }
}
