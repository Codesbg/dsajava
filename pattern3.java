package javapractice;

import java.util.Scanner;
import java.lang.String;
public class pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = s.nextInt();

        // number of row is equal to number of column
        for ( int i = 1; i<=n ; i++){
            for (int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
