package com.lee.java_study.week8.referenceimplementation;

public class Bird implements Animal {

    @Override
    public String getName() {
        return "새";
    }

    @Override
    public int getLegs() {
        return 2;
    }
}
