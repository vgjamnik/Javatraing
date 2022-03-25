import java.util.Scanner;
public class Myprimeno {
    private int num;
    public Myprimeno(int num) {
        this.num = num;
    }

    public static void main(String[]args){
        Myprimeno num = new Myprimeno(6);
        boolean isPrime = num.isPrime();
        System.out.println("The no.is Prime :- "+ isPrime);

        int sum = num.sumUptoN();
        System.out.println("Sum up to N is :- " + sum);

        int div = num.sumOfDivisor();
        System.out.println("Sum of Divisor is :- "+ div);

        num.printNumberTriangle();

    }

    public void printNumberTriangle() {


        for(int i=0;i<num;i++)
        {
            for (int j=1;j<=i;j++) {
                System.out.print( i + "  ");
            }
            System.out.printf("\n ");
        }
        System.out.println( );
    }

    public int sumOfDivisor() {
       int sum = 0;
       for(int i=2;i<=num-1;i++)
           if (num% i == 0){
           sum += i;
           }

  return sum;
    }

    private int sumUptoN() {
        int sum = 0;
        for(int i=1;i<=num;i++)
            sum += i;

        return sum;
    }

    public boolean isPrime() {
        if(num<2){
            return false;
        }


        for (int i=2 ; i <= num -1;i++) {
            if (num % 2 == 0) {
                System.out.println("  ");
                return false;
            }

        }


        return true;
    }


}
