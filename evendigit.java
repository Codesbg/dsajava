package javapractice;

import java.lang.String;
import java.util.Scanner;

public class evendigit {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of element in javapractice.array");
int n = s.nextInt();
int nums[]=new int[n];
        System.out.println("enter the number of element");
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        System.out.println(Evendigit(nums));
    }
        public static int Evendigit(int nums []){
        int count =0;
        for (int num : nums ){
            if (even(num))
                count++;
        }
        return count;
        }

    // this javapractice.function check weather the num contain even digit or not
    static boolean even(int num){
        int numdigits = Digits(num);
        if(numdigits%2==0){
            return true;
        }
        return false;
    }
    //javapractice.function to count the digit of number
    public static int Digits(int num ){
        // if number is negative
        if (num<0){
            num = num*-1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;

        }
        return count;
    }

}
