public class User {

    private int lives;

    public User(){
        this.lives = 6;
    }

    public int getLives() {
        return lives;
    }
    public void lostLife(){
        if(lives > 0){
            lives--;
        }
        

    }

    
}
