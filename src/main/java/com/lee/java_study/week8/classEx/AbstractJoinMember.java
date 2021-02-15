package com.lee.java_study.week8.classEx;

public abstract class AbstractJoinMember implements JoinMember {

    private String message = "이런 클래스는 그럼 필요가 없나?";

    @Override
    public void preJoin() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
