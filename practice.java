package javapractice;

import java.util.Scanner;
import java.lang.String;
public class practice {
    public static void main(String[] args) {
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

