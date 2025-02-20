package javapractice;

import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {
    public static void main(String args[]) {
        // syntax  ArrayList<Integer> list "name of list = new javapractice.array list <>" = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
/*we use add to add the val in list
        list.add(90);
        list.add(56);
        //and so on you can add any number of val
        System.out.println(list); //just print list all vals are printed on it
        // in list we can add more elements as compare to its capacity
        //list. uske bad multiple builtn javapractice.function milega
        System.out.println(list.contains(87));
        list.add(78);
        list.set(0, 789); //you can replace val by set
        System.out.println(list);*/
        // how to take javapractice.input in list?
        Scanner s = new Scanner(System.in);
       /* for (int i=0 ; i< jitna value tak ; i++){
            list.add(s.nextInt());
        }*/
        System.out.println(" javapractice.input the  number of items want");
        int n = s.nextInt();
        System.out.println("enter list elements");
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());//list.add(s.nextInt());
        }
        // toget item in some place

        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i)); // here for print the value of list you need to pass index over here
        }
    }
}
