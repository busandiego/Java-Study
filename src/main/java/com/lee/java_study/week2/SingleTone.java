package com.lee.java_study.week2;


// 싱글톤
public class SingleTone {
    
    private static SingleTone singleTone;

    private SingleTone() {

    }
    
    // 싱글톤이 없을 때 띄어주기 위해
    private static SingleTone getInstance() {
        if (SingleTone.singleTone != null) {
            // 이라인은 실제로 바이트코드로는 두줄이라서
            // 멀티 스레딩 환경에서 문제가 생길 수 있다
            // 그래서 락을 걸어줘야함!
            SingleTone.singleTone = new SingleTone();
        }
        
        return singleTone;
    }





}
