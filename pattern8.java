package javapractice;

import java.util.Scanner;
import java.lang.String;

public class
pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// here increase order me number print hoga and pyramid banayega half
        // also hum pehle j ka count print karte the but isbar hum ek number kara rahe
        // which is initialized by 1 and increase after each print here num is "m"

        System.out.println("enter the number ");
        int n = s.nextInt();
        int m = 1;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(m);
                m++;
            }
            System.out.println( );
        }

    }
}