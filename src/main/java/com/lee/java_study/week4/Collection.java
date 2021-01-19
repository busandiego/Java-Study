package com.lee.java_study.week4;

import java.util.ArrayList;
import java.util.List;

public class Collection {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int sum;

        for (int i = 0; i < 100; ++i) {
            list.add(i);
        }


        //1. 조건부에서 size를 사용했을 경우
        long case_1_start_time = System.nanoTime();
        sum = 0;
        for (int i = 0; i < list.size(); ++i) {
            sum = sum + list.get(i);
        }

        long case_1_end_time = System.nanoTime();
        System.out.println("case 1 ::" + (case_1_end_time - case_1_start_time));


        // 2. 조건부에 미리 구해둔 size를 사용했을 경우
        long case_2_start_time = System.nanoTime();
        sum = 0;
        int size = list.size();
        for (int i = 0; i < size; ++i) {
            sum = sum + list.get(i);
        }

        long case_2_end_time = System.nanoTime();
        System.out.println("case 2 ::" + (case_2_end_time - case_2_start_time));



    }
}


