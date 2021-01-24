package com.lee.java_study.week5;

public class GrandSon extends Son{

    int money;

    @Override
    void checkMoney() {
        money = 0;
        System.out.println("grandSon has no money: " + money);
    }

    @Override
    void inheritancedMoneyandSonMoney() {
        System.out.println("he is young");

    }

    public static void main(String[] args) {
        GrandSon grandSon = new GrandSon();

        grandSon.checkMoney();
        grandSon.inheritancedMoneyandSonMoney();

    }

}
