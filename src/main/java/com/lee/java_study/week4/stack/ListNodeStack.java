package com.lee.java_study.week4.stack;

import lombok.Getter;

@Getter
public class ListNodeStack {

    Node topNode;

    @Getter
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

    }

   // push data in the stack
    /*
    *  @param data Data to push
    *
    * */
    public void push(int data){
        if(topNode == null){
            topNode = new Node(data);
        } else {
            Node tempNode = topNode;
            topNode = new Node(data);
            topNode.next = tempNode;
        }
    }

    // pop data
    public int pop(){
        if(topNode != null){
            Node temp = topNode;
            topNode = topNode.next;
            temp.next = null;
            System.out.println("pop data : " + temp.data);
            return temp.data;
        }else {
            System.out.println("There is no stack node plz push any node, Before using pop()");
            return -1;
        }
    }
}
