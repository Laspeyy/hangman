public class Game {
    
    Word word = new Word();
    gameWord = word.getWord();
    public boolean guessInWord(String gameWord,char[] arr,char guess) {
        boolean guessInWord = false;
        for(int i = 0;i < word.length();i++){
            if(guess == gameWord.charAt(i)){
                return guessInWord = true;
            }
        }
    }
    public char[] gameInitialize(char[] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] = '_';
        }
        return arr;
    }
}
