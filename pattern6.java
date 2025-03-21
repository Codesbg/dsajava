package javapractice;

import java.util.Scanner;
import java.lang.String;
public class pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// here print numbers ka half pyramid we use 2 loops as previous one we use
        System.out.println("enter the number of rows");
        int n = s.nextInt();

        for ( int i =1 ; i<= n ; i++){
            for (int j= 1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
