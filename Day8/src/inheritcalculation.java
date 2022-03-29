import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class inheritcalculation{
    int z;
    public static void  main(String[] args){
        System.out.println("Please enter any two Number:- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        inheritcalculation demo = new inheritcalculation();
        demo.addition(a,b);
        demo.substraction(a,b);
        



    }

    public class multiplication extends inheritcalculation{
        public void mult(int a, int b){
            int Z = a * b;
            System.out.println("The product of the given no:- "+ Z);
        }
    }

    private void substraction(int a, int b) {
        int Z = a-b;
        System.out.println("The substraction of given o is:'- " + Z);

    }

    private void addition(int a, int b) {
      int Z = a+b;
        System.out.println("The Sum of given no is :- " + Z);
    }
}
