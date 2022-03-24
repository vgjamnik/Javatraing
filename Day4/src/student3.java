
public class student3 {

    // example of default constructor
    //which displays the default value
    static int id = 100;
      String name= " \"Vishwa\" ";


      public static void main(String [] args){


          // Creating Objects
          student3 s1= new student3();
          student3 s2= new student3();

          // display the value of obj.

          s1.display();
          s2.display();

      }
          //creating the display method to display the id & name of student
      void display(){
          System.out.println("Dear Student Your name is "+ name);
          System.out.println("Dear Student Your id is "+ id);
      }
    }

