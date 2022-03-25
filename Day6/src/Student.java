import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student{

    private static int[] marks;
    private String name;


    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args){
         int[] marks ={40,50,90,75};
         Student student = new Student( "Vishwa", marks);
         int number = Student.getNumOfMarks();
        System.out.println("Number of marks :- " + number );

         int sumofmarks = Student.getSumOfMarks();
        System.out.println("The sum of marks is :-"+ sumofmarks);

        int  maxMarks = Student.getMaxMarks();
        System.out.println("The Maximum marks is:- "  + maxMarks);

        int minMarks = Student.getMMinMarks();
        System.out.println("The minimum Marks Of the Student is:- " + minMarks);

        BigDecimal averagemarks= Student.getAverageMarks();
        System.out.println("The Average of the students marks is :- " + averagemarks);



     }

    private static BigDecimal getAverageMarks() {
        int sum = getNumOfMarks();
        int number = getNumOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);





    }


    private static int getMMinMarks() {
        int minimum = Integer.MAX_VALUE;
                for(int mark:marks){
                    if(mark < minimum){
                        minimum = mark;
                    }
                }
        return minimum;
    }

    private static int getMaxMarks() {
        int maximum =Integer.MIN_VALUE;
         for(int mark : marks){
             if(mark > maximum){
                 maximum = mark;
             }
         }
         return maximum;
    }

    private static int getSumOfMarks() {
        int sum=0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    private static int getNumOfMarks() {
       return marks.length;

    }

}

