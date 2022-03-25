import java.util.Scanner;

public class switchcontrol {
    static String choice;

    public static void main(String args[]){
        System.out.printf("Please Enter any preference for travel :- \n '1' for Bus  \t\t\t  '2' for Bike\n '3'  for Aeroplane\t\t  '4' for Private Jet   \n :-  ");

        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Case1: You have choose Bus for travelling: ");
                break;
            case 2:
                System.out.println("Case2:  You have choose Bike for travelling: ");
                break;
            case 3:
                System.out.println("Case3: You have choose Aeroplane for travelling: ");
                break;
            default:
                System.out.println("Default: You have choose Private Jet for travelling: ");
        }
    }
}
