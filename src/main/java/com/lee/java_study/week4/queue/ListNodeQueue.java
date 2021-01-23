package com.lee.java_study.week4.queue;


import lombok.Getter;

import java.util.Arrays;

@Getter
public class ListNodeQueue {

   Node top;
   Node tail;

   int size = 0;

    @Getter
   public class Node{
       int data;
       Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data){
        Node node = new Node(data);

        if(top == null){
            top = node;
            tail = node;
        } else {

            // 이쪽 부분이 잘 이해가 안감.
            Node temp = tail;
            tail = node;
            temp.next = tail;
        }
        size++;
    }

    public void traceQueue(){
        Node trace = top;
        int[] traceArr = new int[size];
        int index = 0;
        while(trace != null){
            traceArr[index] = trace.getData();
            trace = trace.next;
            index++;
        }
        System.out.println(Arrays.toString(traceArr));
    }

    public int dequeue(){
        if(top!=null){
            Node temp = top;
            top = top.next;
            temp.next = null;
            size--;
            return temp.getData();
        } else {
            throw new ArrayIndexOutOfBoundsException("There is not more data to dequeue, please enqueue data before dequeue");
        }
    }


}
