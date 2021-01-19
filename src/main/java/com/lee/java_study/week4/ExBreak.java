package com.lee.java_study.week4;

public class ExBreak {

    public static void main(String[] args) {

        // 사용자가 입력한 값이라고 가정한다.
        int userInput = 10;

        System.out.println(getSum(userInput));

    }

    public static int getSum(int target) {
        int result = 0;
        int adder = 1;

        for (;;){
            if(adder > target ) break;

            System.out.println("adder 값" + adder);
            System.out.println("result값:" + result);
            result = result + adder++;
        }
        return result;
    }
}
