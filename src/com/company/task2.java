package com.company;

public class task2 {
    public static void main(String[] args) {
        int n = 260;
        int a = 0;
        int b = 0;
        int c = 0;
        int a1;
        int b1;
        int c1;

        a1 = n % 10;
        a = a+a1;


        b1 = n % 100;
        b = b+b1;
        b1 = b1/10;


        c1 = n%1000;
        c = c+c1;
        c1 = c1/100;


        if((a1 > b1) && (a1 > c1))
            System.out.println(a1 + " Це число найбільше.");
        if((b1 > a1) && (b1 > c1))
            System.out.println(b1 +" Це число найбільше.");
        else
            System.out.println(c1 +" Це число найбільше.");
    }
}
