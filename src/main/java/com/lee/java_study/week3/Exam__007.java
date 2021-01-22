package com.lee.java_study.week3;

public class Exam__007 {

    // instance of
    public static void main(String[] args) {

        MyParent_0 myParent_0 = new MyParent_0();
        MyParent_1 myParent_1 = new MyParent_1();
        MyParent_2 myParent_2 = new MyParent_2();

        System.out.println("expect false ::" + (myParent_0 instanceof MyInterface));
        System.out.println("expect true ::"  + (myParent_1 instanceof MyInterface));
        System.out.println("expect true ::"  + (myParent_2 instanceof MyInterface));

        System.out.println("expect true ::"  + (myParent_1 instanceof MyParent_2));



        /*
        * instanceof 연산 결과가 true일 경우
        * 해당 타입의 변수에 값을 할당할 수 있다.
        * */
        if(myParent_1 instanceof MyInterface){
            MyInterface myInterface = new MyParent_1();
            System.out.println("자신의 상위 타입의 변수에 값을 할당할 수 있다. ::" + (myInterface !=null));
        }



    }

}

class MyParent_0 {}
class MyParent_1 extends MyParent_2{}
class MyParent_2 implements MyInterface{}
interface MyInterface{}

