import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Game game = new Game();
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman, Input Y to Play");
        String randWord = word.getWord();
        char[] arr = new char[randWord.length()];
        arr = wordInitial(arr);
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
    // Move this into the game class to keep main cleaner
    public static char[] guessWord(char guess,char[] arr, String word){
        
        if(guessInWord){
            for(int i = 0; i < arr.length;i++){
                if(word.charAt(i) == guess){
                    arr[i] = guess;
                }
            }
        }
        else{
            Game.lostLife();
        }
        return arr;
        
        
        /**
         * else deduct 1 health from lives and return arr
         * How many lives are left
         * whether the game should stop
         */

    }
}