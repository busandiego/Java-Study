package com.lee.java_study.week6;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatch {

    //더블디스패치: 다이나믹 디스패치를 두 번 하는 것

    //1. Post에다가 타입을 구별한다.
    interface Post {
        void postOn(SNS sns);

    }

    static class Text implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
            // 자기자신을 오브젝트로 넘긴다
        }
    }

    static class Picture implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
            // 자기자신을 오브젝트로 넘긴다
        }
    }

    // SNS쪽에서 처리를 한다.
    interface SNS {
        void post(Text post);

        void post(Picture post);
    }

    static class Facebook implements SNS {
        @Override
        public void post(Text post) {
            System.out.println("text-facebook");
        }

        @Override
        public void post(Picture post) {
            System.out.println("picture-facebook");
        }
    }

    ;

    static class Twitter implements SNS {
        @Override
        public void post(Text post) {
            System.out.println("text-twitter");
        }

        @Override
        public void post(Picture post) {
            System.out.println("picture-twitter");
        }
    }

    ;


    public static void main(String[] args) {

        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter());

//        for(Post p : posts) {
//            for(SNS s : sns){
//                p.postOn(s);
//            }
//        }
        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));
        // 런타임시점에 오브젝트를 보고 p에 메소드가 들어올지 결정한다.
        // 컴파일시점에 static dispatching 되있는것을 오버라이딩함
        // 타입이 두개라서 정확히 어떤 메소드인지그래서 찍어낼수 없어서 오류생김


        // 여러 같은 종류의 로직이 온다면
        // if( sns instanceof Facebook ){ 을 써서 오브젝트 구분한다
        // type 판별하는데 if문을 사용한건 문제가 있다.
        // 모든 타입체크를 해야되서 놓칠 수 있다. 그리고 instanceof는 쓰면안좋다

        // 해결책
        // 1: Post문에다가 타입을 구분한다. -> 문제해결이 될 수 없음

        // 새로운 클래스를 추가하면서 간편하다
        // 자바는 싱글디스패치 구조이다.

    }

}
