package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 10 , b = 10;
        for(int i = 1 ; i <= a ; i++)
        {
            for(int j = 1 ; j <= b ; j++)
            {
                System.out.print( i*j );
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
