public class encapsulation{
//    public class Person {
//        private String name; // private = restricted access
//
//        // Getter
//        public String getName() {
//            return name;
//        }
//
//        // Setter
//        public void setName(String newName) {
//            this.name = newName;
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Person myObj = new Person();
//            myObj.name = "John";  // error
//            System.out.println(myObj.name); // error
//        }
//    }

//    MyClass.java:4: error: name has private access in Person
//    myObj.name = "John";
//         ^
//    MyClass.java:5: error: name has private access in Person
//    System.out.println(myObj.name);
//                  ^
//                          2 errors
//
//
 // "\n ******************************************************************\n "
    public static void  main(String[]args){
    Person myObj=new Person();
    Person myAim = new Person();
    myObj.setName("Vishwa");// Set the value of the name variable to Vishwa
    myAim.setAim("Your Aim is becoming the best person:");
    System.out.println(myObj.getName());
    System.out.println(myAim.getAim());
}


// \n ********************************************************************************************************\n

//    Why Encapsulation?
//
//    Better control of class attributes and methods
//            Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
//    Flexible: the programmer can change one part of the code without affecting other parts
//    Increased security of data



}
