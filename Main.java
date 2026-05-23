import java.util.Scanner;
public class Main {


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
        //     public char[] playerGuess(String gameWord,char[] arr,char guess) {

        while(Start){
            //System.out.printf("You have %d lives remaining",game.getLives());
            System.out.println("Guess a letter"); 
            userGuess = scanner.next().charAt(0);
            arr = game.playerGuess(randWord,arr,userGuess);
            if(!game.gameStatus(arr)){
                break;
            }
            System.out.println(arr);
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