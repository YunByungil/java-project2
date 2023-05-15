package com.example.javaproject2.week5;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static void main(String[] args) {

        int score1 = 94;
        int score2 = 94;
        int score3 = 94;

        System.out.printf("%.2f\n", (score1 + score2 + score3 / 3));

        int[] arr = {7, 2, 3, 9, 28, 1};

        sort(arr);


        Integer[] arr2 = {7, 2, 3, 9, 28, 1};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });


        int[] arr3 = {7, 2, 3, 9, 28, 1};
        arr3 = Arrays.stream(arr3)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("arr3 : " + Arrays.toString(arr3));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            sortARound(arr, i);
        }
    }

    private static void sortARound(int[] arr, int i) {
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
