package com.lee.java_study.week1;

public class Hello {

    private int one = 1;
    private int three = 3;

    public int plus(int first, int second) {

        if ((first + second) != 0) {
            return first + second;

        } else{
            return -1;
        }

    }


    public static void main(String[] args) {
        System.out.println("hi");
        Hello hello = new Hello();
        int plusNum = hello.plus(hello.one, hello.three);
        System.out.println(plusNum);

    }
}
