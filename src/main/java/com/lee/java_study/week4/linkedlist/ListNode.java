package com.lee.java_study.week4.linkedlist;

public class ListNode {
    private int data;
    private ListNode link;

    public ListNode(int data) {
        this.data = data;
        this.link = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getLink(){
        return link;
    }

    public void setLink(ListNode link){
        this.link = link;
    }
}
