package com.lee.java_study.week6;

import java.util.Arrays;
import java.util.List;

public class DispatchEx2 {

    static abstract class Service {
        abstract void run();
    }

    static class MyService1 extends Service {
        @Override
        void run() {
            System.out.println("run1");
        }
    }

    static class MyService2 extends Service {
        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
//        MyService1 svc = new MyService1();
//        svc.run();
//
//        MyService2 svc2 = new MyService2();
//        svc2.run();


        // 이렇게 한다면?
        Service svc = new MyService1();

        // 컴파일 시점에서 어떤 것을 실행할지 모른다
        svc.run();
        // 호출과정에 처음 들어가 있는것
        // receiver parameter

        List<Service> svcList = Arrays.asList(new MyService1(), new MyService2());
        svcList.forEach(s -> s.run());
        svcList.forEach(Service::run); // 메소드 레퍼런스. 메소드 타입이 일치하면 바로 저렇게 쓸수있음


        // Method Signature
        // (name, parameter types) 두 개가 같으면 오버라이딩함
//        String hello(int id){
//            return "";
//
//        }
        ;
//        List<String> hello(int id){
//            return null;
//        }
        // 여기서 hello ,(int id) 두개만 시그니처로 판단함
        // 리턴타입 달라도 시그니처 두개 같아서 한개 더 못 만듬
        // 리턴타입은 관계 없다


        // Method Type
        // (return type, method type parameter, method argument types, exception) => Method Reference
        // 리턴 타입 또한 일치해야지 쓸 수 있다.

    }

}
