package com.lee.java_study.week6;

public class Dispatch {

    static class Service{
        void run(int number){
            System.out.println("run(" +number+ ")");
        }

        void run(String msg){
            System.out.println("run(" + msg + ")");
        }

    }

    public static void main(String[] args) {
        new Service().run(1);
        new Service().run("Dispatch");
        // static dispatching
        // run()은 컴파일되는 시점에서 실행될 것을 알고 있다. ->
        // 실행시점이 되지 않아도 어느 메소드로 호출이 일어날 것인지 안다.



    }
}
