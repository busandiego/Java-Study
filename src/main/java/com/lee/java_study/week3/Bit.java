package com.lee.java_study.week3;

public class Bit {

    public static void main(String[] args) {



        // 비트 연산자
        // ~ 부정, not  1 -> 0 , 0 -> 1 (NOT)
        // & 양쪽의 항이 모두 1이면 1반환 (AND)
        // | 양쪽의 항중에 하나라도 1일면 1반환 (OR)
        // ^ 양쪽의 값이 서로 다를때 1반환 (XOR)


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
        int a3 = 0;
        a3 = ~a1;
        System.out.println("~a1:" + ~a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
    }




}
