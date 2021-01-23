package com.lee.java_study.week4.linkedList2;

import lombok.Getter;

@Getter
public class LinkedList {
    private ListNode head; //FirstNode
    private ListNode tail; //LastNode
    private Integer size = 0; // size

    @Getter
    class ListNode{
        Integer data;
        ListNode next;
        // The constructor of ListNode
        public ListNode(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    // Insert data (Integer) at the First(head)
    public void addFirst(Integer data){
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            ListNode temp = head;
            node.next = temp;
            head = node;
        }
        size++;
    }
    // Finding node in the linked list Using Index
    public ListNode get(Integer index){
        ListNode findNode = head;
        for (int i = 0; i < index; i++) {
            findNode = findNode.next;
        }
        return findNode;
    }
    // Inserting node in the linked list Using Index Number
    /**
     * @param index where
     * @param data Data to insert
     * */
    public void addAt(Integer index, Integer data){
        ListNode insertNode = new ListNode(data);
        if(size == 0){
            addFirst(data);
        }else{
            get(index -1).next = insertNode;
            insertNode.next = get(index);
        }
    }
    // removing node in the linked list Using Index Number
    /**
     * @param index where
     * */
    public void remove(Integer index){
        get(index -1).next = get(index + 1);
        get(index).next = null;
    }
    // checking node in the linked list Using Index Number
    /**
     * @param data Data to insert
     * */
    public boolean contains(Integer data){
        boolean check = false;
        for(int i = 0; i < size; i++){
            if(head == null) {
                return check;
            } else if(head.data.equals(data)){
                check = true;
            }
            head = head.next;
        }
        return check;
    }
}