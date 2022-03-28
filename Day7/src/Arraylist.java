import java.util.ArrayList;

public class Arraylist{
    public static void main(String [] args){
        System.out.println("");
        ArrayList<String> Car = new ArrayList<>();    //Create an Array list objects
        Car.add("Volvo");
        Car.add("BMW");
        Car.add("Bugati");
        Car.add("Farari");
        Car.add("Marcedies");

        System.out.println("This is the array list of cars:- " + Car);
        System.out.println("\n");

        System.out.println("For accessing element use this :- get(index no.); :- get :-  " + Car.get(3));


    }
}
