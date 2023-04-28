package Project02;

public class CarlWizardStrategy implements Strategy{
    /**
     * This strategy will always attack another nation.
     * Will heal a member of the same nation to full life.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life points used in the encounter
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) { // if not in same nation
            if (me.getLifePoints() <= 60) // if enemy at or under 66 life
                lifePoints = 25; //me.getLifePoints(); // attack
            else
                lifePoints = -1; // run away
        }
        return lifePoints;
    }
}
