package com.company.ll;

public class LinkedList {

     Node head;

     public void insertAtFirst(int data){
         Node new_node= new Node(data);
         new_node.next = head;
         head = new_node;
     }

     public void insertAtMiddle(Node prev_node, int data){
         if(prev_node== null){
             System.out.println("Prev Node is null ");
         }
         Node new_node= new Node(data);
         new_node.next = prev_node.next;
         prev_node.next = new_node;
     }

     public void insertAtLast(int data){
         Node new_node= new Node(data);
         if(head==null){
             head = new_node;
             return;
         }
         Node last = head;
         while(last.next!=null){
             last = last.next;
         }
         new_node.next = last.next;
         last.next = new_node;
     }

     public void printLinkedList(){
         Node last = head;
         if(last!=null){
             while(last != null){
                 System.out.println(last);
                 last = last.next;
             }
         }else{
             System.out.println("No Data Available Inside Linked List");
         }


     }


}
