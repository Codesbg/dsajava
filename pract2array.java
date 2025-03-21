package javapractice;

import java.lang.String;
import java.util.Scanner;

public class pract2array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
//swap the javapractice.array items
      /*  System.out.println("enter the number you want to take as javapractice.input");
        int n = s.nextInt();
        int javapractice.array[] = new int[n];
        //javapractice.input javapractice.loop
        System.out.println(" javapractice.input the javapractice.array value :");
        for (int i = 0; i < n; i++) {

            javapractice.array[i] = s.nextInt();
        }
        swap(javapractice.array);
        System.out.print("swapped javapractice.array : " + javapractice.array);
    }
        static void swap ( int [] javapractice.array ){
            Scanner s = new Scanner(System.in);
            System.out.println("enter the index 1 to be swapped");
            int index1 = s.nextInt();
            System.out.println("enter the index 2 to be swapped");
            int index2 = s.nextInt();

             int temp = javapractice.array[index2];
             javapractice.array[index1]=javapractice.array[index2];
             javapractice.array[index2]=temp;

        }

}*/
     int []array={12,45,67,89,98,76,54,34};

        swap(array,0,4);
        System.out.print("after swapping:"+ array);
    }
    public static void swap(int array[] ,int index1 , int index2 ){

        int temp = array[index1];
        index2=index1;
        index2=temp;
    }
}
