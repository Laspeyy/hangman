public class Game {
    User user = new User();
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
    public char[] gameInitialize(char[] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] = '_';
        }
        return arr;
    }
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
