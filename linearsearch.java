package javapractice;

import java.lang.String;
import java.util.Scanner;
public class linearsearch {
    public static void main(String args[]) {
        //TO PRINT THE INDEX

       /* Scanner s = new Scanner(System.in);
        // linear search in javapractice.array
        System.out.println("enter the javapractice.array number");
        int n =s.nextInt();
        System.out.println("enter javapractice.array value");
        int num[]= new int[n];
        for (int i=0 ; i<n ; i++){
            num[i]=s.nextInt();
        }
        System.out.println("enter target");
        int target = s.nextInt();
        int ans = Linearsearch(num, target);
        System.out.println(ans);
    }
    // linear search
    //if it found then return the value if not then return -1

    static int Linearsearch(int num[], int target) {
        if (num.length == 0) {
            return -1;
        }
        for (int i = 0; i < num.length; i++) {
            int element = num[i];
            if (element == target) {
                return i;


            }
        }
        return -1;
    }
}
*/
        //TO PRINT ELEMENT DIRECTLY

        Scanner s = new Scanner(System.in);
        // linear search in javapractice.array
        System.out.println("enter the javapractice.array number");
        int n =s.nextInt();
        System.out.println("enter javapractice.array value");
        int num[]= new int[n];
        for (int i=0 ; i<n ; i++){
            num[i]=s.nextInt();
        }
        System.out.println("enter target");
        int target = s.nextInt();
        int ans = Linearsearch2(num, target);
        System.out.println(ans);
    }
    // linear search
    //if it found then return the value if not then return -1

    static int Linearsearch2(int num[], int target) {
        if (num.length == 0) {
            return -1;
        }
        for (int i = 0; i < num.length; i++) {
            int element = num[i];
            if (element == target) {
                return element ;


            }
        }
        return -1;
    }
}


