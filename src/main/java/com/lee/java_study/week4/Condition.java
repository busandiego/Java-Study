package com.lee.java_study.week4;


//
public class Condition {


    public static void main(String[] args) {
        boolean condition_1 = true;
        boolean condition_2 = false;

        if (condition_1 && condition_2 && condition_1) {
            System.out.println("condition_1과 condition_2 모두 참입니다.");
        } else {
            System.out.println("condition_1과 condition_2 둘 중 하나가 거짓이 있습니다.");
        }

        Double calPer = 101.00;


        // 이렇게 하면 nullsafe 가 안됨
        // null일때는 안타야 됨.
        // 그래서
        if (calPer >= 100 && calPer != null) {
            System.out.println("100이상은 안됩니다.");

        }


    }


}
