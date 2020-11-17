package com.company.power;

public class PowerProgramTest {


    private static Long power(int base, int exp){
        if(exp!=0){
            return (base * power(base, exp-1));
        }else{
            return 1L;
        }

    }


    public static void main(String[] args) {
        System.out.println(power(4,4));
    }
}
