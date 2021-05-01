package com.lee.java_study.week3;


// arithmetic operator 산술 연산자
public class ArithmeticOperator {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        System.out.println("a + b: " + a + b );
        System.out.println("b % a : " + (b%a) ); // -> 2 / 1 => 2 나머지는 0
        System.out.println("a % b : " + (a%b) ); // 1

        System.out.println("e % b : " + (e%b) ); // 1
        System.out.println("b % e : " + (b%e) ); // 2

        System.out.println((23 % 4));

        // 나머지를 5인 식을 만드시오
        System.out.println(11%6);

        // 6의 배수일때 %6을하면 나머지 0으로 나옴
        System.out.println(6%6);
        System.out.println(12%6);
        System.out.println(18%6);








    }



}
