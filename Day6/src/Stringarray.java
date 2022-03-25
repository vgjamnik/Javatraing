//This Program is for The Printing of the days in week
public class Stringarray{
    public static void main(String[] Args){
        String[] daysofWeek ={"Sunday", "Monday","Tuesday", "Wednesday", "Thursday", "Firiday", "Saturday"};
        String daywithMostCharacters = "";
        for(String day: daysofWeek){
            if(day.length()>daywithMostCharacters.length()){
                daywithMostCharacters = day;
            }
        }

        System.out.println("Day with most number of characters "+ daywithMostCharacters);
        for(int i =0; i < daysofWeek.length;i++){
            System.out.println(daysofWeek[i]);


           // for reverse day printing
            // for(int i=daysofWeek.length-1; i>=0;i--){
            //System.out.println(daysofWeek);};
        }
    }
}
