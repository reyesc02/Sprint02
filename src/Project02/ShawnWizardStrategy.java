package Project02;

public class ShawnWizardStrategy implements Strategy {
    /**
     * This strategy will run from a warrior from another nation
     * and will attack a wizard from another nation. Will transfer
     * life points to a player from the same nation.
     *
     * @param me          - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life points used in the encounter
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation())
        {
            if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                if (otherPerson.getType() == PeopleType.warrior)
                { // If there is an enemy warrior, run away from the encounter, lose a point of life.
                    lifePoints = -me.getLifePoints();
                } else
                { // Wizard duel, use a fireball
                    lifePoints = -10; // do 10 damage
                    me.modifyLifePoints(1);
                }
            }
        } else
        {
            if (otherPerson.getLifePoints() < me.getLifePoints()) { // heal a friend
                lifePoints = (int) (me.getLifePoints() - otherPerson.getLifePoints() + 5);
            } else
            {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
}