package javapractice;

import java.util.Scanner;
import java.lang.String;
public class pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the number of rows");
        int n = s.nextInt();
        for (int i = n ; i>= 1 ; i--){ // ye javapractice.loop invert
            for (int j=1 ; j<=i ; j++){ // ye same
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
