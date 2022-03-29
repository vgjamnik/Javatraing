public class Vehicleinherit{
protected String brand = "Maruti";
public void Blowhorn(){
    System.out.println("Blow Honk is :- Pic Piccccccc!");
}
}

class Car extends Vehicleinherit{
    private String modelName = "Omini";  //Car attribute
    public static void main(String[] args){
        // Create a myCar Objects
        Car myCar = new Car();

        System.out.println(myCar.brand);

        //Call the honk() method (from the Vehicle class) on the my Car object
        myCar.Blowhorn();
    }
}
