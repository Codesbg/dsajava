package javapractice;

import java.util.Scanner;
import java.lang.String;
public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //here we only print boundary element line as 1,1 cordinate and n,m in matrix form
        System.out.println("enter the number of rows");
        int n = s.nextInt();
        System.out.println("enter the number of columns");
        int m = s.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n|| j == m) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
