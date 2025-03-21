package javapractice;

import java.util.Scanner;
import java.lang.String;
public class loop {
    public static void main ( String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter number till you want sum");
        int n = s.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){

           sum=sum+i;
            System.out.println( sum);

        }




    }
}
