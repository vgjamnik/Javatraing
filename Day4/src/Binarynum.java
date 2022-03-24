public class Binarynum {
       private int num1;
       private int num2;

    public Binarynum(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
    }

    public  static void main(String[] args){
        Binarynum Binum = new Binarynum(2,3);
        System.out.println("Sum of two num is :- "+ Binum.add());
        System.out.println("Double of given no is :- ");
        Binum.doubleValue();
        System.out.println( "The multiplication of given two no. is :- "+ Binum.multiply());
        System.out.println( "We get the first no. you have entered"+ Binum.getnum1());
        System.out.println("We get the first no. you have entered"+ Binum.getnum2());
    }

    public int getnum2() {
        return num2;
    }

    public int getnum1() {
        return num1;
    }

    public int multiply() {
        return num1 * num2;

    }

    private void doubleValue() {
        this.num1 *= 2;
        this.num2 *= 2;
    }

    public int add() {
      return num1 + num2;
    }
}
