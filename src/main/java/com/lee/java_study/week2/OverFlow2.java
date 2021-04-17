package com.lee.java_study.week2;

public class OverFlow2 {

    public static int max = 2_100_000_000;
    public static int min = -2_100_000_000;


    static void cal(int plus, int minus) {

        max = max + plus;

        min = min + minus;

    }


    public static void main(String[] args) {


            cal(10_000_000, -200_000_000);
        System.out.println(max);
        System.out.println(min);
            if (max < 0 ) {
                System.out.println("max: " + max);
                throw new ArithmeticException("더하기 오버플로우 발생!");

            } else if (min > 0) {
                System.out.println("min: " + min);
                throw new ArithmeticException("마이너스 오버플로우 발생!");
            }




    }
}

