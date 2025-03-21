package javapractice;

import java.util.Scanner;
import java.lang.String;
public class function2 {
   /* public static int Multiply_1 ( int a , int b){
        System.out.println(a*b);
        return 0;
    }*/
    public static int Fact (int a ){
        int fact =1;
        if (a<0){
            System.out.println("invalid javapractice.input!");
            return 0;
        }
        for (int i= a; i>=1 ; i--){
            fact = fact *i;
            System.out.println(fact);
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter first number");
        int a = s.nextInt();
     //   System.out.println("enter second number");
     //   int b = s.nextInt();

Fact(a);
       // Multiply_1(a,b);
    }
}
