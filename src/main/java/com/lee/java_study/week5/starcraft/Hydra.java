package com.lee.java_study.week5.starcraft;

public class Hydra extends Zerg {

    String name = "Hydra ";

    @Override
    public String upgrade() {
        return super.tribe + this.name + "upgrade";
    }
}
