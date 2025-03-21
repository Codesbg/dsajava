package javapractice;

import java.util.Scanner;
import java.lang.String;

public class function {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static int Sum ( int a ,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // javapractice.String name = s.next();
        int a = s.nextInt();
        int b=s.nextInt();

     //   printName(name); //call kiya javapractice.function ko
        Sum(a,b);
    }
}
