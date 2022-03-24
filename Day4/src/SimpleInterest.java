<<<<<<< HEAD
import java.security.Principal;
import java.sql.Time;
import java.util.Scanner;

public class SimpleInterest {
    static float P;
    static float ROI;
    static float Time;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Please Enter The Principal Amount:- ",P);
        float P = sc.nextFloat();

        System.out.printf("please enter the Rate of Interest :- ",ROI);
        float ROI = sc.nextFloat();

        System.out.printf("Please enter the the no of years :- ",Time);
        float Time = sc.nextFloat();

                /* Calculate simple interest */
        float SI = (P * ROI *Time)/100 ;
        System.out.println("Simple interest = " + SI);
            }


    }

=======
public class SimpleInterest {

    public static void main(String[]args){


    }
}
>>>>>>> c9a4c5631aa465fc8da24d218a7ba02a30b5fd42
