package com.lee.java_study.week8.combination;

public class A {

    public void methodA(I i){ // I를 사용! (따라서 A는 B클래스와 관계없음. I 인터페이스랑만 관계 있음  )
        i.methodB();
    }
}
