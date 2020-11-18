package com.company.ll;

public class Node {

      private int data;
      public Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }


    @Override
    public String toString() {
        return "data=" + data ;
    }
}
