package com.lee.java_study.week2;

public class Exam__002 {

    public static void main(String[] args) {
        System.out.println("====== 정수 리터럴 =======");

         int a = 0b10; // 접두문자 0b -> 2진수
         int b = 010; // 접두문자 0 -> 8진수
         int c = 10; // 접두문자 없음 -> 10진수

         long longD = 10l; // 접미문자 l 또는 L -> long 타입 리터럴

        System.out.println("2진수 정수 리터럴: " + a);
        System.out.println("8진수 정수 리터럴: " + b);
        System.out.println("10진수 정수 리터럴: " + c);
        System.out.println("long타입 정수 리터럴: " + longD );
        System.out.println();

        System.out.println("======== 실수 리터럴 ===========");
        // 실수 타입 리터럴은 double 타입으로 컴파일 되므로
        // float 타입인 경우 명시적으로 f 또는 F를 명시해줘야 한다.
        // double 타입도 d나 D를 명시해줘도 되지만, 안해줘도 상관없다.

        float float_v1 = 1.234F;
        double double_v1 = 1.234;
        double double_v2 = 1.234d;
        double double_v3 = 1234E-3d;
        // - E 또는 e 가 숫자 뒤에 존재하는 리터럴 : 10 진수 지수와 가수 표현
        // ex) 5E8 // = 5 x 10^8
        System.out.println("float 타입 실수 리터럴: " + float_v1);
        System.out.println("double 타입 실수 리터럴1 : " + double_v1);
        System.out.println("double 타입 실수 리터럴2 : " + double_v2);
        System.out.println("double 타입 실수 리터럴3 : "+ double_v3);
        System.out.println();

        System.out.println("====== 문자 리터럴 ======");
        char char_v1 = 'C';
        char char_v2 = '민';
        char char_v3 = '\u1234'; // 백슬러시 u 다음 4자리 16진수 유니코드

        System.out.println("문자 리터럴 1: " + char_v1);
        System.out.println("문자 리터럴 2: " + char_v2);
        System.out.println("문자 리터럴 3: " + char_v3);
        System.out.println("문자 리터럴 아무거나 : " + '\u1235');
        System.out.println();

        System.out.println("=========== 부울(논리) 리터럴 ==========");
        boolean boolean_v1 = true;
        boolean boolean_v2 = 12 > 34;

        System.out.println("부울(논리) 리터럴 1 : "  + boolean_v1);
        System.out.println("부울(논리) 리터럴 2 : "  + boolean_v2);
        System.out.println();


        System.out.println("======= 문자열 리터럴 =======");
        String string_v1 = "hello world";
        System.out.println("문자열 리터럴: " + string_v1);
        System.out.println();

    }

}
