package com.lee.java_study.week4;


//
public class ForExam {


    public static void main(String[] args) {

        // 10부터 100까지 출력하는 예시

        int index;
        for (index = 10; index<= 100; index = index + 10){
            System.out.println("index 값: " + index);
        }

        System.out.println("최종 index 값: " + index);

        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // for문 역시 실행 블록이 한줄이라면 블록 {}을 생략할 수 있다

        for(int i = 0; i<myArray.length; ++i){
            sum += myArray[i];
        }
        System.out.println("총합 :" + sum);


        int sum2 = 0;
        for(int elem : myArray ){
            sum2 = sum2 + elem;
        }
        System.out.println("총합 2: " + sum2);




        //////////////////////////////////////////

        for(int i= 0, j=10; i!=j; ++i, --j){
            System.out.println(i + "::" + j);
        }


        for(int i= 0, j=10; i!=j; i++, j--){
            System.out.println(i + "::" + j);
        }


    }





}
