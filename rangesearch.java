package javapractice;

import java.lang.String;
import java.util.Scanner;
public class rangesearch {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the number of element in javapractice.array");
        int n = s.nextInt();
        // javapractice.array initialization
        int arr[] = new int[n];
        System.out.println(" enter the value of javapractice.array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();


        }
        System.out.println(Searchrange(arr));
    };
        static int Searchrange( int arr[]){
            Scanner s = new Scanner(System.in);
            System.out.println("enter the start");
            int start= s.nextInt();
            System.out.println("enter the end");
            int end=s.nextInt();
            System.out.println("enter the target");
            int target=s.nextInt();

            if (arr.length==0){
                System.out.println(" empty javapractice.array!");
            }
            for (int i=start; i<end; i++){
                int element = arr[i];
                if (target==element){
                    return i;
                }
            }
            return -1;
        }


    }
