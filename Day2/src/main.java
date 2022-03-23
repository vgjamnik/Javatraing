import java.util.Scanner;

public class main {

    static int num1;
    static int num2;
    int sum;
    public static void main(String[]args){


        System.out.println("Hellow World");
        System.out.printf("Please enter any to natural no.:-" + num1,num2);
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();

        int  sum = num1 + num2;

        System.out.println("The addition of given no. is :- "+ sum);




    }

}
