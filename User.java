public class User {

    private int lives;

    /**
     * Creates a player with the default number of lives (6).
     */
    public User(){
        this.lives = 6;
    }
    /**
     * Returns how many lives the player has left.
     *
     * @return remaining lives
     */
    public int getLives() {
        return lives;
    }
    /**
     * Decrements lives by one if the player still has lives remaining.
     */
    public void lostLife(){
        if(lives > 0){
            lives--;
        }
    }
}
