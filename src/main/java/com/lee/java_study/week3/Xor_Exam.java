package com.lee.java_study.week3;

import java.util.stream.Stream;

public class Xor_Exam {


    // TODO numbers라는 int형 배열이 있다.
    //  해당 배열에 들어있는 숫자들은 오직 한 숫자를 제외하고 모두 두번씩 들어있다.
    //   오직 한 번만 등장하는 숫자를 찾는 코드를 작성하라.
    public static void main(String[] args){
        Xor_Exam hello = new Xor_Exam();
       // int result = hello.solution(new int[] {5, 2, 5, 1, 2, 4, 5}); // 1출력하기
        //System.out.println(result);


        // 하나만 출력하는 함수
        Integer[] array = new Integer[]{5, 10, 20, 10, 20, 58, 58, 10};
        Stream.of(array).distinct().forEach(i -> System.out.print(" " + i));

    }


}
