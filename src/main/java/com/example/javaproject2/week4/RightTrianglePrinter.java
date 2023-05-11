package com.example.javaproject2.week4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public void printToFile(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        bw.append("aaa");
        bw.flush();
        bw.close();
    }

    public void printToConsole(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }

    public void printShape(int h) {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }

        printToConsole(lines);
    }

    public static void main(String[] args) {
        RightTrianglePrinter r = new RightTrianglePrinter();
        r.printShape(5);
    }
}
