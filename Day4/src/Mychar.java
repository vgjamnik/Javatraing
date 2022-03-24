public class Mychar {
    char Ch;

    public Mychar(char Ch) {
               this.Ch = Ch;

    }

    public static void main(String[] args){
        Mychar mychar = new Mychar('E');
        System.out.println(mychar.isVowel());    // A ,E ,I, O, U;
        System.out.println(mychar.isDigit());   // integer
        System.out.println(mychar.isAlphabet());
        //Mychar.printLowerCaseAlphabets();
        //ychar.printLowerCaseAlphabets();




    }

    private boolean isDigit() {
        if (Ch>= 48 && Ch >+ 57){
            return true;}
        else
        { return false;
        }
    }

    private boolean isAlphabet() {
        if((Ch >=65 && Ch <=90) || (Ch >= 97 && Ch <= 122))
            return true;
        else {
            return false;
        }
    }
    

    public char isVowel() {
           // for a ,e, i,o,u  or A,E,I,O,U

        if (Ch == 'A')
            return 0;
        if (Ch == 'E')
            return 0;
        if(Ch == 'I')
            return 0;
        if (Ch == 'O')
            return 0;
        if (Ch == 'U')
            return 0;
        if(Ch == 'a')
            return 0;
        if(Ch == 'e')
            return 0;
        if(Ch == 'i')
            return 0;
        if(Ch == 'o')
            return 0;
        if(Ch == 'u')
            return 0;
        else {
            return 0;
        }
    }
}
