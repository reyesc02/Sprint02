package Project02;

import java.util.Random;

public class Die {

    int sides;
    int die;
    Random random;

    public Die(int sides){
        this.sides = sides;
        random = new Random();
    }
    public int roll(){
        return random.nextInt(sides) + 1;
    }

    public int getDie() {
        return die;
    }

    public void setDie(int die) {
        this.die = die;
    }

}
