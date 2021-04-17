package com.lee.java_study.week2;

public class OverFlow {

    public static final int MAX = 2_100_000_000;
    public static final int MIN = -2_100_000_000;


    static int[] OverFlowReturn() {
        int[] arr = new int[2];

        arr[0] = MAX;
        arr[1] = MIN;

        return arr;
    }




    public static void main(String[] args) {
        int[] arr = OverFlowReturn();
         int MAX = arr[0] + 200_000_000;
         int MIN = arr[1] + - 200_000_000;

        System.out.println("StackOverFlow: "  + MAX);
        System.out.println("StackOverFlow: " + MIN );



    }
}

