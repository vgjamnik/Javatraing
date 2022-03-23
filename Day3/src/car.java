public class car {
     String Cname,Ccolour;
     int speed,passno;

    public static void main(String[]args){
        System.out.println("This is my car:- ");
        car.Cname();
        car.Ccolour();
        car.speed();
        car.passno();

    }

    static void Cname(){
        System.out.println("My car is \"Mercidies\" ");
    }

    static void Ccolour(){
        System.out.println("Car clour is \"Blue\" ");
    }
    static void speed(){
        System.out.printf("car speed is :- 100 km/hour");
    }

    static void passno(){
        System.out.println("Car passing no is :- \" VJ-3580\"   ");
    }
}
