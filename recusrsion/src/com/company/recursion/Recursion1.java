package com.company.recursion;

public class Recursion1 {

    public static void main(String[] args) {
        int n= 3;
        function(n);

    }

    private static void function(int n){
        if(n>0){
            System.out.println(n);
            function(n-1);
        }
    }
}
