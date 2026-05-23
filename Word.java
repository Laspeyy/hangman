import java.util.Random;

public class Word {
String[] wordList = {
        "mango", "apple", "peach", "grape", "lemon", "melon", "tiger", "eagle",
        "ocean", "river", "cloud", "storm", "ghost", "dream", "heart", "light",
        "magic", "olive", "pearl", "pizza", "salad", "berry", "zebra", "crisp",
        "quest", "banana", "orange", "cherry", "tomato", "potato", "carrot",
        "rabbit", "turtle", "salmon", "walnut", "almond", "ginger", "garlic",
        "celery", "candle", "avocado", "pumpkin", "spinach",
        "lettuce", "dolphin", "penguin", "leopard", "phantom", "rainbow", "thunder"
    };
Random rand = new Random();
int word = rand.nextInt(wordList.length);

/**
 * Selects and returns a random word from the word list.
 *
 * @return a randomly chosen word
 */
public String getWord() {
    Random rand = new Random();
    int word = rand.nextInt(wordList.length);
        
    return wordList[word];
    }
}
