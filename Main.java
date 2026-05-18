import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Start = true;
        while(Start){
            System.out.println("Welcome to Hangman, Input Y to Play");
            System.out.println("Press N to quit anytime");
            Start = false;
        }
        /**
         * TODO:Word is assigned
         * TODO:_ is shown 
         * TODO:Player guesses letter
         * TODO:If letter is in the word then _ is changed to which letter the word has
         * TODO:If letter is not in word lives decrease
         * TODO:Lives < 0 then game ends 
         * TODO:If word is guessed before lives run out, player wins
         */
        scanner.close();
    }
}
