public class forlooparray{
    public static void main(String[] arg){
        String[] cars= {"Mercedies", "Rolls Royals", "Bugati" ,"Farari", "Land Rover","BMW"};

         // for loop
        System.out.println(" ****This is for loop statement in array**** ");
        for (int i=0; i<cars.length;i++){
            System.out.println(cars[i]);

        }


        // for each
        System.out.println("\n***This is for each statement of array***");
        for(String i:cars){
            System.out.println(i);
        }

    }
}
