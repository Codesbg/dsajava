package javapractice;

import java.util.Scanner;
import java.lang.String;
public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the number of rows");
        int n = s.nextInt();
        // inverted half pyramid
        for (int i = 1 ; i<= n ; i++){
            // this javapractice.loop for do all iteration of inner javapractice.loop

            for (int j = 1 ; j<=n-i ; j++){
                //  this javapractice.loop for create space
                System.out.print(" ");
            }
            for (int j = 1 ; j<= i; j++){
                // this javapractice.loop for javapractice.pattern
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
// here the concept is that there is javapractice.pattern in each line n = number of javapractice.pattern to be used
// so n - i be the number of space
//eg if 4 is number of row me javapractice.pattern then
// then 4-i be the number of gaps = 3
//and so on
