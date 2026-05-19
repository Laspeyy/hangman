import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Word word = new Word();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman, Input Y to Play");
        String randWord = word.getWord();
        char[] arr = new char[randWord.length()];
        arr = wordInitial(arr);
        boolean Start = true;
        while(Start){
            
            
            
            
            Start = false;
        }
        System.out.println(randWord);
        System.out.println();
        for(char s : arr){
            System.out.print(s + " ");

       }
       

        /**
         * TODO:Player guesses letter
         * TODO:If letter is in the word then _ is changed to which letter the word has
         * TODO:If letter is not in word lives decrease
         * TODO:Lives < 0 then game ends 
         * TODO:If word is guessed before lives run out, player wins
         */
        scanner.close();
    }
   
    public static char[] wordInitial(char[] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] = '_';
        }
        return arr;
    }
}










