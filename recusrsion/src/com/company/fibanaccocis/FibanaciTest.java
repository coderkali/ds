package com.company.fibanaccocis;

public class FibanaciTest {


    static int num1 =0 ; static int num2=1; static int num3 =0;

    public static void findFibanocci(int n){
        if(n>0){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+num3);
            findFibanocci(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.print(num1+ " "+num2);
        int count =8;
        findFibanocci(count-2);
        System.out.println();
        System.out.println("Last Value Is Fibanocci :: " +num3);
    }
}
