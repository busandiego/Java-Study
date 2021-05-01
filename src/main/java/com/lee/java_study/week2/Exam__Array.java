package com.lee.java_study.week2;

import java.util.Arrays;

public class Exam__Array {


    public static void main(String[] args) {

        // 배열을 선언, 초기화하는 다양한 방법
        int[] arr = new int[5];

        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        String[] arr3 = {"2"};

        // 이렇게 하면 주소값만 나오고 배열 안의 값을 볼 수 없음
        System.out.println("arr2 주소값: " + arr2);
        
        
        System.out.println("arr2 배열 값: " + Arrays.toString(arr2));

        Arrays.fill(arr2, 5);

        System.out.println("arr2 배열 값: " + Arrays.toString(arr2));
    }
}
