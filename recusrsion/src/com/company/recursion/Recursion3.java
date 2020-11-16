package com.company.recursion;

public class Recursion3 {
    public static void main(String[] args) {
        int n= 3;
        function(n);

    }

    private static void function(int n){
        if(n>0){
            System.out.println(n);
            function(n-1);
            function(n-1);
        }
    }
}
