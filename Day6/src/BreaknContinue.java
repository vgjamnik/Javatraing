public class BreaknContinue{
    public static void main(String[] args){
        System.out.println("This is break Statement for 4 :- ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println(" \n    Next output of Continue for 4:- ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }



    }


}
