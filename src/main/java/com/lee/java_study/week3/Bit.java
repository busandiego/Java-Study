package com.lee.java_study.week3;

public class Bit {

    public static void main(String[] args) {
        byte v1 = 10;
        // byte v2 = ~v1; // 컴파일 에러

        //00001010
        //00001011



        int v3 = ~v1; //정상
        System.out.println("v3 값은?: " + v3);
        // -11

        byte b1 =10;
        System.out.println("~b1값: " + ~b1); // -11
        int b2 = ~b1 + 1;
        System.out.println("b2 값: " + b2); // 10



        int a1 = 10;
        int a2 = ~a1;
        System.out.println("~a1값: " + ~a1);
    }




}
