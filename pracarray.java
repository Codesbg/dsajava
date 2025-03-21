package javapractice;

import java.util.Scanner;
import java.lang.String;
public class pracarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number you want to take as javapractice.input");
        int n = s.nextInt();
        System.out.println(" javapractice.input the value of javapractice.array");
        int[] arr = new int[n];
// javapractice.input javapractice.array value
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
// output javapractice.array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);


        }
    }
}