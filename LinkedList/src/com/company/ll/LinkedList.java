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

     public void deleteNodeById(int key){
         Node temp = head;
         Node prev = null;

         //Case1

         if(temp!=null && temp.data==key){
             head = temp.next; //Instead of assign null
             return;
         }

         //Case2
         if(temp!=null && temp.data!=key){
             prev = temp;
             temp = temp.next;
         }

         //case 3
         if(temp==null){
             return;
         }

         prev.next = temp.next;

     }


     public void deletAll(){
         head = null;
     }

     public int getSize(){
         int count = getNodeCount(head);
         System.out.println(count);
         int count1= getNodeCount();
         System.out.println(count1);
         return count;
     }


     private int getNodeCount(Node node){
         if(node == null){
             return 0;
         }
         return 1 + getNodeCount(node.next);
     }

     public Node reverseLinkedList(Node node){
         Node prev = null;
         Node current = node;
         Node next = null;
         while(current!=null){
             next = current.next;
             current.next = prev;

             prev = current;
             current = next;
         }
         node = prev;
         return node;
     }

     private int getNodeCount(){
         int i=1;
         Node node = head;
         while(node!=null && node.next!=null){
             node = node.next;
             i++;
         }
         return i;
     }
}
