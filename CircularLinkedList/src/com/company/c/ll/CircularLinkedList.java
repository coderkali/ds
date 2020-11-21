package com.company.c.ll;

public class CircularLinkedList {


    public Node pushNode(Node head_ref, int data){
        Node new_node = new Node();
        Node temp = head_ref;

        new_node.data = data;
        new_node.next = head_ref;

        if(head_ref!=null){
            while(temp.next!=head_ref){
                temp = temp.next;
            }
            temp.next = new_node;
        }else{
            new_node.next = new_node;
        }

        head_ref = new_node;

        return head_ref;
    }

    public void print(Node head){
        if(head!=null){
            Node temp = head;
            do{
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }while (temp != head);
        }
    }


}
