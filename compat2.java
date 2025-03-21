package javapractice;

import java.util.Scanner;
import java.lang.String;
public class compat2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // butterfly javapractice.pattern
        System.out.println("enter the number ");
        int n = s.nextInt();
        //first part ke star
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // second half part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            // lower half of butterfly
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // spaces
                int space = 2 * (n - i);
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                // second half part
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
