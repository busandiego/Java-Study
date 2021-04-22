package com.lee.java_study.week2;

public class PrimitiveType {

    int a ;

    static class ReferenceType {

    }

    static ReferenceType referenceType2; // 이렇게하면 Null 나옴

    public static void main(String[] args) {

        PrimitiveType primitiveType = new PrimitiveType();

        System.out.println(primitiveType.a);
        ReferenceType referenceType = new ReferenceType(); // null이 아님
        System.out.println(referenceType);
        System.out.println(referenceType2);
        if (primitiveType == null) {
            System.out.println("null");
        } else {
            System.out.println("null 아님");
        }

        if (referenceType2 == null) {
            System.out.println("null");
        } else{
            System.out.println("null 아님");
        }
    }
}
