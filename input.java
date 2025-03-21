package javapractice;

import java .util.*;
import java.lang.String;
public class input {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
       /* int a = s.nextInt();
        int b = s.nextInt();
        int sum = a+b;
        System.out.println(sum);*/

        // to print the table

        System.out.println("Enter the number = ");
        int n = s.nextInt();
        System.out.println("Enter till table you want = ");
        int x = s.nextInt();
        System.out.println(" table for n till x is = ");
        for ( int i=1 ; i<=x ; i ++){
            System.out.println( n + "x" + i + "=" + n*i);
        }
        }
    }

