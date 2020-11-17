package com.company.factorial;

public class FactorialTest {

    public static long findFactorial(int n){
        if(n>=1){
            return n * findFactorial(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
