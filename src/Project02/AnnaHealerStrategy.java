package Project02;

public class AnnaHealerStrategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        if (me.getNation() == otherPerson.getNation() && me.getTribe() == otherPerson.getTribe())
        {
            if (me.getType() == PeopleType.wizard)
            {

                if (me.getLifePoints() < otherPerson.getLifePoints())
                {
                    int heal = otherPerson.getLifePoints() / 2 + me.getLifePoints();
                    return heal;
                } else
                    return me.getLifePoints();
            }
            else if (me.getType() == PeopleType.warrior) {
                return 66;
            } else if (me.getType() == PeopleType.healer) {
                return 20;
            }
    }
        return 0;
}}
