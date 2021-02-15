package com.lee.java_study.week8.bankexam;

public class KBBank implements Bank {

    @Override
    public void withDraw(int price) {

        System.out.println("KB은행만의 인출로직...");
        if(price <= Bank.MAX_NUMBER){
            System.out.println(price + " 원을 인출한다.");

        } else {
            System.out.println(price + " 원을 인출실패.");
        }

    }

    @Override
    public void deposit(int price) {
        System.out.println("KB은행만의 입금 로직..." + price + " 원을 입금한다.");
    }


}
