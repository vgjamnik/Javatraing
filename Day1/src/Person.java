import java.util.Scanner;


public class Person{
    public static void main(String[] args){
        System.out.println("Please Enter your Name:- ");
        Scanner person=new Scanner(System.in);
        String personname = person.nextLine();

        System.out.println("Please Enter your Address:- ");
        String personaddress= person.nextLine();


         walk();
         run();
         sleep();
         eat();
         drink();


    }

    private static void drink() {
        System.out.println("The person is drinking");
    }

    private static void eat() {
        System.out.println("person is eating");
    }

    private static void walk() {
        System.out.println("Person is walking");
    }

    public static void run(){
        System.out.println("person is running");
    }

    public static void sleep(){
        System.out.println("person is sleeping ");
    }
}
