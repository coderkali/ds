package com.company.combination;

import com.company.factorial.FactorialTest;

public class CombinationTest {

    public static void main(String[] args) {
        int n= 5;
        int r = 3;
        findCombination(n, r);
    }

    private static void findCombination(int n, int r) {
        long nFactorial = FactorialTest.findFactorial(n);
        long rFactorial = FactorialTest.findFactorial(r);
        long nrFactorial = FactorialTest.findFactorial(n - r);
        System.out.println( (nFactorial/(rFactorial*nrFactorial)) );
    }
}
