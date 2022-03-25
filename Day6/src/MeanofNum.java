import java.util.Scanner;

public class MeanofNum{

        public static void main(String[] args) {
            System.out.println("Enter the numbers to get their mean:-");
            Scanner sc = new Scanner(System. in );
            // Initialize sum and count of input elements
            int sum = 0,
                    count = 0;
            //Checking if an int value is available
            while (sc.hasNextInt()) {
                // Read an int value
                int num = sc.nextInt();
                sum += num;
                sum += num;
                count++;
            }
            int mean = sum / count;
            System.out.println("Mean of the numbers is: " + mean);
        }
    }
