package javapractice;

import java.util.Scanner;
import java.lang.String;

public class pattern {
    public static void main( String[] args)
    {
        //solid rectangle
         Scanner s = new Scanner(System.in);
        // nested javapractice.loop
        System.out.println("enter the number of rows");
        int m = s.nextInt();
        System.out.println("enter the number of columns");
        int n = s.nextInt();
        for (int i = 1; i<=m; i++){
            for (int j =1;j<=n; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}