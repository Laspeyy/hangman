import java.util.Random;

public class Word {
String[] wordList = {"mango","apple","peach"};
Random rand = new Random();
int word = rand.nextInt(wordList.length);

public String getWord() {
    Random rand = new Random();
    int word = rand.nextInt(wordList.length);
        
    return wordList[word];
    }

    
     
}
