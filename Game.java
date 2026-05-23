public class Game {
    User user = new User();
    /**
     * Processes a single letter guess against the secret word.
     * Reveals matching letters on the board, or deducts a life if the guess is wrong.
     *
     * @param gameWord the secret word
     * @param arr current display board (underscores and revealed letters)
     * @param guess the letter guessed by the player
     * @return updated display board
     */
    public char[] playerGuess(String gameWord,char[] arr,char guess) {
        boolean isTrue = false;
        for(int i = 0;i < gameWord.length();i++){
            if(Character.toLowerCase(guess) == gameWord.charAt(i)){
                isTrue = true;
                break;
            }
        }
        if(isTrue){
            for(int i = 0; i < gameWord.length();i++){
                if(gameWord.charAt(i) == Character.toLowerCase(guess)){
                    arr[i] = guess;
                }
            }
        }
        else{
            user.lostLife();
        }
        return arr;
    }
    /**
     * Fills the display board with underscore placeholders.
     *
     * @param arr board array sized to the word length
     * @return the same array with each slot set to {@code '_'}
     */
    public char[] gameInitialize(char[] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] = '_';
        }
        return arr;
    }
    /**
     * Checks whether the game should continue.
     *
     * @param arr current display board
     * @return {@code true} if there are still hidden letters and the player has lives left;
     *         {@code false} if the word is complete or lives have run out
     */
    public boolean gameStatus(char[] arr){
        boolean isTrue = true;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == '_'){
                isTrue = true;
                break;
                
            }
            else{
                isTrue = false;
            }
        }
        return isTrue && user.getLives() > 0;
    }
}