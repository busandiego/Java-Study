package com.lee.java_study.week7;

public class MyBook {

    // private static final String NAME = "KIMKIM";

    public enum MyEnum {

        KEESUN("keesun"), BOOK("book");

        private String text;

        private MyEnum(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }


    }


    public static void main(String[] args) {



        MyBook myBook = new MyBook();
        myBook.print(MyEnum.KEESUN);
        // enum으로 제한하면 type safe하게 가져올 수 있다


    }

    private void print(MyEnum myEnum) {
        System.out.println(myEnum.getText());
    }
}
