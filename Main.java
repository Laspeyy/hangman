import java.util.Scanner;
public class Main {


    /**
     * Runs a single Hangman round: picks a word, initializes the board,
     * prompts for letter guesses, updates the board, and exits when the player
     * wins or runs out of lives.
     *
     * @param args unused command-line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
        Word word = new Word();
        Scanner scanner = new Scanner(System.in);
        char userGuess = ' ';
        System.out.println("Welcome to Hangman");
        String randWord = word.getWord();
        char[] arr = new char[randWord.length()];
        arr = game.gameInitialize(arr);
        System.out.println(arr);
        boolean Start = true;
        
        while(Start){
            System.out.printf("You have %d lives remaining",game.user.getLives());
            System.out.println();
            System.out.println("Guess a letter"); 
            userGuess = scanner.next().charAt(0);
            arr = game.playerGuess(randWord,arr,userGuess);
            if(!game.gameStatus(arr)){
                Start = false;
            }
            System.out.println(arr);
        }
        scanner.close();
    }
}