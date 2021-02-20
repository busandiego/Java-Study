package com.lee.java_study.week8.referenceimplementation;

public class Main {

    public static void printAnimal(Animal animal) {
        System.out.println("이름 : " + animal.getName());
        System.out.println("다리 개수 : " + animal.getLegs());
    }


    public static void main(String[] args) {

        Cat cat = new Cat();
        Bird bird = new Bird();

       // System.out.println(cat.getName()); // 고양이
       // System.out.println(cat.getLegs()); // 4
        // System.out.println(bird.getName()); // 새
        // System.out.println(bird.getLegs()); // 2

        // cat, bird 인스턴스는 Animal 타입으로도 생성 가능합니다.

        Animal cat2 = new Cat();
        Animal bird2 = new Bird();

        System.out.println(cat2.getName());
        System.out.println(cat2.getLegs());
        System.out.println(bird2.getName());
        System.out.println(bird2.getLegs());

        printAnimal(cat2);
        printAnimal(bird2);


    }

}
