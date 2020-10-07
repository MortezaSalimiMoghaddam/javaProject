package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a , b ;
        int index = -1 ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers greater than 1:");
        a = s.nextInt();
        b = s.nextInt();
        for(int i = 2 ; i < Math.max(a , b) ; i++ )
        {
            if (((a % i) == 0) && ((b % i) == 0))
            {
                System.out.println("a & b are not prime in comparison");
                index = 1;
                break;
            }
        }
        if( index == -1)
        {
            System.out.println("a & b are prime in comparison");
        }
    }
}
