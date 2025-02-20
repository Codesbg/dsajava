package javapractice;

import java.util.Scanner;
import java.lang.String;
public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // in java there are javapractice.array with index 0 hence called zero indexed javapractice.array
        System.out.println("enter the number you want to take as javapractice.input");
        int n = s.nextInt();
        int array[]= new int[n];
        //javapractice.input javapractice.loop
        System.out.println(" javapractice.input the javapractice.array value :");
        for (int i =0; i < n; i++){

            array[i]=s.nextInt();
        }
        // now to search particular number
        System.out.println(" enter the x value which you want to search :");
        int x = s.nextInt();

        // output javapractice.loop
        for (int i = 0 ; i<array.length; i++){
            if(array[i]==x){
                System.out.println(" x found in index"+ i);
            }
        }

    }
}
