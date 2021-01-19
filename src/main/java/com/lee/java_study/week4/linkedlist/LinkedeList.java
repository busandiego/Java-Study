package com.lee.java_study.week4.linkedlist;

public class LinkedeList {

    // 헤더추가
    public ListNode addHead(ListNode nodeToAdd) {
        return nodeToAdd;
    }

    // 노드 추가
    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {

        // head로 넣을 경우.
        if (position == 0) {
            nodeToAdd.setLink(head);
            return nodeToAdd;
        }

        ListNode tempNode = head;


        // 해당 Node를 넣어야할 position 전까지 이동
        for (int i = 0; i < position - 1; i++) {

            // position 값이 리스트 사이즈보다 클 경우 position값과 상관없이 뒤로 붙여준다.
            if (tempNode.getLink() == null) {
                break;
            }
            tempNode = tempNode.getLink();

        }

        // 이전노드의 링크를 추가된 노드의 주소로 연결하고,
        // 추가된 노드의 링크를 기존 연결된 노드로 변경
        // 변경 전: A(tempNode) -> B
        // 변경 후: A(tempNode) -> nodeToAdd -> B
        nodeToAdd.setLink(tempNode.getLink());
        tempNode.setLink(nodeToAdd);

        //생각하면 맞음
        return head;
    }

    // 노드 삭제
    public ListNode remove(ListNode head, int positionToRemove) {
        ListNode tempNode = head;

        // head를 삭제할경우 헤드만 변경해준다.
        if (positionToRemove == 0) {
            head = null;
            return tempNode.getLink();
        }

        for (int i = 0; i < positionToRemove - 1; i++) {

            //삭제 position이 클 경우 아무런 삭제도 하지 않음
            if (tempNode.getLink() == null) {
                return head;
            }

            tempNode = tempNode.getLink();
        }

        // 변경전 : A(tempNode) -> B(positionToRemove) -> C
        // 변경후 : A(tempNode) -> C
        tempNode.setLink(tempNode.getLink().getLink());
        return head;
    }

    // 해당 노드가 포함되어 있는지 여부
    public boolean contains(ListNode head, ListNode nodeToCheck) {
        ListNode tempNode = head;
        boolean result = false;

        while (true) {
            if (tempNode.getLink() == null) {
                break;
            }

            if (tempNode.equals(nodeToCheck)) {
                result = true;
                break;
            }

            tempNode = tempNode.getLink();
        }

        return result;
    }

    // 결과값 출력함수
    public String toString(ListNode head) {
        String str = "";
        ListNode tempNode = head;

        while (true) {
            str += tempNode.getData() + " ";

            if (tempNode.getLink() == null) {
                break;
            }
            tempNode = tempNode.getLink();
        }

        return str;
    }


}
