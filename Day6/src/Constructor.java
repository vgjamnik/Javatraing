

public class Constructor{


        int i;

        // constructor with no parameter
        private Constructor() {
            i = 5;
            System.out.println("Constructor is called");
        }

        public static void main(String[] args) {

            // calling the constructor without any parameter
            Constructor obj = new Constructor();
            System.out.println("Value of i: " + obj.i);
        }
    }

