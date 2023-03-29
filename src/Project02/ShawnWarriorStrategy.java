package Project02;

public class ShawnWarriorStrategy implements Strategy {
    /**
     * Warrior strategy is generally aggressive and returns maximum amount of life
     * points if players are from different nations. If from the same nation then
     * player will transfer life points.
     *
     * @param me          - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life points to use in the encounter
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() == otherPerson.getNation()) {
            if (otherPerson.getLifePoints() < me.getLifePoints()) {
                if (otherPerson.getTribe() == me.getTribe()) {
                    lifePoints = -((me.getLifePoints() - otherPerson.getLifePoints()));
                }
            }
        } else {
            int points = me.getLifePoints() - otherPerson.getLifePoints() - 10;
            if (points > 0) {
                lifePoints = otherPerson.getLifePoints() - 10;
            } else {
                lifePoints = me.getLifePoints();
            }
        }
        return lifePoints;
    }
}

