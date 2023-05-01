package Project02;

public class AnnaHealerStrategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson)
    {
        Die die = new Die(10);
        die.roll();
        if (me.getNation() == otherPerson.getNation() && me.getTribe() == otherPerson.getTribe())
        {
            if (me.getType() == PeopleType.wizard && otherPerson.getType() == PeopleType.wizard)
            {
                if (me.getLifePoints() < otherPerson.getLifePoints())
                {
                    int heal = otherPerson.getLifePoints() / 2 + me.getLifePoints() + die.roll();
                    return heal;
                } else
                    return me.getLifePoints();
            }
        }
        return me.getLifePoints();
    }
}
