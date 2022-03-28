import java.util.Arrays;

public class basicofarray{
    static int[] arr ={1,2,3,4,5,6,7,8,9,10};
    static String[] array = {"Mercedies", "BMW" ,"Farari","Odi" , "Jagaur" ,"Rolls Royal"};
    public static void main(String [] args){
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);

        System.out.println("\nThe all elements in the given array are:- ");
        System.out.println(arr.length);

        System.out.println("\nMy car collection will be:- ");
        System.out.println(Arrays.stream(array).toList());

        System.out.println("\nThe sequence of my collection is :-");
        for(int i = 0; i < array.length; i++)
        {

            System.out.println(array[i]);
        }


    }
}
