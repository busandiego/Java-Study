package com.lee.java_study.week3;

// 논리연산자
public class LogicalOperator {


    public static void main(String[] args) {


        int a = 0;
        int b = 0;
        if (a++ == 0 || b++ == 0) {
            System.out.println("Hello");

        }
        System.out.println(a); // 1
        System.out.println(b); // 0
        System.out.println();

        // ++ 앞에 두면
        //  if(++c == 0 || ++d == 0) 연산하기전에
        // c, d가 증가되서 값비교하고 맞으면 첫번째 C에서 빠져나오고 값증가함
        // d는 영향안줌
        int c = 0;
        int d = 0;
        if (++c == 1 || ++d == 1) {
            System.out.println("Hello");

        }
        System.out.println(c); // 1
        System.out.println(d); // 1
        System.out.println();



        // ++ 앞에 두면
        //  if(++e == 0 || ++f == 0) 연산하기전에
        // e, f가 증가되서 값비교했는데 둘다 값이 아니니까
        // e, f 확인하면서 증가됨 hello 출력안됨
        int e = 0;
        int f = 0;
        if (++e == 0 || ++f == 0) {
            System.out.println("Hello");



        }
        System.out.println(e); // 1
        System.out.println(f); // 1
    }
}
