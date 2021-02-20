package com.lee.java_study.week8.referenceimplementation;

public class Cat implements Animal {

    @Override
    public String getName() {
        return "고양이";
    }

    @Override
    public int getLegs() {
        return 4;
    }
}
