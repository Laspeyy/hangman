public class User {

    private int lives;
    Game game = new Game();

    public User(){
        this.lives = 6;
    }

    public int getLives() {
        return lives;
    }
    public void lostLife(){
        if(lives >= 0){
            lives--;
        }
        else{
            // call Game to set isAlive to false
        }

    }

    
}
