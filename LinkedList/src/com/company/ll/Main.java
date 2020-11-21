package com.company.ll;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.printLinkedList();
        linkedList.insertAtFirst(1);
        linkedList.printLinkedList();
        linkedList.insertAtLast(2);
        linkedList.printLinkedList();

        linkedList.getSize();

        System.out.println(linkedList.reverseLinkedList(linkedList.head));

    }
}
