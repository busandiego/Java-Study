package com.lee.java_study.week2;

public class Exam__003 {


    public static void main(String[] args) {
        int value1; // 정수형 타입의 변수 value1를 선언

        int value2, value3, value4; // 여러개 선언 가능

        // 1. 선언과 동시에 초기화
        int value5 = 10;

        // 2. 선언한 다음 초기화
        int value6;
        value6 = 20;


        // 타입캐스팅과 타입프로모션
       float floatV = 1.23f; // 4Byte

        long longV = (long)floatV;  // long => 8Byte

        long longV2 = 2;

        float floatV2 = longV2;


        long v3 = 2;
        int intV = (int)v3;
        int intV2 = 3;

        long longV5 = intV2;

    }
}
