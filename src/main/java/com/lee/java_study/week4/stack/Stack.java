package com.lee.java_study.week4.stack;


import java.util.Arrays;

public class Stack {

    // TODO
    //  int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
    //  void push(int data)를 구현하세요.
    //  int pop()을 구현하세요.


    private int[] stackArr; // 초기화 안하고 할당하는 거 가능함
    private int top = -1;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.stackArr = new int[size];
    }

    /*
     *  @param data Data to insert
     * */
    public void push(int data) {
        // if stack is full, increase size of stackArr, using Arrays.copyOf
        // push하면 top이 올라가는데 length랑 같으면 꽉차있기 때문에 같을 때, length 늘려줌
        if (stackArr.length == top + 1) {
            stackArr = Arrays.copyOf(stackArr, stackArr.length + 5);
            // Arrays.copyOf(원본배열, 복사할 길이);
            size = stackArr.length;
        }

        // increase top, Before assign data. beacuse top initialize -1
        stackArr[++top] = data;
        // TODO top의 수를 증가시킨 index에 data를 집어 넣는다.

    }

    // peek the top data of stackArr
    public int peek() {
        return stackArr[top];
    }

    // pop the top data of stackArr
    public int pop() {
        if (top == -1) {
            System.out.println("There is no more data in the stack, please push data");
            return -1;
        }

        // return top data, and top is reduce by 1;
        // data 꺼내고 그리고 index는 1감소됨 데이터 그 아래에 꺼 나타내야되니까
        return stackArr[top--];
    }
}
