package Project02;

import java.util.Random;
public class CarlWizardStrategy implements Strategy{
    /**
     * This strategy will always attack another nation.
     * Will heal a member of the same nation to full life.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life points used in the encounter
     */
    public int strategy(People me, People otherPerson) {

        Random rand = new Random();
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) { // if not in same nation
                    int max = 5963;
                    int min = 3;
                    lifePoints = (int) (1.35 * (float) ((rand.nextInt((max - min) + 1) + min)));
                    //System.out.println("WizLP: " + lifePoints);
        }
        else {
            if (otherPerson.getType() == PeopleType.wizard)
                lifePoints = -(1208-me.getLifePoints()); // heal to full hp
            else
                lifePoints = -(2331-me.getLifePoints()); // heal to full hp
        }
        return lifePoints;
    }
}
