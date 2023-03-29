package Project02;

/**
 * when my tribe has a greater life points than attack damage the otherTribe(-50)
 *but if my lifepoints is less than the otherTribe which I will have (-1) is taking.
 */
public class AnnaWizardStrategy implements Strategy{

    public int strategy(People me, People otherPerson)
    {
        int lifePoints = 0;
        int giveLife;
        if(me.getType() == PeopleType.wizard && otherPerson.getType() == PeopleType.warrior) {
            if (otherPerson.getLifePoints() < me.getLifePoints()) // attack
            {
                lifePoints = otherPerson.getLifePoints() - 50;
            }
            else{
                lifePoints = me.getLifePoints() - 1; // runaway
            }

            if (me.getTribe() == otherPerson.getTribe())
            {
                if (me.getLifePoints() < 60 && otherPerson.getLifePoints() > 60)
                {
                    giveLife = otherPerson.getLifePoints() - 10;
                    lifePoints = me.getLifePoints()+ giveLife;
                }
            }

        }
        return lifePoints;
    }
}
