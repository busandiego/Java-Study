package com.lee.java_study.week8.classEx;

public class NotJoinMember implements JoinMember {

    @Override
    public void afterJoin() {
        System.out.println("멤버용 새 글이 올라왔어요");
    }
}
