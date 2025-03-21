package javapractice;

import java.lang.String;
import java.util.Scanner;
public class Strings1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /* javapractice.input the string
        System.out.println("enter your name");
       // javapractice.String name = s.next(); for one word
        // System.out.println(" your name is "+ name);
        javapractice.String w = s.nextLine(); // for full line javapractice.input
        System.out.println(" your name is " + w);
        // " + " for concatinate the two string
        // javapractice.String length use javapractice.function nameofstring.lenth javapractice.function

        // to acesss every element of string seperately
        System.out.println("enter name");
        javapractice.String name = s.nextLine();
        System.out.println("enter line");
        javapractice.String sentence = s.nextLine();
        javapractice.String full = name + sentence ;
        System.out.println(full); // poora concatinated string
        System.out.println( full.length());
        for (int i = 0; i<= full.length(); i++){
            System.out.println(full.charAt(i));
            // charat se ek ek  character ata hai
            // usko separate count karega
        }
        // COMPARETO it check three cases
        // 1. s1>s2 : positive value
        // 2. s1==s2 : zero
        // 3. s1<s2 : negative value
 // ispe word me letter compare hota hai alphabet sequence
        javapractice.String s1 = " shitij bharti";
        javapractice.String s2 = " goswami ";
        if (s1.compareTo(s2)==0){
            System.out.println(" equal");
        } else if (s1.compareTo(s2)>0) {
            System.out.println(" s1 is greater than s2 ");

        }
else {
            System.out.println(" s2 is greater than s1");
        }
        //== is liye nahi use karte kyu ki ye kabhi kabhi fail ho jata hai test case me example below

        if (new javapractice.String("shitijbharti")== new javapractice.String("shitijbharti")){
            System.out.println(" both are equal");

        }

     else   {
            System.out.println(" strings are not equal");
        }
        //SUBSTRINGS in java

        javapractice.String s4 = " my_string";
        //substring( begning and ending se find karta hai )
        // to bech ka part nikal deta hai
        System.out.println(s4);
        javapractice.String s5=s4.substring(4,s4.length()); // 4th index se poori string consider hogi
        System.out.println(s5);
*/
        /*string are unmutable wo ek bar memory me ban jati hai to without
        dobara initialize kiye nai change hoti matlab ek or new string banana padega if ek string
        bana li apne
         */

    }
}
