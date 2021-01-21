package com.lee.java_study.week4.linkedList2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedImpl implements LinkedList {

    public LinkedImpl() {}


    public LinkedImpl(int data){
        add(null, new ListNode(data), 0);
    }

    public LinkedImpl(ListNode nodeToAdd) {
        add(null, nodeToAdd, 0);
    }


    public ListNode add(ListNode head, ListNode nodeToAdd, int position) { // position == index

        // position이 허용범위를 벗어난 경우
        if (!isAvailablePosition(head, position)) throw new IndexOutOfBoundsException();

        // 아직 연결된 노드가 없는 경우
        if (head == null) return nodeToAdd;

        // nodeToAdd를 head에 위치시키려는 경우
        if(position == 0){
            nodeToAdd.next = head;
            return nodeToAdd;
        }

        ListNode prevNode = getNodeAtThePosition(head, position -1); // 삽입하려는 위치의 바로 이전 노드(position -1)를 가져온다
        nodeToAdd.next = prevNode.next;
        prevNode.next = nodeToAdd;
        return head;
    }

    public ListNode remove(ListNode head, int positionToRemove) { // positionToRemove == index
        // positionToRemove가 가능범위를 벗어난 경우
        if(!isAvailablePosition(head, positionToRemove)
        || positionToRemove == getSize(head)) throw new IndexOutOfBoundsException();

        // 연결리스트가 null인 경우
        if(head == null) return null;

        // head를 제거하는 경우
        if(positionToRemove == 0) return  head.next;

        ListNode prevNode = getNodeAtThePosition(head, positionToRemove - 1);
        // 제거하려는 위치의 바로 이전 노드를 가져온다.
        // prevNode에 해당 노드의 다다음 노드를 연결시킨다.
        prevNode.next = prevNode.next.next;
        return head;

    }

    public boolean contains(ListNode head, ListNode nodeToCheck){
        while(head != null){
            if(head.getData() == nodeToCheck.getData()) { // 순회하며 가져온 노드의 값과 nodeToCheck의 값이 일치하는지 확인한다.
                return true;
            }
            head = head.next; //연결리스트를 head부터 tail까지 순회
        }
        return false;
    }



    // position이 허용가능한 인덱스 값인지 확인
    public boolean isAvailablePosition(ListNode head, int position) {
        if (position < 0 || position > (getSize(head))) {
            // available value : 0 <= position <= linkedlist 크기
            return false;
        }
        return true;
    }

    // 연결리스트의 head를 기준으로 순회하여, position 위치에 있는 노드를 반환
    public ListNode getNodeAtThePosition(ListNode head, int position) {
        for (int i = 0; i < position; i++) {
            head = head.next;
        }

        return head;
    }

    // 현재 노드가 다음 노드와 연결되어 있는지 확인
    public boolean hasNext(ListNode head){
        if(head.next == null) return false;
        return true;
    }

    // 연결리스트의 크기(노드 개수)를 반환
    public int getSize(ListNode head){
        if(head == null) return 0;
        if(!hasNext(head)) return 1;
        ListNode node = head.next;
        int size = 2;

        while(hasNext(node)){
            size++;
            node = node.next;
        }
        return size;
    }

    public String toString(ListNode head){
        if(head == null) return "";
        List<String> nodes = new ArrayList<>();
        ListNode tmp = head;

        while(head != null){
            nodes.add(String.valueOf(head.getData()));
            head = head.next;
        }
        head = tmp;
        return String.join("," , nodes); // 문자열들을 합쳐서 출력함함
    }

}