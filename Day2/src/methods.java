public class methods {

    // To Calculate angle of a parallelogram
    static void CAOP(int angle1,int angle2,int angle3,int angle4){
        int angle=360-(angle1+angle2+angle3+angle4);
        System.out.println("Angle of parallelogram: "+angle);
        //return angle;

    }
    //Calculate the area of Triangle
    static void CAOT(int base, int height){
        double A=0.5 * (base * height);
        System.out.println("The area of Triangle: "+A);
    }

    //for multiplication Table....
    static void showTables(int tableNumber){
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d",i,tableNumber,i*tableNumber).println();
        }

    }
    //Main method
    public static void main(String args[]){
        CAOP(90,90,90,90);
        CAOT(25,32);
        showTables(5);


    }
}
