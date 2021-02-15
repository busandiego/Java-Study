package com.lee.java_study.week8.classEx;

public class HelloJoinMember implements JoinMember, JoinGroup {



    @Override
    public void preJoin() {
        JoinMember.super.preJoin();
        JoinGroup.super.preJoin();
    }

    @Override
    public void afterJoin() {
        System.out.println("after join Hello member");
    }

    public static void main(String[] args) {
        HelloJoinMember member = new HelloJoinMember();
        member.preJoin();
    }
}
