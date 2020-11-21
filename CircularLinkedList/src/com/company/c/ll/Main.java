package com.company.c.ll;

public class Main {

    public static void main(String[] args) {
	  CircularLinkedList circularLinkedList = new CircularLinkedList();
	  Node head = null;
		head=circularLinkedList.pushNode(head,10);
		head=circularLinkedList.pushNode(head,20);
		head=circularLinkedList.pushNode(head,30);
		circularLinkedList.print(head);
    }
}
