import java.util.ArrayList;
import java.util.Collections;

public class intarraList{
        public static void main(String[] args) {
            ArrayList<Integer> myNumbers = new ArrayList<Integer>();
            myNumbers.add(33);
            myNumbers.add(15);
            myNumbers.add(20);
            myNumbers.add(34);
            myNumbers.add(8);
            myNumbers.add(12);

            // Sort an ArrayList
            //
            //Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:

            Collections.sort(myNumbers);  // Sort myNumbers in numarical form

            for (int i : myNumbers) {
                System.out.println(i);
            }
        }
    }


