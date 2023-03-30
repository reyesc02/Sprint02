package Project02;

import java.util.Random;

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
        Random rand = new Random();
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) { // if in different nations
                int max = 40;
                int min = 35;
                lifePoints = (int) (8.35 * (float) ((rand.nextInt((max - min) + 1) + min) + 400));
                //System.out.println("Warrior LP: " + lifePoints);
        } else {
            if (otherPerson.getType() == PeopleType.wizard)
                lifePoints = -(1208-me.getLifePoints()); // heal to full hp
            else
                lifePoints = -(2331-me.getLifePoints()); // heal to full hp
        }

        return lifePoints;
    }

}
