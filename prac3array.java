package javapractice;

import java.lang.String;
import java.util.Scanner;
public class prac3array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
       /* System.out.println(" enter the number of javapractice.array elements");
        int n = s.nextInt();
        int javapractice.array[] = new int[n];
        // javapractice.input javapractice.loop
        System.out.println("enter the elements ");
        for (int i = 0; i < n; i++) {
            javapractice.array[i] = s.nextInt();
        }

        maximum(javapractice.array);
        System.out.println(javapractice.array);
    }
        // imagine javapractice.array is non empty
         public static int maximum(int [] javapractice.array){
            int max = javapractice.array[0];
            for (int i=0; i< javapractice.array.length; i++){
                if (javapractice.array[i]>max){
                    max=javapractice.array[i];
                }

            }
            return max;
        }
    }*/
        // CODE WITHOUT TRCKING INPUT
        int[]array={1,4,5,6,7,8,9,0,23,4,5,67};
        System.out.println(array);
        max(array);
    }
    static int max(int []array){
        int max=array[0];
        for (int i=0; i < array.length ; i++ ){
            if (array[0]>max){
                array[0]=max;
            }
        }
        return max;
    };
    }

