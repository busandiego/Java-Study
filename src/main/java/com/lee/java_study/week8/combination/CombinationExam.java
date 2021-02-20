package com.lee.java_study.week8.combination;

public class CombinationExam {

    // [강한 결합] 직접적인 관계의 두 클래스 (A -> B)
    class A{
        public void method(B b) { // B를 사용 !! (따라서 B와 관계 있음)
            b.methodB();
        }
    }

    class B {
        public void methodB() {
            System.out.println("methodB()");
        }
    }



    public static void main(String[] args) {
        CombinationExam combinationExam = new CombinationExam();
        CombinationExam.A a = combinationExam.new A();

        CombinationExam combinationExam2 = new CombinationExam();
        //CombinationExam.B b = combinationExam2.new B();
        a.method(combinationExam2.new B());

    }


}
