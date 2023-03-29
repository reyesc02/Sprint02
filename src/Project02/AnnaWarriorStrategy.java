package Project02;

/**
 if my warrior's encounters another warrior from a different nation.
 Depend on the life point it has, less than 60 point will run away (-1)
 but of the other warrior less than 80 will attack(-10)
 */
public class AnnaWarriorStrategy implements Strategy {

    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getType() == PeopleType.warrior && otherPerson.getType() == PeopleType.warrior)
            {
                if (me.getLifePoints() < 60)
                {
                    lifePoints = me.getLifePoints() - 1; // runaway
                }
            }
            if(otherPerson.getLifePoints() > 80)
            {
                lifePoints = otherPerson.getLifePoints() - 10; // attack
            }
        }
        return lifePoints;
    }
}