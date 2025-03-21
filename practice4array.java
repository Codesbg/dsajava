package javapractice;

import java.lang.String;
import java.util.Scanner;
public class practice4array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of element in javapractice.array");
        int n = s.nextInt();
        int array[] = new int[n];
        System.out.println("enter the javapractice.array values");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        average(array);
        System.out.println(array);

    }

    public static float average(int array[]) {
        float sum = 0;
        float avg = 0;
        float length= array.length;
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];

        }
        avg=sum/length;

        return avg;

    }
}
