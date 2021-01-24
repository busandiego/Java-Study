package com.lee.java_study.week5;

public class InheritanceExam01 {



    public static void main(String[] args) {
        Son son = new Son();
        son.checkMoney();

        son.inheritancedMoneyandSonMoney();
        son.checkMoney();

    }
}



class Father {

    int money = 100;

}

class Son extends Father {
    int money = 10;

    void checkMoney(){
        System.out.println("son's money: " + this.money );
        System.out.println("son's money2: " + money );

        System.out.println("Father's money: " + super.money);
    }

    void inheritancedMoneyandSonMoney(){
        System.out.println("money : " + (super.money + this.money));
    }
}