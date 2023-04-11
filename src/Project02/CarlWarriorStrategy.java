package Project02;

public class CarlWarriorStrategy implements Strategy{
    /**
     * Warrior strategy is aggressive and returns maximum amount of life
     * points if players are from different nations in the range of 3632 to 3674.
     * If from the same nation then player will heal them to full life, 1208 for wizard
     * and 2331 for warrior.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life points to use in the encounter
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) { // if in different nations
            if (otherPerson.getLifePoints() > 40) // if above 40 life
                lifePoints = me.getLifePoints(); // attack
            else
                lifePoints = -1; // run away
        } else {
            if (otherPerson.getLifePoints() > 50 && me.getLifePoints() <= 50) // if in same team heal hp
                lifePoints = -((me.getLifePoints() + otherPerson.getLifePoints())/2);
        }
        return lifePoints;
    }
}
