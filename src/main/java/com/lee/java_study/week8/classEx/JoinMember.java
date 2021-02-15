package com.lee.java_study.week8.classEx;

public interface JoinMember {

    // 세미콜론 생략 가능
    default void preJoin(){}
    default void afterJoin(){}

}
