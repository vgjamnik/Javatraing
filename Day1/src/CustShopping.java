import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.math.BigInteger;
import java.util.Scanner;

public class CustShopping{
    String custName;
    BigInteger getCustMobile;
    static int custMobile;
    public static void main(String[]arg){
        System.out.println("Please Enter your Name:- ");
        Scanner sc =new Scanner(System.in);
        String custName = sc.nextLine();

        System.out.printf(custName + "!!!\n " + "Welcome To Online Shopping  \n \n " );


        System.out.println("Enter Your Mobile No.:- ");
        BigInteger custMobile = sc.nextBigInteger();
        System.out.println("Your Mo.No. is  :- " + custMobile);

        System.out.println("Our Product for you are:- \n  1. Soap  2. Chocolate  \n  3. Juice   4. Lunch  \n  5. Coffee   6. Coldrinks ");

        int Choice=0;

        System.out.println("Enter Your Choice:- " );
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("You Have choose the Soap ");
                break;
            case 2:
                System.out.println("You have got Chocolate");
                break;
            case 3:
                System.out.println("You have got Juice");
                break;
            case 4:
                System.out.println("You have choose lunch");
                break;
            case 5:
                System.out.println("You have got Coffee");
                break;
            case 6:
                System.out.println("Coldrinks");
                break;
            default:
                System.out.println("Sorry your choice is not valid");
        }

        

    }


}
