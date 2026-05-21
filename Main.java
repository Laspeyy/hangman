import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Game game = new Game();
        Word word = new Word();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman");
        String randWord = word.getWord();
        char[] arr = new char[randWord.length()];
        arr = game.gameInitialize(arr);
        System.out.println(arr);
        boolean Start = true;
        
        while(Start){
            Start = false;
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
}