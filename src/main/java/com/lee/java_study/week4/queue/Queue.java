package com.lee.java_study.week4.queue;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class Queue {
    public int[] queueArr;
    public int top = -1;
    public int tail = -1;
    public int size;

    public Queue(int size) {
        this.queueArr = new int[size];
        this.size = size;
    }

    /*
    * method to insert data in the queueArr
    *  @param data insert data in queue
    * */
    public void enqueue(int data){
        // If there is no more space to inserting data, extends the queueArr
        if(queueArr.length == (tail + 1)){
            size = size + 5;
            queueArr = Arrays.copyOf(queueArr, size);
        }
        queueArr[++tail] = data;
        top = (top == -1) ? 0 : top;
        // top == -1이 true면 0을 대입하고, false면 그냥 top
        // 아무것도 없을 때는 top -1이고 어떤게 data가 들어가면 top은 쭉~ 0

    }

    /*
    * method to delete & print data at top data in queueArr.
    * */
    public int dequeue(){
        // if the statement of queueArr throw Error ArrayIndexOutOfBoundsException.
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("there is no more data to dequeue, you need to enqueue Before do this");
        }

        int result = queueArr[top];
        // this scope is left shifting the array.
        if(tail != 0){
            for (int i = 0; i < queueArr.length; i++) {
                // queueArr.length 이상의 값을 index해서 넣을 순 없다
                if(i+1 != queueArr.length){
                    queueArr[i] = queueArr[i+1];
                }

//                if(i != queueArr.length -1){
//                    queueArr[i] = queueArr[i+1];
//                }

            }
        }
        // if top and tail is Zero, top sub 1.
        top = (top == tail--) ? top-1 : top;
        return result;
    }



    // checking empty statement of queue
    public boolean isEmpty(){
        return top == -1 && tail == -1;
        // top == -1 이고 tail == -1이  true면 return true
        // top == -1이 아니거나 혹은 tail == -1 이 아니면 return false
    }

}
