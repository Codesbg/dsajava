package javapractice;

import java.lang.String;
import java.util.Scanner;
public class minofarray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the element number");
        int n = s.nextInt();
        int num[]=new int[n];
        System.out.println("enter the value of javapractice.array");
        for (int i=0; i<n; i++){
            num[i]=s.nextInt();
        }
        System.out.println(minimum(num));
    }
    // return the minimum value in javapractice.array
    static int minimum(int num[]){
        if(num.length==0){
            return -1;
        }
        int ans = num[0];
        for (int i =0 ;i<num.length;i++){
            if(num[i]<ans){
                return num[i];
            }
        }
        return 0;
    }
}
