package com.lee.java_study.week4;


public class ConditionExam {
    public static void main(String[] args) {
        int score = 87;

        if (score >= 90) {
            System.out.println("매우 우수합니다.");

        } else if (score >= 80) {
            System.out.println("준수합니다.");
        } else if (score >= 70) {
            System.out.println("노력이 필요합니다.");
        } else if (score >= 60) {
            System.out.println("많은 노력이 필요합니다.");
        } else {
            System.out.println("뭔가 잘못됐습니다.");
        }

        int point;
        point = 0;
        if(score >= 90) ++point;
        System.out.println("point : " + point);
        if(score >= 80) ++point;
        System.out.println("point : " + point);
        if(score >= 70) ++point;
        System.out.println("point : " + point);
        if(score >= 60) ++point;
        System.out.println("point : " + point);
        System.out.println("example 2: " + point);

        int point2;
        point2 = 0;
        if(score >= 90) point2++;
        System.out.println("point2 : " + point2);
        if(score >= 80) point2++;
        System.out.println("point2 : " + point2);
        if(score >= 70) point2++;
        System.out.println("point2 : " + point2);
        if(score >= 60) point2++;
        System.out.println("point2 : " + point2);
        System.out.println("example 3 : " + point2);


    }
}
