package javapractice;

import java.util.Scanner;
import java.lang.String;
public class condition {
    public static void main(String[] args) {
      /*  Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int a=s.nextInt();
if (a>18){
    System.out.println("you are eligible for vote");
} else if (a<18) {
    System.out.println("you are not eligible for vote");
}
else {
    System.out.println("wrong age inputted invalid !");
}*/
        Scanner s = new Scanner(System.in);
        System.out.println(" enter your age ");
        int age = s.nextInt();
        System.out.println(age);

        if (age == 0) {
            System.out.println(" in valid javapractice.input");
        } else if (age > 0) {
            System.out.println(" valid age");

        } else {
            System.out.println(" age cannot be char , boolean ,float");


        }
    }
}

