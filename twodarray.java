package javapractice;

import java.util.Scanner;
import java.lang.String;
public class twodarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // ye bhi ek bar me banta hai ek line of code me
        System.out.println("javapractice.input the rows :");
        int rows = s.nextInt();
        System.out.println("javapractice.input the columns");
        int cols = s.nextInt();
        int array [][]= new int [rows][cols];
        // yaha row x column = number of inputa hota hai
         // javapractice.input javapractice.loop
        //pehla javapractice.loop for row
        System.out.println(" give the elements of 2d javapractice.array");
        for (int i=0 ; i<rows ; i++){
            // cols javapractice.input
            for (int j = 0 ; j<cols ; j++){
                array[i][j]=s.nextInt();
            }

        }
        // make a number which i want to find
        System.out.println("enter the number which you want to find");
        int x = s.nextInt();

        //output of javapractice.input
      /*  System.out.println("show javapractice.array");
        for (int i =0; i<rows ; i++) {
            for ( int j = 0; j < cols; j++) {
                //to print the javapractice.array ka line on next line
                System.out.print(javapractice.array[i][j] + "");
            }
            System.out.println();
        }*/

        for (int i=0 ; i<rows ; i++){
            for ( int j=0; j<cols ; j++){
                //compare the x with each element of matrix
                if(array[i][j]==x){
                    System.out.println(" x found in index" + "( " +i+ " " +j+ ")");
                }
            }
        }
    }
}
